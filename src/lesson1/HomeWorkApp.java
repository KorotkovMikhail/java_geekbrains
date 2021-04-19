package lesson1;


import java.util.Scanner;

public class HomeWorkApp {

    public static void  printThreeWords(){

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {
        System.out.println("Используем метод checkSumSign");

        System.out.print("Введите целое число a ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        System.out.print("Введите целое число b ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();


        if (a + b > 0) {
            System.out.println("Сумма положительная");
        } else if (a + b == 0) {
            System.out.println("Сумма равна 0");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){

        System.out.println("Используем метод printColor");

        System.out.print("Введите целое число a ");
        Scanner scan1 = new Scanner(System.in);
        int value = scan1.nextInt();

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers(){
        System.out.println("Используем метод compareNumbers");

        System.out.print("Введите целое число a ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        System.out.print("Введите целое число b ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();

        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }


    }

    public static void main(String[] args) {


        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();



    }
}
