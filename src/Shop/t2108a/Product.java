package Shop.t2108a;
import java.text.DecimalFormat;

public class Product {
    private String id;
    private String name;
    private Category category;
    private long amount;
    private long price;
    private long amountSale;
    public Product (String id, String name, Category category, long amount, long price, long amountSale){}
    public String getId(){return id;}
    public void setId(String id){this.id=id;}
    public String getName(){return name;}
    public void setName(){this.name=name;}
    public Category getCategory(){return category;}
    public void setCategory(){this.category=category;}
    public long getPrice(){return price;}
    public void setPrice(){this.price=price;}
    public long getAmount(){return amount;}
    public void setAmount(){this.amount=amount;}
    public long getAmountSale() {return amountSale;}
    public void setAmountSale(){this.amountSale=amountSale;}
    public static String formatMoney(long money){
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        return formatter.format(money);
    }
    @Override
    public String toString(){
        return id + "-" + name + "-" + category.getValue() + "-" + amount + "-" + formatMoney(price) + "-" + amountSale;
    }
}
