package pertemuan_07.contoh;

public class CallFrameVariables {

    public static void main(String[] args) {

        // Variabel lokal milik method main()
        int angka = 10;

        System.out.println("Nilai di main: " + angka);

        // Memanggil method hitung()
        hitung();

        // Nilai angka di main tetap 10
        System.out.println("Nilai di main setelah hitung(): " + angka);
    }

    static void hitung() {

        // Variabel angka di sini berbeda dari angka di main()
        int angka = 50;

        System.out.println("Nilai di hitung: " + angka);
    }
}

/*
Meskipun kedua method memiliki variabel bernama angka, keduanya merupakan variabel lokal yang berbeda.
- angka di main() memiliki nilai 10.
- angka di hitung() memiliki nilai 50.
- Setelah hitung() selesai, variabel lokal milik pemanggilan hitung() tidak dapat diakses lagi.
- Variabel angka milik main() tetap memiliki nilai 10.
Hal ini membantu kita memahami bahwa setiap pemanggilan method memiliki konteks eksekusinya sendiri.

Catatan: variabel lokal primitif seperti int biasanya dijelaskan sebagai bagian dari call frame dalam model pembelajaran ini. 
Detail implementasi internal JVM bisa lebih kompleks, tetapi model tersebut cukup untuk memahami materi dasar.
*/
