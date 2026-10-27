package pertemuan_07.contoh;

public class CallingSequence {

    public static void main(String[] args) { // main() adalah method pertama yang dijalankan ketika program dimulai

        System.out.println("1. Program dimulai");

        // main() memanggil method pertama
        methodPertama();

        System.out.println("4. Program selesai");
    }

    static void methodPertama() { // Method pertama dipanggil dari main()

        System.out.println("2. Method pertama dijalankan");

        // Method pertama memanggil method kedua
        methodKedua();

        // Baris ini berjalan setelah methodKedua selesai
        System.out.println("3. Method pertama selesai");
    }

    static void methodKedua() { // Method kedua dipanggil dari method pertama

        System.out.println("Method kedua dijalankan");
    }
}

/*
Perhatikan urutannya:
1. Java menjalankan main().
2. main() memanggil methodPertama().
3. methodPertama() memanggil methodKedua().
4. methodKedua() selesai, lalu eksekusi kembali ke methodPertama().
5. Setelah methodPertama() selesai, eksekusi kembali ke main().

Hubungannya dengan Memory Management: setiap pemanggilan method membutuhkan informasi selama method tersebut berjalan. 
Call frame untuk pemanggilan method baru ditambahkan ke call stack, kemudian dilepas ketika method selesai.

Gambaran sederhananya:
main()
  |
  └── methodPertama()
          |
          └── methodKedua()

Ketika methodKedua() selesai, program kembali ke methodPertama(). 
Inilah salah satu cara memahami mekanisme Last In, First Out (LIFO) pada call stack.
*/
