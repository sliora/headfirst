package com.example.headfirst;

public class CheckLaptop implements Observer{
    @Override
    public void messageAlert() {
        //사용자에게 전달 내용 작성
        System.out.println("랩탑이 정상적으로 작동중입니다.");
    }
}
