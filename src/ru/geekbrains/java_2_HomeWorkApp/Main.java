package ru.geekbrains.java_2_HomeWorkApp;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        zad1();
//        zad2();
//        zad3();
//        zad4();
//        zad5();
    }
    public static boolean zad1() {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        a = scanner.nextInt();
        System.out.println("Введите число b");
        b = scanner.nextInt();
        c=a+b;
        if (10 <=c && c <= 20) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
    public static void zad2() {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("положительное ");
        } else {
            System.out.println("отрицательное ");
        }
    }
    public static boolean zad3() {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        a = scanner.nextInt();
        if (a < 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
    public static void zad4() {
        int a;
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите сколько раз нужно отпечатать строку");
        a = scanner.nextInt();
        System.out.println("Укажите что нужно отпечать");
        s = scanner.next();
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }
        public static boolean zad5(){
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите год");
        a =scanner.nextInt();
            if (a%400== 0) {
                System.out.println("true");
                return true;
          } else if (a%100== 0){
             System.out.println("false");
              return false;
         }else if (a%4== 0){
            System.out.println("true");
              return true;
             }else { System.out.println("false");
             return false;
            }
    }
}




