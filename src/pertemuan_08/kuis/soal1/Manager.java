package pertemuan_08.kuis.soal1;

// Subclass (Kelas Turunan)
public class Manager extends Employee {

    private int jumlahTim;

    // Constructor
    public Manager(String nama, double gaji, int jumlahTim) {
        super(nama, "Manager", gaji);
        this.jumlahTim = jumlahTim;
    }

    // Method khusus Manager
    public void tampilkanTim() {
        System.out.println("Jumlah Tim: " + jumlahTim + " orang");
    }
}