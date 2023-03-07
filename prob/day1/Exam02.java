package prob.day1;

public class Exam02 {
    public static void main(String[] args) {
        sum(7);
        sum(16);
        sum(11);
    }

    public static void sum(int num){
        int result = 0;
        if(num % 2 == 1){
            result = odd(num);
        }else{
            result = even(num);
        }
        System.out.println(result);
    }
    public static int odd(int num){
        int sum = 0;
        for(int i = 1 ; i <= num ; i=i+2){
            sum += i;
        }
        return sum;
    }
    public static int even(int num){
        int sum = 0;
        for(int i = 0 ; i <= num ; i=i+2){
            sum += i;
        }
        return sum;
    }
}
