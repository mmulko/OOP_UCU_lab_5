package decorators;

import flowers.Item;

public class RibbonDecorator extends ItemDecorator {
    private double price;

    public RibbonDecorator(Item item) {
        super(item);
        this.price = item.price();
    }

    public String getDescription() {
        return "Flower decorated in Ribbon";
    }

    public double price() {
        return 40 + price;
    }
}