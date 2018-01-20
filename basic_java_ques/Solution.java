/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution;

/**
 *
 * @author dell
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        Double d=scan.nextDouble();
        scan.nextLine();
        String line=scan.nextLine();
        
        // Write your code here.

        System.out.println("String: " + line);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
