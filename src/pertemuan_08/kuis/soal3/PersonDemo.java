package pertemuan_08.kuis.soal3;

// Class utama untuk menjalankan program
public class PersonDemo {

    public static void main(String[] args) {

        // Membuat objek Student
        Student student = new Student(
            "Ilham",
            21,
            "Tangerang",
            "2026001",
            "Informatika"
        );

        // Membuat objek Teacher
        Teacher teacher = new Teacher(
            "Bu Dewi",
            35,
            "Jakarta",
            "1987001",
            "Pemrograman Java"
        );

        // Menampilkan informasi Student
        System.out.println("=== DATA STUDENT ===");
        student.tampilkanInfo();
        student.tampilkanAkademik();

        System.out.println();

        // Menampilkan informasi Teacher
        System.out.println("=== DATA TEACHER ===");
        teacher.tampilkanInfo();
        teacher.tampilkanPekerjaan();
    }
}