import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int comparer=1;
        
  
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i) == A.charAt(A.length()-comparer))
            {
                count++;
            }
            else
            {
                System.out.println("No");
                break;
            }
            comparer++;
            
        }
        if(count==A.length())
            System.out.println("Yes");
        //System.out.println(count);
        //System.out.println(comparer);
        
    }
}
