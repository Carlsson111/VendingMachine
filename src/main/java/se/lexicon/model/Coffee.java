package se.lexicon.model;

public class Coffee extends Product {
    private String roastLevel;

    public Coffee(int id, double price, String productName, String roastLevel) {
        super(id,price,productName);
        this.roastLevel = roastLevel;
    }

    public String getRoastLevel() {
        return roastLevel;
    }

    public void setRoastLevel(String roastLevel) {
        this.roastLevel = roastLevel;
    }

    @Override
    public String examine() {
        return "Examining Coffee: " + getProductName() + ", Price: " + getPrice() + ", Roast Level: " + roastLevel;
    }

    @Override
    public String use() {
        return "Drinking Coffee: " + getProductName();
    }
}
