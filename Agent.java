package Assignment;

public class Agent extends Person{

    private String company;
    private double salary = 0;

    Agent(){
    }
    Agent(String name, String contact_number, String address, String company, double salary){
        setName(name);
        setContact(contact_number);
        setAddress(address);
       this.company = company;
       this.salary = salary;
    }
    String getCompany(){
        return company;
    }
    double getSalary(){
        return salary;
    }
    void setCompany(String company){
        this.company = company;
    }
    void setSalary(double salary){
        this.salary = salary;
    }
}
