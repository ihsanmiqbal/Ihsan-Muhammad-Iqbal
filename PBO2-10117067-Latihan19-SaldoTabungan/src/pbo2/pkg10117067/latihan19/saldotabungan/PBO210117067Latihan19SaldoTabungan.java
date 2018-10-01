/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini dibuat untuk MENAMPILKAN SALDO TABUNGAN USER
 */
package pbo2.pkg10117067.latihan19.saldotabungan;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
        
/**
 *
 * @author Ihsanmi
 */
public class PBO210117067Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nSaldo, bulan ;
    double nBungan ;
    
    nSaldo = 2500000;
    bulan = 1;
    
    DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getIntegerInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    
    formatRp.setGroupingSeparator('.');
    kursIndonesia.setDecimalFormatSymbols(formatRp);
    
    while (bulan <= 6){
        
        nSaldo = (int) (nSaldo + (nSaldo * 0.15));
        System.out.printf("Saldo di Bulan ke-" + bulan + " Rp.%s \n ", kursIndonesia.format(nSaldo));
        bulan = bulan + 1;
    }
    }
    
}
