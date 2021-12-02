package mathAndCollections.fibonachi.numbers;

public class Main {
    // Метод выводит первые десять элементов последовательности чисел Фибоначчи
    static int fibonachi(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int row = fibonachi(i);
            System.out.println(row);
        }
    }
}