package mathAndCollections.returning.even.and.uneven.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        int[] array = {5, -2, 4, 10, -22, 35, -14, 45};
        Map<Boolean, List<Integer>> result = Arrays.stream(array).boxed()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        List<Integer> unevenList = new ArrayList(result.get(false));
        List<Integer> evenList = new ArrayList(result.get(true));
        List<Integer> subtractionList = new ArrayList(unevenList.stream().map(s -> s - 100).collect(Collectors.toList()));
        List<Integer> multiplicationList = new ArrayList(evenList.stream().map(s -> s * 100).collect(Collectors.toList()));
        subtractionList.addAll(multiplicationList);
        System.out.println(subtractionList);
    }
}