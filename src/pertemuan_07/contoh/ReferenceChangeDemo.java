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
