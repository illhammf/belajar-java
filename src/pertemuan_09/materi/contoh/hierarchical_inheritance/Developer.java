package pertemuan_09.materi.contoh.hierarchical_inheritance;

// Subclass kedua
public class Developer extends Pegawai {

    private String bahasaPemrograman;

    // Constructor Developer
    public Developer(
        String nama,
        double gajiPokok,
        String bahasaPemrograman
    ) {

        // Memanggil constructor superclass
        super(nama, gajiPokok);

        this.bahasaPemrograman = bahasaPemrograman;
    }

    // Method khusus Developer
    public void menulisKode() {
        System.out.println(
            nama + " sedang menulis kode menggunakan "
            + bahasaPemrograman + "."
        );
    }
}
