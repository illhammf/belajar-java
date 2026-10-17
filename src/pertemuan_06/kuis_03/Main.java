package pertemuan_06.kuis_03;


public class Main {

    public static void main(String[] args) {

        // Membuat object produk Laptop dengan stok awal 5
        Produk produk1 = new Produk("Laptop", 7000000, 5);

        // Menambahkan 3 unit sehingga stok menjadi 8
        produk1.tambahStok(3);

        // Mengurangi 2 unit sehingga stok menjadi 6
        produk1.kurangiStok(2);

        // Menampilkan informasi produk terbaru
        produk1.tampilkanInfo();
    }
}

