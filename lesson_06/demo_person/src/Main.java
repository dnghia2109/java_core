import model.Person;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng p1
        Person p1 = new Person();
        p1.name = "Linh";
        p1.age = 20;
        p1.address = "Hà Nội";
        p1.study();
        System.out.println(p1.name + " - " + p1.age + " - " + p1.address + " - " + Person.school);

        Person p2 = new Person();
        p2.name = "Nghĩa";
        p2.age = 20;
        p2.address = "Hà Nội";
        p2.study();
        System.out.println(p2.name + " - " + p2.age + " - " + p2.address + " - " + Person.school);

        Person.method();

//        model.Dog d1 = new model.Dog();
//        d1.color = "White";
//        d1.breed = "bla bla";
//        d1.age = 2;
//        d1.size = "Medium";
//        d1.age();
//        d1.size();
//        d1.color();
//        d1.eat();


        // Vd cho Constructor
        Person p3 = new Person("Nam", 20, "Hà Nội");
        System.out.println("\n" + p3.name + " - " + p3.age + " - " + p3.address);

        System.out.println("Cập nhật tuổi của Nam.");
        p3.age = 21;
        System.out.println( p3.name + " - " + p3.age + " - " + p3.address);
    }
}
