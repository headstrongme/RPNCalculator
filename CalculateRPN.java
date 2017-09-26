
package rpn;

import java.util.Stack;


public class CalculateRPN 
{
    public static int process(String s)
    {
      int a=0;
      int secondOperand,firstOperand;
      Stack stk = new Stack();
      String operators = "+-*/";
      for(int i=0 ; i<s.length();i++)
      {
           if(Character.isDigit(s.charAt(i)))
                   {
                       stk.push(s.charAt(i));
                   }
           else
           {
               String f = String.valueOf(stk.pop());
	       String g = String.valueOf(stk.pop());
               secondOperand=Integer.parseInt(f);
               firstOperand=Integer.parseInt(g);
               switch(s.charAt(i))
               {
                   
                   case '+':
                     
                    String t=String.valueOf(secondOperand+firstOperand);

                    stk.push(t);
                    break;
                   case '-':
                      
                    t=String.valueOf(secondOperand-firstOperand);
                     stk.push(t);
                       break;
                    case '*':
                       
                    t=String.valueOf(secondOperand*firstOperand);
                     stk.push(t);
                       break;
                    case '/':
                      
                    t=String.valueOf(secondOperand/ firstOperand);
                     stk.push(t);
                       break;   
                       
               }
           }
      }
      
      a = Integer.parseInt(String.valueOf(stk.pop()));
      return a;
    }
}
