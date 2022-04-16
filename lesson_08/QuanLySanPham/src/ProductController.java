import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    public void mainMenu(){
        System.out.println("------ Chọn chức năng từ 1-7 ------");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Xem danh sách toàn bộ sản phẩm");
        System.out.println("3. Tìm sản phẩm theo tên");
        System.out.println("4. Tìm sản phẩm theo ID");
        System.out.println("5. Tìm sản phẩm có số lượng ít hơn 5");
        System.out.println("6. Tìm sản phẩm theo giá");
        System.out.println("7. Thoát");
    }

    public void menuFindByID(){
        System.out.println("1. Xóa sản phẩm.");
        System.out.println("2. Cập nhật số lượng sản phẩm.");
        System.out.println("3. Thoát");
    }

    public void menuFindByPrice(){
        System.out.println("1. Tìm sản phẩm có mức giá dưới 50.000.");
        System.out.println("2. Tìm sản phẩm có mức giá từ 50.000 đến dưới 100.000");
        System.out.println("3. Tìm sản phẩm có mức giá từ 100.000 trở lên.");
        System.out.println("4. Thoát");
    }

    public void mainController(){
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        ArrayList<Product> listProduct= new ArrayList<>();
        ProductService service = new ProductService();


        do {
            mainMenu();
            int option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:
                    listProduct.add(service.inputProduct());
                    break;
                case 2:
                    service.showProduct(listProduct);
                    break;
                case 3:
//                    ArrayList<Product> listProductFindByName = service.findProductByName(listProduct);
                    System.out.println("Nhập tên sản phẩm muốn tìm:");
                    String findName = sc.nextLine();
                    Product productFindByName = service.findProductByName(listProduct, findName);
                    break;
                case 4:
                    System.out.println("Nhập ID: ");
//                    int findId = Integer.parseInt(sc.nextLine());
                    int findId = sc.nextInt();
                    sc.nextLine();
                    Product productFindById = service.findProductById(listProduct, findId);
                    boolean checkId = true;
                    while (checkId){
                        menuFindByID();
//                        int optionId = Integer.parseInt(sc.nextLine());
                        int optionId = sc.nextInt();
                        sc.nextLine();
                        switch (optionId){
                            case 1:
                                service.deleteProduct(listProduct, productFindById);
                                break;
                            case  2:
                                service.updateProductQuantity(productFindById);
                                break;
                            case 3:
                                checkId = false;
                                break;
                            default:
                                System.out.println("Chọn chức năng từ 1-3");
                                break;
                        }
                    }
                    break;
                case 5:
                    Product productQuantityLessThan5 = service.findProductQuantityLessThan05(listProduct);
                    break;
                case 6:
                    boolean checkPrice = true;
                    while (checkPrice){
                        int optionPrice = sc.nextInt();
                        sc.nextLine();
                        switch (optionPrice){
                            case 1:
                                Product product = service.findProductPriceLessThan50000(listProduct);
                                break;
                            case 2:
                                Product product1 = service.findProductPriceBetween50000and100000(listProduct);
                                break;
                            case 3:
                                Product product2 = service.findProductPriceMoreThan100000(listProduct);
                                break;
                            case 4:
                                checkId = false;
                                break;
                            default:
                                System.out.println("Chọn chức năng từ 1-4");
                                break;
                        }
                    }
                    break;
                case 7:
                    check = false;
                    break;
                default:
                    System.out.println("Chọn chức năng từ 1-7");
                    break;
            }
        }while (check);
    }
}
