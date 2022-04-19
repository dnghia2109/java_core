import java.util.ArrayList;
import java.util.Scanner;

public class Dev extends Employee {
    private int ot;
    public int getOt() {
        return ot;
    }

    public void setOt(int ot) {
        this.ot = ot;
    }

    public Dev(int id, int salary, String name, String address, String dateOfBirth, String mobile, String email, Gender gender, int ot) {
        super(id, salary, name, address, dateOfBirth, mobile, email, gender);
        this.ot = ot;
    }

    public Dev() {
    }

    public Dev inputDev(){
        Scanner sc = new Scanner(System.in);
        Dev dev = new Dev();
        System.out.println("Nhập id ");
        dev.setId(Integer.parseInt(sc.nextLine()));

        return dev;
    }


    @Override
    public void showAllEmploy() {

    }

    @Override
    public void showEmploy1() {

    }
}
