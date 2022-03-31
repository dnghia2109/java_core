import java.util.Scanner;
import java.util.Set;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        do {
            System.out.println("Nhập a: ");
            a = sc.nextInt();
        }
        while(a == 0);
        System.out.println("Nhập b: ");
        b = sc.nextInt();
        System.out.println("Nhập c: ");
        c = sc.nextInt();

        double delta = b*b - 4*a*c;
        if (delta > 0){
            System.out.println("Phương trình có 2 nghiệm phân biệt:\n x1 = " + (-b - Math.sqrt(delta))/(2*a) + "\n x2 = "
                    + (-b - Math.sqrt(delta))/(2*a) );
        }else if(delta == 0){
            System.out.println("Phương trình có nghiệm kép:\n x = " + (-b/(2*a)));
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
