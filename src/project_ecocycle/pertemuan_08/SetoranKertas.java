package project_ecocycle.pertemuan_08;

// Subclass yang mewarisi SetoranSampah
// sekaligus mengimplementasikan interface DapatDidaurUlang.
public class SetoranKertas extends SetoranSampah
        implements DapatDidaurUlang {

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

    @Override
    public void prosesDaurUlang() {
        System.out.println(
                "Kertas dipilah, dihancurkan, dan diproses menjadi bahan kertas baru."
        );
    }
}