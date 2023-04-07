package Assignment;

public class Person {
    private String name;
    private String contact_number;
    private String address;
    private boolean isAlive = true;

    Person(){
    }
    Person(String name, String contact_number, String address, boolean isAlive){
        this.name = name;
        this.contact_number = contact_number;
        this.address = address;
        this.isAlive = isAlive;
    }

     String getName(){
        return name;
    }
     String getContact(){
        return contact_number;
    }
     String getAddress(){
        return address;
    }
     boolean isAlive(){
        return isAlive;
    }
     void setName(String name){
        this.name = name;
    }
     void setContact(String contact_number){
        this.contact_number = contact_number;
    }
     void setAddress(String address){
        this.address = address;
    }
}
