package pertemuan_09.materi.contoh.multilevel_inheritance;

// Subclass tingkat ketiga
public class Kucing extends Hewan {

    // Atribut khusus kucing
    private String ras;

    // Constructor Kucing
    public Kucing(String nama, String jenisMakanan, String ras) {

        // Memanggil constructor superclass Hewan
        super(nama, jenisMakanan);

        this.ras = ras;
    }

    // Method khusus kucing
    public void mengeong() {
        System.out.println(nama + " mengeluarkan suara: Meow!");
    }

    public void tampilkanRas() {
        System.out.println("Ras            : " + ras);
    }
}
