package pertemuan_09.materi.contoh.multilevel_inheritance;

// Main class untuk menjalankan program
public class DemoMultilevelInheritance {

    public static void main(String[] args) {

        // Membuat objek dari subclass Kucing
        Kucing kucing = new Kucing(
            "Milo",
            "Daging",
            "Persia"
        );

        System.out.println("=== INFORMASI KUCING ===");

        // Method yang diwarisi dari Organisme
        kucing.tampilkanNama();
        kucing.bernapas();

        System.out.println();

        // Method yang diwarisi dari Hewan
        kucing.tampilkanJenisMakanan();
        kucing.bergerak();

        System.out.println();

        // Method dan atribut khusus Kucing
        kucing.tampilkanRas();
        kucing.mengeong();
    }
}
