public class Pelanggan implements SupermarketABC {
    private String namaPelanggan;
    private String noHP;
    private int noFaktur;
    private String namaBarang;
    private int hargaBarang;
    private int jumlahBeli;
    private int totalBayar;

    public String getNamaPelanggan()
    {
        return this.namaPelanggan;
    }

    public String getNoHP()
    {
        return this.noHP;
    }
    
    public int getNoFaktur()
    {
        return this.noFaktur;
    }

    public String getNamaBarang()
    {
        return this.namaBarang;
    }

    public int getHargaBarang()
    {
        return this.hargaBarang;
    }

    public int getJumlahBeli()
    {
        return this.jumlahBeli;
    }

    public int getTotalBayar()
    {
        return this.totalBayar;
    }

    public void setNamaPelanggan(String nama)
    {
        this.namaPelanggan = nama;
    }

    public void setNoHP(String noHP)
    {
        this.noHP = noHP;
    }

    public void setNoFaktur(int faktur)
    {
        this.noFaktur = faktur;
    }

    public void setNamaBarang(String nama)
    {
        this.namaBarang = nama;
    }

    public void setHargaBarang(int harga)
    {
        if (harga > 0)
            this.hargaBarang = harga;
        else
            throw new ArithmeticException("Harga barang harus positif");
    }

    public void setJumlahBeli(int jumlah)
    {
        if (jumlah > 0)
            this.jumlahBeli = jumlah;
        else
            throw new ArithmeticException("Jumlah beli harus positif");
    }

    public void setTotalBayar()
    {
        this.totalBayar = this.hargaBarang * this.jumlahBeli;
    }
/* 
    public Pelanggan()
    {
        ;
    }
*/
}
