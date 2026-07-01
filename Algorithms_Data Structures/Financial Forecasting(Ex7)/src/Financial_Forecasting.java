import java.util.HashMap;

public class Financial_Forecasting{
    private static HashMap<String,Double>finfor =new HashMap<>();

    public static double FutureValue(double principal, double rate, int years){
        if(years==0)
            return principal;

        String key=principal+"_"+rate+"_"+years;
        if(finfor.containsKey(key)){
            return finfor.get(key);

        }
        double result=FutureValue(principal, rate, years-1)*(1+rate);
        finfor.put(key, result);
        return result;

    }
    public static void print(double Principal, double rate, int years){
        System.out.println("\nyears : Future Value");
        for(int i=0;i<=years;i++){
            double value=FutureValue(Principal,rate,i);
            System.out.printf("%2d : Rs %.2f%n",i,value);
        }
    }


}