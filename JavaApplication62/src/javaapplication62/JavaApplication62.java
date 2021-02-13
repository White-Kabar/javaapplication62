/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication62;
import java.util.Scanner;
/**
 *
 * @author WHITEKABAR
 */
public class JavaApplication62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,m;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter an integer :");
        n = input.nextInt();
        m = n;
        for (int i=2; i<=m; i++) {
            while (m%i==0) {
                System.out.print(i+",");
                m = m/i;
            }
        }
         System.out.println("\n");       
            }
        }
    
    

