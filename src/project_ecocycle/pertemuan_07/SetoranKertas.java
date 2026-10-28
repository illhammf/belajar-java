package project_ecocycle.pertemuan_07;

public class SetoranKertas extends SetoranSampah {

    private String jenisKertas;

    public SetoranKertas(
            String namaNasabah,
            double berat,
            double hargaPerKg,
            String jenisKertas) {
        super(namaNasabah, berat, hargaPerKg);
        setJenisKertas(jenisKertas);
    }

    public String getJenisKertas() {
        return jenisKertas;
    }

    public void setJenisKertas(String jenisKertas) {
        if (jenisKertas != null && !jenisKertas.isBlank()) {
            this.jenisKertas = jenisKertas;
        }
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("=== SETORAN SAMPAH KERTAS ===");
        super.tampilkanInformasi();
        System.out.println("Jenis Kertas: " + jenisKertas);
    }
}
