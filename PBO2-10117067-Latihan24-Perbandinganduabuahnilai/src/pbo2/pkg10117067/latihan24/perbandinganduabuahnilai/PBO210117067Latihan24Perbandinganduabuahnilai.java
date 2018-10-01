/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 101170867
 * DESKRIPSI PROGRES : Program ini dibuat untuk MENAMPILKAN PERBANDINGAN DUA BUAH NILAI
 */
package pbo2.pkg10117067.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author Luthfi
 */
public class PBO210117067Latihan24Perbandinganduabuahnilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner(System.in);

        int nNilai1, nNilai2, Hasil, i;
        String jawaban, peritah;

        boolean ulang = true;

        while (ulang == true) {
            System.out.println("Masukan nilai pertama : ");
            Scanner scanner = new Scanner(System.in);
            nNilai1 = scanner.nextInt();

            System.out.println("Masukan nilai kedua : ");
            nNilai2 = scanner.nextInt();

            jawaban = (nNilai1 > nNilai2 ? "besar" : "kecil");
            System.out.println("Hasil : " + nNilai1 + " Lebih " + jawaban + " dari " + nNilai2);
            
            System.out.print("Ulangi Aktifitas ? (ya/tidak) : ");
            String perintah = scanner.next();
            
            if (perintah.equals("tidak")){
                ulang = false;
                System.out.println("Keluar");
            } else {
                System.out.print("Masukan Nilai Kedua : ");
                nNilai1 = scanner.nextInt();
                
                 System.out.print("Masukan Nilai Kedua : ");
                nNilai2 = scanner.nextInt();
            
                jawaban = (nNilai1 > nNilai2 ? "besar" : "kecil");
                
                System.out.println("Hasil : " + nNilai1 + " Lebih " + jawaban + " dari " + nNilai2);
                System.out.println("Ulang aktifitas ? (ya/tidak) : ");
                perintah = scanner.next();
            }
            

        }
        
    }
    
}
