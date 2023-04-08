package Assignment;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class main {

    public static void main(String[] args)throws IOException{
        char ans;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // to read string (customer name)
        java.util.Scanner input = new java.util.Scanner(System.in); // to read other input
        Customer customer = new Customer();
        Product[] product = new Product[5];
        Booking order = new Booking();

        product[0] = new Product(1,"RTX4090 Ti", 10900);
        product[1] = new Product(2,"Intel i9 11900K", 7600);
        product[2] = new Product(3,"Coolermaster PSU 1000W", 1500);
        product[3] = new Product(4,"Samsung UltraSpeed SSD 3TB", 3400);
        product[4] = new Product(5,"Kingston DDR5 32GB 2x2 RAM", 2000);

        System.out.println("Marziq TechEnterprise\nPC Parts Products\n\nThese are products available: ");

        do{
            //check limit order
            if(order.getOrderCounts() >= 50) {
                System.out.println("Maximum order reached! ");
                break;
            }
            System.out.println("----code--Product----------Price----------");
            for (int i = 0; i < Product.getProductCounts(); i++) {
                System.out.println((i+1) + "-" + product[i].printProduct());
            }
            System.out.println("------------------------------------------");
            System.out.println("Total number of products: " + Product.getProductCounts());

            //get customer name
            System.out.print("Enter customer name: ");
            order.setCustomerName(reader.readLine());

            //get product ordered
            System.out.print("Enter code of product: ");
            order.setProductCode(input.nextInt());

            //get quantity
            System.out.print("Order quantity: ");
            order.setQuantity(input.nextInt());

            order.setOrderCounts(); // increment ordercounts

            //output@receipt
            System.out.println("\nOrder by " + order.getCustomerName());
            System.out.println("Item ordered: " + product[order.getProductCode() - 1].getName());
            System.out.println("Order quantity: " + order.getQuantity());
            System.out.printf("Amount of order is RM%.2f", (order.getQuantity() * product[order.getProductCode() - 1].getPrice()));

            customer.updatePurchase((order.getQuantity() * product[order.getProductCode() - 1].getPrice()));

            System.out.print("\n\nMore order? (Y or N): ");
            ans = input.next().charAt(0);
            System.out.println("");
        }while(ans == 'Y' || ans == 'y');
        System.out.println("Total orders: " + order.getOrderCounts());
        System.out.printf("Total sales: RM%.2f\n", customer.getTotalPurchase() );
        System.out.println("\nEND OF PROGRAM");
    }

}
