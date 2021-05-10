package lesson6.animals;

import lesson6.Animal;

public class Cat extends Animal {
    public static int countCat;
    public Cat(String name) {
        super(name);
        countCat++;
    }

    @Override
    public void run(int distance) {
        if (distance<=200){
            System.out.println(this.name + " пробежал " + distance + " метров.");
        } else {
            System.out.println(this.name + " пробежал 200 метров и лег поспать. Коты не дураки столько бегать. Оставшиеся " + (distance-200) + " метров " + this.name + " пробежит в другой раз");
        }
    }

    @Override
    public void swim(int distance) {
            System.out.println(this.name + " - кот и не умеет плавать.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
