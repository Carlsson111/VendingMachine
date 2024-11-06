package se.lexicon.model;

public class EnergyDrink extends Product {
    private int caffeineContent;

    public EnergyDrink(int id, double price, String productName, int caffeineContent) {
        setId(id);
        setPrice(price);
        setProductName(productName);
        this.caffeineContent = caffeineContent;
    }

    public int getCaffeineContent() {
        return caffeineContent;
    }

    public void setCaffeineContent(int caffeineContent) {
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
