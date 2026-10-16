package pertemuan_06.kuis_02;


public class RekeningBank {

    // Data rekening dilindungi menggunakan private
    private String nomorRekening;
    private Double saldo;

    // Constructor untuk mengisi nomor rekening dan saldo awal
    public RekeningBank(String nomorRekening, Double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    // Setter untuk memperbarui nomor rekening
    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    // Setter saldo dengan validasi agar saldo tidak negatif
    public void setSaldo(Double saldo) {
        if (saldo < 0) {
            System.out.println("Tidak boleh bernilai negatif!");
        } else {
            this.saldo = saldo;
        }
    }

    // Getter untuk mengambil nomor rekening
    public String getNomorRekening() {
        return this.nomorRekening;
    }

    // Getter saldo juga memeriksa nilai yang tersimpan
    public Double getSaldo() {
        if (saldo < 0) {
            System.out.println(
                "Saldo tidak boleh negatif, jadi saldo kamu: "
            );
            return 0.0;
        }

        return saldo;
    }
}

