package prob.day2;

public class TestAnimals {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.play();
        Cat cat = new Cat("Fluffy");
        cat.play();
        Spider spider = new Spider();
        spider.eat();
        spider.walk();
        fish.walk();
    }
}
