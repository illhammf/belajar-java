package project_ecocycle.pertemuan_06;

// Kertas juga dapat memiliki informasi tambahan, misalnya jenis kertas yang disetorkan.
public class SetoranKertas extends SetoranSampah {

    // Atribut khusus untuk jenis kertas
    private String jenisKertas;

    public SetoranKertas(
        String namaNasabah,
        double berat,
        double hargaPerKg,
        String jenisKertas
    ) {
        // Menginisialisasi atribut yang berasal dari superclass
        super(namaNasabah, berat, hargaPerKg);

        this.jenisKertas = jenisKertas;
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

        // Menampilkan informasi umum dari class induk
        super.tampilkanInformasi();

        System.out.println("Jenis Kertas: " + jenisKertas);
    }
}

