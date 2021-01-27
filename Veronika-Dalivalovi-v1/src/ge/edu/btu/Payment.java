package ge.edu.btu;

import org.apache.log4j.Logger;

public class Payment {

    public static <T> void Pay(T obj) {
        final Logger logger = Logger.getLogger(Payment.class);
        logger.info("კომუნალური გადახდილია: " + obj.toString());
    }

    public static void main(String[] args) {
        Electricity electricity = new Electricity("1876251",11);
        Water water = new Water("1822250", 32.5);

        Pay(electricity);
        Pay(water);
    }
}
