package project_ecocycle.pertemuan_03;

import java.util.Scanner;

public class EcoCycle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        System.out.println("================================");
        System.out.println("       SELAMAT DATANG DI");
        System.out.println("           ECOCYCLE");
        System.out.println("================================");
        System.out.println("1. Informasi EcoCycle");
        System.out.println("2. Hitung Nilai Setoran Sampah");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu: ");

        pilihan = input.nextInt();

        // Memproses pilihan menu menggunakan switch
        switch (pilihan) {
            case 1:
                System.out.println("\n=== INFORMASI ECOCYCLE ===");
                System.out.println(
                    "EcoCycle membantu pengelolaan sampah rumah tangga."
                );
                System.out.println(
                    "Setoran sampah dapat dihitung berdasarkan berat dan harga."
                );
                break;

            case 2:
                System.out.println("\n=== JENIS SAMPAH ===");
                System.out.println("1. Plastik");
                System.out.println("2. Kertas");
                System.out.println("3. Logam");
                System.out.print("Pilih jenis sampah: ");

                int kategori = input.nextInt();

                double hargaPerKg = 0;
                String jenisSampah = "";

                // Menentukan jenis dan harga sampah
                switch (kategori) {
                    case 1:
                        jenisSampah = "Plastik";
                        hargaPerKg = 4000;
                        break;

                    case 2:
                        jenisSampah = "Kertas";
                        hargaPerKg = 2000;
                        break;

                    case 3:
                        jenisSampah = "Logam";
                        hargaPerKg = 3000;
                        break;

                    default:
                        System.out.println(
                            "Pilihan jenis sampah tidak tersedia."
                        );
                        break;
                }

                // Memeriksa apakah kategori sampah valid
                if (hargaPerKg > 0) {
                    System.out.print("Masukkan berat sampah (kg): ");
                    double berat = input.nextDouble();

                    // Memvalidasi berat sampah
                    if (berat > 0) {
                        double total = berat * hargaPerKg;

                        System.out.println("\n=== HASIL SETORAN ===");
                        System.out.println("Jenis sampah : " + jenisSampah);
                        System.out.println("Berat        : " + berat + " kg");
                        System.out.println(
                            "Harga per kg : Rp" + hargaPerKg
                        );
                        System.out.println(
                            "Nilai setoran: Rp" + total
                        );
                    } else {
                        System.out.println(
                            "Berat sampah harus lebih dari 0 kg."
                        );
                    }
                }

                break;

            case 3:
                System.out.println("\nTerima kasih telah menggunakan EcoCycle!");
                break;

            default:
                System.out.println("\nPilihan menu tidak tersedia.");
                break;
        }

        input.close();
    }
}