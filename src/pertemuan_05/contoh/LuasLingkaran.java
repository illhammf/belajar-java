package pertemuan_05.contoh;

public class LuasLingkaran {

    // Atribut private
    private int jejari;
    private double luas;

    // Setter untuk mengatur jari-jari
    public void setJejari(int r) {
        if (r > 0) {
            this.jejari = r;
        } else {
            this.jejari = 0;
        }
    }

    // Getter untuk menghitung luas lingkaran
    public double getLuas() {
        this.luas = Math.PI * Math.pow(this.jejari, 2);
        return this.luas;
    }
}
