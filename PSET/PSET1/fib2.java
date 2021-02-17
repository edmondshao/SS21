package PSET.PSET1;
import java.util.Scanner;
public class fib2 {
    //Use Dynamic programming 
    //faster dosent time out 
    static long getFib(int num){
        long fib[] = new long [num+2];
        //fill out the start
        fib[0]=0;
        fib[1] = 1;
        
        for (int i = 2; i<=num;i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return (fib[num]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inputF = sc.nextInt();
        
        System.out.println(getFib(inputF-1));
    }
}