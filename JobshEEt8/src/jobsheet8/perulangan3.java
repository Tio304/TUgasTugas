/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

import java.util.Scanner;
 
/**
 *
 * @author Asus
 */
public class perulangan3 {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //pemasokan 
     boolean running = true;
     int counter = 0;
     String jawab;
     Scanner Scan = new Scanner(System.in);
     
     // proses 
     while(running){
         System.out.println("Apakah Anda Ingin Keluar???");
         System.out.println("jawab[ya/tidak]> ");
         jawab = Scan.nextLine();
         // cek jawabnya,kalauya maka berhenti mengulang
         if (jawab.equalsIgnoreCase("ya")){
             running = false;
         }
         counter++;
     }
        
       
          
        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
        
    }
    
}
