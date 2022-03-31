import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
//        Sinh ra số ngẫu nhiên

//        Random rd = new Random();
//        boolean isCheck = true;
//        while (isCheck){
//            int randomNumber = rd.nextInt(100);
//            System.out.println("Số ngẫu nhiên: " + randomNumber);
//
//            if (randomNumber > 90){
//                isCheck = false;
//            }
//        }

        //Viết chương trình sinh 1 số ngẫu nhiên. THức hiện nhập 1 số từ bàn phím.
        // So sánh 2 số rdNumber và number.
        // Trong trường hợp rdNuber > number ===> sout("Bạn nhập số lớn hơn rồi.") và cho lặp lại
        // Trong trường hợp rdNuber < number ===> sout("Bạn nhập số bé hơn rồi.") và cho lặp lại
        // Trong trường hợp rdNuber = number ===> sout("Bạn nhập đúng rồi.")

        Random rd = new Random();
        int randomNumber = rd.nextInt(100);
        System.out.println("Số ngẫu nhiên: " + randomNumber);
        Scanner sc = new Scanner(System.in);
        boolean isChecked = true;
        while (isChecked){
            int number = sc.nextInt();
            if (number > randomNumber){
                System.out.println("Bạn nhập số lớn hơn rồi. Hãy thử nhập lại");
            }
            else if(number < randomNumber){
                System.out.println("Bạn nhập số nhỏ hơn rồi. Hãy thửu nhập lại:");

            }else{
                System.out.println("Bạn nhập đúng rồi!");
                isChecked = false;
            }
        }
    }
}
