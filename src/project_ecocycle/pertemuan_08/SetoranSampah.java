package project_ecocycle.pertemuan_08;

public class SetoranSampah {

    // Atribut private untuk menjaga data tetap terenkripsi.
    private String namaNasabah;
    private double berat;
    private double hargaPerKg;

    public SetoranSampah( // Constructor untuk menginisialisasi objek SetoranSampah
            String namaNasabah,
            double berat,
            double hargaPerKg) {

        setNamaNasabah(namaNasabah);
        setBerat(berat);
        setHargaPerKg(hargaPerKg);
    }

    // Getter untuk nama nasabah
    public String getNamaNasabah() {
        return namaNasabah;
    }

    // Setter dengan validasi untuk nama nasabah
    public void setNamaNasabah(String namaNasabah) {
        if (namaNasabah != null && !namaNasabah.isBlank()) {
            this.namaNasabah = namaNasabah;
        }
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        if (berat > 0) {
            this.berat = berat;
        }
    }

    public double getHargaPerKg() {
        return hargaPerKg;
    }

    public void setHargaPerKg(double hargaPerKg) {
        if (hargaPerKg >= 0) {
            this.hargaPerKg = hargaPerKg;
        }
    }

    // Method untuk menghitung nilai setoran berdasarkan berat dan harga per kilogram.
    public double hitungNilaiSetoran() {
        double beratSampah = this.berat;
        double hargaSampahPerKg = this.hargaPerKg;

        return beratSampah * hargaSampahPerKg;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Nasabah : " + namaNasabah);
        System.out.println("Berat Sampah : " + berat + " kg");
        System.out.println("Harga per Kg : Rp" + formatRupiah(hargaPerKg));
        System.out.println("Nilai Setoran: Rp" + formatRupiah(hitungNilaiSetoran()));
    }

    // Method untuk memformat nilai menjadi format rupiah dengan tipe protected agar dapat diakses oleh kelas turunan.
    protected String formatRupiah(double nilai) {
        return String.format("%,.0f", nilai).replace(',', '.');
    }
}