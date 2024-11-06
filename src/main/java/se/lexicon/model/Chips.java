package se.lexicon.model;

public class Chips extends Product {
    private String flavor;

    public Chips(int id, double price, String productName, String flavor) {
        setId(id);
        setPrice(price);
        setProductName(productName);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String examine() {
        return "Examining Chips: " + getProductName() + ", Price: " + getPrice() + ", Flavor: " + flavor;
    }

    @Override
    public String use() {
        return "Eating Chips: " + getProductName();
    }
}
