package pertemuan_09.materi.contoh.single_inheritance;

// Subclass (Kelas Anak)
public class Mobil extends Kendaraan {

    // Atribut khusus milik subclass
    private int jumlahPintu;

    // Constructor subclass
    public Mobil(String merk, int tahunProduksi, int jumlahPintu) {

        // Memanggil constructor superclass
        super(merk, tahunProduksi);

        this.jumlahPintu = jumlahPintu;
    }

    // Method khusus milik subclass
    public void bukaBagasi() {
        System.out.println("Bagasi mobil " + merk + " berhasil dibuka.");
    }

    // Method untuk menampilkan informasi tambahan
    public void tampilkanJumlahPintu() {
        System.out.println("Jumlah Pintu   : " + jumlahPintu);
    }
}
