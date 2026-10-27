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
