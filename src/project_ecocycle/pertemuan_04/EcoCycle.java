package project_ecocycle.pertemuan_04;


import java.util.Scanner;

public class EcoCycle {

    // Harga simulasi sampah per kilogram
    static final double HARGA_PLASTIK = 4000;
    static final double HARGA_KERTAS = 2000;
    static final double HARGA_LOGAM = 3000;

    // Function void untuk menampilkan menu utama
    static void tampilkanMenu() {
        System.out.println("\n================================");
        System.out.println("       SELAMAT DATANG DI");
        System.out.println("           ECOCYCLE");
        System.out.println("================================");
        System.out.println("1. Informasi EcoCycle");
        System.out.println("2. Hitung Nilai Setoran Sampah");
        System.out.println("3. Keluar");
        System.out.println("================================");
    }

    // Function void untuk menampilkan informasi aplikasi
    static void tampilkanInformasi() {
        System.out.println("\n=== INFORMASI ECOCYCLE ===");
        System.out.println(
            "EcoCycle membantu pengelolaan sampah rumah tangga."
        );
        System.out.println(
            "Sampah dapat disetorkan dan dihitung nilai setoran simulasinya."
        );
    }

    // Function void untuk menampilkan pilihan kategori sampah
    static void tampilkanKategoriSampah() {
        System.out.println("\n=== JENIS SAMPAH ===");
        System.out.println("1. Plastik");
        System.out.println("2. Kertas");
        System.out.println("3. Logam");
    }

    // Function dengan parameter untuk menentukan nama sampah
    static String getJenisSampah(int kategori) {
        switch (kategori) {
            case 1:
                return "Plastik";
            case 2:
                return "Kertas";
            case 3:
                return "Logam";
            default:
                return "";
        }
    }

    // Function dengan parameter untuk menentukan harga sampah
    static double getHargaPerKg(int kategori) {
        switch (kategori) {
            case 1:
                return HARGA_PLASTIK;
            case 2:
                return HARGA_KERTAS;
            case 3:
                return HARGA_LOGAM;
            default:
                return 0;
        }
    }

    // Function dengan dua parameter dan return value
    static double hitungNilaiSetoran(
        double berat,
        double hargaPerKg
    ) {
        return berat * hargaPerKg;
    }

    // Function void untuk menampilkan hasil setoran
    static void tampilkanHasilSetoran(
        String jenisSampah,
        double berat,
        double hargaPerKg,
        double total
    ) {
        System.out.println("\n=== HASIL SETORAN ===");
        System.out.println("Jenis sampah : " + jenisSampah);
        System.out.println("Berat        : " + berat + " kg");
        System.out.printf("Harga per kg : Rp%.2f%n", hargaPerKg);
        System.out.printf("Nilai setoran: Rp%.2f%n", total);
    }

    // Function untuk menjalankan proses setoran sampah
    static void prosesSetoran(Scanner input) {
        tampilkanKategoriSampah();

        System.out.print("Pilih jenis sampah: ");
        int kategori = input.nextInt();

        // Mengambil nama dan harga dari function
        String jenisSampah = getJenisSampah(kategori);
        double hargaPerKg = getHargaPerKg(kategori);

        // Memvalidasi kategori sampah
        if (hargaPerKg <= 0) {
            System.out.println(
                "Pilihan jenis sampah tidak tersedia."
            );
            return;
        }

        System.out.print("Masukkan berat sampah (kg): ");
        double berat = input.nextDouble();

        // Memvalidasi berat sampah
        if (berat <= 0) {
            System.out.println(
                "Berat sampah harus lebih dari 0 kg."
            );
            return;
        }

        // Memanggil function perhitungan dengan dua argument
        double total = hitungNilaiSetoran(berat, hargaPerKg);

        // Menampilkan hasil menggunakan function
        tampilkanHasilSetoran(
            jenisSampah,
            berat,
            hargaPerKg,
            total
        );
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        tampilkanMenu();

        System.out.print("Pilih menu: ");
        int pilihan = input.nextInt();

        // Control Statement dari Pertemuan 3 tetap digunakan
        switch (pilihan) {
            case 1:
                tampilkanInformasi();
                break;

            case 2:
                prosesSetoran(input);
                break;

            case 3:
                System.out.println(
                    "\nTerima kasih telah menggunakan EcoCycle!"
                );
                break;

            default:
                System.out.println(
                    "\nPilihan menu tidak tersedia."
                );
                break;
        }

        input.close();
    }
}
