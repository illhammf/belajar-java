package pertemuan_09.materi.contoh.multiple_inheritance;

// Class yang mengimplementasikan dua interface
public class Smartphone implements Kamera, PemutarMusik {

    private String merk;
    private String model;

    // Constructor
    public Smartphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    // Implementasi method dari interface Kamera
    @Override
    public void ambilFoto() {
        System.out.println(
            merk + " " + model + " sedang mengambil foto."
        );
    }

    // Implementasi method dari interface PemutarMusik
    @Override
    public void putarMusik() {
        System.out.println(
            merk + " " + model + " sedang memutar musik."
        );
    }

    // Method khusus Smartphone
    public void tampilkanInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Model : " + model);
    }
}
