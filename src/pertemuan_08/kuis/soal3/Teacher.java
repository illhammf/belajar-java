package pertemuan_08.kuis.soal3;

// Subclass dari Person
public class Teacher extends Person {

    private String nip;
    private String mataPelajaran;

    // Constructor
    public Teacher(
        String nama,
        int umur,
        String alamat,
        String nip,
        String mataPelajaran
    ) {
        super(nama, umur, alamat);
        this.nip = nip;
        this.mataPelajaran = mataPelajaran;
    }

    // Method khusus Teacher
    public void tampilkanPekerjaan() {
        System.out.println("NIP             : " + nip);
        System.out.println("Mata Pelajaran  : " + mataPelajaran);
    }
}