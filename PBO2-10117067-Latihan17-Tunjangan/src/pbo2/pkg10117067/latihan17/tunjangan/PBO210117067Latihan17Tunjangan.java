/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENAMPILKAN TUNJANGAN
 */
package pbo2.pkg10117067.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author Ihsanmi
 */
public class PBO210117067Latihan17Tunjangan {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        String status;
        int gajiPokok;
        double tunjangan, totalGaji;

        System.out.println("=========Program Tunjangan========");
        System.out.print("Berapa gaji anda sebulan?: ");
        gajiPokok = scanner.nextInt();

        System.out.print("Status Anda ? (Menikah/Belum) :");
        status = scanner.next();

        tunjangan = (status.equalsIgnoreCase("Menikah")) ? gajiPokok * 0.35 : 0;

        totalGaji = tunjangan + gajiPokok;

        System.out.println("\n");
        System.out.println("==========Hasil Perhitungan============");
        System.out.println("Gaji Pokok\t\t : " + gajiPokok);
        System.out.println("Tunjangan Gaji\t\t : " + tunjangan);
        System.out.println("Total Gaji\t\t : " + totalGaji);
        System.out.println("(Develop By : IhsanMi");
    }
    
}
