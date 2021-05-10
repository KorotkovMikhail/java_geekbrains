package lesson7;

import java.util.Scanner;

public class HomeWorkAppString {
    private static void presentation(String str){
        System.out.println("Последний символ строки: " + str.charAt(str.length()-1));
        System.out.println("Строка заканчивается на \"!!!\": " + str.endsWith("!!!"));
        System.out.println("Строка начинается на \"I like\": " + str.startsWith("I like"));
        System.out.println("Строка содержит \"Java\": " + str.contains("Java"));
        System.out.println("Позиция Java в строке: " + str.indexOf("Java"));
        System.out.println("Строка с заменой \"а\" на \"о\": " + str.replace("a", "o"));
        System.out.println("Строка в верхнем регистре: " + str.toUpperCase());
        System.out.println("Строка в нижнем регистре: " + str.toLowerCase());
        System.out.println("Вырезанное слово \"Java\": " + str.substring(str.indexOf("Java"),str.indexOf("Java") + 4));
    }
    public static void main(String[] args) {
        System.out.println("Введите строку для проверки ");
        Scanner scan = new Scanner(System.in);
        presentation(scan.nextLine());
    }
}
