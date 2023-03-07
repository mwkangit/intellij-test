package prob.day2;

public class Worker extends Man implements Speakable{

    public Worker(String name) {
        super(name);
    }

    public void Worker(String name){

    }

    @Override
    public String speak() {
        return getName() + " 일꾼은 자기가 맡은 일을 열심히 한다!!";
    }
}
