package ru.geekbrains.java_2_HomeWorkApp;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println(symma10and20(1, 7));
        priznacChisla(10);
        System.out.println(blPriznakChisla(0));
        printString( "testtest", 5);
        System.out.println(vesocosYear(12));
    }
    public static boolean symma10and20(int a, int b) {
        return (10 <= a+b && a+b <= 20);
        }
    public static void priznacChisla(int a) {
        if (a >= 0) {
            System.out.println("Положительное ");
        } else {
            System.out.println("Отрицательное ");
        }
    }
    public static boolean blPriznakChisla(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printString(String word, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(word);
        }
    }
        public static boolean vesocosYear(int year){
        return (year % 4 ==0 && year % 100 !=0 || year % 400 == 0);

    }
}




