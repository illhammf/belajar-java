package pertemuan_06.kuis_01;

public class Mahasiswa {

    // Atribut private agar tidak diakses langsung dari luar class
    private String nama;
    private String nim;
    private Double ipk;

    // Constructor untuk memberikan nilai awal ketika object dibuat
    public Mahasiswa(String nama, String nim, Double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    // Setter digunakan untuk mengubah nilai atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter untuk mengubah NIM
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Setter untuk mengubah IPK
    public void setIpk(Double ipk) {
        this.ipk = ipk;
    }

    // Getter untuk mengambil nilai nama
    public String getNama() {
        return nama;
    }

    // Getter untuk mengambil nilai NIM
    public String getNim() {
        return nim;
    }

    // Getter untuk mengambil nilai IPK
    public Double getIpk() {
        return ipk;
    }

    // Kenapa kita menggunakan getter dan setter?
    // Jawaban: Getter dan setter digunakan untuk mengontrol akses ke atribut private.
}
