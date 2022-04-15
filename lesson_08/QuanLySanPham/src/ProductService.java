import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    public Product inputProduct(){
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        System.out.println("- ID:");
        p.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("- Tên sản phẩm:");
        p.setProductName(sc.nextLine());
        System.out.println("- Mô tả sản phẩm:");
        p.setDescription(sc.nextLine());
        System.out.println("- Số lượng sản phẩm:");
        p.setSoLuong(Integer.parseInt(sc.nextLine()));
        System.out.println("- Giá bán:");
        p.setPrice(Long.parseLong(sc.nextLine()));
        System.out.println("- Đơn vị tính: ");
        p.setDonVi(sc.nextLine());

        return  p;
    }

    public void showProduct(ArrayList<Product> list){
        for (Product prd : list){
            System.out.println(prd);
        }
    }

    public Product findProductById(ArrayList<Product> list, int findId){
        Product newFindProduct = null;
        for (Product prd : list){
            if (prd.getId() == findId){
                newFindProduct = prd;
            }
        }
        return newFindProduct;
    }

    public void updateQuantity(){

    }
}
