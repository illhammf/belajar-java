package pertemuan_09.materi.contoh.hierarchical_inheritance;

// Superclass (Kelas Induk)
public class Pegawai {

    // Atribut umum yang diwariskan
    protected String nama;
    protected double gajiPokok;

    // Constructor superclass
    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Method umum untuk seluruh pegawai
    public void tampilkanInfo() {
        System.out.println("Nama       : " + nama);
        System.out.println("Gaji Pokok : Rp" + gajiPokok);
    }

    public void bekerja() {
        System.out.println(nama + " sedang bekerja.");
    }
}
