package pertemuan_08.kuis.soal3;

// Superclass (Kelas Induk)
public class Person {

    protected String nama;
    protected int umur;
    protected String alamat;

    // Constructor
    public Person(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    // Method untuk menampilkan informasi seseorang
    public void tampilkanInfo() {
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Alamat : " + alamat);
    }
}