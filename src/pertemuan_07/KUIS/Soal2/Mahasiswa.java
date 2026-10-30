package pertemuan_07.KUIS.Soal2;

public class Mahasiswa {
    // Atribut dibuat private agar tidak dapat diakses langsung dari luar class
    private String nim;
    private String nama;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    // Constructor untuk menginisialisasi data mahasiswa
    public Mahasiswa(String nim, String nama, double nilaiTugas,
                     double nilaiUTS, double nilaiUAS) {
        this.nim = nim;
        this.nama = nama;

        // Nilai awal diatur melalui setter agar tetap melewati validasi
        this.nilaiTugas = 0;
        this.nilaiUTS = 0;
        this.nilaiUAS = 0;

        setNilaiTugas(nilaiTugas);
        setNilaiUTS(nilaiUTS);
        setNilaiUAS(nilaiUAS);
    }

    // Getter untuk mengambil NIM
    public String getNim() {
        return nim;
    }

    // Getter untuk mengambil nama
    public String getNama() {
        return nama;
    }

    // Getter untuk mengambil nilai tugas
    public double getNilaiTugas() {
        return nilaiTugas;
    }

    // Getter untuk mengambil nilai UTS
    public double getNilaiUTS() {
        return nilaiUTS;
    }

    // Getter untuk mengambil nilai UAS
    public double getNilaiUAS() {
        return nilaiUAS;
    }

    // Setter nilai tugas dengan validasi 0 sampai 100
    public void setNilaiTugas(double nilaiTugas) {
        if (nilaiTugas >= 0 && nilaiTugas <= 100) {
            this.nilaiTugas = nilaiTugas;
        } else {
            System.out.println("Nilai tugas tidak valid! Masukkan nilai 0-100.");
        }
    }

    // Setter nilai UTS dengan validasi 0 sampai 100
    public void setNilaiUTS(double nilaiUTS) {
        if (nilaiUTS >= 0 && nilaiUTS <= 100) {
            this.nilaiUTS = nilaiUTS;
        } else {
            System.out.println("Nilai UTS tidak valid! Masukkan nilai 0-100.");
        }
    }

    // Setter nilai UAS dengan validasi 0 sampai 100
    public void setNilaiUAS(double nilaiUAS) {
        if (nilaiUAS >= 0 && nilaiUAS <= 100) {
            this.nilaiUAS = nilaiUAS;
        } else {
            System.out.println("Nilai UAS tidak valid! Masukkan nilai 0-100.");
        }
    }

    // Menghitung nilai akhir berdasarkan bobot yang ditentukan
    public double hitungNilaiAkhir() {
        return (nilaiTugas * 0.30)
                + (nilaiUTS * 0.30)
                + (nilaiUAS * 0.40);
    }

    // Menentukan status kelulusan berdasarkan nilai akhir
    public String tentukanStatus() {
        if (hitungNilaiAkhir() >= 60) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }

    // Menampilkan seluruh data dan hasil penilaian mahasiswa
    public void tampilkanHasil() {
        System.out.println("=== HASIL PENILAIAN MAHASISWA ===");
        System.out.println("NIM          : " + getNim());
        System.out.println("Nama         : " + getNama());
        System.out.println("Nilai Tugas  : " + getNilaiTugas());
        System.out.println("Nilai UTS    : " + getNilaiUTS());
        System.out.println("Nilai UAS    : " + getNilaiUAS());
        System.out.printf("Nilai Akhir  : %.2f%n", hitungNilaiAkhir());
        System.out.println("Status       : " + tentukanStatus());
    }

    public static void main(String[] args) {
        // Membuat objek mahasiswa sesuai contoh pada PPT
        Mahasiswa mahasiswa1 = new Mahasiswa(
                "2026001",
                "Sinta",
                80,
                75,
                90
        );

        // Menampilkan hasil penilaian
        mahasiswa1.tampilkanHasil();

        // Contoh pengujian validasi:
        // Baris berikut ditolak karena nilai melebihi 100.
        // Nilai UTS sebelumnya tetap 75.
        // mahasiswa1.setNilaiUTS(120);
    }
}