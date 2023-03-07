package prob.day1;

public class Exam06 {
    public static void main(String[] args) {
        factorial(5);
    }

    public static void factorial(int num){
        if(num < 2 || num >9){
            System.out.println("잘못된 숫자가 입력되었습니다.");
        }else{
            int result = 1;
            for(int i = 2 ; i <= num ; i++){
                result *= i;
            }
            System.out.println(result);
        }
    }
}
