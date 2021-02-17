package Recitation.R2;
//currently working on car value 
import java.util.*;
public class Main
{
    

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        //find the binary representation of a
        Stack <Integer> binaryNum = new Stack<Integer>();
        while (a > 0 ){
            int curr = a %2 ; 
            binaryNum.push(curr);
            a = a/2;
        }

        
        //find max 
        int maxCount = 0;
        int currCount = 0;
        int previousBinary = -1;
        while (!(binaryNum.isEmpty())){
            
            int currBinary = binaryNum.pop();
            
            System.out.print(currBinary);
            //if its first loop 
            if (previousBinary == -1 ){
                previousBinary = currBinary;
                if (currBinary == 1){
                    currCount++;
                }
                continue;
            }
            //if continuation of strem
            else if (currBinary == 1 ){
                //increment max count 
                currCount ++;
                
            }
            //end a streak 
            else if (currBinary ==0 && previousBinary == 1){
                if (maxCount < currCount){
                    maxCount = currCount;
                    
                }
                //not empty 
                if (!(binaryNum.isEmpty())){
                    currCount = 0;
                }
               
                
            }
           
            
        }
        if(maxCount < currCount){
            maxCount = currCount;
            //currCount = 0;
        } 
        System.out.println();
        System.out.println(maxCount);
        
        in.close();
    }
}