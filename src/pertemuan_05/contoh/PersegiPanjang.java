package pertemuan_05.contoh;


public class PersegiPanjang {

    // Atribut private
    private int panjang;
    private int lebar;
    private double luas;

    // Setter untuk panjang
    public void setPanjang(int p) {
        if (p > 0) {
            this.panjang = p;
        } else {
            this.panjang = 0;
        }
    }

    // Setter untuk lebar
    public void setLebar(int l) {
        if (l > 0) {
            this.lebar = l;
        } else {
            this.lebar = 0;
        }
    }

    // Getter untuk menghitung luas
    public double getLuas() {
        this.luas = this.panjang * this.lebar; // Rumus luas persegi panjang = panjang * lebar
        return this.luas;
    }
}

