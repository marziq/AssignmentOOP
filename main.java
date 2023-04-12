package Assignment;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class main {

    public static void main(String[] args)throws IOException{
        char ans = 'y';
        int chooseAgent;
        int customerIndex = 0;
        boolean isExist = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // to read string (customer name)
        java.util.Scanner input = new java.util.Scanner(System.in); // to read other input
        Customer[] customer = new Customer[100];
        Product[] product = new Product[5];
        Booking booking = new Booking();
        Agent[] agent = new Agent[3];

        for(int i = 0;i < customer.length; i++)
            customer[i] = new Customer();
        customer[0] = new Customer("Ammar Haziq", "0198389538", "Melayu Raya");
        customer[1] = new Customer("Ahmad Haikal", "0111234765", "Pekan Nanas");
        customer[2] = new Customer("Mior Ahmad", "01234567890", "Pontian");
        agent[0] = new Agent("George Lopez", "011-113243213", "KL", 0);
        agent[1] = new Agent("Giga Hadid", "012-343213377", "SEREMBAN", 0);
        agent[2] = new Agent("Mohd Salahuddin", "018-57715660", "JOHOR", 0);
        product[0] = new Product(1,"Standard Single Room", 150);
        product[1] = new Product(2,"Standard Double Room", 200);
        product[2] = new Product(3,"Standard Queen Room", 500);
        product[3] = new Product(4, "Standard King Room", 800);
        product[4] = new Product(5, "Executive Suite Room", 1500);

        int customerCounts = Customer.getNumCustomers();

        do{
            System.out.println("\nWelcome to Dreamy Hotel booking\n\nChoose agent: ");
            for(int i = 0; i < agent.length; i++)
                System.out.println("   "+ (i+1) + ". " + agent[i].getName());

            System.out.print("Choose agent: ");
            chooseAgent = input.nextInt();
            chooseAgent--;
            System.out.print("Enter Customer Name: ");
            booking.setCustomerName(reader.readLine());
            String customerName = booking.getCustomerName();
            for(int i = 0; i <= customerCounts; i++)
            if(customerName.equalsIgnoreCase(customer[i].getName())){
                isExist = true;
                break;
            }
            if(isExist){
                System.out.println("Customer is a registered customer\n");
                for(int i = 0; i <= customerCounts; i++)
                    if(customerName.equalsIgnoreCase(customer[i].getName())){
                        System.out.println("Name: " + customer[i].getName());
                        System.out.println("Contact no: " + customer[i].getContact());
                        System.out.println("Address: " + customer[i].getAddress());
                        break;
                    }
            }
            else{
                System.out.println("Customer is not yet registered\n");
                System.out.print("Enter Name: ");
                customerName = reader.readLine();
                System.out.print("Enter Contact No: ");
                String customerContact = reader.readLine();
                System.out.print("Enter Address: ");
                String customerAddress = reader.readLine();
                System.out.println("New Customer successfully added\n");
                customer[customerCounts] = new Customer(customerName,customerContact,customerAddress);
                customerCounts++;
            }

            System.out.print("Make new booking?(Y/N): ");
            char bookingChoice = input.next().charAt(0);

            switch(bookingChoice){
                case 'y': case 'Y':break;
                default: continue;
            }


            System.out.println("Available packages: ");
            for(int i = 0;i < Product.getProductCounts(); i++)
                System.out.println("  " + (i+1) + ". " + product[i].getName() + "    RM" + product[i].getPrice());
            System.out.print("Choose package: ");
            booking.setProductCode(input.nextInt());
            int customerPackage = booking.getProductCode() - 1;
            System.out.print("Enter Quantity: ");
            booking.setQuantity(input.nextInt());

            double total = booking.getQuantity()*product[customerPackage].getPrice(); // total amount

            System.out.println("You have chosen " + product[customerPackage].getName() + " for " + booking.getQuantity() + " pax");
            System.out.printf("Amount of package is RM%.2f\n", total);

            //get array index
            for(int i =0; i <= customerCounts; i++)
                if(customerName.equalsIgnoreCase(customer[i].getName()))
                    customerIndex = i;

            customer[customerIndex].updatePurchase(total); //update customer purcase
            agent[chooseAgent].setCommission(total*agent[chooseAgent].getRate()); // add commision
            System.out.print("\nAnother booking(Y/N)?:  ");
            ans = input.next().charAt(0);
            isExist = false;

            booking = new Booking(customerName, customerPackage, booking.getQuantity());
        }while(ans == 'y' || ans == 'Y');

        System.out.println("\nSummary report by agent\n");
        System.out.println("     Name of Agent\t Commision");
        System.out.println("----------------------------------");
        for(int i = 0; i < Agent.getAgentCounts(); i++)
            System.out.printf("     %d. %-20s RM%.2f\n", i+1, agent[i].getName(), agent[i].getCommission());


    }

}
