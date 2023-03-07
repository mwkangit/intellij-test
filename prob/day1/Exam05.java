package prob.day1;

public class Exam05 {
    public static void main(String[] args) {
        primeNumber(5);
    }

    public static void primeNumber(int num){
        for(int i = 2 ; i <= num ; i++){
            int limit = (int) Math.sqrt(i);
            if(i == 2 || i == 3){
                System.out.println(i);
            }else if(i % 2 == 0){
                continue;
            }else{
                boolean flag = true;
                for(int j = 3 ; j <= limit ; j=j+2){
                    if(i % j == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    System.out.println(i);
                }
            }

        }
    }
}
