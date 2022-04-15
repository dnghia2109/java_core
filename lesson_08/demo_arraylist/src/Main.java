import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> strList = new ArrayList<>();
//        //Thêm phần tử vào arraylist
//        strList.add("Java");
//        strList.add("HTML");
//        strList.add("Python");
//        strList.add("Ruby");
//
//        for(String s : strList){
//            System.out.println(s);
//        }
//
//        //SẮp xếp
//        Collections.sort(strList);
//        System.out.println("Danh sách sau khi sắp xếp: ");
//        for(String s : strList){
//            System.out.println(s);
//        }
//
//        System.out.println("Phần tử có index bằng 2 là: " + strList.get(2));
//
//        for(int i = 0; i < strList.size(); i++){
//            if(strList.get(i).contains("y")){
//                System.out.println(strList.get(i));
//            }
//        }
//
//        System.out.println(strList.contains("ruby"));
//
//        ArrayList<String> strList2 = new ArrayList<>();
//        strList2.add("C/C++");
//        strList2.add("PHP");
//        strList2.addAll(strList);
//
//        System.out.println(strList2);

//        strList.set(1, "MySQL");
//        System.out.println("Danh sách sau khi cập nhật: ");
//        for(String s : strList){
//            System.out.println(s);
//        }
//
//        strList.remove("Java");
//        System.out.println("Danh sách sau khi xóa Java: ");
//        for(String s : strList){
//            System.out.println(s);
//        }
//
//        strList.remove(1);
//        System.out.println("Danh sách sau khi xóa index = 1: ");
//        for(String s : strList){
//            System.out.println(s);
//        }
//
//        System.out.println("Số phần tử: " + strList.size());
//
//        strList.clear();
//
//        System.out.println("Số phần tử: " + strList.size());

//        ArrayList<Integer> intList = new ArrayList<>();
//
//        for(int i = 1; i <= 10; i++){
//            intList.add(i);
//        }
//
//        System.out.println(intList);
//
//        System.out.println("Các phần tử là số chẵn: ");
//        int count = 0;
//        for (int i : intList){
//            if(i%2 == 0 ){
//                System.out.print(i + "\t");
//                count++;
//            }
//        }
//        System.out.println("\n Số phần tử chẵn: " + count);
//
//        ArrayList<Double> doubleList = new ArrayList<>();
//
//        ArrayList<Character> charList = new ArrayList<>();

        //ArrayList list = new ArrayList();


        Person p = new Person(1, "Ngọc", 26, "Hà Giang");
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(p);
        personList.add(new Person(2, "Huy", 28, "Hà Nội"));
        personList.add(new Person(3, "Quang", 20, "Hà Nội"));
        personList.add(new Person(4, "Thịnh", 24, "Hà Nội"));
        personList.add(new Person(5,"Linh", 27, "Hà Nội"));

        for (Person person : personList){
            System.out.println(person.getName() + " - " + person.getAge()
                    + " - " + person.getAddress());
        }

        Person findPerson = null;
        for(Person person : personList){
            if(person.getName().equals("Quang")){
                findPerson = person;
            }
        }

        personList.remove(findPerson);

        System.out.println("Danh sách sau khi xóa Quang: ");
        for (Person person : personList){
            System.out.println(person.getName() + " - " + person.getAge()
                    + " - " + person.getAddress());
        }
    }
}