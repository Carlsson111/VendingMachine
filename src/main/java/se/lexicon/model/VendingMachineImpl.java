package se.lexicon.model;

public class VendingMachineImpl implements VendingMachine {
    private double currentBalance;
    private Product[] products;

    public VendingMachineImpl(){
        products = new Product[6];
        products[0] = new Chips(1,25,"BBQ Heaven","BBq");
        products[1]= new Chips(2,25,"Sea Chips","Salted");
        products[2]=new Chips(3,15,"Normal Coffe","Java");
        products[3]= new EnergyDrink(4,30,"Monster Green",250);
        products[4]= new Soda(5,20,": Cola",27);
        products[5]= new Soda(6,20,": Fanta",15);
    }


    @Override
    public void addCurrency(Currency currency) {
        currentBalance += currency.getValue();
        System.out.println("Currency added:" + currency.getValue());
        System.out.println("Current balance:"+ currentBalance);
    }

    @Override
    public Product request(int id) {
        for (Product product: products){
            if (product.getId()==id){
                if (currentBalance>=product.getPrice()){
                    currentBalance-=product.getPrice();
                    System.out.println("Product dispensed"+product.getProductName());
                    return product;
                }else {
                    System.out.println("Insufficient Balance");
                    return null;
                }
            }
        }
        System.out.println("Product not found");
        return null;
    }

    @Override
    public int endSession() {
        int balanceToReturn = (int) currentBalance;
        currentBalance = 0;
        System.out.println("Session ended. Returning balance ;"+balanceToReturn);
        return balanceToReturn;
    }

    @Override
    public String getDescription(int id) {
        for (Product product: products){
            if (product.getId()== id){
                return product.getProductName() + ";" + product.getPrice();
            }
        }
        return "Product not found";
    }

    @Override
    public int getBalance() {
        return (int) currentBalance;
    }

    @Override
    public String[] getProducts() {
        String[] productDescriptions = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productDescriptions[i] = products[i].getId() + ", " + products[i].getProductName() + ": " + products[i].getPrice();
        }
        return productDescriptions;
    }
}
