package Kuis;

public class Barang18 {
    public String kode;
    public String nama;
    public int harga;
    public int stok;

    public Barang18(String kode, String nama, int harga, int stok) {
        this.kode=kode;
        this.nama=nama;
        this.harga=harga;
        this.stok=stok;
    }

    public void cetakInfo() {
        System.out.printf("%-5s %-12s %-7d %d\n", kode, nama, harga, stok);
    }
}