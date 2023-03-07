package prob.day1;

public class Exam01 {
    public static void main(String[] args) {
        gcd(2, 5);
        gcd(5, 15);
        gcd(250, 30);
    }

    public static void gcd(int a, int b){
        System.out.println(a + ":" + b);
        if(b > a){
            int sub = a;
            a = b;
            b = sub;
        }
        while(a % b != 0){
            int sub = a % b;
            a = b;
            b = sub;
        }
        System.out.println(b);
    }

}
