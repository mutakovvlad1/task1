package mathAndCollections.turning.array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length/ 2; i++) {
            int turningArray = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = turningArray;
        }
        System.out.println(Arrays.toString(array));
    }
}