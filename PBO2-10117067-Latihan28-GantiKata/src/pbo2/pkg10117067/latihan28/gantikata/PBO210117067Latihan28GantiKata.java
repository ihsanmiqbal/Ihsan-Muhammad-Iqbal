/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini dibuat untuk MENAMPILKAN GANTI KATA PADA SUATU KALIMAT
 */
package pbo2.pkg10117067.latihan28.gantikata;

import java .util.Scanner;
/**
 *
 * @author Ihsanmi
 */
public class PBO210117067Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Kalimat;
        String nGanti, nJadi;
        
        System.out.println("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        System.out.println("Ganti kata : ");
        nGanti = scanner.nextLine();
        
        System.out.println("Menjadi Kata : ");
        nJadi = scanner.nextLine();
        
        String ganti = Kalimat.replace(nGanti,nJadi);
        System.out.println("ADALAH : " + ganti);
    }
    
}
