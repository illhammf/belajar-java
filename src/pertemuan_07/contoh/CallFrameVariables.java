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
