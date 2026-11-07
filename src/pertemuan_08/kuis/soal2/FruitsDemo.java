package pertemuan_08.kuis.soal2;

// Class utama untuk menjalankan program
public class FruitsDemo {

    public static void main(String[] args) {

        // Membuat objek Apple
        Apple apel = new Apple(
            "Merah", "Manis", "Fuji"
        );

        // Membuat objek Banana
        Banana pisang = new Banana(
            "Kuning", "Manis", "Sedang"
        );

        // Menampilkan informasi Apple
        System.out.println("=== INFORMASI APEL ===");
        apel.tampilkanInfo();
        apel.tampilkanJenis();

        System.out.println();

        // Menampilkan informasi Banana
        System.out.println("=== INFORMASI PISANG ===");
        pisang.tampilkanInfo();
        pisang.tampilkanUkuran();
    }
}