package lesson1.task1;

import java.util.Arrays;

public class Arr<E> {

    private int size;
    private E[] arr;

    public Arr(int size) {
        this.arr = (E[]) new Object[size];
    }

    public void add(E value, int index) {
        arr[index] = value;
    }

    public void changeElementOfArr(int i, int j) {
        E buffer = arr[i];
        arr[i] = arr[j];
        arr[j] = buffer;

    }

    @Override
    public String toString() {
        return "arr=" + Arrays.toString(arr);
    }
}
