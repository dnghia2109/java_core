import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> integers = new ArrayList<>();
        ClassGeneric<String> string = new ClassGeneric<>("hello");
        string.setObj("HI");
        System.out.println(string.getObj());

        ClassGeneric<Integer> integers = new ClassGeneric<>(8);
        integers.setObj(9);
        System.out.println(integers.getObj());
    }
}
