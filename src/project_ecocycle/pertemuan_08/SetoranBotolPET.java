package project_ecocycle.pertemuan_08;

// Subclass dari SetoranPlastik.
public class SetoranBotolPET extends SetoranPlastik { 
    // Constructor untuk menginisialisasi objek SetoranBotolPET
    private String kodeResin;

    public SetoranBotolPET(
            String namaNasabah,
            double berat,
            double hargaPerKg,
            String kodeResin) {

        super(namaNasabah, berat, hargaPerKg, "Botol PET");
        setKodeResin(kodeResin);
    }

    public String getKodeResin() {
        return kodeResin;
    }

    public void setKodeResin(String kodeResin) {
        if (kodeResin != null && !kodeResin.isBlank()) {
            this.kodeResin = kodeResin;
        }
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("=== SETORAN BOTOL PET ===");
        super.tampilkanInformasi();
        System.out.println("Kode Resin: " + kodeResin);
    }

    @Override
    public void prosesDaurUlang() {
        System.out.println(
                "Botol PET dipilah, dibersihkan, dan diproses menjadi serpihan plastik untuk didaur ulang."
        );
    }
}