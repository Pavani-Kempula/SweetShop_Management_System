package com.blz.sweetshopws;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        System.out.println("Welcome to Sweet Shop Management System");

        GulabJamun gulabJamun = new GulabJamun();
        gulabJamun.id = "f6542";
        gulabJamun.price = 15;

        Kalakand kalakand = new Kalakand();
        kalakand.id = "s2656";
        kalakand.price = 20;

        Kesari kesari = new Kesari();
        kesari.id = "d434";
        kesari.price = 30;

        Khaja khaja = new Khaja();
        khaja.id = "g686";
        khaja.price = 25;

        Laddu laddu = new Laddu();
        laddu.id = "l242";
        laddu.price = 40;

        SweetRepository sweetRepository = new SweetRepository();
        sweetRepository.add(gulabJamun);
        sweetRepository.add(kalakand);
        sweetRepository.add(kesari);
        sweetRepository.add(khaja);
        sweetRepository.add(laddu);

        UserInterface userInterface = new UserInterface();

        List sweetList = sweetRepository.getSweetList();
        userInterface.print(sweetList);
    }

}