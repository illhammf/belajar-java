package pertemuan_07.KUIS.Soal1;

public class Buku {
    // Atribut untuk menyimpan informasi buku
    String judul;
    String penulis;
    int tahunTerbit;

    // Constructor untuk mengisi data buku
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("=== DATA BUKU ===");
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println();
    }

    public static void main(String[] args) {
        // Membuat dua objek buku dengan data berbeda
        Buku buku1 = new Buku("Pemrograman Java", "Andi", 2024);
        Buku buku2 = new Buku("Dasar Pemrograman", "Budi", 2023);

        // Menampilkan informasi masing-masing buku
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
    }
}

/*
Penjelasan konsep:

Konsep	            Implementasi
Class	            Buku
Attribute	        judul, penulis, tahunTerbit
Constructor	        public Buku(...)
Object	            buku1 dan buku2
Method	            tampilkanInfo()
Pemanggilan method	buku1.tampilkanInfo() dan buku2.tampilkanInfo()


Kenapa atributnya belum menggunakan private?

Pada soal pertama, PPT hanya meminta class, atribut, constructor, method, dan dua objek. 
Penggunaan private, getter, setter, serta validasi data menjadi persyaratan eksplisit pada soal kedua dan ketiga. 
Jadi, implementasi ini mengikuti instruksi soal pertama tanpa menambahkan kompleksitas yang tidak diperlukan.
*/