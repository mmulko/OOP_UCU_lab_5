package flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPackList = new ArrayList<FlowerPack>();

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPackList) {
            price += flowerPack.price();
        }
        return price;
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPackList.add(flowerPack);
    }
}
