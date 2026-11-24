package pertemuan_09.materi.contoh.single_inheritance;

// Superclass (Kelas Induk)
public class Kendaraan {

    // Atribut yang dapat diwariskan kepada subclass
    protected String merk;
    protected int tahunProduksi;

    // Constructor superclass
    public Kendaraan(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    // Method umum yang dapat digunakan subclass
    public void nyalakan() {
        System.out.println(merk + " sedang dinyalakan.");
    }

    public void tampilkanInfo() {
        System.out.println("Merk           : " + merk);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }
}
