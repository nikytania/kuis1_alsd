package Kuis;

import java.util.ArrayList;
import java.util.Scanner;

public class TransaksiBarang {
    private ArrayList<Barang18> daftarBarang;
    private ArrayList<Barang18> keranjang;
    private Scanner scanner;

    public TransaksiBarang() {
        daftarBarang = new ArrayList<>();
        keranjang = new ArrayList<>();
        scanner = new Scanner(System.in);

        //data barang
        daftarBarang.add(new Barang18("K01", "Sabun", 1000, 5));
        daftarBarang.add(new Barang18("K02", "Pasta Gigi", 2000, 10));
        daftarBarang.add(new Barang18("K03", "Biore", 3000, 23));
        daftarBarang.add(new Barang18("K04", "Shampoo", 4000, 55));
        daftarBarang.add(new Barang18("K05", "Sikat Gigi", 5000, 65));
        
    }

    public void tampilkanBarang() {
        System.out.println("\n=========================");
        System.out.println("Daftar Barang");
        System.out.println("=========================");
        System.out.printf("%-5s %-12s %-7s %s\n", "Kode", "Nama", "Harga", "Stok");
        for (Barang18 barang : daftarBarang) {
            barang.cetakInfo();
        }
    }

    public void beliBarang() {
        String ulang;
        do {
            System.out.print("Masukkan kode barang: ");
            String kode = scanner.nextLine();
            boolean ditemukan = false;

            for (Barang18 barang : daftarBarang) {
                if (barang.kode.equalsIgnoreCase(kode)) {
                    if (barang.stok > 0) {
                        barang.stok--;
                        keranjang.add(new Barang18(barang.kode, barang.nama, barang.harga, barang.stok));
                    } else {
                    } ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Barang " + kode + " tidak ditemukan.");
            }
            System.out.print("Apakah akan belanja kembali (Y/N)? ");
            ulang = scanner.nextLine();
        } while (ulang.equalsIgnoreCase("Y"));
    }

    public void tampilkanPembelian() {
        System.out.println("\n=========================");
        System.out.println("List Belanjaan");
        System.out.println("=========================");
        System.out.printf("%-5s %-12s %-7s %s\n", "Kode", "Nama", "Harga", "Stok");
        System.out.println("=========================");
        for (Barang18 barang : keranjang) {
            barang.cetakInfo();
        }
    }
}