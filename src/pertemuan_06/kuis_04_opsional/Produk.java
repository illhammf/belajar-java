package pertemuan_06.kuis_04_opsional;

public class Produk {

    // Atribut private hanya bisa diakses langsung dari class ini
    private String namaProduk;
    private double harga;
    private int stok;

    // Constructor tanpa parameter untuk membuat object kosong
    public Produk() {
        // Nilai atribut akan diisi melalui setter jika diperlukan
    }

    // Constructor dengan parameter untuk mengisi data awal
    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    // Menambah stok produk
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            this.stok += jumlah;
        }
    }

    // Mengurangi stok jika jumlah mencukupi
    public void kurangiStok(int jumlah) {
        if (jumlah > 0 && jumlah <= this.stok) {
            this.stok -= jumlah;
        }
    }

    // Menampilkan informasi umum produk
    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}
  
}
