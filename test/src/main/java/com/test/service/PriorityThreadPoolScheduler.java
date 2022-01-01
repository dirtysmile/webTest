package com.test.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

@Service
@RequiredArgsConstructor
public class PriorityThreadPoolScheduler implements DisposableBean {

    private final ThreadPoolTaskExecutor taskExecutor;

    private ThreadPoolTaskScheduler scheduledThreadPoolExecutor;
    private int schedulePoolSize = 10;

    Map<String, ScheduledFuture> futureMap = new ConcurrentHashMap<>();


    private volatile boolean initialized = false;


    /**
     * scheduler 초기화. 사용하기 전에 초기화 해야 한다.
     */
    @PostConstruct
    public void initialize() {
        System.out.println("PriorityThreadPoolScheduler init");
        if (!initialized) {
            scheduledThreadPoolExecutor = new ThreadPoolTaskScheduler();
            scheduledThreadPoolExecutor.setPoolSize(schedulePoolSize);
            scheduledThreadPoolExecutor.setWaitForTasksToCompleteOnShutdown(false);
            scheduledThreadPoolExecutor.initialize();
            initialized = true;
        }
    }


    /**
     * cron형태 schedule 실행.
     *
     * @param name           schedule key. 이 name으로 schedule 된 task 취소 할 수 있다.
     * @param task           schedule 하려는 task.
     * @param cronExpression cron 표현식.
     */
    public void scheduleCron(String name, PriorityTask task, String cronExpression) {
        scheduleTrigger(name, task, new CronTrigger(cronExpression), false);
    }

    public Runnable getExecutorWrapedTask(PriorityTask task) {
        return () -> {
            System.out.println("run task:{"+task.getClass().getSimpleName()+"}");
            taskExecutor.execute(task);
        };
    }

    /**
     * @param name
     * @param runnable
     * @param trigger
     * @param runParallel 동일한 이름으로 이미 완료 되지 않은 job이 있는 상태에서 해당 job을 다시 실행시키는지?
     */
    public void scheduleTrigger(String name, Runnable runnable, Trigger trigger, boolean runParallel) {
        ScheduledFuture pastFuture = futureMap.get(name);
        if (pastFuture != null && !pastFuture.isDone() && !runParallel) {
            System.out.println("schedule {"+ name +"} is already run or waiting, so skip");
            return;
        }
        ScheduledFuture scheduledFuture = scheduledThreadPoolExecutor.schedule(runnable, trigger);
        futureMap.put(name, scheduledFuture);
    }


    @Override
    public void destroy() throws Exception {
        taskExecutor.shutdown();
        scheduledThreadPoolExecutor.shutdown();
        System.out.println("destroy!!!!!");
    }
}
