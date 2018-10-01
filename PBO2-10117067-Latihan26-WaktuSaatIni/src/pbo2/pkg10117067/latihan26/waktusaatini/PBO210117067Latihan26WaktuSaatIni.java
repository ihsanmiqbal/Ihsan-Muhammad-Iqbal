/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 101170867
 * DESKRIPSI PROGRES : Program ini dibuat untuk MENAMPILKAN WAKTU SAAT INI
 */
package pbo2.pkg10117067.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Ihsanmi
 */
public class PBO210117067Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date Waktu = new Date ( );
        SimpleDateFormat FormatWaktu = new SimpleDateFormat("EEEE, dd MMM yyy hh:mm:ss");
        
        System.out.println("Hari ini adalah hari : " + FormatWaktu.format(Waktu));
    }
    
}
