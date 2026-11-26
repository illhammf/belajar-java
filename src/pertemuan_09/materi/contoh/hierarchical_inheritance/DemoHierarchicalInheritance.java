package pertemuan_09.materi.contoh.hierarchical_inheritance;

// Main class untuk menjalankan program
public class DemoHierarchicalInheritance {

    public static void main(String[] args) {

        // Membuat objek Manager
        Manager manager = new Manager(
            "Andi",
            8000000,
            5
        );

        // Membuat objek Developer
        Developer developer = new Developer(
            "Budi",
            6000000,
            "Java"
        );

        // Membuat objek Designer
        Designer designer = new Designer(
            "Citra",
            5500000,
            "Figma"
        );

        System.out.println("=== DATA MANAGER ===");
        manager.tampilkanInfo();
        manager.bekerja();
        manager.mengelolaTim();

        System.out.println();

        System.out.println("=== DATA DEVELOPER ===");
        developer.tampilkanInfo();
        developer.bekerja();
        developer.menulisKode();

        System.out.println();

        System.out.println("=== DATA DESIGNER ===");
        designer.tampilkanInfo();
        designer.bekerja();
        designer.membuatDesain();
    }
}
