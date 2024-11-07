package se.lexicon.model;

public class Soda extends Product {
    private String sugarContent;
    public Soda(int id, double price, String productName, String sugarContent) {
        super(id,price,productName);
        this.sugarContent = sugarContent;
    }

    public String getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(String sugarContent) {
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
