// Yêu cầu: Viết chương trình quản lý sp cua 1 cửa hàng gồm các thông tin:
// id, tên sp, mô tả, số lượng, giá bán, đơn vị.
// 1. Xem dán sách sản phẩm.
// 2. TÌm sản phẩm theo id.
// 3. Tìm sản phẩm theo id để: Xóa sản phẩm đó và Cập nhật số lượng sản phẩm


public class Main {
    public static void main(String[] args) {
        ProductController controller = new ProductController();
        controller.mainController();
    }
}
