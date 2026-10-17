package project_ecocycle.pertemuan_06;


public class SetoranSampah {

    // Atribut private untuk menerapkan encapsulation
    private String namaNasabah;
    private double berat;
    private double hargaPerKg;

    // Constructor untuk menginisialisasi data setoran
    public SetoranSampah(
        String namaNasabah,
        double berat,
        double hargaPerKg
    ) {
        this.namaNasabah = namaNasabah;
        setBerat(berat);
        setHargaPerKg(hargaPerKg);
    }

    // Getter untuk mengambil nama nasabah
    public String getNamaNasabah() {
        return namaNasabah;
    }

    // Setter dengan validasi nama
    public void setNamaNasabah(String namaNasabah) {
        if (namaNasabah != null && !namaNasabah.isBlank()) {
            this.namaNasabah = namaNasabah;
        }
    }

    // Getter dan setter berat sampah
    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        if (berat > 0) {
            this.berat = berat;
        }
    }

    // Getter dan setter harga per kilogram
    public double getHargaPerKg() {
        return hargaPerKg;
    }

    public void setHargaPerKg(double hargaPerKg) {
        if (hargaPerKg >= 0) {
            this.hargaPerKg = hargaPerKg;
        }
    }

    // Menghitung nilai setoran berdasarkan berat dan harga
    public double hitungNilaiSetoran() {
        return berat * hargaPerKg;
    }

    // Menampilkan informasi dasar setoran
    public void tampilkanInformasi() {
        System.out.println("Nama Nasabah : " + namaNasabah);
        System.out.println("Berat Sampah : " + berat + " kg");
        System.out.println("Harga per Kg : Rp" + hargaPerKg);
        System.out.println(
            "Nilai Setoran: Rp" + hitungNilaiSetoran()
        );
    }

    /*
    Kenapa menjadi class induk? Karena nama nasabah, berat, harga per kilogram, 
    dan perhitungan nilai setoran merupakan data serta perilaku dasar yang dapat digunakan oleh berbagai jenis sampah.

    Class ini dapat menjadi dasar untuk class turunan yang lebih spesifik, misalnya SetoranPlastik atau SetoranKertas,
    yang mungkin memiliki atribut tambahan atau metode khusus sesuai dengan karakteristik sampah tersebut.
    */
}

