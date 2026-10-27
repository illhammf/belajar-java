package pertemuan_07.contoh;

public class ReferenceChangeDemo {

    public static void main(String[] args) {

        // Membuat object pertama
        Mahasiswa mhs1 = new Mahasiswa("Ilham");

        // mhs2 merujuk pada object yang sama dengan mhs1
        Mahasiswa mhs2 = mhs1;

        System.out.println("Sebelum referensi berubah:");
        System.out.println("mhs1: " + mhs1.nama);
        System.out.println("mhs2: " + mhs2.nama);

        // Membuat object kedua dan memberikan referensinya ke mhs2
        mhs2 = new Mahasiswa("Budi");

        System.out.println("\nSetelah referensi berubah:");
        System.out.println("mhs1: " + mhs1.nama);
        System.out.println("mhs2: " + mhs2.nama);
    }
}

class Mahasiswa {

    String nama;

    Mahasiswa(String nama) {
        this.nama = nama;
    }
}

/*
Awalnya, mhs1 dan mhs2 menunjuk pada objek yang sama.
mhs1 ──────┐
           ├────> Object A: Ilham
mhs2 ──────┘

Setelah perintah berikut dijalankan:

mhs2 = new Mahasiswa("Budi");

Java membuat objek baru, lalu mhs2 menyimpan referensi ke objek baru tersebut.
mhs1 ───────────> Object A: Ilham

mhs2 ───────────> Object B: Budi

Objek pertama masih dapat diakses melalui mhs1. Oleh karena itu, nama yang dibaca melalui mhs1 tetap Ilham.

Jika tidak ada lagi referensi yang dapat menjangkau suatu objek, objek tersebut berpotensi menjadi kandidat garbage collection. 
Namun, waktu penghapusannya tidak bisa dipastikan hanya dari perubahan referensi.
*/
