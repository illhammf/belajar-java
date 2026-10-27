package pertemuan_07.contoh;

public class ReferenceDemo {

    public static void main(String[] args) {

        // Variabel primitif menyimpan nilai secara langsung
        int angka1 = 10;

        // angka2 memperoleh salinan nilai angka1
        int angka2 = angka1;

        angka2 = 20;

        System.out.println("Angka 1: " + angka1);
        System.out.println("Angka 2: " + angka2);

        System.out.println();

        // Membuat object menggunakan keyword new
        Mahasiswa mhs1 = new Mahasiswa("Ilham");

        // mhs2 menyalin nilai referensi dari mhs1
        // Keduanya merujuk pada object yang sama
        Mahasiswa mhs2 = mhs1;

        // Mengubah nama melalui mhs2
        mhs2.nama = "Budi";

        // Perubahan terlihat melalui kedua referensi
        System.out.println("Nama melalui mhs1: " + mhs1.nama);
        System.out.println("Nama melalui mhs2: " + mhs2.nama);
    }
}

class Mahasiswa {

    String nama;

    Mahasiswa(String nama) {
        this.nama = nama;
    }
}

/*
Bagian pertama: variabel primitif
int angka1 = 10;
int angka2 = angka1;

angka2 = 20;

Ketika nilai angka1 disalin ke angka2, nilai primitifnya disalin. Perubahan angka2 menjadi 20 tidak mengubah angka1.

---

Bagian kedua: variabel referensi
Mahasiswa mhs1 = new Mahasiswa("Ilham");
Mahasiswa mhs2 = mhs1;

Pada bagian ini, mhs2 tidak membuat objek mahasiswa baru. Variabel tersebut menyalin referensi yang sama dengan mhs1.

Akibatnya, keduanya merujuk pada objek yang sama. Ketika nama objek diubah melalui mhs2, perubahan itu juga terlihat melalui mhs1.

Gambaran sederhananya:
mhs1 ──────┐
           ├────> Object Mahasiswa
mhs2 ──────┘       nama = "Budi"

Konsep ini berkaitan langsung dengan pembahasan variabel referensi dan objek di heap pada materi dosen.
*/