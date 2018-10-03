package com.java.project;
//Отобразить в окне консоли аргументы командной строки в обратном порядке

import java.util.Arrays;
public class task2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));
        {for (int i = 5; i > 0; i--) {
            System.out.println(i);}
        }
    }
}