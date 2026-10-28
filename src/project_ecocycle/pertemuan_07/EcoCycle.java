package project_ecocycle.pertemuan_07;

public class EcoCycle {

    public static void main(String[] args) {
        // main() memulai urutan pemanggilan method aplikasi.
        jalankanAplikasi();
    }

    static void jalankanAplikasi() {
        tampilkanJudul();

        // Variabel referensi bertipe superclass menyimpan objek subclass.
        // Ini menunjukkan bahwa SetoranPlastik dan SetoranKertas adalah SetoranSampah.
        SetoranSampah setoranPlastik = new SetoranPlastik(
                "Ilham",
                5.0,
                3000,
                "Botol PET"
        );

        SetoranSampah setoranKertas = new SetoranKertas(
                "Budi",
                4.0,
                2000,
                "Kardus"
        );

        // Method menerima variabel referensi yang menunjuk ke objek setoran.
        tampilkanSetoran(setoranPlastik);
        System.out.println();
        tampilkanSetoran(setoranKertas);

        // Variabel lokal untuk menyimpan nilai dari dua objek setoran.
        double nilaiPlastik = setoranPlastik.hitungNilaiSetoran();
        double nilaiKertas = setoranKertas.hitungNilaiSetoran();
        double totalSetoran = hitungTotalSetoran(nilaiPlastik, nilaiKertas);

        System.out.println();
        System.out.println("=== RINGKASAN SETORAN ===");
        System.out.println("Nilai setoran plastik : Rp" + formatRupiah(nilaiPlastik));
        System.out.println("Nilai setoran kertas  : Rp" + formatRupiah(nilaiKertas));
        System.out.println("Total seluruh setoran: Rp" + formatRupiah(totalSetoran));
    }

    static void tampilkanJudul() {
        System.out.println("====================================");
        System.out.println("       EcoCycle - Bank Sampah");
        System.out.println("====================================");
        System.out.println();
    }

    // Parameter setoran adalah variabel referensi yang menerima objek.
    static void tampilkanSetoran(SetoranSampah setoran) {
        setoran.tampilkanInformasi();
    }

    // Contoh simple variables: parameter dan variabel lokal menyimpan angka.
    static double hitungTotalSetoran(double nilaiPertama, double nilaiKedua) {
        double total = nilaiPertama + nilaiKedua;
        return total;
    }

    static String formatRupiah(double nilai) {
        return String.format("%,.0f", nilai).replace(',', '.');
    }
}
