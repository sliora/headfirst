package com.example.headfirst;

public class CheckComputers implements Observer{
    private String computerName;

    public CheckComputers(String computerName) {
        this.computerName = computerName;
    }

    @Override
    public void update() {
        System.out.println("컴퓨터명: " + computerName + "랜섬웨어 모니터링 작동중");
    }
}
