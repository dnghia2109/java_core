public class Main {
    public int age;
    public static final float PI = 3.14f;
    public static void main(String[] args) {

//	    System.out.println("Hello world");
//        System.out.println("Xin chào");
//
//        int age; //Khai báo biến
//        age = 26;
//        long salary = 10000000L;
//        System.out.println("Lương của tôi là: " + salary);
//
//        float weight = 57f; //Khi sd kiểu float phải có f sau giá trị của biến
//        double height = 1.6;
//
//        char a = 'a';
//        char num = '5';
//        char s = 65
//        System.out.println(PI);
//        System.out.println("\"Nghĩa\"");
//
//
//        double height = 1.65;
//        double weight = 57;
//        double bmi = weight/(height*height);
//        System.out.println(bmi);
//
//        float math = 8.5f;
//        float physic = 8f;
//        float chemistry = 6.75f;
//        float avr = (math+physic+chemistry)/3;
//        System.out.println(avr);

        int a = 5;
        int b= 2;
        double c = (double)a/b;
        System.out.println(c);

        System.out.println(a%2 == 0 ? a+" là số chẵn " : a+ " là số lẻ");

        int age = 10;
        System.out.println(age >= 18 ? "Đủ tuổi bầu cử" : "Bạn chưa đủ tuổi bầu cử");
    }
}
