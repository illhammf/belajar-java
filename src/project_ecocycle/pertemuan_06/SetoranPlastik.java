package project_ecocycle.pertemuan_06;


public class SetoranPlastik extends SetoranSampah {

    // Atribut tambahan khusus untuk sampah plastik
    private String jenisPlastik;

    public SetoranPlastik(
        String namaNasabah,
        double berat,
        double hargaPerKg,
        String jenisPlastik
    ) {
        // Memanggil constructor class induk
        super(namaNasabah, berat, hargaPerKg);

        this.jenisPlastik = jenisPlastik;
    }

    public String getJenisPlastik() {
        return jenisPlastik;
    }

    public void setJenisPlastik(String jenisPlastik) {
        if (jenisPlastik != null && !jenisPlastik.isBlank()) {
            this.jenisPlastik = jenisPlastik;
        }
    }

    // Menampilkan informasi umum dan informasi khusus plastik
    @Override
    public void tampilkanInformasi() {
        System.out.println("=== SETORAN SAMPAH PLASTIK ===");

        // Menggunakan method warisan dari class induk
        super.tampilkanInformasi();

        System.out.println("Jenis Plastik: " + jenisPlastik);
    }
}

