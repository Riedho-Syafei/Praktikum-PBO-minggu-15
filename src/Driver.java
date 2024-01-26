import java.util.Scanner;

public class Driver
{
    public static void main(String[] args) throws Exception
    {
        LoginPage.login();

        Penjualan penjualan = new Penjualan();
        Scanner keyboard = new Scanner(System.in);
        //keyboard.next();

        // penjualan.setTanggal("12/12/2023");
        // penjualan.setWaktu("08:32:07 WIB");

        System.out.println("Nama Pelanggan:");
        penjualan.setNamaPelanggan(keyboard.nextLine());

        System.out.println("Nomor HP:");
        penjualan.setNoHP(keyboard.nextLine());

        System.out.println("Alamat: ");
        penjualan.setAlamat(keyboard.nextLine());

        System.out.println("Nomor faktur:");
        penjualan.setNoFaktur(keyboard.nextInt());
        keyboard.nextLine();

        System.out.println("Nama barang:");
        penjualan.setNamaBarang(keyboard.nextLine());

        System.out.println("Harga barang:");
        penjualan.setHargaBarang(keyboard.nextInt());
        keyboard.nextLine();

        System.out.println("Jumlah beli:");
        penjualan.setJumlahBeli(keyboard.nextInt());
        keyboard.nextLine();

        penjualan.setTotalBayar();

        System.out.println("\n\n");
        System.out.println("       SUPERMARKET ZAHARA        ");
        System.out.println("Tanggal: " + penjualan.getTanggal());
        System.out.println("Waktu:   " + penjualan.getWaktu());
        System.out.println("=================================");
        System.out.println("         DATA PELANGGAN          ");
        System.out.println("---------------------------------");
        System.out.print("Nama Pelanggan: " + penjualan.getNamaPelanggan() + '\n');
        System.out.print("Alamat: " + penjualan.getAlamat() + "\n");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("      DATA PEMBELIAN BARANG      ");
        System.out.println("---------------------------------");
        System.out.print("Kode barang: " + penjualan.getNoFaktur() + '\n');
        System.out.print("Nama barang: " + penjualan.getNamaBarang() + '\n');
        System.out.print("Harga barang: " + penjualan.getHargaBarang() + '\n');
        System.out.print("Jumlah beli: " + penjualan.getJumlahBeli() + '\n');
        System.out.print("TOTAL BAYAR: " + penjualan.getTotalBayar() + '\n');
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("Kasir: Zulham <3");
        System.out.println("\n\n");

        keyboard.close();
        

    }

    
    
}
