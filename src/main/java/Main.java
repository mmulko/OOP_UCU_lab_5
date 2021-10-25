import flowers.Color;
import flowers.Flower;
import flowers.FlowerType;

public class Main {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[3];
        for (int i = 0; i < flowers.length; i++) {
            flowers[i] = new Flower(FlowerType.ROSE);
            flowers[i].setColor(Color.RED);
        }
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
    }
}
