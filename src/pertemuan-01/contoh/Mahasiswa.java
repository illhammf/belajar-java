public class Mahasiswa { // Membuat class Mahasiswa

    // Attribute
    String nama;
    int umur;

    // Method
    void belajar() {
        System.out.println(nama + " sedang belajar Java.");
    }

    public static void main(String[] args) {

        // Membuat object dari class Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();

        // Mengisi attribute
        mahasiswa.nama = "Ilham";
        mahasiswa.umur = 20;

        // Menampilkan data
        System.out.println("Nama : " + mahasiswa.nama);
        System.out.println("Umur : " + mahasiswa.umur);

        // Memanggil method
        mahasiswa.belajar();
    }
}