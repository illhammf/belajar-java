package pertemuan_08.kuis.soal2;

// Superclass (Kelas Induk)
public class Fruits {

    protected String nama;
    protected String warna;
    protected String rasa;

    // Constructor
    public Fruits(String nama, String warna, String rasa) {
        this.nama = nama;
        this.warna = warna;
        this.rasa = rasa;
    }

    // Method untuk menampilkan informasi buah
    public void tampilkanInfo() {
        System.out.println("Nama  : " + nama);
        System.out.println("Warna : " + warna);
        System.out.println("Rasa  : " + rasa);
    }
}