package shop.t2208A1;

public class Menu {
    public static void mainMenu() {
        System.out.println("1. Xem thông tin sản phẩm ");
        System.out.println("2. In danh sách sản phẩm trên 10.000");
        System.out.println("3. Đếm số sản phẩm có số lượng bán từ 50 trở lên");
        System.out.println("4. liệt kê sản phẩm dựa theo loại sản phẩm");
        System.out.println("5. Sắp xếp sản phẩm theo số lượng bán được");
        System.out.println("6. Đưa ra sanr phẩm bán được nhiều nhất ");
        System.out.println("7. Sắp xếp sản phẩm theo tên");
        System.out.println("0. Thoát trương trình");
        System.out.println("Lựa chọn của bạn là : ");

    }
    public static void chosseCategory(){
        System.out.printf("1. Thực phẩm");
        System.out.printf("2. Đồ gia dụng");
    }
    public static void secondMenu(){
        System.out.printf("1. Sửa thông rin sản phẩm ");
        System.out.printf("2. Xoá sản phẩm");
        System.out.printf("0. Quay lại trang chủ");
        System.out.printf("lựa chọn của bạn là: ");
    }
}
