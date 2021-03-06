import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    public void mainMenu(){
        System.out.println("1. Thêm SP mới");
        System.out.println("2. Xem danh sách SP");
        System.out.println("3. Tìm SP theo tên");
        System.out.println("4. Tìm SP theo ID");
        System.out.println("5. Tìm SP có số lượng ít hơn 5");
        System.out.println("6. Tìm SP theo giá thành");
        System.out.println("7. Exit");
    }

    public void menuFindByID(){
        System.out.println("1. Xóa SP.");
        System.out.println("2. Cập nhật SL của SP.");
        System.out.println("3. Exit");
    }

    public void menuFindByPrice(){
        System.out.println("1. Tìm SP có giá lớn hơn 50.000.");
        System.out.println("2. Tìm SP có giá nằm trong khoảng 50.000 - 100.000");
        System.out.println("3. Tìm SP có giá lớn hơn 100.000.");
        System.out.println("4. Exit");
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
                    System.out.println("Nhập tên sản phẩm muốn tìm:");
                    String findName = sc.nextLine();
                    ArrayList<Product> productFindByName = service.findProductByName(listProduct, findName);
                    service.showProduct(productFindByName);
                    break;
                case 4:
                    System.out.println("Nhập ID: ");
                    int findId = Integer.parseInt(sc.nextLine());
//                    int findId = sc.nextInt();
//                    sc.nextLine();
                    Product productFindById = service.findProductById(listProduct, findId);
                    boolean checkId = true;
                    do{
                        menuFindByID();
                        int optionId = Integer.parseInt(sc.nextLine());
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
                    }while (checkId);
                    break;
                case 5:
                    ArrayList<Product> productQuantityLessThan5 = service.findProductQuantityLessThan5(listProduct);
                    service.showProduct(productQuantityLessThan5);
                    break;
                case 6:
                    boolean checkPrice = true;
                    do{
                        menuFindByPrice();
                        int optionPrice = Integer.parseInt(sc.nextLine());
                        switch (optionPrice){
                            case 1:
                                ArrayList<Product> product = service.findProductPriceLessThan50000(listProduct);
                                service.showProduct(product);
                                break;
                            case 2:
                                ArrayList<Product> product1 = service.findProductPriceBetween50000and100000(listProduct);
                                service.showProduct(product1);
                                break;
                            case 3:
                                ArrayList<Product> product2 = service.findProductPriceMoreThan100000(listProduct);
                                service.showProduct(product2);
                                break;
                            case 4:
                                checkPrice = false;
                                break;
                            default:
                                System.out.println("Chọn chức năng từ 1-4");
                                break;
                        }
                    }while (checkPrice);
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
