/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini dibuat untuk MENAMPILKAN PERHITUNGGAN LINGKARAN
 */
package pbo2.pkg10117067.latihan22.perhitunganlingkaran;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Ihsanmi
 */
public class PBO210117067Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double PHI = 3.14159265358979323846;
        double nKeliling, nDiameter = 0, njariJari, nLuas;

        do {
            System.out.print("Masukan nilai diameter lngkaran : ");
            try {
                nDiameter = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Nilai diameter tidak sesuai");
                scanner.nextLine();
            }

        } while (nDiameter == 0);
        
        njariJari = nDiameter / 2;
        nLuas = (float) (PHI * (njariJari * njariJari));
        nKeliling = (PHI * nDiameter);
        
        DecimalFormat DF = new DecimalFormat("#.##");
        System.out.printf("jari jari lingkaran \t= %s%n", DF.format(njariJari));
         System.out.printf("Luas keliling\t\t= %s%n", DF.format(nLuas));
        System.out.printf("Keliling Lingkaran\t= %s%n", DF.format(nKeliling));
    
    }
    
}
