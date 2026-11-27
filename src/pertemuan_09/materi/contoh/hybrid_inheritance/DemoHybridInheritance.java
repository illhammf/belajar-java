package pertemuan_09.materi.contoh.hybrid_inheritance;

public class DemoHybridInheritance {
    public static void main(String[] args) {

        Laptop laptop = new Laptop(
                "ASUS",
                "Intel Core i7",
                6000
        );

        System.out.println("=== INFORMASI LAPTOP ===");

        laptop.tampilkanMerk();
        laptop.tampilkanSpesifikasi();
        laptop.tampilkanBaterai();

        System.out.println("\n=== KEMAMPUAN LAPTOP ===");

        laptop.nyalakan();
        laptop.menjalankanProgram();
        laptop.bawa();
        laptop.isiDaya();
    }
}
