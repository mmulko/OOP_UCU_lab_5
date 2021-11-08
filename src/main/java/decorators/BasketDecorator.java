package decorators;

import flowers.Item;

public class BasketDecorator extends ItemDecorator {
    private double price;

    public BasketDecorator(Item item) {
        super(item);
        this.price = item.price();
    }

    public String getDescription() {
        return "Flower decorated in Basket";
    }

    public double price() {
        return 4 + price;
    }
}
