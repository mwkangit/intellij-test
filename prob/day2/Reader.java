package prob.day2;

public class Reader extends Man implements Speakable{

    public Reader(String name) {
        super(name);
    }

    public void Reader(String name){

    }

    @Override
    public String speak() {
        return getName() + " 독자는 자바를 잘 하고 싶다!!";
    }
}
