package pertemuan_09.materi.contoh.single_inheritance;

// Main class untuk menjalankan program
public class DemoSingleInheritance {

    public static void main(String[] args) {

        // Membuat objek dari subclass Mobil
        Mobil mobil = new Mobil("Toyota Avanza", 2024, 4);

        System.out.println("=== INFORMASI KENDARAAN ===");

        // Memanggil method warisan dari superclass
        mobil.tampilkanInfo();
        mobil.nyalakan();

        System.out.println();

        // Memanggil atribut dan method khusus subclass
        mobil.tampilkanJumlahPintu();
        mobil.bukaBagasi();
    }
}
