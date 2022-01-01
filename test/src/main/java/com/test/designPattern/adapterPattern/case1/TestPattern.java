package com.test.designPattern.adapterPattern.case1;

public class TestPattern {
    public static void main(String[] args) {
        Aplayer player1 = new APlayerImpl();
        player1.play("aaa.mp3");

        //계약기간 만료로 APlayerImpl()을 사용할 수 없다.

        //BPlayer : 새로 도입된 방식(잘 동작할 것이다.)
        Bplayer player2 = new BPlayerImpl();
        player2.playFile("bbb.mp3");

        // Aplayer obj= (어댑터) = new BplayerImpl();
        // 기존의 잘 동작하던 코드와 새로 도입된 코드를
        // 변경 없이 사용하고 싶은 것이다.
        // 어댑터 적용 후 에러가 난다면 어댑터 부분만 보면 될것이다.

        player1 = new BToAAdapter(new BPlayerImpl());
        player1.play("ccc.mp3");

        // 현재 모든 코드가 APlayer 인터페이스에 맞춰서 코딩되어 있다.
        // 그러므로 여기서 APlayer에 대입되는 객체만 수정해주면
        // APlayer 인터페이스가 사용되는 부분에서는 수정할 필요가 없다.
    }
}
