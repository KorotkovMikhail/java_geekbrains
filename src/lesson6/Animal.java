package lesson6;

public abstract class Animal {
    protected String name;
    public static int countAnimal;

    public Animal(String name) {
        this.name = name;
        countAnimal++;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
