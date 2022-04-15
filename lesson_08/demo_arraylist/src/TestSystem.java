import java.util.ArrayList;
import java.util.Scanner;

public class TestSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonService service = new PersonService();
        ArrayList<Person> list = service.getAllPerson();

        service.show(list);

//        Person newPerson = service.createPerson();
//        service.addPerson(list, newPerson);
//
//        System.out.println("Danh sách sau khi thêm: ");
//        service.show(list);

        //Xóa đối tượng
        System.out.println("Nhập id đối tượng cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());

        Person fPerson = service.findPersonById(list, id);
        service.removePerson(list, fPerson);

        //fPerson.setAddress("Bắc Ninh");

        System.out.println("Danh sách sau khi xóa: ");
        service.show(list);

        //-----------------------------------------------------
        //Cập nhật địa chỉ
        System.out.println("Nhập id đối tượng cần cập nhật địa chỉ: ");
        int fId = Integer.parseInt(sc.nextLine());
        Person updatePerson = service.findPersonById(list, fId);
        System.out.println("Đối tượng bạn tìm được là: ");
        System.out.println(updatePerson);

        System.out.println("Nhập địa chỉ mới: ");
        String newAddress = sc.nextLine();
        service.updateAddress(updatePerson, newAddress);

        System.out.println("Danh sách sau khi cập nhật: ");
        service.show(list);

    }
}