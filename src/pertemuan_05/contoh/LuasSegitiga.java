package pertemuan_05.contoh;


public class LuasSegitiga {

    // Atribut dibuat private agar tidak diakses langsung dari luar class
    private int alas;
    private int tinggi;
    private double luas;

    // Setter untuk mengatur alas
    public void setAlas(int a) {
        if (a > 0) {
            this.alas = a;
        } else {
            this.alas = 0;
        }
    }

    // Setter untuk mengatur tinggi
    public void setTinggi(int t) {
        if (t > 0) {
            this.tinggi = t;
        } else {
            this.tinggi = 0;
        }
    }

    // Getter untuk menghitung dan mengambil luas
    public double getLuas() {
        this.luas = this.alas * this.tinggi * 0.5;
        return this.luas;
    }
}

