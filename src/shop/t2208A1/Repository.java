package shop.t2208A1;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Repository {
    List<Product>ListProducts = new ArrayList<>();
    public  Repository(){
        ListProducts.add(new Product("01","bánh đo rê mon 3 vị", Category.FOOD,100,3500,57));
        ListProducts.add(new Product("02","xúc xích sườn non", Category.FOOD,100,3500,57));
        ListProducts.add(new Product("03","Thanh cua", Category.FOOD,100,3500,57));
        ListProducts.add(new Product("04","Bánh khoai môn", Category.FOOD,100,3500,57));
        ListProducts.add(new Product("05","Thìa ăn cơm inox mạ vàng", Category.HOUSEWARE,100,3500,57));
        ListProducts.add(new Product("06","Bát đựng gia vị", Category.HOUSEWARE,100,3500,57));
        ListProducts.add(new Product("07","Nướcn hoa hồng Soothing Facial Toner Simple", Category.COSMETICS,100,3500,57));
        ListProducts.add(new Product("08","Combo gội xả Hairburst", Category.COSMETICS,100,3500,57));
        ListProducts.add(new Product("09","Tinh chất dưỡng ẩm sâu klairs rich moist soothing serum", Category.COSMETICS,100,3500,57));
        ListProducts.add(new Product("10","Ke dưỡng thể paula chỏi resist weight body treatment", Category.COSMETICS,100,3500,57));
        ListProducts.add(new Product("11","áo thun tsun", Category.FASHOIN,100,3500,57));
    }

    public void show(){
        //sd foreach
        //for ....
        ListProducts.forEach(product -> System.out.println(product));
    }
    public void sortProductByName(){
        ListProducts.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
    }
    public void filterProductByPrice(){
        ListProducts.stream()
                .filter(product -> product.getPrice() > 10000)
                .forEach(product -> System.out.println(product));

    }
    public void countProductByAmoutSale(){
        long count = ListProducts.stream()
                .filter(product -> product.getAmount()>= 50)
                .count();
        System.out.println("số lương sp bán được từ 50 trở lên là: "+ count);
    }
}
