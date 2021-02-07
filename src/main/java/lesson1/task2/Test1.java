package lesson1.task2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

    private static Integer[] arrInt = {1, 2, 3};

    public static void main(String[] args) {

        transformArrToArrayList(arrInt);

    }

    private static void transformArrToArrayList(Integer[] arrInt) {
        List<Integer> arrList = new ArrayList<>(Arrays.asList(arrInt));
        System.out.println(arrList);
    }

}
