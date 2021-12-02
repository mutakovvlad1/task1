package mathAndCollections.factorial.simple;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Введите значение для вычисления факториала");
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}