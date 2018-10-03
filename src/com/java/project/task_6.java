package com.java.project;
//        6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифрю
//        6.6. «Счастливые» числа.

import java.util.Scanner;

public class task_6 {
    private static int i;

    public static void main(String[] args) {
//Ввести с консоли n целых чисел.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array length: ");
        int a = sc.nextInt();
        System.out.println("Please enter array: ");
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

//  6.1. Четные и нечетные числа.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                System.out.println("Odd - " + arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.println("Even  - " + arr[i]);
        }
// 6.2. Наибольшее и наименьшее число.
        int min = arr[i];
        for (int i = 0; i < arr.length; i++)
            if (min > arr[i]) {
                min = arr[i];
            }
        System.out.println("Minimal value is - " + min);
        int max = arr[i];
        for (int i = 0; i < arr.length; i++)
            if (max < arr[i]) {
                max = arr[i];
            }
        System.out.println("Maximum value is - " + max);

//6.3/6.4 Числа, которые делятся на 3 или на 9
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            } else if (arr[i] % 9 == 0)
                System.out.println(arr[i]);

//6.4 Числа, которые делятся на 5 и на 7
        for (i = 0; i < arr.length; i++)
            if (arr[i] % 5 == 0) {
                System.out.println(arr[i]);
            } else if (arr[i] % 7 == 0) {
                System.out.println(arr[i]);
            }

//6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр
        int b, c, d;
        for (int i = 0; i < arr.length; i++)
            if ((arr[i] > 99) && (arr[i] < 1000)){
            b = arr[i] / 10 / 10;
            c = arr[i] / 10 % 10;
            d = arr[i] % 100 % 10;
            if (b != c && b != c && c != b && c != b && d != b && d != b)

                System.out.println("Number" + arr[i]);
        }
    }
}










