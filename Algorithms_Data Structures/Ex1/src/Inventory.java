import java.util.HashMap;
import java.util.Map;


public class Inventory {

    private HashMap<String, Product> inventoryMap=new HashMap<>();

    public void addProduct(Product p){
        if(inventoryMap.containsKey(p.getProductId())){
            System.out.println("Product exists: " + p.getProductId());
            return;
        }
        inventoryMap.put(p.getProductId(),p);
        System.out.println("Added: " +p);
    }


    public void updateProduct(String productId, int newQty, double newPrice ){

        Product p= inventoryMap.get(productId);
        if(p==null){
            System.out.println("Product not found:" + productId);
            return;
        }
        p.setQuantity(newQty);
        p.setPrice(newPrice);
        System.out.println("Updated item:" + p);

    }

    public void deleteProduct(String productId){

        if(!inventoryMap.containsKey(productId)){
            System.out.println("Product Not Found : "+ productId);
            return;
        }
        inventoryMap.remove(productId);
        System.out.println("Product deleted : "+ productId);

    }

    public void displayAll(){
        if(inventoryMap.isEmpty()){
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("--------Inventory---------");
        for(Map.Entry<String,Product>entry:inventoryMap.entrySet()){
            System.out.println(entry.getValue());
        }
        System.out.println("--------");

    }
}
