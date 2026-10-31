package pertemuan_07.KUIS.Soal3.pakai_scanner;

import java.util.Scanner;
import java.util.Locale;

public class Toko {
    private static final Scanner input = new Scanner(System.in);
    private static final Barang barang = new Barang(
            "BRG001", "Keyboard", 150000, 10
    );

    public static void main(String[] args) {
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = bacaInteger("Pilih menu: ");

            switch (pilihan) {
                case 1:
                    tampilkanBarang();
                    break;

                case 2:
                    prosesTambahStok();
                    break;

                case 3:
                    prosesPembelian();
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan program toko!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Pilih menu 1-4.");
            }

            System.out.println();

        } while (pilihan != 4);

        input.close();
    }

    // Menampilkan menu utama
    public static void tampilkanMenu() {
        System.out.println("=== MENU TOKO ===");
        System.out.println("1. Tampilkan Barang");
        System.out.println("2. Tambah Stok");
        System.out.println("3. Beli Barang");
        System.out.println("4. Keluar");
    }

    // Menampilkan data barang
    public static void tampilkanBarang() {
        System.out.println("\n=== INFORMASI BARANG ===");
        System.out.println("Kode Barang : " + barang.getKodeBarang());
        System.out.println("Nama Barang : " + barang.getNamaBarang());
        System.out.printf("Harga       : %s%n", formatRupiah(barang.getHarga()));
        System.out.println("Stok        : " + barang.getStok());
    }

    // Menambah stok barang
    public static void prosesTambahStok() {
        System.out.println("\n=== TAMBAH STOK ===");
        System.out.println("Nama Barang : " + barang.getNamaBarang());
        System.out.println("Stok Awal   : " + barang.getStok());

        int jumlah = bacaInteger("Jumlah stok yang ditambahkan: ");
        barang.tambahStok(jumlah);
    }

    // Memproses pembelian barang
    public static void prosesPembelian() {
        System.out.println("\n=== PEMBELIAN BARANG ===");
        System.out.println("Nama Barang : " + barang.getNamaBarang());
        System.out.printf("Harga       : %s%n", formatRupiah(barang.getHarga()));
        System.out.println("Stok Tersedia: " + barang.getStok());

        int jumlah = bacaInteger("Jumlah yang dibeli: ");

        // Validasi dan pengurangan stok dilakukan sebelum mencetak struk
        if (!barang.jualBarang(jumlah)) {
            return;
        }

        // Menghitung subtotal, diskon, dan total bayar
        double subtotal = barang.getHarga() * jumlah;
        double totalBayar = barang.hitungTotal(jumlah);
        double diskon = subtotal - totalBayar;

        System.out.println("\n=== STRUK PEMBELIAN ===");
        System.out.println("Nama Barang : " + barang.getNamaBarang());
        System.out.printf("Harga       : %s%n", formatRupiah(barang.getHarga()));
        System.out.println("Jumlah      : " + jumlah);
        System.out.printf("Subtotal    : %s%n", formatRupiah(subtotal));
        System.out.printf("Diskon 10%%  : %s%n", formatRupiah(diskon));
        System.out.printf("Total Bayar : %s%n", formatRupiah(totalBayar));
        System.out.println("Sisa Stok   : " + barang.getStok());
        System.out.println("Transaksi berhasil!");
    }

    // Membaca input bilangan bulat
    public static int bacaInteger(String pesan) {
        while (true) {
            System.out.print(pesan);
            String teks = input.nextLine().trim();

            try {
                return Integer.parseInt(teks);
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa bilangan bulat!");
            }
        }
    }

    // Format angka menjadi Rupiah
    public static String formatRupiah(double nominal) {
        return String.format(Locale.US, "Rp%,.0f", nominal)
                .replace(',', '.');
    }
}
