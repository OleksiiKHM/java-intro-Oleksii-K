package Lesson02;

public class Fibonacci {

    public static void main(String[] args) {
        //printFibonacciNumbers(5);
        switchCaseExample('C');
        //System.out.println(printfibonnaciRecursive(4));

    }

    public static void printFibonacciNumbers(int num) {
        int fib1 = 0;
        int fib2 = 1;
        if (num == 0) {
            System.out.println("Please specify number starting from 1");
        } else if (num == 1) {
            System.out.print(fib1);
        } else if (num == 2) {
            System.out.print(fib1 + ", " + fib2);
        } else {
            System.out.print(fib1 + ", " + fib2);
            for (int i = 2; i < num; i++) {
                int fib = fib2 + fib1;
                System.out.print(", " + fib);
                fib2 = fib;
                fib1 = fib - fib1;
            }
        }
    }

   /* public static int printfibonnaciRecursive(int num) {
        if (num == 1) {
            return 1;
        } else if (num == 2) {
            return 1;
        } else {
            int fib = printfibonnaciRecursive(num - 1) + printfibonnaciRecursive(num - 2);
            return fib;
        }
    } */

    public static void switchCaseExample(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Отлично!");
                //break;
            case 'B':
            case 'C':
                System.out.println("Отлично выполнено");
                //break;
            case 'D':
                System.out.println("Вы прошли");
                //break;
            case 'F':
                System.out.println("Лучше попробуйте снова");
                break;
            default:
                System.out.println("Неверная оценка");
        }
        System.out.println("Ваша оценка " + grade);
    }

}
