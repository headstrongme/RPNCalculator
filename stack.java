
package rpn;

import java.util.ArrayList;
import javafx.beans.binding.Bindings;


public class stack {
     String[] al = new String[20];
     int index=-1;
     
     public String  pop()
     {
         if(isEmpty())
         {
             System.out.println("Stack is empty");
             
         }
         else
         {
             index--;
            return al[index+1];
            
         }
         return "";
     }
     
     public void push(String value)
     {
         if(index==19){
             System.out.println("stack is full");
         }else
         al[++index]=(value);
     }
     public boolean isEmpty()
     {
         return index==-1;
     }
    
}
