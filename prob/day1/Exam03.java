package prob.day1;

import java.util.HashMap;

public class Exam03 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        init(map);
        monthCheck(3, map);
        monthCheck(2, map);
        monthCheck(13, map);
    }
    public static void init(HashMap<Integer, Integer> map){
        map.put(1, 31);
        map.put(2, 28);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);
    }
    public static void monthCheck(int month, HashMap<Integer, Integer> map){
        int days = 0;
        if(month <= 12 && month >= 1){
            days = map.get(month);
        }
        System.out.println(month + " 월은 " + days + " 일까지 있습니다.");
    }
}
