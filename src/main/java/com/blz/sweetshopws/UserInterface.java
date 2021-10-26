package com.blz.sweetshopws;

import java.util.List;
import java.util.Set;

public class UserInterface {

    public void print(Set<Sweet> set) {
        for(Sweet sweet: set) {
            System.out.println(sweet);
        }
    }

    public void printDietSweets(Set<Sweet> set) {
       for (Sweet sweet : set) {
           if (sweet instanceof IDiet) {
               System.out.println(sweet);
           }
       }
    }

    public void printNormalSweets(Set<Sweet> set) {
        for (Sweet sweet : set) {
            if (sweet instanceof INormal) {
                System.out.println(sweet);
            }
        }
    }

}
