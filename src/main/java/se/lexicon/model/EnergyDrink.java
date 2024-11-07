package se.lexicon.model;

public class EnergyDrink extends Product {
    private String caffeineContent;

    public EnergyDrink(int id, double price, String productName, String caffeineContent) {
        super(id,price,productName);
        this.caffeineContent = caffeineContent;
    }

    public String getCaffeineContent() {
        return caffeineContent;
    }

    public void setCaffeineContent(String caffeineContent) {
        this.caffeineContent = caffeineContent;
    }

    @Override
    public String examine() {
        return "Examining EnergyDrink: " + getProductName() + ", Price: " + getPrice() + ", Caffeine: " + caffeineContent + "mg";
    }

    @Override
    public String use() {
        return "Drinking EnergyDrink: " + getProductName();
    }
}
