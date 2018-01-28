import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int len_a=A.length();
        int len_b=B.length();
        int max,count=0;
        if(len_a>len_b)
            max=len_a;
        else
            max=len_b;
        System.out.println(len_a+len_b);
        for(int i=0;i<max;i++)
        {
            if(A.charAt(i)>B.charAt(i)){
              System.out.println("Yes");
                count++;
                break;
            }
            if(A.charAt(i)=='\0' || B.charAt(i)=='\0'){
                if(A.charAt(i)=='\0')
                {
                    System.out.println("No");
                    count++;
                    break;
                }
                else{
                    count++;
                System.out.println("Yes");
                    break;
            }
            }
            if(A.charAt(i)<B.charAt(i)){
                count++;
              System.out.println("No");
                break;
            }
            len_a--;
            len_b--;
        }
        if(count==0)
        System.out.println("No");
        System.out.println((A.substring(0,1).toUpperCase() +                A.substring(1)) + "\t" + (B.substring(0,1).toUpperCase()         + B.substring(1)));
        
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
