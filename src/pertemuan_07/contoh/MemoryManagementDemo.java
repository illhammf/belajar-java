public class MemoryManagementDemo {

    public static void main(String[] args) {

        // =========================================
        // A. TYPICAL CALLING SEQUENCE
        // =========================================

        System.out.println("=== A Typical Calling Sequence ===");

        // Method addNumbers dipanggil dari main().
        // Selama method dijalankan, Java membuat call frame
        // untuk menyimpan informasi yang diperlukan method.
        int result = addNumbers(5, 10);

        // Setelah addNumbers selesai, hasilnya dikembalikan
        // ke main() dan disimpan dalam variabel result.
        System.out.println("Result: " + result);


        // =========================================
        // B. CALL FRAMES - SIMPLE VARIABLES
        // =========================================

        System.out.println("\n=== Call Frames - Simple Variables ===");

        // Memanggil method yang menggunakan variabel primitif.
        simpleVariables();


        // =========================================
        // C. CALL FRAMES - REFERENCE VARIABLES
        // =========================================

        System.out.println("\n=== Call Frames - Reference Variables ===");

        // Memanggil method yang menggunakan array dan object.
        referenceVariables();
    }


    // =============================================
    // A. METHOD UNTUK TYPICAL CALLING SEQUENCE
    // =============================================

    static int addNumbers(int a, int b) {

        // Parameter a dan b menerima nilai dari pemanggil.
        // Variabel sum merupakan variabel lokal method ini.
        int sum = a + b;

        // Mengembalikan hasil penjumlahan ke method pemanggil.
        return sum;
    }


    // =============================================
    // B. SIMPLE VARIABLES
    // =============================================

    static void simpleVariables() {

        // Variabel bertipe int menyimpan nilai bilangan bulat.
        int x = 10;
        int y = 20;

        // Variabel z menyimpan hasil penjumlahan x dan y.
        int z = x + y;

        // Menampilkan nilai setiap variabel.
        System.out.println(
            "x = " + x + ", y = " + y + ", z = " + z
        );
    }


    // =============================================
    // C. REFERENCE VARIABLES
    // =============================================

    static void referenceVariables() {

        // Membuat array dengan kapasitas tiga elemen.
        // numbers merupakan variabel referensi ke array.
        int[] numbers = new int[3];

        // Mengisi elemen array dengan nilai.
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // Mengakses elemen array menggunakan enhanced for.
        for (int n : numbers) {
            System.out.println("Number: " + n);
        }

        // Membuat object Person menggunakan keyword new.
        // Variabel person menyimpan referensi ke object tersebut.
        Person person = new Person("Dina", 22);

        // Menampilkan object person.
        // Java memanggil method toString() milik Person.
        System.out.println(person);
    }
}