package com.blz.sweetshopws;

import java.util.Objects;

public abstract class Sweet {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweet sweet = (Sweet) o;
        return  Objects.equals(id, sweet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash( id );
    }
}
