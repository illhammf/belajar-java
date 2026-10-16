package pertemuan_06.kuis_01;

public class Main {

    public static void main(String[] args) {

        // Membuat object Mahasiswa melalui constructor
        Mahasiswa mhs = new Mahasiswa(
            "Ilham Firmansyah",
            "20240801102",
            3.90
        );

        // Menampilkan data menggunakan getter
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIM: " + mhs.getNim());
        System.out.println("IPK: " + mhs.getIpk());
    }
}

