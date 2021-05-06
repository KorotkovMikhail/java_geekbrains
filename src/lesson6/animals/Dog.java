package lesson6.animals;

import lesson6.Animal;

public class Dog extends Animal {
    public static int countDog;
    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void run(int distance) {
        if (distance<=500){
            System.out.println(this.name + " пробежал " + distance + " метров.");
        } else {
            System.out.println(this.name + " пробежал 500 метров и устал. Оставшиеся " + (distance-500) + " метров " + this.name + " пробежит как только чуть-чуть отдохнет");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance<=10){
            System.out.println(this.name + " проплыл " + distance + " метров.");
        } else {
            System.out.println(this.name + " проплыл 5 метров и вернулся на берег Всего проплыв 10 метров. Если бы " + this.name + " заплыл дальше на требуемые " + distance + " метров, он мог бы утонуть.");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
