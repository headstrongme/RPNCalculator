package rpn;

import java.util.ArrayList;
import java.util.Scanner;


public class RPN 
{
    public static String convert(String a)
    {
        String s=a;
      stack st = new stack();
       int j=0;
        String postfix= "";
        for(int i=0;i<((s.length()));i++)
        {
          if (!Character.isDigit(s.charAt(i)))
          {
              String temp= String.valueOf(s.charAt(i));
            if(s.charAt(i)=='+'|| s.charAt(i)=='-')
            {
                
                if(st.index==-1)
                {
                    
                    st.push(temp);
                }
                else
                {
                    if(st.al[st.index].equals("("))
                        {
                        st.push(temp);
                        }
                    else
                         {
                          postfix+= st.pop();
                           st.push(temp);
                         }
                }
                
                
            }
            if(s.charAt(i)=='*'|| s.charAt(i)=='/')
            {
                
                 if(st.index==-1)
                {
                    
                    st.push(temp);
                }
                else
                {
                   
                    if(st.al[st.index].equals("(")||st.al[st.index].equals("+")|| st.al[st.index].equals("-"))
                        {
                       
                        st.push(temp);
                        }
                    else 
                         {
                          postfix+= st.pop();
                           st.push(temp);
                         }
                }
            }
            if(s.charAt(i)==')')
            {
               for(int k=j+1;k<=st.index;k++) 
               {
                   postfix+= st.pop();
                   
               }
               st.index=j-1;
            }
            if(s.charAt(i)=='(')
            {
              st.push(temp);
              j=st.index;
            }
          }
          else
          {
            postfix+=  s.charAt(i);
          }
          if(i==s.length()-1)
          {
            while((st.index)!=-1)  
            {
                postfix+= st.pop();
            }
          }
              
        }
        System.out.println(postfix);  
        return(postfix);
    }
    
   
}
