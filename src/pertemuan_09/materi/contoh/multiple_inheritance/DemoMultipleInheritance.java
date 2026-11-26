package pertemuan_09.materi.contoh.multiple_inheritance;

// Main class
public class DemoMultipleInheritance {

    public static void main(String[] args) {

        // Membuat objek Smartphone
        Smartphone smartphone = new Smartphone(
            "Samsung",
            "Galaxy S24"
        );

        System.out.println("=== INFORMASI SMARTPHONE ===");

        // Memanggil method khusus Smartphone
        smartphone.tampilkanInfo();

        System.out.println();

        // Memanggil method dari interface Kamera
        smartphone.ambilFoto();

        // Memanggil method dari interface PemutarMusik
        smartphone.putarMusik();
    }
}
