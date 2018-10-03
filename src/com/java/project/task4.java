package com.java.project;
//Ввести пароль из командной строки и сравнить его со строкой-образцом
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password1 = sc.next();
        String  password2 = "Password2";

        if (password1.equals(password2))
        {
            System.out.println("Welcome to java world, Alex!");
        }
        else
         {
            System.out.println("Password is wrong");
        }
    }
}
