package pertemuan_08.kuis.soal3;

// Subclass dari Person
public class Student extends Person {

    private String nim;
    private String jurusan;

    // Constructor
    public Student(
        String nama,
        int umur,
        String alamat,
        String nim,
        String jurusan
    ) {
        super(nama, umur, alamat);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Method khusus Student
    public void tampilkanAkademik() {
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }
}