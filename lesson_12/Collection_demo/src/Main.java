import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Nghĩa", "12A", 8.7));
        list.add(new Student(2, "Đức", "11A", 8));
        list.add(new Student(3, "Trung", "12A", 7.5));
        list.add(new Student(4, "Long", "11A", 8.4));
        list.add(new Student(5, "Nguyên", "10A", 9));

        Map<String, Integer> map = new HashMap<>();
        for (Student stu : list){
            if (map.containsKey(stu.getClassroom())){
                map.put(stu.getClassroom(), map.get(stu.getClassroom()) + 1);
            }else {
                map.put(stu.getClassroom(), 1);
            }
        }
        System.out.println(map);
    }
}
