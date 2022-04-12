import model.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Nghĩa");
        p.setAge(21);
        p.setAddress("LB,HN");
        System.out.println(p.getName() + " - " + p.getAge() + " - " + p.getAddress());
    }
}
