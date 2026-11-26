package pertemuan_09.materi.contoh.hierarchical_inheritance;

// Subclass pertama
public class Manager extends Pegawai {

    private int jumlahTim;

    // Constructor Manager
    public Manager(String nama, double gajiPokok, int jumlahTim) {

        // Memanggil constructor superclass
        super(nama, gajiPokok);

        this.jumlahTim = jumlahTim;
    }

    // Method khusus Manager
    public void mengelolaTim() {
        System.out.println(
            nama + " sedang mengelola " + jumlahTim + " anggota tim."
        );
    }
}
