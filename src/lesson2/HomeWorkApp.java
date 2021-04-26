package lesson2;

import java.util.Scanner;

public class HomeWorkApp {

    private static boolean sum(int a, int b) {

        return (a + b >= 10 && a + b <= 20);
    }
    private static void numberInteger(int a){

        if (a>=0) {
            System.out.println("Число положительное");
        }else {
            System.out.println("Число отрицательно");
        }
    }
    private static boolean numberInteger2(int a){

        return a < 0;

    }
    private static void printLabel(String label, int a){

        for (int i=0; i<a; i++){
            System.out.println(label);
        }

    }
    private static boolean leap(int a){

        return (a%4==0)&&((a%100!=0)||(a%400==0));

    }
    public static void main(String[] args) {


        System.out.println("Используем метод проверяющий, что сумма двух чисел лежит в пределах от 10 до 20 ");
        System.out.print("Введите целое число a ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        System.out.print("Введите целое число b ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();
        if (sum(a,b)) {
            System.out.println("Сумма чисел от 10 до 20 (включительно)");
        } else{
            System.out.println("Сумма числе меньше 10 или больше 20");
        }



        System.out.println("Используем метод проверяющий, положительно или отрицательное число введено (способ 1)");
        System.out.print("Введите целое число a ");
        Scanner scan3 = new Scanner(System.in);
        a = scan3.nextInt();
        numberInteger(a);


        System.out.println("Используем метод проверяющий, положительно или отрицательное число введено (способ 2)");
        System.out.print("Введите целое число a ");
        scan3 = new Scanner(System.in);
        a = scan3.nextInt();
        if (numberInteger2(a)) {
            System.out.println("Число отрицательное");
        }else {
            System.out.println("Число положительное");
        }


        System.out.println("Используем метод выводящий строку несолкько раз");
        System.out.print("Введите строку, которую должен вывсети метод ");
        String label = new Scanner(System.in).nextLine();
        System.out.print("Введите сколько раз требуется вывести строку ");
        scan3 = new Scanner(System.in);
        a = scan3.nextInt();
        printLabel(label,a);


        System.out.println("Используем метод проверяющий, високосный ли год");
        System.out.print("Введите год ");
        scan3 = new Scanner(System.in);
        a = scan3.nextInt();
        if (leap(a)) {
            System.out.println("Год високосный");
        }else {
            System.out.println("Год не високосный");
        }




    }

}
