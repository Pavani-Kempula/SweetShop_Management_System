package com.blz.sweetshopws;

import java.util.ArrayList;
import java.util.List;

public class SweetRepository {

    private List sweetList = new ArrayList();

    public List getSweetList() {
        return sweetList;
    }

    public void add(GulabJamun gulabjamun) {
        sweetList.add(gulabjamun);
    }

    public void add(Kalakand kalakand) {
        sweetList.add(kalakand);
    }

    public void add(Kesari kesari) {
        sweetList.add(kesari);
    }

    public void add(Khaja khaja) {
        sweetList.add(khaja);
    }

    public void add(Laddu laddu) {
        sweetList.add(laddu);
    }

}
