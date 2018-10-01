/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program dibuat untuk MENAMPILKAN HURUF BESAR ATAU KECILPADA SUATU KALIMAT
 */
package pbo2.pkg10117067.latihan27.hurufkecilbesar;

import java.util.Scanner;
/**
 *
 * @author Ihsanmi
 */
public class PBO210117067Latihan27HurufKecilBesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Kalimat;
        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        String Besar = Kalimat.toUpperCase();
        String Kecil = Kalimat.toLowerCase();
        System.out.println();
        System.out.println("========HasilFormating=======");
        System.out.println("Huruf besar = " + Besar);
        System.out.println("Huruf Kecil = " + Kecil);
        
    }
    
}
