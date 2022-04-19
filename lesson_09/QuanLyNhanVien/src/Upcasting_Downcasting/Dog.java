package Upcasting_Downcasting;

public class Dog extends Animal{
    @Override
    public void method1() {
        super.method1();
        System.out.println("Lớp con ghi đè method1");
    }

    @Override
    public void method2() {
        super.method2();
        System.out.println("Lớp con ghi đè method2");
    }

    public void method3(){
        System.out.println("method 3 của lớp con");
    }
}
