package delivery;

import java.util.Arrays;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(String[] items) {
        System.out.println("Delivering " + Arrays.toString(items) + " by <<DHL>>");
        return true;
    }
}
