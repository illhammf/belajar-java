package pertemuan_08.materi.contoh;

// Subclass (Kelas Anak)
// Kucing mewarisi class Hewan
public class Kucing extends Hewan {

    // Method khusus milik class Kucing
    public void bersuara() {
        System.out.println("Kucing mengeluarkan suara: Meow!");
    }

    public static void main(String[] args) {

        // Membuat objek dari class Kucing
        Kucing kucing = new Kucing();

        // Memanggil method milik superclass
        kucing.makan();
        kucing.tidur();

        // Memanggil method milik subclass
        kucing.bersuara();
    }
}