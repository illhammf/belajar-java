package project_ecocycle.pertemuan_05;

public class SetoranSampah {

    // Atribut private untuk melindungi data setoran
    private String jenisSampah;
    private double berat;
    private double hargaPerKg;

    // Constructor untuk membuat object setoran
    public SetoranSampah(
        String jenisSampah,
        double berat,
        double hargaPerKg
    ) {
        setJenisSampah(jenisSampah);
        setBerat(berat);
        setHargaPerKg(hargaPerKg);
    }

    // Setter untuk jenis sampah
    public void setJenisSampah(String jenisSampah) {
        if (jenisSampah == null || jenisSampah.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Jenis sampah tidak boleh kosong."
            );
        }

        this.jenisSampah = jenisSampah;
    }

    // Setter untuk berat sampah
    public void setBerat(double berat) {
        if (berat <= 0) {
            throw new IllegalArgumentException(
                "Berat sampah harus lebih dari 0 kg."
            );
        }

        this.berat = berat;
    }

    // Setter untuk harga per kilogram
    public void setHargaPerKg(double hargaPerKg) {
        if (hargaPerKg <= 0) {
            throw new IllegalArgumentException(
                "Harga per kilogram harus lebih dari 0."
            );
        }

        this.hargaPerKg = hargaPerKg;
    }

    // Getter untuk mengambil jenis sampah
    public String getJenisSampah() {
        return jenisSampah;
    }

    // Getter untuk mengambil berat sampah
    public double getBerat() {
        return berat;
    }

    // Getter untuk mengambil harga per kilogram
    public double getHargaPerKg() {
        return hargaPerKg;
    }

    // Method untuk menghitung nilai setoran
    public double hitungNilaiSetoran() {
        return berat * hargaPerKg;
    }
}

