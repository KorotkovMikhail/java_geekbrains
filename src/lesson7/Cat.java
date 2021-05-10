package lesson7;

public class Cat {
    private String name;
    private String color;
    private int appetite;
    private boolean satiety;

    public Cat(String name, String color, int appetite) {
        this.name = name;
        this.color = color;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        if (p.getFood() > this.appetite) {
            p.decreaseFood(appetite);
            this.satiety = true;
            System.out.println(this.color + " " + this.name + " съел " + this.appetite + " грамм еды.");
        } else {
            System.out.println(this.color + " " + this.name + " проигнорировал тарелку с остатками");
        }
    }

    public void info() {
        if (satiety) {
            System.out.println(this.color + " " + this.name + " сыт.");
        } else {
            System.out.println(this.color + " " + this.name + " голоден");
        }
    }
}
