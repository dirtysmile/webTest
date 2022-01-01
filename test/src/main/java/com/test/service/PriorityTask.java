package com.test.service;

public interface PriorityTask extends Runnable {
    int URGENT = 9;
    int HIGH = 7;
    int MEDIUM = 5;
    int LOW = 3;
    int TRIVIAL = 1;

    String MONITOR = "MONITOR";
    String WORKFLOWTASK = "WORKFLOW";
    String CITASK = "CI";
    String HEARTBEAT = "HEARTBEAT";
    String ALER = "ALERT";
    String NORMAL = "NORMAL";

    int getPriority();

    String getGroupName();

}
