public class PrintData {
    public static void main(String[] args) {
        String name = "Nghĩa";
        int age = 21;
        String add = "HN";
        System.out.println("Xin chào các bạn, tên tôi là: " + name + ", năm nay tôi: " + age + " tuổi, tôi đến từ " + add);

        System.out.printf("Xin chào các bạn, tên tôi là: %s, năm nay tôi: %d tuổi, tôi đến từ %s", name, age, add);

        System.out.printf("\n %f + %f = %f", 9f, 8.5, (8.5+9));
    }
}
