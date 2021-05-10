package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке: " + food + " грамм еды");
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void addFood(int amount) {
        food += amount;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
