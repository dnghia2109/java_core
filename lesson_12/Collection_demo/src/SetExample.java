import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExample {
    public static void main(String[] args) {

        // HashSet sẽ tự động sắp xếp gtri các phần tử theo thú tự tăng dần.
        // Khộng lấy phần tử có gtri trùng nhau.
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(2);
        hashSet.add(9);
        hashSet.add(6);
        hashSet.add(9);
        System.out.println(hashSet);

        // LinkedHashSet duy trì thứ tự khi sắp xếp.
        // Không cho trùng lặp.
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(2);
        linkedHashSet.add(8);
        linkedHashSet.add(7);
        linkedHashSet.add(2);
        System.out.println(linkedHashSet);




    }
}
