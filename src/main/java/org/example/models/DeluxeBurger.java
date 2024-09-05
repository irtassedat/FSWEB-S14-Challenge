package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String drink, cips;


    public DeluxeBurger() {
        super("DELUXE BURGER", "DOUBLE", 19.10, "DOUBLE");
        this.drink = "COKE";
        this.cips = "CURVY";
    }


    public String getDrink() {
        return drink;
    }

    public String getCips() {
        return cips;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
}