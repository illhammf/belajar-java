

public class Produk {

    // Atribut private untuk menyimpan informasi produk
    private String namaProduk;
    private double harga;
    private int stok;

    // Constructor untuk menginisialisasi produk
    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter untuk membaca nama produk
    public String getNamaProduk() {
        return namaProduk;
    }

    // Getter untuk membaca harga
    public double getHarga() {
        return harga;
    }

    // Getter untuk membaca stok
    public int getStok() {
        return stok;
    }

    // Setter untuk mengubah nama produk
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    // Setter untuk mengubah harga produk
    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        }
    }

    // Setter untuk mengubah stok produk
    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        }
    }

    // Menambah stok jika jumlah yang dimasukkan positif
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        }
    }

    // Mengurangi stok hanya jika jumlah tersedia mencukupi
    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && jumlah <= this.stok) {
            this.stok -= jumlah;
        }
    }

    // Menampilkan informasi produk
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}
