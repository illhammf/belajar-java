package project_ecocycle.pertemuan_06;


public class EcoCycle {

    public static void main(String[] args) {

        // Object setoran plastik
        SetoranPlastik plastik = new SetoranPlastik(
            "Ilham",
            5.0,
            3000,
            "Botol PET"
        );

        // Object setoran kertas
        SetoranKertas kertas = new SetoranKertas(
            "Budi",
            4.0,
            2000,
            "Kardus"
        );

        // Menampilkan informasi setiap setoran
        plastik.tampilkanInformasi();

        System.out.println();

        kertas.tampilkanInformasi();

        // Menghitung total nilai kedua setoran
        double totalSetoran =
            plastik.hitungNilaiSetoran()
            + kertas.hitungNilaiSetoran();

        System.out.println();
        System.out.println(
            "Total Nilai Seluruh Setoran: Rp" + totalSetoran
        );
    }
}

