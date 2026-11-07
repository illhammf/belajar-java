package pertemuan_08.kuis.soal2;

// Subclass dari Fruits
public class Banana extends Fruits {

    private String ukuran;

    // Constructor
    public Banana(String warna, String rasa, String ukuran) {
        super("Pisang", warna, rasa);
        this.ukuran = ukuran;
    }

    // Method khusus Banana
    public void tampilkanUkuran() {
        System.out.println("Ukuran: " + ukuran);
    }
}