package flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setColor(Color.RED);
        flower.setPrice(10);
    }

    @Test
    void getPrice() {
        assertEquals(10, flower.getPrice());
    }

    @Test
    void getFlowertype() {
        assertEquals(FlowerType.ROSE, flower.getFlowertype());
    }

    @Test
    void getColor() {
        assertEquals(Color.RED, flower.getColor());
    }
}