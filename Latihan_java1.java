/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_java1;
import java.util.Scanner;
/**
 *
 * @author singgih
 */
public class Latihan_java1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
     Scanner keyboard = new Scanner(System.in);
     int a,b,c,d;
     System.out.print("Masukan nilai fibonaci anda? ");
     a=keyboard.nextInt();
     for(b=1;b<=a;b++){
         c=(b-1);
         d=(c+b);
         System.out.println("Deret fibonaci ke - "+b+" adalah "+d);
         
     }
        
    }
}
    

