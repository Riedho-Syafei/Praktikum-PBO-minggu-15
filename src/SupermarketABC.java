public interface SupermarketABC {
    String getNamaPelanggan();
    String getNoHP();
    int getNoFaktur();
    String getNamaBarang();
    int getHargaBarang();
    int getJumlahBeli();
    int getTotalBayar();

    void setNamaPelanggan(String nama);
    void setNoHP(String noHP);
    void setNoFaktur(int faktur);
    void setNamaBarang(String nama);
    void setHargaBarang(int harga);
    void setJumlahBeli(int jumlah);
    void setTotalBayar();

}
