package Assignment;

public class Customer extends Person{
    private double totalPurchase = 0;
    private static int numCustomers = 0;

    Customer(){
        numCustomers++;
    }
    Customer(String name, String contact_number, String address){
        setName(name);
        setContact(contact_number);
        setAddress(address);
        numCustomers++;
    }
    public void updatePurchase(double amount){
        totalPurchase += amount;
    }
    public int getNumCustomers(){
        return numCustomers;
    }
    public double getTotalPurchase(){
        return totalPurchase;
    }
}
