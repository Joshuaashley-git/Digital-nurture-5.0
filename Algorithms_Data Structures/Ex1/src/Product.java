import javax.xml.transform.stream.StreamSource;

public class Product {

    private String productId;
    private String productName;
    private int quantity;
    private double price;


    public Product(String productId, String productName, int quantity, double price) {

        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;


    }

    //--------------------------getter methods-------------------------------------
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    //---------------------------------setter methods------------------------
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //-----------converting to string---------
    @Override
    public String toString() {
        return String.format(" [%s]    |    %s    |    Qty: %d    |    Price: ₹%.2f    |", productId, productName, quantity, price);
        //  return "id = "+ productId + "| name = " + productName + "| quantity = " + quantity + "| price = " + price;
    }
}

   /* public static void main() {

    Product p = new Product("101","senty",20,20000);
    System.out.println(p);
    }}*/