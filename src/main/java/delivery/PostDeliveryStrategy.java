package delivery;

import java.util.Arrays;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(String[] items) {
        System.out.println("Delivering " + Arrays.toString(items) + " by Post");
        return true;
    }
}
