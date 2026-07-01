public class Main{
    public static void main(String[] args) {

        double Principal=175000.0;
        double rate=0.17;
        int years=5;

        System.out.println("-----Financial Forecasting----");
        System.out.println();

        double fincial_forcasting=Financial_Forecasting.FutureValue(Principal,rate,years);
        System.out.printf("Resursive : Rs %.2f%n",fincial_forcasting);

        Financial_Forecasting.print(Principal,rate,years);



    }

}