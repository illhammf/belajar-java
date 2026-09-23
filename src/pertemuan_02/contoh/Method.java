package pertemuan_02.contoh;

public class Method {

    // Method tanpa parameter
    static void salam() {
        System.out.println("Halo, selamat belajar Java!");
    }

    // Method dengan parameter
    static void tampilkanNama(String nama) {
        System.out.println("Nama saya " + nama);
    }

    // Method dengan return value
    static int tambah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        salam();

        tampilkanNama("Ilham");

        int hasil = tambah(10, 5);

        System.out.println("Hasil penjumlahan : " + hasil);
    }
}