import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainPerson {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Nghĩa", "HN", 21)) ;
        list.add(new Person("Nam", "HN", 21));
        list.add(new Person("Ngọc", "NĐ", 22));

        for (Person p : list){
            System.out.println(p);
        }

//        Collections.sort(list);
//        System.out.println("DS sau khi sắp xếp:");
//        for (Person person : list){
//            System.out.println(person);
//        }

//        Collections.sort(list, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//
//        System.out.println("DS sau khi sắp xếp theo tên:");
//        for (Person person : list){
//            System.out.println(person);
//        }

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("DS sau khi sắp xếp theo tuổi:");
        for (Person person : list){
            System.out.println(person);
        }
    }

}
