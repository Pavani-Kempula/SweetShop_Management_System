package com.blz.sweetshopws;

public class Sweet {

    enum Color {
        RED, GREEN, WHITE, GREEN_WHITE;
    }

    enum Category {
        MILK, SUGAR, GHEE, DRYFRUITS, SUGARLESS;
    }

    String name;
    Color color;
    int price;
    String id;
    Category category;

    @Override
    public String toString() {
        return "Sweet [name=" + name + ", color=" + color + ", price=" + price + ", id=" + id + ", category=" + category + "]";
    }

}
