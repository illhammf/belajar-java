package pertemuan_05.contoh;

public class Main {

    public static void main(String[] args) {

        // Menghitung luas segitiga
        LuasSegitiga st1 = new LuasSegitiga();
        st1.setAlas(2);
        st1.setTinggi(3);

        double luasSegitiga = st1.getLuas();

        // Menghitung luas persegi panjang
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.setPanjang(4);
        pp1.setLebar(2);

        double luasPersegiPanjang = pp1.getLuas();

        // Menghitung setengah luas lingkaran
        LuasLingkaran ling = new LuasLingkaran();
        ling.setJejari(2);

        double luasLingkaran = 0.5 * ling.getLuas();

        // Menghitung hasil akhir
        double luasArsir =
            luasSegitiga + luasPersegiPanjang - luasLingkaran;

        System.out.println(
            "Luas daerah diarsir: " + luasArsir + " cm2"
        );
    }
}
