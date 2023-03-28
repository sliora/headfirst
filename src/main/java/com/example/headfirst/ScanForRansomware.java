package com.example.headfirst;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScanForRansomware implements Subject {
    private List<Observer> observers;

    public ScanForRansomware() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.messageAlert();
        }
    }

    public void isRansomwareFile() throws InterruptedException, IOException {
        String fileName = "C:\\headfirst.txt";             // 감시 대상 파일
        String previousExtension = getExtension(fileName); // 이전 확장자 저장 변수

        while (true) {
            String currentExtension = getExtension(fileName);
            if (!currentExtension.equals(previousExtension)) {
                Runtime.getRuntime().exec("shutdown -s -t 0");
                break;
            }
            notifyObservers();
            previousExtension = currentExtension;

            Thread.sleep(10000); //10초
        }
    }

    private static String getExtension(String filePath) {
        String extension = "";
        File file = new File(filePath);
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf > 0 && lastIndexOf < name.length() - 1) {
            extension = name.substring(lastIndexOf + 1);
        }
        return extension;
    }
}
