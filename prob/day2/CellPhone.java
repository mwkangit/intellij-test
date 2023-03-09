package prob.day2;

public class CellPhone {
    private String model;
    private double battery;

    public CellPhone(String model) {
        this.model = model;
    }

    public void call(int time){
        if(time < 0){
            System.out.println("통화시간입력오류");
        }else{
            System.out.println("통화 시간 : " + time + "분");
            battery -= time * 0.5;
            if(battery < 0){
                battery = 0;
            }
        }
    }

    public void charge(int time){
        if(time < 0){
            System.out.println("충전시간입력오류");
        }else{
            System.out.println("충전 시간 : " + time + "분");
            battery += time * 3;
            if(battery > 100){
                battery = 100;
            }
        }
    }

    public void printBattery(){
        System.out.println("남은 배터리 양 : " + battery);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CellPhone){
            CellPhone c = (CellPhone) obj;
            if(this.model.equals(c.model)){
                return true;
            }
        }
        return false;
    }
}
