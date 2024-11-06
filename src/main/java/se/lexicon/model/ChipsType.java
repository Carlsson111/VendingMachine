package se.lexicon.model;

public enum ChipsType {
    SALT(1,20,"Salted Chips"),
    KETCHUP(2,25,"Ketchup Chips"),
    BBQ(3,25,"BBQ Chips"),
    CHEESY_DELUXE(4,30,"Cheesy Deluxe Chips"),
    CHILL_CHILI(5,30,"Chill Chili Chips");

    private final int id;
    private final double price;
    private final String productName;


    ChipsType(int id, double price, String productName) {
        this.id = id;
        this.price = price;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }
}
