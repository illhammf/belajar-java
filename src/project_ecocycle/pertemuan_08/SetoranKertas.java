package project_ecocycle.pertemuan_08;

// Subclass yang mewarisi SetoranSampah
// sekaligus mengimplementasikan interface DapatDidaurUlang.
public class SetoranKertas extends SetoranSampah
        implements DapatDidaurUlang { // implementasi ini artinya SetoranKertas harus menyediakan implementasi untuk metode prosesDaurUlang() dari interface DapatDidaurUlang.

    private String jenisKertas;

    // Constructor untuk menginisialisasi objek SetoranKertas
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

    @Override // Override menandakan bahwa metode ini mengubah perilaku metode dari superclass SetoranSampah.
    public void tampilkanInformasi() {
        System.out.println("=== SETORAN SAMPAH KERTAS ===");
        super.tampilkanInformasi();
        System.out.println("Jenis Kertas: " + jenisKertas);
    }

    @Override // Override menandakan bahwa metode ini mengubah perilaku metode dari interface DapatDidaurUlang.
    public void prosesDaurUlang() {
        System.out.println(
                "Kertas dipilah, dihancurkan, dan diproses menjadi bahan kertas baru."
        );
    }
}