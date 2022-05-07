import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public void menu(){
        System.out.println("============== Các chức năng =============");
        System.out.println("1. In thông tin dựa trên danh mục");
        System.out.println("2. In thông tin các sản phẩm dựa theo hãng và số sản phẩm của hãng đó.");
        System.out.println("3. In thông tin sản phẩm dựa trên mức giá và danh mục");
        System.out.println("4. Tìm sản phẩm theo tên và số sản phẩm tìm được");
        System.out.println("5. Liệt kê các hãng và số lượng sản phẩm của mỗi hãng.");
        System.out.println("6. Thoát");
    }

    public void menuShowProductByCategory(){
        System.out.println("1. Điện thoại");
        System.out.println("2. Laptop");
        System.out.println("3. Appe");
        System.out.println("4. Phụ kiện");
        System.out.println("5. Thoát");
    }

    public void menuShowProductByPrice(){
        System.out.println("1. Dưới 2 triệu.");
        System.out.println("2. Từ 2 - 4 triệu.");
        System.out.println("3. Từ 4 - 7 triệu.");
        System.out.println("4. Từ 7 - 13 triệu.");
        System.out.println("5. Trên 13 triệu.");
        System.out.println("6. Thoát.");
    }

    public void mainController(){
        Scanner sc = new Scanner(System.in);
        ProductService service = new ProductService();
        ArrayList<Product> list = service.inputNewProduct();
        boolean flag = true;
        while (flag) {
            menu();
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    boolean flag1 = true;
                    while (flag1){
                        menuShowProductByCategory();
                        int option1 = Integer.parseInt(sc.nextLine());
                        switch (option1) {
                            case 1:
//                                ArrayList<Product> newList = service.showProductByCategory(list, "Điện thoại");
                                service.getAllProduct(service.showProductByCategory(list, "Điện thoại"));
                                break;
                            case 2:
                                service.getAllProduct(service.showProductByCategory(list, "Laptop"));
                                break;
                            case 3:
                                service.getAllProduct(service.showProductByCategory(list, "Appe"));
                                break;
                            case 4:
                                service.getAllProduct(service.showProductByCategory(list, "Phụ kiện"));
                                break;
                            case 5:
                                flag1 = false;
                                break;
                            default:
                                System.out.println("Chọn chức năng 1-5.");
                                break;
                        }
                    }
                    break;

                case 2:
                    service.getAllProduct(service.searchProductByBrand(list));
                    break;

                // Lọc theo danh mục trước -> Lọc theo mức giá
                case 3:
                    System.out.println("- Danh mục sản phẩm: ");
                    String searchCategory = sc.nextLine();
                    ArrayList<Product> listGetByCategory = service.showProductByCategory(list, searchCategory);
                    boolean flag2 = true;
                    while (flag2) {
                        menuShowProductByPrice();
                        int option2 = Integer.parseInt(sc.nextLine());
                        switch (option2){
                            case 1:
                                service.getAllProduct(service.searchByPriceAndCategory(listGetByCategory,
                                        0, 2000000));
                                break;
                            case 2:
                                service.getAllProduct(service.searchByPriceAndCategory(listGetByCategory,
                                        2000000, 4000000));
                                break;
                            case 3:
                                service.getAllProduct(service.searchByPriceAndCategory(listGetByCategory,
                                        4000000, 7000000));
                                break;
                            case 4:
                                service.getAllProduct(service.searchByPriceAndCategory(listGetByCategory,
                                        7000000, 13000000));
                                break;
                            case 5:
                                service.getAllProduct(service.searchByPriceAndCategory(listGetByCategory,
                                        13000000, 90000000));
                                break;
                            case 6:
                                flag2 = false;
                                break;
                            default:
                                System.out.println("Chọn chức năng 1-6.");
                                break;
                        }
                    }
                    break;

                case 4:
                    service.getAllProduct(service.searchByName(list));
                    break;

                case 5:
                    service.quantityProductByCategory(list);
                    break;

                case 6:
                    flag = false;
                    break;

                default:
                    System.out.println("Chọn chức năng 1-6.");
                    break;
            }
        }
    }
}
