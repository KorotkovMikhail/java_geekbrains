package lesson3;

import java.util.Scanner;
import java.util.Arrays;



public class HomeWorkApp {

    public static int[] inputArr(int n) {
        int Arr[] = new int[n];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент массива номер " + i + " ");
            Arr[i] = scan.nextInt();
        }
        return Arr;
    }
    private static int[] Arr(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }

    private static boolean checkBalance(int[] arr) {
        int balance1;
        int balance2;
        for (int i = 0; i < arr.length; i++) {
            balance1 = 0;
            balance2 = 0;
            for (int i1 = 0; i1 < i + 1; i1++) {
                balance1 = balance1 + arr[i1];
            }
            for (int i2 = i + 1; i2 < arr.length; i2++) {
                balance2 = balance2 + arr[i2];
            }
            if (balance1 == balance2) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Урок 3. Задание 1.");
        System.out.print("Введите длинну массива для первого задания ");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array1 = new int[length];
        for (int i = 0; i < length; i++) {
            array1[i] = (int) Math.round(Math.random());
        }
        System.out.println("Для первого задания сгенерирован массив: \n"  + Arrays.toString(array1));
        for (int i = 0; i < length; i++) {
            if (array1[i] == 0) {
                array1[i] = 1;
            } else {
                array1[i] = 0;
            }
        }
        System.out.println("После обработки получаем массив: \n"  + Arrays.toString(array1));

        System.out.println("Урок 3. Задание 2.");
        int[] array2 = new int[100];
        for (int i = 0; i < array2.length; i++) array2[i] = i + 1;
        System.out.println("Для задания 2 сделан массив: \n"  + Arrays.toString(array2));

        System.out.println("Урок 3. Задание 3.");
        int[] array3 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Для задания 3 задан массив: \n"  + Arrays.toString(array3));
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] = array3[i]*2;
            }
        }
        System.out.println("После обработки получился массив: \n"  + Arrays.toString(array3));

        System.out.println("Урок 3. Задание 4.");
        System.out.print("Введите длинну массива для четвертого задания ");
        scan = new Scanner(System.in);
        length = scan.nextInt();
        int[][] array4 = new int[length][length];
        for (int i = 0; i < array4.length; i++) {
            array4[i][i] = 1;
            array4[i][array4.length - 1 - i] = 1;
        }
        System.out.println("Для задания 4 сделан массив:");
        for (int[] ints : array4) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("Урок 3. Задание 5.");
        System.out.print("Введите длинну массива для пятого задания ");
        scan = new Scanner(System.in);
        length = scan.nextInt();
        System.out.print("Введите элемент для массива пятого задания ");
        scan = new Scanner(System.in);
        int value = scan.nextInt();
        System.out.println("Для задания 5 сделан массив: \n"  + Arrays.toString(Arr(length,value)));

        System.out.println("Урок 3. Задание 6.");
        System.out.print("Введите длинну массива для шестого задания ");
        scan = new Scanner(System.in);
        length = scan.nextInt();
        int[] array6 = new int[length];
        System.out.print("Введите элемент массива номер 0 ");
        array6[0] = scan.nextInt();
        int max = array6[0];
        int min = array6[0];
        for (int i = 1; i < length; i++) {
            System.out.print("Введите элемент массива номер " + i + " ");
            array6[i] = scan.nextInt();
            if (array6[i]>max) {max = array6[i];}
            if (array6[i]<min) {min = array6[i];}
        }
        System.out.println("Для задания 6 введен массив: \n"  + Arrays.toString(array6));
        System.out.println("Минимальный элемент этого массива: "  + min);
        System.out.println("максимальный элемент этого массива: "  + max);

        System.out.println("Урок 3. Задание 7.");
        System.out.print("Введите длинну массива для седьмого задания (по логике задания должна быть больше 1) ");
        scan = new Scanner(System.in);
        length = scan.nextInt();
        int[] array7 = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Введите элемент массива номер " + i + " ");
            array7[i] = scan.nextInt();
        }
        System.out.println("Для задания 7 введен массив: \n"  + Arrays.toString(array7));
        if (checkBalance(array7)) {
            System.out.println("В этом массиве есть положение баланса");
        } else {
            System.out.println("В этом массиве нет положения баланса");
        }

        System.out.println("Урок 3. Задание 8.");
        System.out.print("Введите длинну массива для седьмого задания (по логике задания должна быть больше 1) ");
        scan = new Scanner(System.in);
        length = scan.nextInt();
        int[] array8 = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Введите элемент массива номер " + i + " ");
            array7[i] = scan.nextInt();
        }

    }



}
