package shop.t2208A1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);
        Menu.mainMenu();
        int choose = scanner.nextInt();
        switch (choose){
            case 0:
                System.exit(0);
                break;
            case 1 :
                System.out.printf("Danh sách sản phẩm");
                repository.show();
                break;
            case 2:
                System.out.printf("Các sản phẩm có trên 10000:");
                repository.filterProductByPrice();
                break;
            case 3:
                repository.countProductByAmoutSale();
                break;
            case 7:
                repository.sortProductByName();
                System.out.printf("Sản phẩm sau khi sắp xếp: ");
                repository.show();

        }
    }
}
