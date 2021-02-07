package lesson1.task3;

public class Test3 {

    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();

        Box<Orange> box3 = new Box<>();
        Box<Orange> box4 = new Box<>();

        Apple apple = new Apple();
        Orange orange = new Orange();

        box1.addFruit(apple, 15);
        box2.addFruit(apple, 20);

        box3.addFruit(orange, 10);
        box4.addFruit(orange, 23);

        System.out.println("Weight of box1 " + box1.getWeight());
        System.out.println("Weight of box2 " + box2.getWeight());
        System.out.println("Weight of box3 " + box3.getWeight());
        System.out.println("Weight of box4 " + box4.getWeight());

        System.out.println();

        System.out.println("Weight of box1 and Weight of box3 is equals? Answer: " + box1.compare(box3));
        System.out.println("Weight of box2 and Weight of box4 is equals? Answer: " + box2.compare(box4));

        System.out.println();

        box1.pourFruits(box2);
        System.out.println("Weight of box1 " + box1.getWeight());
        System.out.println("Weight of box2 " + box2.getWeight());

        System.out.println();

        box3.pourFruits(box4);
        System.out.println("Weight of box3 " + box3.getWeight());
        System.out.println("Weight of box4 " + box4.getWeight());

        System.out.println();

    }

}
