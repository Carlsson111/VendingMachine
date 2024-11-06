package se.lexicon;
import se.lexicon.model.*;
public class Main extends VendingMachineImpl {
    public static void main(String[] args) {
        VendingMachineImpl vendingMachineImpl = new VendingMachineImpl();
        vendingMachineImpl.addCurrency(Currency.FIFTY);
        System.out.println(vendingMachineImpl.getBalance());
        vendingMachineImpl.request(5);
        System.out.println("--------------");
        System.out.println(vendingMachineImpl.getBalance());
        vendingMachineImpl.endSession();
        System.out.println(vendingMachineImpl.getBalance());
        String[] items = vendingMachineImpl.getProducts();
        for(String element : items){
            System.out.println(element);
        }
    }
}



