package Assignment;

public class Product {
    private int product_code;
    private String name;
    private double price;
    private static int productCounts = 0;
    Product(){
        productCounts++;
    }
    Product(int product_code, String name, double price){
        this.product_code = product_code;
        this.name = name;
        this.price = price;
        productCounts++;
    }
    void setName(String name){
        this.name = name;
    }
    void setProductCode(int product_code){
        this.product_code = product_code;
    }
    void setPrice(double price){
        this.price = price;
    }
    String getName(){
        return name;
    }
    int getProductCode(){
        return product_code;
    }
    double getPrice(){
        return price;
    }
    static int getProductCounts(){
        return productCounts;
    }
    String printProduct(){
        return name + "\t(RM" + String.format("%.2f", price) + ")";
    }

}
