package pertemuan_07.KUIS.Soal3.pakai_scanner;

public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private double harga;
    private int stok;

    public Barang(String kodeBarang, String namaBarang, double harga, int stok) {
        if (harga <= 0 || !Double.isFinite(harga)) {
            throw new IllegalArgumentException("Harga harus lebih dari 0!");
        }

        if (stok < 0) {
            throw new IllegalArgumentException("Stok tidak boleh negatif!");
        }

        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public boolean tambahStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Gagal! Jumlah stok harus lebih dari 0.");
            return false;
        }

        if (jumlah > Integer.MAX_VALUE - stok) {
            System.out.println("Gagal! Jumlah stok terlalu besar.");
            return false;
        }

        stok += jumlah;

        System.out.println("Stok berhasil ditambahkan.");
        System.out.println("Stok sekarang: " + stok);
        return true;
    }

    public boolean jualBarang(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Gagal! Jumlah pembelian harus lebih dari 0.");
            return false;
        }

        if (jumlah > stok) {
            System.out.println("Gagal! Stok barang tidak mencukupi.");
            System.out.println("Stok tersedia: " + stok);
            return false;
        }

        stok -= jumlah;
        return true;
    }

    // Menghitung total pembayaran tanpa mengubah stok
    public double hitungTotal(int jumlah) {
        if (jumlah <= 0) {
            throw new IllegalArgumentException(
                    "Jumlah pembelian harus lebih dari 0!"
            );
        }

        double subtotal = harga * jumlah;

        if (subtotal >= 500000) {
            return subtotal - (subtotal * 0.10);
        }

        return subtotal;
    }
}