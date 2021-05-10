package lesson7;

import java.util.Scanner;

public class HomeWorkAppOOP {
    public static void main(String[] args) {
        String[] name = new String[] {"Барсик", "Мурзик", "Васька", "Маркиз", "Граф", "Беляш", "Шанс", "Бакс", "Гав"};
        String[] color = new String[] {"Серый", "Белый", "Черный", "Рыжий", "Коричневый", "Пятнистый", "Дымчатый"};
        System.out.print("Сколько у нас котов и кошек? ");
        Scanner scan = new Scanner(System.in);
        int lot = scan.nextInt();
        Cat[] cats = new Cat[lot];
        int a;
        int b;
        for (int i = 0; i < lot; i++) {
            a = (int)(Math.random()*(name.length));
            b = (int)(Math.random()*(color.length));
            cats[i] = new Cat(name[a], color[b], (int)(Math.random()*((20)+1)));
        }
        Plate plate = new Plate(0);
        System.out.print("Перед нами тарелка. Сколько корма насыпем?  ");
        lot = scan.nextInt();
        plate.addFood(lot);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        for (Cat cat : cats) {
            cat.info();
        }
        plate.info();
    }
}
