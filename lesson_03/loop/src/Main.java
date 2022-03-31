import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++){
//            System.out.println("Hello World");
//        }
//
//        for (int i = 0; i <= 10; i++){
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//       WHILE LOOP
//        int i = 0;
//        while (i < 10){
//            System.out.println("Hello World");
//            i++;
//        }

//        Scanner sc = new Scanner(System.in);
//        int age = 0, count = 0;
//        boolean isContinue = true;
//        while(isContinue){
//            System.out.println("Nhập tuổi: ");
//            age = sc.nextInt();
//            count++;
//
//            if (age > 0){
//                isContinue = false;
//            }
//
//            if (count >= 3){
//                System.out.println("Bạn đã nhập quá 3 lần.");
////                isContinue = false;
//                System.exit(0);
//            }
//
//        }
//        System.out.println("Tuổi của bạn là: " + age);

//        DO-WHILE
//        int i = 0;
//        do{
//            System.out.println("Hello World");
//            i++;
//        }while (i < 10);

//        for (int i = 0; i <= 30; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }else if ( i % 3 == 0){
//                System.out.println("Fizz");
//            }else{
//                System.out.println(i);
//            }
//        }

        for (int i = 0; i <= 30; i++){
            if ( i % 3 == 0){
                if ( i % 5 == 0){
                    System.out.println("FizzBuzz");
                }else{
                    System.out.println("Fizz");
                }
            }else{
                if (i % 5 == 0){
                    System.out.println("Buzz");
                }else {
                    System.out.println(i);
                }
            }
        }



    }
}
