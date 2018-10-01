/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini dibuat untuk MENAMPILKAN TARGET SALDO TABUNGAN USER
 */
package pbo2.pkg10117067.latihan20.target.saldo.tabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author Ihsanmi
 */
public class PBO210117067Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nSaldo, nBungan, bulan;
      
      nSaldo = 3500000;
      bulan = 1;
      
      DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getIntegerInstance();
      DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
      
      formatRp.setGroupingSeparator('.');
      kursIndonesia.setDecimalFormatSymbols(formatRp);
      
      while (nSaldo <= 6000000){
          nSaldo = (int) ((nSaldo * 0.08) + nSaldo);
          System.out.printf("Saldo Di buan ke-" + bulan + "Rp.%s\n ",kursIndonesia.format(nSaldo));
          
          bulan = bulan + 1; 
      }
    }
    
}
