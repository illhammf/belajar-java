package pertemuan_09.materi.contoh.hybrid_inheritance;

public class Komputer extends Perangkat {
    protected String prosesor;

    public Komputer(String merk, String prosesor) {
        super(merk);
        this.prosesor = prosesor;
    }

    public void menjalankanProgram() {
        System.out.println("Komputer menjalankan program.");
    }

    public void tampilkanSpesifikasi() {
        System.out.println("Merk     : " + merk);
        System.out.println("Prosesor : " + prosesor);
    }
}
