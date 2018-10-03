package com.java.project;
import java.util.Scanner;

//Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please enter first number: ");
        a = sc.nextInt();
        System.out.println("Please enter second number: ");
        b = sc.nextInt();
        c = a + b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);

    }
}
