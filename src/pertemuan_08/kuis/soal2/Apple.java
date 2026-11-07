package pertemuan_08.kuis.soal2;

// Subclass dari Fruits
public class Apple extends Fruits {

    private String jenis;

    // Constructor
    public Apple(String warna, String rasa, String jenis) {
        super("Apel", warna, rasa);
        this.jenis = jenis;
    }

    // Method khusus Apple
    public void tampilkanJenis() {
        System.out.println("Jenis : " + jenis);
    }
}