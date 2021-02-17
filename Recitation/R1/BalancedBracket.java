package Recitation.R1;
import java.util.*;  // Import the Scanner class


public class BalancedBracket {
    public static void main(String[] args) {
      HashMap<Character, Character> charmappings;

        charmappings = new HashMap<Character, Character>();
        charmappings.put(')', '(');
        charmappings.put('}', '{');
        charmappings.put(']', '[');
      Stack<Character> stack = new Stack<Character>();

      Scanner sc = new Scanner(System.in);  // Create a Scanner object
      
      int numInputs = sc.nextInt();  
      boolean work = true;
      
      //read in and create list for parantheses 
      ArrayList<String> inputRaw = new ArrayList<String>();
      for (int i = 0;i<numInputs; i ++){
        String currInput = sc.next();
        inputRaw.add(currInput);
      }
      //read through and do processing 
      for (int i = 0; i <numInputs;i++){
        String currInput = inputRaw.get(i);
        int currLen = currInput.length();
        //analyze each input if its legal
        //must be a even number 
        if (currLen%2 != 0){
          System.out.println("NO");

          continue;
        }
        //create stack 
        for (int j = 0; j <currLen;j++){
          char c = currInput.charAt(j);
          if (charmappings.containsKey(c)){
            char topElement = stack.empty() ? '#' : stack.pop();
            if (topElement != charmappings.get(c)) {
              System.out.println("NO");
              work = false;
              break;
            }

          }
          else{
            stack.push(c);
          }
        }
        if (work == true){
          System.out.println("YES");
        }
        else{
          work = true;
        }
        
        
      } 
      

      sc.close();
    }
  }