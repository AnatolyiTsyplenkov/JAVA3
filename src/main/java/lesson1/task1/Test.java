package lesson1.task1;

public class Test {
    public static void main(String[] args) {
        Arr<String> strArr = new Arr<>(3);
        Arr<Integer> intArr = new Arr<>(5);

        strArr.add("some text 0", 0);
        strArr.add("some text 1", 1);
        strArr.add("some text 2", 2);

        intArr.add(1, 0);
        intArr.add(2, 1);
        intArr.add(3, 2);

        System.out.println(strArr);
        strArr.changeElementOfArr(0,2);
        System.out.println(strArr);

        System.out.println();

        System.out.println(intArr);
        intArr.changeElementOfArr(1,4);
        System.out.println(intArr);

    }
}
