package prob.day2;

public class CellPhoneMain {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone("애플");
        CellPhone cellPhone1 = new CellPhone("애플");
        cellPhone.charge(20);
        cellPhone.printBattery();
        cellPhone.call(300);
        cellPhone.printBattery();
        cellPhone.charge(50);
        cellPhone.printBattery();
        cellPhone.call(40);
        cellPhone.printBattery();
        System.out.println(cellPhone.equals(cellPhone1));


    }



}
