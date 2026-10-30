package pertemuan_07.KUIS.Soal3;

public class Barang {
    // Atribut dibuat private untuk menerapkan encapsulation
    private String kodeBarang;
    private String namaBarang;
    private double harga;
    private int stok;

    // Constructor untuk menginisialisasi data barang
    public Barang(String kodeBarang, String namaBarang, double harga, int stok) {
        // Memastikan harga harus lebih dari 0
        if (harga <= 0) {
            throw new IllegalArgumentException("Harga harus lebih dari 0!");
        }

        // Memastikan stok awal tidak boleh negatif
        if (stok < 0) {
            throw new IllegalArgumentException("Stok tidak boleh negatif!");
        }

        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter untuk membaca kode barang
    public String getKodeBarang() {
        return kodeBarang;
    }

    // Getter untuk membaca nama barang
    public String getNamaBarang() {
        return namaBarang;
    }

    // Getter untuk membaca harga barang
    public double getHarga() {
        return harga;
    }

    // Getter untuk membaca stok barang
    public int getStok() {
        return stok;
    }

    // Menambahkan stok jika jumlahnya valid
    public boolean tambahStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Gagal! Jumlah stok harus lebih dari 0.");
            return false;
        }

        // Mencegah nilai stok melampaui batas integer
        if (jumlah > Integer.MAX_VALUE - stok) {
            System.out.println("Gagal! Jumlah stok terlalu besar.");
            return false;
        }

        stok += jumlah;

        System.out.println("Stok berhasil ditambahkan.");
        System.out.println("Stok sekarang: " + stok);

        return true;
    }

    // Menjual barang jika jumlah dan stok memenuhi ketentuan
    public boolean jualBarang(int jumlah) {
        // Jumlah pembelian harus lebih dari 0
        if (jumlah <= 0) {
            System.out.println("Gagal! Jumlah pembelian harus lebih dari 0.");
            return false;
        }

        // Pembelian tidak boleh melebihi stok yang tersedia
        if (jumlah > stok) {
            System.out.println("Gagal! Stok barang tidak mencukupi.");
            System.out.println("Stok tersedia: " + stok);
            return false;
        }

        // Stok dikurangi setelah transaksi dinyatakan valid
        stok -= jumlah;

        return true;
    }

    // Menghitung total pembayaran setelah diskon
    public double hitungTotal(int jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException(
                    "Jumlah pembelian harus lebih dari 0!"
            );
        }

        // Menghitung subtotal sebelum diskon
        double subtotal = harga * jumlah;

        // Diskon 10% jika subtotal minimal Rp500.000
        if (subtotal >= 500000) {
            return subtotal - (subtotal * 0.10);
        }

        // Jika subtotal kurang dari Rp500.000, tidak ada diskon
        return subtotal;
    }
}
