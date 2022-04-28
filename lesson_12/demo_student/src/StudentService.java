import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentService {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("1", "Nghĩa", "A2", 9));
        list.add(new Student("2", "Nam", "A3", 8.9f));
        list.add(new Student("3", "Đức", "A4", 9.8f));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getPoint() > o2.getPoint() ? 1 : -1;
            }
        });

        System.out.println("DS sau khi sắp xếp theo điểm:");
        for (Student student : list){
            System.out.println(student);
        }
    }
}
