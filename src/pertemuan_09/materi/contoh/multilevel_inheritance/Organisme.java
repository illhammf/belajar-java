package pertemuan_09.materi.contoh.multilevel_inheritance;

// Superclass tingkat pertama
public class Organisme {

    // Atribut umum organisme
    protected String nama;

    // Constructor superclass
    public Organisme(String nama) {
        this.nama = nama;
    }

    // Method umum organisme
    public void bernapas() {
        System.out.println(nama + " sedang bernapas.");
    }

    public void tampilkanNama() {
        System.out.println("Nama Organisme : " + nama);
    }
}
