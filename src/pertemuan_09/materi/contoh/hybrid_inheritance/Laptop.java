package pertemuan_09.materi.contoh.hybrid_inheritance;

public class Laptop extends Komputer
        implements BisaDibawa, BisaDiisiDaya {

    private int kapasitasBaterai;

    public Laptop(String merk, String prosesor, int kapasitasBaterai) {
        super(merk, prosesor);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    @Override
    public void bawa() {
        System.out.println("Laptop dapat dibawa ke mana saja.");
    }

    @Override
    public void isiDaya() {
        System.out.println("Laptop sedang mengisi daya.");
    }

    public void tampilkanBaterai() {
        System.out.println("Kapasitas baterai: "
                + kapasitasBaterai + " mAh");
    }
}
