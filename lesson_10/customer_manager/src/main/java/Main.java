import com.google.gson.Gson;

import javax.swing.plaf.ComponentUI;

public class Main {
    public static void main(String[] args) {
//        String json = "{\"id\":1,\"first_name\":\"Boigie\",\"last_name\":\"Macknish\",\"email\":\"bmacknish0@barnesandnoble.com\",\"gender\":\"Agender\"}";
//
//        // Tạo đối tượng Gson
//        Gson gson = new Gson();
//
//        // Chuyển từ JSON sang Object
//        Customer customer = gson.fromJson(json, Customer.class);
//        System.out.println(customer.getFirstName() + " - " + customer.getLastName() + " - " + customer.getId());
//
//        // CHuyển từ Object sang JSON
//        Customer customer1 = new Customer(21,"Lại","Nghĩa","ld21@gmai.com","Nam");
//
//        String jsonCustomer = gson.toJson(customer1);
//        System.out.println(jsonCustomer);

        CustomerService service = new CustomerService();
        System.out.println("Chuyển từ ArrayList sang Json:");
        service.getCustomerArray();
        System.out.println("Chuyển từ Json sang ArrayList:");
        service.getArrayListCustomer();
    }
}
