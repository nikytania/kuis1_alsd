package Kuis;

import java.util.Scanner;

public class MainBarang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransaksiBarang transaksi = new TransaksiBarang();
        int pilihan;

        System.out.println("=========================");
        System.out.println("TOKO MAJU MUNDUR CANTIK");
        System.out.println("=========================");

        do {
            System.out.println("\n1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih [1-4]: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    transaksi.tampilkanBarang();
                    break;
                case 2:
                    transaksi.tampilkanBarang();
                    transaksi.beliBarang();
                    break;
                case 3:
                    transaksi.tampilkanPembelian();
                    break;
                case 4:
                    System.out.print("Terima kasih sudah berbelanja!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Input ulang! ");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
