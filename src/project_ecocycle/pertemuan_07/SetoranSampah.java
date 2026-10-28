package project_ecocycle.pertemuan_07;

public class SetoranSampah {

    // Atribut private untuk menjaga data tetap terenkapsulasi.
    private String namaNasabah;
    private double berat;
    private double hargaPerKg;

    public SetoranSampah(String namaNasabah, double berat, double hargaPerKg) {
        setNamaNasabah(namaNasabah);
        setBerat(berat);
        setHargaPerKg(hargaPerKg);
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

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

    // Method ini menggunakan variabel lokal untuk memperlihatkan
    // contoh simple variables di dalam sebuah pemanggilan method.
    public double hitungNilaiSetoran() {
        double beratSampah = this.berat;
        double hargaSampahPerKg = this.hargaPerKg;
        double nilaiSetoran = beratSampah * hargaSampahPerKg;

        return nilaiSetoran;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Nasabah : " + namaNasabah);
        System.out.println("Berat Sampah : " + berat + " kg");
        System.out.println("Harga per Kg : Rp" + formatRupiah(hargaPerKg));
        System.out.println("Nilai Setoran: Rp" + formatRupiah(hitungNilaiSetoran()));
    }

    // Method pembantu untuk membuat tampilan nilai uang lebih mudah dibaca.
    protected String formatRupiah(double nilai) {
        return String.format("%,.0f", nilai).replace(',', '.');
    }
}
