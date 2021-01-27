package ge.edu.btu;

public class Water {
    private final String customerNumber;
    private final double amount;

    public Water(String customerNumber, double amount){
        this.customerNumber = customerNumber;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[customerNumber=" + customerNumber + ", amount=" + amount + "]";
    }
}
