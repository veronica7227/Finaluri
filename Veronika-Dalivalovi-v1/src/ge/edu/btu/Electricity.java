package ge.edu.btu;

public class Electricity {
    private final String customerNumber;
    private final double amount;

    public Electricity(String customerNumber, double amount){
        this.customerNumber = customerNumber;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[customerNumber=" + customerNumber + ", amount=" + amount + "]";
    }
}
