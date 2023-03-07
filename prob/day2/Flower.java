package prob.day2;

public class Flower {

    private String name;
    private String color = "알지못함";
    private boolean wild = true;

    public Flower(String name) {
        this(name, "알지못함", true);
    }

    public Flower(String name, String color) {
        this(name, color, true);
    }

    public Flower(String name, String color, boolean wild) {
        this.name = name;
        this.color = color;
        this.wild = wild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }
}
