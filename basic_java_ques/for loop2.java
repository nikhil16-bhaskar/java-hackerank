import java.util.*;
import java.io.*;


class Solution{
    public static void main(String []args){
        double sum,result;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            double a = in.nextInt();
            double b = in.nextInt();
            double n = in.nextInt();
            result=a;
            for(double j=0;j<n;j++)
            {
               
                
                    result=result+(Math.pow(2,j)*b);
               // result=(int)result;
                
             System.out.print((int)result+"\t");
        }
        System.out.println();
        }
        in.close();
}
}