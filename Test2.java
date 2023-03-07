public class Test2 {
    public static void main(String[] args) {
        /*
        점수가 90점이상이면 A
        80점이상이면 B
        70점이상이면 C
        60점이상이면 D
        60점미만이면 F
         */
        int score = 0;
        char grade;
        if(score >= 90){
            grade = 'A';
        }else if(score >= 80){
            grade = 'B';
        }else if(score >= 70){
            grade = 'C';
        }else if(score >= 60){
            grade = 'D';
        }else{
            grade = 'F';
        }

        System.out.println(grade);

        char letter = 'A';
        char[] alphabet = new char[26];
        for(int i = 0 ; i < alphabet.length ; i++){
            alphabet[i] = (char) (letter + i);
        }
        for(char c : alphabet){
            System.out.println(c);
        }
    }


}
