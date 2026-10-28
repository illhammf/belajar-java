package project_ecocycle.pertemuan_07;

public class SetoranPlastik extends SetoranSampah {

    private String jenisPlastik;

    public SetoranPlastik(
            String namaNasabah,
            double berat,
            double hargaPerKg,
            String jenisPlastik) {
        super(namaNasabah, berat, hargaPerKg);
        setJenisPlastik(jenisPlastik);
    }

    public String getJenisPlastik() {
        return jenisPlastik;
    }

    public void setJenisPlastik(String jenisPlastik) {
        if (jenisPlastik != null && !jenisPlastik.isBlank()) {
            this.jenisPlastik = jenisPlastik;
        }
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("=== SETORAN SAMPAH PLASTIK ===");
        super.tampilkanInformasi();
        System.out.println("Jenis Plastik: " + jenisPlastik);
    }
}
