package com.java.project;
//Приветствовать любого пользователя при вводе его имени через командную строку

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome to Java world " + name);
    }
}
