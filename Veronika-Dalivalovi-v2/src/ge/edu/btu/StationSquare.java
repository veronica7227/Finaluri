package ge.edu.btu;

public class StationSquare {
    public static void main(String[] args) {
        Passenger lasha = new Passenger("Lasha", true);
        Passenger saba = new Passenger("Saba", false);
        Passenger lika = new Passenger("Lika", true);

        Train train = new Train();

        train.addPassenger(lasha);
        train.addPassenger(saba);
        train.addPassenger(lika);

        for(Passenger passenger: train.getPassengerList())
            System.out.println(passenger.getName());
    }
}
