public class test {

    public static void main(String[] args) {
        Logger l1=Logger.getInstance();
        l1.log("App started");
        Logger l2=Logger.getInstance();
        l2.log("Processing");
        System.out.println(l1==l2);



    }
}
