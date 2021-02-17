package PSET.PSET1;
import java.util.*;

public class carValue {
    public static void main(String [] args ){
        //input: #Months, Payment Size (double), DownPayment(double), number of month depreciation pairs (start @ month 0)
        //month and depreciation percentage (if percentage not listed previous applies)
        Scanner sc = new Scanner (System.in);
        int totalMonths = sc.nextInt();
        double payment = sc.nextDouble();
        double financedAmount = sc.nextDouble();
        int numMonths = sc.nextInt();

        //read in the months pairs to dict 
        int currMonth = 0;
        Hashtable<Integer,Integer> deprTable = new Hashtable<Integer,Integer>(); 
        for (int i = 0; i < numMonths; i ++){
            //month 
            int month = sc.nextInt();
            //value 
            int value = sc.nextInt();
            deprTable.put(month,value);

        }

        //calculate depreciation 
        double currValue = financedAmount;
        double moneyOwed = financedAmount; 
        int monthCtr = 0;
        int currDpr = 0;
        while (moneyOwed > currValue ){
             //find the curr depreciation rate 
             if (deprTable.get(monthCtr) == null){
                
             }
             else{
                 currDpr = deprTable.get(monthCtr);

             }
             
             
        }



        sc.close();
    }
}
