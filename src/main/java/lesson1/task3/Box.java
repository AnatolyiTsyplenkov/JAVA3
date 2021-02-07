package lesson1.task3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> boxOfFruits = new ArrayList<>();

    public void addFruit(T fruit, int quantity) {

        for (int i = 0; i < quantity; i++) {
            boxOfFruits.add(fruit);
        }

    }

    public float getWeight() {
        float weightOfBox = 0.0f;

        for (Fruit fruit : boxOfFruits) {
            weightOfBox += fruit.getWeight();
        }

        return weightOfBox;
    }

    public boolean compare(Box compareBox) {
        if (compareBox.getWeight() == this.getWeight()) {
            return true;

        }

        return false;
    }

    public void pourFruits(Box<T> otherBox) {
        otherBox.boxOfFruits.addAll(boxOfFruits);
        this.boxOfFruits.clear();

    }

}
