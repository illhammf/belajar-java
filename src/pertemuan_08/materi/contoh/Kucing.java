package pertemuan_08.materi.contoh;

// Subclass (Kelas Anak)
public class Kucing extends Hewan {

    // Method khusus subclass
    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara: Meow!");
    }

    public static void main(String[] args) {

        // Membuat objek Kucing
        Kucing kucing = new Kucing();

        // Mengisi atribut warisan dari superclass
        kucing.nama = "Milo";
        kucing.umur = 2;

        // Menampilkan atribut
        System.out.println("Nama: " + kucing.nama);
        System.out.println("Umur: " + kucing.umur + " tahun");

        // Memanggil method superclass
        kucing.makan();
        kucing.tidur();

        // Memanggil method subclass
        kucing.bersuara();
    }
}