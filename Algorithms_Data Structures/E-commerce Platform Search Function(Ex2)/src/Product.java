public class Product {

    private String productId;
    private String producName;
    private String catagory;

    public Product(String productId, String productName, String catagory){

        this.productId=productId;
        this.producName=productName;
        this.catagory=catagory;

    }

    public String getProductId(){
        return productId;
    }
    public String getProducName(){
        return producName;
    }
    public String getCatagory(){
        return catagory;
    }

    public String toString(){
        return String.format("[%s] %-20s | %s",productId,producName,catagory);
    }



}
