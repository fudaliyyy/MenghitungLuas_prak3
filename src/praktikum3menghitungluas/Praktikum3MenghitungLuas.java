/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3menghitungluas;

import java.util.Scanner;

/**
 *
 * @author Zephyrus
 */
public class Praktikum3MenghitungLuas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner luas = new Scanner(System.in);
        int persegi, sisi;
        int segetiga, tinggi, alas;
        int lingkaran, jari;
        int menu = luas.nextInt();      
        
         switch (menu) {
             case 1:
                 sisi = luas.nextInt();
                 persegi(sisi);
                 break;
                 
             case 2:
                 tinggi = luas.nextInt();
                 alas = luas.nextInt();
                 segitiga(tinggi, alas);
                 break;
                 
             case 3:
                 jari = luas.nextInt();
                 lingkaran(jari);
                 break;
                         
             default:
                 System.out.print("Input yang anda masukan tidak sesuai");
                 break;
         }
    }
    
     static void persegi (int sisi){
         int formula = sisi*sisi;
         System.out.print(formula);
     }
    
     static void segitiga (int tinggi, int alas){
         int formula = alas*tinggi*1/2;
         System.out.print(formula);
     }
    
    static void lingkaran (int jari){
        if (jari == 7){
            double formula = 22/7*jari*jari;
            int akhir = (int) formula;
            System.out.print((double)akhir);
            } else {
            double formula = 3.14*jari*jari;
            int akhir = (int) formula;
            System.out.print((double) akhir);
        }
    }
}