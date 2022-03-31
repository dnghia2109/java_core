import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Tạo đối tượng
        // <Tên class> <tên biến tham chiếu> = new <Tên class>;
//        Calculator calculator = new Calculator();
//
//        //Gọi phương thức sum()
//        calculator.sum();
//
//        //Gọi phương thức minus()
//        calculator.minus(6, 5);

//        Bmi bmi = new Bmi();
//        bmi.bmiCalculator();
//        bmi.bmiCalculator2(1.65, 57);

        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập chiều cao: ");
//        double height = sc.nextDouble();
//        System.out.println("Nhập cân nặng: ");
//        double weight = sc.nextDouble();
//
//        double bmiResult = bmi.bmiCalculator3(height, weight);
////        double bmiResult = bmi.bmiCalculator3(1.65, 57);
//        System.out.println("Chỉ số BMi của bạn là: " + bmiResult );
////        bmi.result(bmiResult);
//        System.out.println(bmi.result(bmiResult));

        Circle circle = new Circle();
        System.out.println("Nhập bán kính của hình tròn: ");
        double r = sc.nextDouble();
        System.out.println("diện tích: " + circle.areaCircle(r));
        System.out.println("Chu vi: " + circle.perimeterCircle(r));
    }
}
