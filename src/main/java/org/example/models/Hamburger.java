package org.example.models;

public class Hamburger {
    private String name, meat;
    private double  price;
    private String  breadRollType;
    private String addition1Name,addition2Name, addition3Name,addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String meat,  double price,String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }
    public void addHamburgerAddition1(String addition1Name,double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.price = price + addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name,double addition2Price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        this.price = price + addition2Price;

    }
    public void addHamburgerAddition3(String addition3Name,double addition3Price){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        this.price = price + addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name,double addition4Price){
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
        this.price = price + addition4Price;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double itemizeHamburger(){

        System.out.println("Name: " + this.name);
        System.out.println("Meat: " + this.meat);
        System.out.println("BreadRollType: " + this.breadRollType);
        if(addition1Name != null){

            System.out.println("Addition1: " + addition1Name);
        }
        if(addition2Name != null){

            System.out.println("Addition2: " + addition2Name);
        }
        if(addition3Name != null){

            System.out.println("Addition3: " + addition3Name);
        }
        if(addition4Name != null){

            System.out.println("Addition4: " + addition4Name);
        }


        return getPrice();
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}