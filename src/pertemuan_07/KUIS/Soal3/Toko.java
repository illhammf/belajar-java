package pertemuan_07.KUIS.Soal3;

import java.util.Scanner;
import java.util.Locale;

public class Toko {
    // Scanner untuk menerima input dari pengguna
    private static final Scanner input = new Scanner(System.in)
            .useLocale(Locale.US);

    // Membuat objek barang untuk transaksi toko
    private static final Barang barang = new Barang(
            "BRG001",
            "Keyboard",
            150000,
            10
    );

    public static void main(String[] args) {
        int pilihan;

        // Menu terus ditampilkan sampai pengguna memilih keluar
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
                    System.out.println("Pilihan tidak valid! Silakan pilih 1-4.");
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

    // Menampilkan informasi barang yang tersedia
    public static void tampilkanBarang() {
        System.out.println("\n=== INFORMASI BARANG ===");
        System.out.println("Kode Barang : " + barang.getKodeBarang());
        System.out.println("Nama Barang : " + barang.getNamaBarang());
        System.out.printf("Harga       : %s%n", formatRupiah(barang.getHarga()));
        System.out.println("Stok        : " + barang.getStok());
    }

    // Memproses penambahan stok barang
    public static void prosesTambahStok() {
        System.out.println("\n=== TAMBAH STOK ===");

        System.out.println("Nama Barang : " + barang.getNamaBarang());
        System.out.println("Stok Awal   : " + barang.getStok());

        int jumlah = bacaInteger("Jumlah stok yang ditambahkan: ");

        barang.tambahStok(jumlah);
    }

    // Memproses transaksi pembelian barang
    public static void prosesPembelian() {
        System.out.println("\n=== PEMBELIAN BARANG ===");

        System.out.println("Nama Barang : " + barang.getNamaBarang());
        System.out.printf("Harga       : %s%n", formatRupiah(barang.getHarga()));
        System.out.println("Stok Tersedia: " + barang.getStok());

        int jumlah = bacaInteger("Jumlah yang dibeli: ");

        // Validasi jumlah pembelian sebelum menghitung transaksi
        if (jumlah <= 0) {
            System.out.println("Transaksi gagal! Jumlah pembelian harus lebih dari 0.");
            return;
        }

        // Memeriksa apakah stok cukup dan mengurangi stok jika valid
        if (!barang.jualBarang(jumlah)) {
            return;
        }

        // Menghitung subtotal dan total pembayaran
        double subtotal = barang.getHarga() * jumlah;
        double totalBayar = barang.hitungTotal(jumlah);
        double diskon = subtotal - totalBayar;

        // Menampilkan struk pembelian
        System.out.println("\n=== STRUK PEMBELIAN ===");
        System.out.println("Nama Barang : " + barang.getNamaBarang());
        System.out.printf("Harga       : %s%n", formatRupiah(barang.getHarga()));
        System.out.println("Jumlah      : " + jumlah);
        System.out.printf("Subtotal    : %s%n", formatRupiah(subtotal));
        System.out.printf("Diskon      : %s%n", formatRupiah(diskon));
        System.out.printf("Total Bayar : %s%n", formatRupiah(totalBayar));
        System.out.println("Sisa Stok   : " + barang.getStok());
        System.out.println("Transaksi berhasil!");
    }

    // Membaca input angka bulat dengan penanganan input yang tidak valid
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

    // Mengubah angka menjadi format mata uang Rupiah
    public static String formatRupiah(double nominal) {
        return String.format(
                Locale.US,
                "Rp%,.0f",
                nominal
        ).replace(',', '.');
    }
}
