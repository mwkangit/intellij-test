package prob.day1;

public class Exam04 {
    public static void main(String[] args) {
        gugudan(3);
        gugudan(1);
    }
    public static void gugudan(int num){
        if(num < 2 || num >9){
            System.out.println("잘못된 숫자가 입력되었습니다.");
        }else{
            StringBuilder sb = new StringBuilder();
            for(int i = 1 ; i <= 9 ; i++){
                sb.append(num).append(" * ").append(i).append(" = ").append(num*i).append("\n");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb);
        }
    }
}
