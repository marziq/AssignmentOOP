package Assignment;

public class Booking {
    private String customer_name;
    private int product_code;
    private int quantity;


    Booking(){
    }
    Booking(String customer_name, int product_code, int quantity){
        this.customer_name = customer_name;
        this.product_code = product_code;
        this.quantity = quantity;
    }
    public String getCustomerName() {
        return customer_name;
    }
    public void setCustomerName(String customer_name) {
        this.customer_name = customer_name;
    }
    public int getProductCode() {
        return product_code;
    }
    public void setProductCode(int product_code) {
        this.product_code = product_code;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


