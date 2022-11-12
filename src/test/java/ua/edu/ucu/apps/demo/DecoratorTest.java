package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.decorators.PaperDecorator;
import ua.edu.ucu.apps.demo.flowers.Flower;
import ua.edu.ucu.apps.demo.flowers.FlowerColor;
import ua.edu.ucu.apps.demo.flowers.FlowerType;

public class DecoratorTest {
    private static final int PRICE = 100;
    private static final int SEPAL = 13;
    private static final int ID = 1;

    @Test
    public void testDecorator() {
        Item flower = new Flower(ID, SEPAL, FlowerColor.BLUE,
                PRICE, FlowerType.TULIP);
        flower = new PaperDecorator(flower);
        Assertions.assertEquals(flower.price(), PRICE + SEPAL);
    }
}
