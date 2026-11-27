package pertemuan_09.materi.contoh.hybrid_inheritance;

public class Perangkat {
    protected String merk;

    public Perangkat(String merk) {
        this.merk = merk;
    }

    public void nyalakan() {
        System.out.println(merk + " sedang dinyalakan.");
    }

    public void tampilkanMerk() {
        System.out.println("Merk perangkat: " + merk);
    }
}
