package decorators;

import flowers.Item;

public class PaperDecorator extends ItemDecorator {
    private double price;

    public PaperDecorator(Item item) {
        super(item);
        this.price = item.price();
    }

    public String getDescription() {
        return "Flower decorated in Paper";
    }
    
    public double price() {
        return 13 + price;
    }
}
