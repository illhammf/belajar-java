package pertemuan_09.materi.contoh.hierarchical_inheritance;

// Subclass ketiga
public class Designer extends Pegawai {

    private String aplikasiDesain;

    // Constructor Designer
    public Designer(
        String nama,
        double gajiPokok,
        String aplikasiDesain
    ) {

        // Memanggil constructor superclass
        super(nama, gajiPokok);

        this.aplikasiDesain = aplikasiDesain;
    }

    // Method khusus Designer
    public void membuatDesain() {
        System.out.println(
            nama + " sedang membuat desain menggunakan "
            + aplikasiDesain + "."
        );
    }
}
