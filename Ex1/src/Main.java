public class Main {

    public static void main(String[]args){
        Inventory inv=new Inventory();

        inv.addProduct(new Product("101", "rice", 20, 1000));
        inv.addProduct(new Product("102", "dal", 25, 650));
        inv.addProduct(new Product("103", "pulse", 32, 890));

        inv.addProduct(new Product("104","juice",2,30));

        inv.updateProduct("104",1,25);
        inv.displayAll();

        inv.deleteProduct("102");

        inv.displayAll();





    }
}
