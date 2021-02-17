package PSET.PSET1;
import java.util.*;
public class fib {
    static int getFib (int num){
        if (num<=1){
            return (num);
        }
        return getFib(num-1) +getFib(num-2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inputF = sc.nextInt();
        /** Need to do inputF-1 if 0 is 1st in 
        fib sequence
        */
        System.out.println(getFib(inputF));
        sc.close();
    }
}
