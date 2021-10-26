package com.blz.sweetshopws;

import java.util.List;
import java.util.Set;

public abstract class Application {

    public static void main(String[] args) {

        System.out.println("Welcome to Sweet Shop Management System");

        Sweet gulabJamun = new GulabJamun();
        gulabJamun.id = "f6542";
        gulabJamun.price = 15;

        Sweet kalakand = new Kalakand();
        kalakand.id = "s2656";
        kalakand.price = 20;

        Sweet kesari = new Kesari();
        kesari.id = "d434";
        kesari.price = 30;

        Sweet khaja = new Khaja();
        khaja.id = "g686";
        khaja.price = 25;

        Sweet laddu = new Laddu();
        laddu.id = "1242";
        laddu.price = 40;

        Sweet laddu1 = new Laddu();
        laddu1.id = "1242";
        laddu1.price = 36;

        SweetRepository sweetRepository = new SweetRepository();
        sweetRepository.add(gulabJamun);
        sweetRepository.add(kalakand);
        sweetRepository.add(kesari);
        sweetRepository.add(khaja);
        sweetRepository.add(laddu);
        sweetRepository.add(laddu1);

        UserInterface userInterface = new UserInterface();

        Set sweetSet = sweetRepository.getSweetList();
        userInterface.print(sweetSet);

        System.out.println("\nPrinting IDietSweet\n");
        userInterface.printDietSweets(sweetSet);
        System.out.println("\nPrinting INormalSweet\n");
        userInterface.printNormalSweets(sweetSet);
        sweetRepository.delete(gulabJamun);
        sweetRepository.delete(kesari);
        sweetRepository.delete(laddu);
        System.out.println("\nPrinting after remove the sweet\n");
        userInterface.print(sweetSet);
    }

}