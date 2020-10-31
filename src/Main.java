package com.Perbandingan;
import java.util.Scanner;

/**
 *
 * @author Diva Sabila Ramadhan 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program ini untuk membandingkan Nilai Pertama dan Nilai Kedua
 *
 */
public class Perbandingan {

    static final Scanner scan = new Scanner(System.in);
    int nilai1, nilai2;
    
    public void masukkanNilai(){
        System.out.println("=======Program Perbandingan NIlai=======");
        System.out.print("Masukkan nilai pertama : ");
        nilai1 = scan.nextInt();
        System.out.println("Masukkan nilai kedua : ");
        nilai2 = scan.nextInt();
    }
    
    public String perbandinganNilai(){
        return (nilai1 < nilai2) ? nilai1+" lebih kecil dari "+nilai2 :
                (nilai1 > nilai2) ? nilai1+" lebih besar dari "+nilai2 :
                        nilai1+" sama dengan "+nilai2;
    }
    
    public void ulangPerbandingan(){
        System.out.print("\nUlangi Aktifitas ? (Ya/Tidak) : ");
        if(scan.next().equals("Ya")){
          System.out.print("\n");
            startMethod();  
        }
    }
    
    public String perbandingan(){
        System.out.print("\\nUlangi Aktifitas ? (Ya/Tidak) : ");
        if(scan.next().equals("Ya")){
        System.out.print("\n");
            startMethod();    
        }
    }
    
    public void tampilPerbandingan(String hasil){
        System.out.println("\\nHasil : "+hasil);
    }
    
    public void startMethod(){
       masukkanNilai();
       tampilPerbandingan(perbandinganNilai());
       ulangPerbandingan();
    }
    

    public static void main(String[] args) {
        Perbandingan = new Perbandingan;
              
    }
    
}
