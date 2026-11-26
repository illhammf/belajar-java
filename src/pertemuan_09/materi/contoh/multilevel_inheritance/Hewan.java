package pertemuan_09.materi.contoh.multilevel_inheritance;

// Subclass dari Organisme
// Sekaligus superclass bagi Kucing
public class Hewan extends Organisme {

    // Atribut khusus hewan
    protected String jenisMakanan;

    // Constructor Hewan
    public Hewan(String nama, String jenisMakanan) {

        // Memanggil constructor Organisme
        super(nama);

        this.jenisMakanan = jenisMakanan;
    }

    // Method khusus hewan
    public void bergerak() {
        System.out.println(nama + " sedang bergerak.");
    }

    public void tampilkanJenisMakanan() {
        System.out.println("Jenis Makanan  : " + jenisMakanan);
    }
}
