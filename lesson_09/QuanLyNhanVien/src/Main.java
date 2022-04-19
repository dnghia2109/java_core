//Viết chương trình quản lý nhân viên của 1 cty gồm 2 loại nhân viên:
//Dev: id, name, do, address, gender, mobile,email, salary, ot
//Tester: id, name, do, address, gender, mobile,email, salary, bug
//
//- Xem ds nhân viên.
//- Xem ds nhân viên theo loại nhân viên.
//- Thực hiện tính lương :
//    + Dev: salary + (ot*200000)
//    + Tester: salarry + (bug*50000)


import Upcasting_Downcasting.Animal;
import Upcasting_Downcasting.Dog;

public class Main {
    public static void main(String[] args) {
        // Upcasting
        Animal animal = new Dog();
        animal.method1();
        animal.method2();

        //Downcasting
        Dog dog = (Dog) animal;
        dog.method1();
        dog.method2();
        dog.method3();
    }
}
