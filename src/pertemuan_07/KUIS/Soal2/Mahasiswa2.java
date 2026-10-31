package pertemuan_07.KUIS.Soal2;

import java.util.Scanner;

public class Mahasiswa2 {
    // Atribut private untuk menerapkan encapsulation
    private String nim;
    private String nama;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    // Constructor
    public Mahasiswa2 (String nim, String nama,
                     double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nim = nim;
        this.nama = nama;

        // Nilai awal agar semua nilai diatur melalui setter
        this.nilaiTugas = 0;
        this.nilaiUTS = 0;
        this.nilaiUAS = 0;

        setNilaiTugas(nilaiTugas);
        setNilaiUTS(nilaiUTS);
        setNilaiUAS(nilaiUAS);
    }

    // Getter
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }

    public double getNilaiUAS() {
        return nilaiUAS;
    }

    // Setter dengan validasi nilai 0-100
    public void setNilaiTugas(double nilaiTugas) {
        if (Double.isFinite(nilaiTugas)
                && nilaiTugas >= 0 && nilaiTugas <= 100) {
            this.nilaiTugas = nilaiTugas;
        } else {
            System.out.println("Nilai tugas tidak valid! Nilai harus 0-100.");
        }
    }

    public void setNilaiUTS(double nilaiUTS) {
        if (Double.isFinite(nilaiUTS)
                && nilaiUTS >= 0 && nilaiUTS <= 100) {
            this.nilaiUTS = nilaiUTS;
        } else {
            System.out.println("Nilai UTS tidak valid! Nilai harus 0-100.");
        }
    }

    public void setNilaiUAS(double nilaiUAS) {
        if (Double.isFinite(nilaiUAS)
                && nilaiUAS >= 0 && nilaiUAS <= 100) {
            this.nilaiUAS = nilaiUAS;
        } else {
            System.out.println("Nilai UAS tidak valid! Nilai harus 0-100.");
        }
    }

    // Menghitung nilai akhir sesuai bobot
    public double hitungNilaiAkhir() {
        return (nilaiTugas * 0.30)
                + (nilaiUTS * 0.30)
                + (nilaiUAS * 0.40);
    }

    // Menentukan status kelulusan
    public String tentukanStatus() {
        if (hitungNilaiAkhir() >= 60) {
            return "LULUS";
        }

        return "TIDAK LULUS";
    }

    // Menampilkan hasil penilaian
    public void tampilkanHasil() {
        System.out.println("\n=== HASIL PENILAIAN MAHASISWA ===");
        System.out.println("NIM          : " + getNim());
        System.out.println("Nama         : " + getNama());
        System.out.println("Nilai Tugas  : " + getNilaiTugas());
        System.out.println("Nilai UTS    : " + getNilaiUTS());
        System.out.println("Nilai UAS    : " + getNilaiUAS());
        System.out.printf("Nilai Akhir  : %.2f%n", hitungNilaiAkhir());
        System.out.println("Status       : " + tentukanStatus());
    }

    // Membaca nilai yang valid dari pengguna
    public static double bacaNilai(Scanner input, String namaNilai) {
        while (true) {
            System.out.print(namaNilai + " (0-100): ");
            String teks = input.nextLine().trim();

            try {
                double nilai = Double.parseDouble(teks);

                if (Double.isFinite(nilai) && nilai >= 0 && nilai <= 100) {
                    return nilai;
                }

                System.out.println("Nilai harus berada di antara 0 dan 100.");
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka yang valid.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan identitas mahasiswa
        System.out.println("=== INPUT DATA MAHASISWA ===");

        System.out.print("NIM          : ");
        String nim = input.nextLine();

        System.out.print("Nama         : ");
        String nama = input.nextLine();

        // Memasukkan nilai dengan validasi
        double tugas = bacaNilai(input, "Nilai Tugas");
        double uts = bacaNilai(input, "Nilai UTS");
        double uas = bacaNilai(input, "Nilai UAS");

        // Membuat objek mahasiswa
        Mahasiswa2 mahasiswa = new Mahasiswa2(
                nim, nama, tugas, uts, uas
        );

        // Menampilkan hasil penilaian
        mahasiswa.tampilkanHasil();

        input.close();
    }
}
