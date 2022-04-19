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
        p.setQuantity(Integer.parseInt(sc.nextLine()));
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

    // Tìm theo tên
    public ArrayList<Product> findProductByName(ArrayList<Product> list, String findName){
        ArrayList<Product> list1 = new ArrayList<>();
        for (Product p : list){
            if(p.getProductName().contains(findName)){
                list1.add(p);
            }
        }
        return list1;
    }


//    public Product findProductByName(ArrayList<Product> list, String findName){
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Nhập tên sản phẩm muốn tìm:");
////        String findName = sc.nextLine();
//        Product newFindProduct = new Product();
//        for (Product prd : list){
//            if (prd.getProductName().contains(findName)){
//                newFindProduct = prd;
//            }
//        }
//        return newFindProduct;
//    }

    // Tìm theo ID
    public Product findProductById(ArrayList<Product> list, int findId){
        Product newFindProduct = null;
        for (Product prd : list){
            if (prd.getId() == findId){
                newFindProduct = prd;
            }
        }
        return newFindProduct;
    }

    // Xóa sản phẩm
    public void deleteProduct(ArrayList<Product> list, Product product){
        list.remove(product);
    }

    // Cập nhật số lượng sản phẩm
    public void updateProductQuantity(Product product){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng cập nhật:");
        int updateQuantity = Integer.parseInt(sc.nextLine());
        product.setQuantity(updateQuantity);
    }

    // Tìm các sản phẩn có số lượng dưới 5
    public ArrayList<Product> findProductQuantityLessThan5(ArrayList<Product> list){
        ArrayList<Product> list1 = new ArrayList<>();
        for (Product p : list){
            if(p.getQuantity() < 5){
                list1.add(p);
            }
        }
        return list1;
    }
//    public Product findProductQuantityLessThan05(ArrayList<Product> list){
//        Product productName = null;
//        for (Product p : list){
//            if(p.getQuantity() < 5){
//                productName = p;
//            }
//        }
//        return productName;
//    }

    // Tìm sản phẩm theo mức giá < 50000
    public ArrayList<Product> findProductPriceLessThan50000(ArrayList<Product> list){
//        Scanner sc = new Scanner(System.in);
//        int option = Integer.parseInt(sc.nextLine());
//        ArrayList<Product> list1 = new ArrayList<>();
//        switch (option){
//            case 1:
//        }
        ArrayList<Product> list1 = new ArrayList<>();
        for (Product p : list){
            if(p.getPrice() < 50000){
                list1.add(p);
            }
        }
        return list1;
    }
//    public Product findProductPriceLessThan50000(ArrayList<Product> list){
//        Product product = null;
//        for (Product p : list){
//            if(p.getPrice() < 50000){
//                product = p;
//            }
//        }
//        return product;
//    }

    // Tìm sản phẩm theo mức giá từ 50000-100000
    public ArrayList<Product> findProductPriceBetween50000and100000(ArrayList<Product> list){
        ArrayList<Product> list1 = new ArrayList<>();
        for (Product p : list){
            if((p.getPrice() >= 50000) && (p.getPrice() < 100000)){
                list1.add(p);
            }
        }
        return list1;
    }
//    public Product findProductPriceBetween50000and100000(ArrayList<Product> list){
//        Product product = null;
//        for (Product p : list){
//            if((p.getPrice() >= 50000) && (p.getPrice() < 100000)){
//                product = p;
//            }
//        }
//        return product;
//    }



    // Tìm sản phẩm theo mức giá > 100000
    public ArrayList<Product> findProductPriceMoreThan100000(ArrayList<Product> list){
        ArrayList<Product> list1 = new ArrayList<>();
        for (Product p : list){
            if(p.getPrice() >= 100000){
                list1.add(p);
            }
        }
        return list1;
    }
//    public Product findProductPriceMoreThan100000(ArrayList<Product> list){
//        Product product = null;
//        for (Product p : list){
//            if(p.getPrice() >= 100000){
//                product = p;
//            }
//        }
//        return product;
//    }
}
