package project_ecocycle.pertemuan_08;

public class EcoCycle {

    public static void main(String[] args) {
        jalankanAplikasi();
    }

    static void jalankanAplikasi() {
        tampilkanJudul();

        // Membuat objek dari masing-masing subclass.
        SetoranPlastik setoranPlastik = new SetoranPlastik(
                "Ilham",
                5.0,
                3000,
                "Botol PET Campuran"
        );

        SetoranKertas setoranKertas = new SetoranKertas(
                "Budi",
                4.0,
                2000,
                "Kardus"
        );

        SetoranBotolPET setoranBotolPET = new SetoranBotolPET(
                "Andi",
                3.0,
                5000,
                "PET-1"
        );

        // Menampilkan informasi menggunakan referensi superclass.
        tampilkanSetoran(setoranPlastik);
        System.out.println();

        tampilkanSetoran(setoranKertas);
        System.out.println();

        tampilkanSetoran(setoranBotolPET);

        // Menjalankan method melalui interface.
        System.out.println("\n=== PROSES DAUR ULANG ===");

        tampilkanProsesDaurUlang(setoranPlastik);
        tampilkanProsesDaurUlang(setoranKertas);
        tampilkanProsesDaurUlang(setoranBotolPET);

        // Menghitung total nilai setoran.
        double nilaiPlastik = setoranPlastik.hitungNilaiSetoran();
        double nilaiKertas = setoranKertas.hitungNilaiSetoran();
        double nilaiBotolPET = setoranBotolPET.hitungNilaiSetoran();

        double totalSetoran = hitungTotalSetoran(
                nilaiPlastik,
                nilaiKertas,
                nilaiBotolPET
        );

        System.out.println("\n=== RINGKASAN SETORAN ===");
        System.out.println("Nilai setoran plastik : Rp" + formatRupiah(nilaiPlastik));
        System.out.println("Nilai setoran kertas  : Rp" + formatRupiah(nilaiKertas));
        System.out.println("Nilai setoran botol PET: Rp" + formatRupiah(nilaiBotolPET));
        System.out.println("------------------------------------");
        System.out.println("Total seluruh setoran : Rp" + formatRupiah(totalSetoran));
    }

    static void tampilkanJudul() {
        System.out.println("====================================");
        System.out.println("       EcoCycle - Bank Sampah");
        System.out.println("       Pertemuan 8");
        System.out.println("====================================");
        System.out.println();
    }

    // Parameter menggunakan tipe superclass.
    static void tampilkanSetoran(SetoranSampah setoran) {
        setoran.tampilkanInformasi();
    }

    // Parameter menggunakan tipe interface.
    static void tampilkanProsesDaurUlang(DapatDidaurUlang material) {
        material.prosesDaurUlang();
    }

    static double hitungTotalSetoran(
            double nilaiPertama,
            double nilaiKedua,
            double nilaiKetiga) {

        return nilaiPertama + nilaiKedua + nilaiKetiga;
    }

    static String formatRupiah(double nilai) {
        return String.format("%,.0f", nilai).replace(',', '.');
    }
}