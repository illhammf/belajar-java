package pertemuan_08.kuis.soal1;

// Subclass (Kelas Turunan)
public class Developer extends Employee {

    private String bahasaPemrograman;

    // Constructor
    public Developer(String nama, double gaji, String bahasaPemrograman) {
        super(nama, "Developer", gaji);
        this.bahasaPemrograman = bahasaPemrograman;
    }

    // Method khusus Developer
    public void tampilkanKeahlian() {
        System.out.println("Bahasa Pemrograman: " + bahasaPemrograman);
    }
}