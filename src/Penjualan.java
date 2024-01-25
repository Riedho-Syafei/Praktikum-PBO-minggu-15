import java.time.LocalDate;
// import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;

// https://stackoverflow.com/questions/59531046/java-time-datetimeexception-unable-to-extract-zoneid-from-temporal
// https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

public class Penjualan extends Pelanggan
{
    private LocalDate tanggal;
    // private LocalTime waktu;
    private OffsetTime waktu;

    public String getTanggal()
    {
        tanggal = LocalDate.now();
        DateTimeFormatter obj = DateTimeFormatter.ofPattern("E, dd-MM-yyyy");
        String tanggalFormat = tanggal.format(obj);

        return tanggalFormat;
    }

    public String getWaktu()
    {
        waktu = OffsetTime.now();
        DateTimeFormatter obj = DateTimeFormatter.ofPattern("HH:mm:ss O");
        String waktuFormat = waktu.format(obj);
        
        return waktuFormat;
    }

    public Penjualan()
    {
        ;
    }
}
