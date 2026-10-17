package pertemuan_06.kuis_04_opsional;


public class Elektronik extends Produk {

    // Atribut tambahan yang khusus dimiliki produk elektronik
    private String garansi;

    // Constructor mengisi data produk dan informasi garansi
    public Elektronik(
        String namaProduk,
        double harga,
        int stok,
        String garansi
    ) {
        // Memanggil constructor class induk Produk
        super(namaProduk, harga, stok);

        // Mengisi atribut khusus milik class Elektronik
        this.garansi = garansi;
    }

    // Getter untuk membaca informasi garansi
    public String getGaransi() {
        return garansi;
    }

    // Setter untuk mengubah informasi garansi
    public void setGaransi(String garansi) {
        this.garansi = garansi;
    }

    // Menampilkan informasi lengkap produk elektronik
    public void tampilkanInfoElektronik() {
        System.out.println("=== Data Produk Elektronik ===");

        // Mengakses data warisan melalui getter dari class Produk
        System.out.println("Nama Produk: " + getNamaProduk());
        System.out.println("Harga: " + getHarga());
        System.out.println("Stok: " + getStok());

        // Menampilkan atribut tambahan milik Elektronik
        System.out.println("Garansi: " + getGaransi());
    }
}

