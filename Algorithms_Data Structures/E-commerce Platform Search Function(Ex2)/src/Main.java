public class Main{
    public static void main(String[] args){

        Product[] catalogue={
                new Product("1008","Laptop","Computers"),
                new Product("1005","Washing machine","Appliances"),
                new Product("1009","Mobile","electronics"),
                new Product("1006","Iron box","Appliances"),
                new Product("1003","Printer","Devices")

        };

        String target="1001";

        Product[] sortedCatalogue=Search.sortById(catalogue);
        System.out.println("Sorted catalogue according to ProductId: ");
        for(Product p: sortedCatalogue) System.out.println(" " + p);

        System.out.println("\nSearching ProductId:"+target);
        int binResult=Search.binarySearch(sortedCatalogue,target);
        if(binResult!=-1){
            System.out.println("Result: "+ sortedCatalogue[binResult]);
        }else{
            System.out.println("Result not found!!");
        }


    }
}