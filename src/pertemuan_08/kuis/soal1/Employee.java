package pertemuan_08.kuis.soal1;

// Superclass (Kelas Induk)
public class Employee {

    protected String nama;
    protected String jabatan;
    protected double gaji;

    // Constructor
    public Employee(String nama, String jabatan, double gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    // Method untuk menampilkan informasi karyawan
    public void tampilkanInfo() {
        System.out.println("Nama     : " + nama);
        System.out.println("Jabatan  : " + jabatan);
        System.out.println("Gaji     : Rp" + gaji);
    }
}