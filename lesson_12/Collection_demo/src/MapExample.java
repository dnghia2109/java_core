import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        // HashMap sắp xếp theo thứ tự tăng dần của key
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Nghĩa");
        hashMap.put(2, "Nam");
        hashMap.put(5, "Phong");
        hashMap.put(3, "Đức");
        hashMap.put(4,"Hoa");
        System.out.println(hashMap);

        // Có thể sử dụng put() để cập nhật lại gtri của key tương ứng.
        hashMap.put(3,"Quân");
        System.out.println(hashMap);

        System.out.println(hashMap.get(1));

        hashMap.remove(1);
        System.out.println(hashMap);

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
