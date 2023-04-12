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
     String getCustomerName() {
        return customer_name;
    }
     void setCustomerName(String customer_name) {
        this.customer_name = customer_name;
    }
     int getProductCode() {
        return product_code;
    }
     void setProductCode(int product_code) {
        this.product_code = product_code;
    }
     int getQuantity() {
        return quantity;
    }
     void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


