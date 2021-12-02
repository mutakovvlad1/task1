package mathAndCollections.factorial.recursively;

import java.util.Scanner;

public class Main {

    static int factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    public static void main(String[] args) {
        System.out.println("Введите значение для вычисления факториала");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}
