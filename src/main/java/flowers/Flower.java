package flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Flower {
    private double sepalLength;
    private double price;
    private FlowerType flowertype;
    private Color color;

    public Flower(FlowerType flowertype) {
        this.flowertype = flowertype;
    }
}
