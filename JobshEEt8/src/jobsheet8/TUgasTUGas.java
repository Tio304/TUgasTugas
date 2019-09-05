/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7.pkg8;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TUgasTUGas {
     public static void main (String[] args)  {
          System.out.println("Challange.Challange1.main()");
         // Deklarasi 
         double  Harian;
         double Laporan;
         double Ujian;
         double Akhiran;
         
         // Pemasokan
         
         Scanner baca = new Scanner(System.in);
         
         // Awalan
         System.out.println("========MEMASUKKAN NILAI-NILAI MURID========");
         System.out.println("=Silahkan Masukkan Nilai Siswa=");
      
           //input 
        System.out.println("Tolong Masukkan Nilai Harian  Siswa: ");
        
         Harian = baca.nextInt();
         
          //penggolongan
        
        if(Harian <=40) {
              
              Harian =  (Harian * 0.3);
            System.out.println(Harian);
                       System.out.println("Grade Anda F"); 
                      

        }else if (Harian <=55){
              
              Harian =  (Harian * 0.3);
          
                       
            
            System.out.println("Grade Anda E");
            
        }else if (Harian <=74){
              
            Harian =  (Harian * 0.3);  
           
                      
                        System.out.println("Grade Anda D");
            
        }else if (Harian <=85){
            
            System.out.println(Harian);
                      
                        System.out.println("Grade Anda C");
            
        }else if (Harian <=92){
             
            System.out.println(Harian* 0.3);
                      
                        System.out.println("Grade Anda B");
            
        }else if (Harian <=100){
               
            System.out.println(Harian*0.3);
                      
                        System.out.println("Grade Anda A");
            
        }
          
            
                        
              
             
         
         System.out.println("Tolong Masukkan Nilai LAPORAN Siswa: ");
          Laporan = baca.nextInt();
         
          //penggolongan
        
        if(Laporan <=40) {
              Laporan =  (Laporan * 0.2);
          System.out.println(Laporan);
                       System.out.println("Grade Anda F");
            
        }else if(Laporan <=55) { 
            Laporan =  (Laporan * 0.2);
           
                       System.out.println("Grade Anda E");
                       
       }else if(Laporan <=74) {
            Laporan =  (Laporan * 0.2);
           
                       System.out.println("Grade Anda D");
           
       } else if(Laporan <=85) {
           Laporan =  (Laporan * 0.2);
           
                       System.out.println("Grade Anda C");
           
       }else if(Laporan <=92) {
           Laporan =  (Laporan * 0.2);
            
                       System.out.println("Grade Anda B");
           
       }else if(Laporan <=100) {
           Laporan =  (Laporan * 0.2);
            
                       System.out.println("Grade Anda A");
           
       }
            
              
            

        
         
        

         
         System.out.println("Nilai Ujian Anda ");
         Ujian = baca.nextInt();
         
         
          if(Ujian <=40) {
              Ujian =  ( 0.5 *Ujian);
           System.out.println(Ujian);
                       System.out.println("Grade Anda F");
           
          }else  if(Ujian <=55) {
           Ujian =  (Ujian * 0.5);
            
                       System.out.println("Grade Anda E");
           
       }else  if(Ujian <=74) {
           Ujian =   ( Ujian * 0.5 );
            
                       System.out.println("Grade Anda D");
           
       }else  if(Ujian <=85) {
           Ujian = (Ujian * 0.5);
          
                       System.out.println("Grade Anda C");
           
       }
         else  if(Ujian <=92) {
           Ujian =  (Ujian * 0.5);
          
                       System.out.println("Grade Anda B");
           
       }else  if(Ujian <=100) {
          Ujian  = (Ujian * 0.5);
           
                       System.out.println("Grade Anda A");
           
       } System.out.println("Nilai Akhir Anda ");
       
        
         Akhiran = ((Ujian + Harian + Laporan)/1.7);
          System.out.println(Akhiran);
            if(Akhiran <=55) {
             
            System.out.println(Akhiran);
                       System.out.println("Anda tidak lulus,tingkatkan belajar anda");
           
          }else  if(Akhiran <=74) {
          
            System.out.println(Akhiran);
                       System.out.println("Anda tidak lulus,tingkatkan belajar anda");
           
       }else  if(Akhiran <=85) {
           
            System.out.println(Akhiran);
                       System.out.println("Anda lulus dengan cukup,Tingkatkan lagi prestasimu");
           
       }else  if(Akhiran <=92) {
           
            System.out.println(Akhiran);
                       System.out.println("Anda lulus dengan baik,Pertahankan Prestasimu");
           
       }
         else  if(Akhiran <=100) {
           
            System.out.println(Akhiran);
                       System.out.println("Anda lulus,Excelent");
           
      
          
         
     }
        
         
         
         
         
        
         
         
         
                
         
         
         
         
     }
    
}
