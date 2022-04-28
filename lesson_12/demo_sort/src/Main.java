import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);

        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println("DS sau khi sắp xếp: " + numbers);

        Collections.reverse(numbers);
        System.out.println(numbers);

//        Collections.shuffle(numbers);
//        System.out.println(numbers);

        Collections.swap(numbers,0, numbers.size()-1);
        System.out.println(numbers);


        ArrayList<String> name = new ArrayList<>();
        name.add("Nghĩa");
        name.add("Tuấn");
        name.add("Quang");
        name.add("Quang");
        name.add("Nam");

        ArrayList<String> names = new ArrayList<>();
        names.add("Vui");
        names.add("Tươi");
        names.add("An");
        names.add("Thành");
        names.add("Ân");
        Collections.sort(names);
        System.out.println(names);



    }
}
