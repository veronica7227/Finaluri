package ge.edu.btu;

public class Passenger {
    private final String name;
    private final boolean ticket;

    public Passenger(String name1, boolean ticket1){
        name = name1;
        ticket = ticket1;
    }

    public String getName(){
        return name;
    }

    public boolean haveTicket(){
        return ticket;
    }
}
