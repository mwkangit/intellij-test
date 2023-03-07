package prob.day2;

public class SpeakTest {
    public static void main(String[] args) {
        Reader m1 = new Reader("길동");
        System.out.println(m1.speak());

        Worker m2 = new Worker("둘리");
        System.out.println(m2.speak());
    }
}
