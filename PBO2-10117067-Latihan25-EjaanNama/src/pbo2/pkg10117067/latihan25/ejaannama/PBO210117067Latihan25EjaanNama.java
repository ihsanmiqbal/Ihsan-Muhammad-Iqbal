/*
 * NAMA       : Nur Ihsan Muhammad Iqbal
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini dibuat untuk MENAMPILKAN EJAAN NAMA USER
 */
package pbo2.pkg10117067.latihan25.ejaannama;

import java.util.Scanner;
/**
 *
 * @author Ihsanmi
 */
public class PBO210117067Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nama;
        int Panjang;
        char huruf;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Nama depan untuk di eja : ");
        Nama = scanner.nextLine();
        
        Panjang = Nama.length();
        
        System.out.println("Ejaan untuk" + Nama + " adalah : ");
        
        for (int i = 0; i < Panjang; i++){
            System.out.println("Huruf ke-" + (i+1) + " : " + Nama.charAt(i));
        }
    }
    
}
