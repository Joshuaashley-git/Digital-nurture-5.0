import java.util.Arrays;
import java.util.Comparator;

public class Search {

    public static int binarySearch(Product[] product,String targetId){

        int low =0;
        int high=product.length-1;
        int comparisons=0;

        while (low<=high){
            int mid=(low+high)/2;
            comparisons++;
            String midId=product[mid].getProductId();

            int cmp=targetId.compareTo(midId);

            if(cmp==0) {
                return mid;
            }else if(cmp>0){
                low=mid+1;

            }else{
                high=mid-1;
            }
        }

        return -1;


    }
    public static Product[] sortById(Product[] product){
        Product[] sorted=product.clone();
        Arrays.sort(sorted,Comparator.comparing(Product::getProductId));
        return sorted;
    }
}
