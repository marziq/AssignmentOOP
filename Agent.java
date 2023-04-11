package Assignment;

public class Agent extends Person{
    private final double COMMISSION_RATE = 0.15;
    private double commission = 0;
    private static int agentCounts = 0;
    Agent(){
        agentCounts++;
    }
    Agent(String name, String contact_number, String address, double commission){
        setName(name);
        setContact(contact_number);
        setAddress(address);
       this.commission = commission;
       agentCounts++;
    }
    double getCommission(){
        return commission;
    }
    void setCommission(double commission){
        this.commission += commission;
    }
    double getRate(){
        return COMMISSION_RATE;
    }
    static int getAgentCounts(){
        return agentCounts;
    }
}
