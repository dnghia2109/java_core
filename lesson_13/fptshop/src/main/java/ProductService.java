import java.lang.reflect.Array;
import java.util.*;

public class ProductService {

    public ArrayList<Product> inputNewProduct() {
        ArrayList<Product> newList = new ArrayList<>();
        newList.add(new Product(1, "Macbook Air 2021", "Sản phẩm mới về",
                29000000, "Apple", 9, 4,
                new ArrayList<>(Arrays.asList("Laptop", "Appe"))));
        newList.add(new Product(2, "Ipad pro 2021", "Máy tính bảng Apple",
                21000000, "Apple", 10, 8,
                new ArrayList<>(Arrays.asList("Appe"))));
        newList.add(new Product(3, "Iphone 13", "Điện thoại iphone 13 64gb",
                24000000, "Apple", 20, 12,
                new ArrayList<>(Arrays.asList("Điện thoại", "Appe"))));
        newList.add(new Product(4, "Ipad Air 2021", "Máy tính bảng Apple",
                16000000, "Apple", 16, 9,
                new ArrayList<>(Arrays.asList("Appe"))));
        newList.add(new Product(5, "Samsung s21 ultra", "Điện thoại Samsung",
                30000000, "SamSung", 10, 1,
                new ArrayList<>(Arrays.asList("Điện thoại"))));
        newList.add(new Product(6, "Tai nghe Airpod  ", "Tai nghe Apple",
                3000000, "Apple", 10, 2,
                new ArrayList<>(Arrays.asList("Appe", "Phụ kiện"))));
        newList.add(new Product(7, "Tai nghe Xiaomi", "Tai nghe Xiaomi",
                500000, "Xiaomi", 10, 9,
                new ArrayList<>(Arrays.asList("Phụ kiện"))));
        newList.add(new Product(8, "Microsoft Surface Pro 8", "Máy tính bảng Apple",
                40000000, "Microsoft", 6, 2,
                new ArrayList<>(Arrays.asList("Laptop"))));

        return newList;
    }

    // Show all product
    public void getAllProduct(ArrayList<Product> list) {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    // Tìm sản phẩm theo Danh mục sản phẩm
    public ArrayList<Product> showProductByCategory(ArrayList<Product> list, String searchCategory) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> newList = new ArrayList<>();
//        System.out.println("- Tên danh mục:");
//        String searchCategory = sc.nextLine();
        for (Product product : list) {
            for (String category : product.getCategory()) {
                if (category.contains(searchCategory)) {
                    newList.add(product);
                }
            }
        }

        return newList;
    }

    // Tìm theo hãng sản xuất (brand) và số sản phẩm của hãng đó
    public ArrayList<Product> searchProductByBrand(ArrayList<Product> list) {
        ArrayList<Product> newList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("- Tên hãng sản xuất:");
        String searchBrand = sc.nextLine();
        for (Product product : list) {
            if (product.getBrand().contains(searchBrand)) {
                newList.add(product);
            }
        }
        System.out.println(searchBrand + "có số sản phẩm: " + newList.size());

        return newList;
    }

    // Tìm sản phẩm dựa trên mức giá
    public ArrayList<Product> searchByPriceAndCategory(ArrayList<Product> list, long price1, long price2) {
        ArrayList<Product> newList = new ArrayList<>();
        for (Product product : list) {
            if (price1 < product.getPrice() && product.getPrice() < price2) {
                newList.add(product);
            }
        }
        if (newList.size() == 0){
            System.out.println("không có sản phẩm trong tầm giá.");
        }
        return newList;
    }

    // Tìm sản phẩm theo tên và số sản phẩm tìm được
    public ArrayList<Product> searchByName(ArrayList<Product> list) {
        ArrayList<Product> newList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("- Tên sản phẩm:");
        String searchProductName = sc.nextLine();
        for (Product product : list) {
            if (product.getName().contains(searchProductName)) {
                newList.add(product);
            }
        }
        System.out.println("Số sản phẩm tìm được: " + newList.size());
        return newList;
    }

    // Liệt kê các hãng và số lượng sản phẩm của mỗi hãng
    public void quantityProductByCategory(ArrayList<Product> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for (Product i : list) {
            if (map.containsKey(i.getBrand())) {
                map.put(i.getBrand(), map.get(i.getBrand()) + 1);
            } else {
                map.put(i.getBrand(), 1);
            }
        }
        System.out.println(map);
    }
}
