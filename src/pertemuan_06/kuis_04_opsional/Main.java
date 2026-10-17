package pertemuan_06.kuis_04_opsional;


public class Main {

    public static void main(String[] args) {

        // Membuat object Elektronik dengan garansi 3 tahun
        Elektronik laptop = new Elektronik(
            "Laptop HP",
            7500000,
            10,
            "3 Tahun"
        );

        // Menambah 5 unit: stok menjadi 15
        laptop.tambahStok(5);

        // Mengurangi 3 unit: stok menjadi 12
        laptop.kurangiStok(3);

        // Menampilkan seluruh data produk elektronik
        laptop.tampilkanInfoElektronik();
    }

    /*
    Konsep penting pada tugas tambahan:
    - extends Produk berarti Elektronik mewarisi anggota class Produk yang dapat diaksesnya.
    - super(...) memanggil constructor class induk.
    - Atribut private pada Produk tidak bisa diakses langsung oleh Elektronik; karena itu kita menggunakan getter dan setter.
    - garansi merupakan atribut tambahan yang hanya dimiliki class Elektronik.

    Tugas ini menjadi pengantar untuk materi inheritance. 
    Walaupun kita membahas kelas turunan di sini, fokus utama Pertemuan 6 tetap pada pengelolaan akses data dan penerapan encapsulation.
    */
}
