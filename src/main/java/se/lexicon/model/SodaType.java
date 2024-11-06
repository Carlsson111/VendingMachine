package se.lexicon.model;

public enum SodaType {



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



