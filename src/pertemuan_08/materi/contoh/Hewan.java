package pertemuan_08.materi.contoh;

// Superclass (Kelas Induk)
public class Hewan {

    // Atribut superclass
    protected String nama;
    protected int umur;

    // Method superclass
    public void makan() {
        System.out.println(nama + " sedang makan.");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur.");
    }
}