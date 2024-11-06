package se.lexicon.model;

public class Soda extends Product {
    private int sugarContent;
    public Soda(int id, double price, String productName, int sugarContent) {
        super(id,price,productName);
        this.sugarContent = sugarContent;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    @Override
    public String examine() {
        return "Examining Soda: " + getProductName() + ", Price: " + getPrice() + ", Sugar: " + sugarContent + "g";
    }

    @Override
    public String use() {
        return "Drinking Soda: " + getProductName();
    }
}
