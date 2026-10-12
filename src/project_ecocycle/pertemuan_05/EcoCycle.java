package project_ecocycle.pertemuan_05;

import java.util.Scanner;

public class EcoCycle {

    static final double HARGA_PLASTIK = 4000;
    static final double HARGA_KERTAS = 2000;
    static final double HARGA_LOGAM = 3000;

    // Function void untuk menampilkan menu
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

    // Function void untuk menampilkan informasi
    static void tampilkanInformasi() {
        System.out.println("\n=== INFORMASI ECOCYCLE ===");
        System.out.println(
            "EcoCycle membantu pengelolaan sampah rumah tangga."
        );
        System.out.println(
            "Setoran dihitung berdasarkan berat dan harga sampah."
        );
    }

    // Menampilkan kategori sampah
    static void tampilkanKategoriSampah() {
        System.out.println("\n=== JENIS SAMPAH ===");
        System.out.println("1. Plastik");
        System.out.println("2. Kertas");
        System.out.println("3. Logam");
    }

    // Mengambil nama kategori
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

    // Mengambil harga kategori
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

    // Memproses setoran menggunakan object SetoranSampah
    static void prosesSetoran(Scanner input) {
        tampilkanKategoriSampah();

        System.out.print("Pilih jenis sampah: ");
        int kategori = input.nextInt();

        String jenis = getJenisSampah(kategori);
        double harga = getHargaPerKg(kategori);

        if (jenis.isEmpty()) {
            System.out.println(
                "Pilihan jenis sampah tidak tersedia."
            );
            return;
        }

        System.out.print("Masukkan berat sampah (kg): ");
        double berat = input.nextDouble();

        if (berat <= 0) {
            System.out.println(
                "Berat sampah harus lebih dari 0 kg."
            );
            return;
        }

        // Membuat object dengan data yang sudah divalidasi
        SetoranSampah setoran = new SetoranSampah(
            jenis,
            berat,
            harga
        );

        tampilkanHasilSetoran(setoran);
    }

    // Menampilkan data melalui getter
    static void tampilkanHasilSetoran(SetoranSampah setoran) {
        System.out.println("\n=== HASIL SETORAN ===");
        System.out.println(
            "Jenis sampah : " + setoran.getJenisSampah()
        );
        System.out.println(
            "Berat        : " + setoran.getBerat() + " kg"
        );
        System.out.printf(
            "Harga per kg : Rp%.2f%n",
            setoran.getHargaPerKg()
        );
        System.out.printf(
            "Nilai setoran: Rp%.2f%n",
            setoran.hitungNilaiSetoran()
        );
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        tampilkanMenu();

        System.out.print("Pilih menu: ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                tampilkanInformasi();
                break;

            case 2:
                prosesSetoran(input);
                break;

            case 3:
                System.out.println(
                    "Terima kasih telah menggunakan EcoCycle!"
                );
                break;

            default:
                System.out.println(
                    "Pilihan menu tidak tersedia."
                );
                break;
        }

        input.close();
    }
}

