import java.util.ArrayList;

public class TestSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Nghĩa", 20, "HN", 8));
        students.add(new Student("Long", 20, "HN", 9));
        students.add(new Student("Nam", 20, "HN", 10));

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Ngọc", 26, "HN", 20000000));
        teachers.add(new Teacher("Khôi", 27, "HN", 30000000));
        teachers.add(new Teacher("Cường", 28, "HN", 40000000));

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("A", 20, "HN"));
        persons.add(new Person("B", 21, "HN"));
        persons.add(new Person("C", 22, "HN"));

        System.out.println("- DS học sinh:");
        showList(students);
        System.out.println("===================");

        System.out.println("- DS giảng viên:");
        showList(teachers);
        System.out.println("===================");

        System.out.println("- DS người:");
        showList(persons);


    }

    public static void showList(ArrayList<?> list){
        for (Object o : list){
            System.out.println(o);
        }
    }

//    public static void showList(ArrayList<? super Student> list){
//        for (Object o : list){
//            System.out.println(o);
//        }
//    }

//    public static void showList(ArrayList<? extends Person> list){
//        for (Object o : list){
//            System.out.println(o);
//        }
//    }

//    public static void showList(ArrayList<? extends Teacher> list){
//        for (Object o : list){
//            System.out.println(o);
//        }
//    }
}
