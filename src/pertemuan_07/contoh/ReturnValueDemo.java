package pertemuan_07.contoh;

public class ReturnValueDemo {

    public static void main(String[] args) {

        System.out.println("Program dimulai");

        // Memanggil method dan menerima nilai kembaliannya
        int hasil = kuadrat(5);

        System.out.println("Hasil kuadrat: " + hasil);

        System.out.println("Program selesai");
    }

    static int kuadrat(int angka) {

        System.out.println("Method kuadrat dijalankan");

        // Menghitung kuadrat dan mengembalikan hasilnya
        return angka * angka;
    }
}

/*
Pada kode ini:

int hasil = kuadrat(5);

Program memanggil method kuadrat() dengan nilai 5. Method tersebut menghitung 5 * 5, lalu mengembalikan hasil 25 melalui return.

Setelah method selesai, eksekusi kembali ke main() dan nilai yang dikembalikan disimpan dalam variabel hasil.

Ini berkaitan dengan isi call frame yang mencakup informasi mengenai nilai kembalian method.
*/
