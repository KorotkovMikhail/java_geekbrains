package lesson6;

import lesson6.animals.Cat;
import lesson6.animals.Dog;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на спортивный фестиваль среди животных!");
        while (true) {
            int i;
            int distance;
            Animal animal = null;
            Scanner scan = new Scanner(System.in);
            System.out.print("Зарегистрировать нового участника? 1 - кот, 2 - собака, 3 - хватит на сегодня участников ");
            i = scan.nextInt();
            if (i == 3){
                break;
            } else if (i == 1) {
                System.out.print("Введите кличку кота ");
                scan = new Scanner(System.in);
                animal = new Cat(scan.nextLine());
            } else if (i == 2) {
                System.out.print("Введите кличку собаки ");
                scan = new Scanner(System.in);
                animal = new Dog(scan.nextLine());
            }
            while (true) {
                System.out.print("Что сделать участнику " + animal.name + "? 1 - бежать, 2 - плыть. ");
                scan = new Scanner(System.in);
                i = scan.nextInt();
                if ((i == 1)||(i == 2)){
                    break;
                } else {
                    System.out.print("Задание неккоректно. Наш участник еще не умеет делать подобное. Попробуйте снова.");
                }
            }
            System.out.print("Введите дистанцию. ");
            scan = new Scanner(System.in);
            distance = scan.nextInt();
            if (i == 1) {
                animal.run(distance);
            } else {
                animal.swim(distance);
            }
        }
        System.out.println("Поздравляем с окончанием фестиваля.");
        System.out.println("Всего в нем приняло участие " + Animal.countAnimal + " животных");
        System.out.println("Из них " + Cat.countCat + " котов");
        System.out.println("Из них " + Dog.countDog + " собак");
    }
}
