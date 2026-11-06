package pertemuan_08.kuis.soal1;

// Class utama untuk menjalankan program
public class EmployeeDemo {

    public static void main(String[] args) {

        // Membuat objek Manager
        Manager manager = new Manager(
            "Andi", 10000000, 5
        );

        // Membuat objek Developer
        Developer developer = new Developer(
            "Budi", 8000000, "Java"
        );

        // Menampilkan informasi Manager
        System.out.println("=== DATA MANAGER ===");
        manager.tampilkanInfo();
        manager.tampilkanTim();

        System.out.println();

        // Menampilkan informasi Developer
        System.out.println("=== DATA DEVELOPER ===");
        developer.tampilkanInfo();
        developer.tampilkanKeahlian();
    }
}