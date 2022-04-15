import java.util.ArrayList;
import java.util.Scanner;

public class PersonService {

    public ArrayList<Person> getAllPerson(){
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person(1,"Huy", 28, "Hà Nội"));
        list.add(new Person(2,"Quang", 20, "Hà Nội"));
        list.add(new Person(3,"Thịnh", 24, "Hà Nội"));
        list.add(new Person(4,"Linh", 27, "Hà Nội"));

        return list;
    }

    public void show(ArrayList<Person> list){
        for(Person p : list){
            System.out.println(p);
        }
    }

    //Tạo đối tượng person
    public Person createPerson(){
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        System.out.println("Nhập id: ");
        p.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập tên: ");
        p.setName(sc.nextLine());
        System.out.println("Nhập tuổi: ");
        p.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập địa chỉ: ");
        p.setAddress(sc.nextLine());

        return p;
    }

    //Thêm đối tượng person vào ArrayList
    public boolean addPerson(ArrayList<Person> list, Person p){
        return list.add(p);
    }

    //Tìm đối tượng theo id
    public Person findPersonById(ArrayList<Person> list, int id){
        Person fPerson = null;
        for(Person p : list){
            if(p.getId() == id){
                fPerson = p;
            }
        }
        return fPerson;
    }

    //xóa đối tượng ra khỏi danh sách
    public void removePerson(ArrayList<Person> list, Person person){
        list.remove(person);
    }

    //Cập nhật địa chỉ
    public void updateAddress(Person p, String address){
        p.setAddress(address);
    }
}