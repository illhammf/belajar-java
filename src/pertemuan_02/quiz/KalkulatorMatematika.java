package pertemuan_02.quiz;

public class KalkulatorMatematika {

    // Method untuk menghitung sisi miring segitiga
    static double hitungSisiMiring(double a, double b) {

        // Rumus: √(a² + b²)
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static void main(String[] args) {

        // Tipe data dan variabel
        double sisiA = 3;
        double sisiB = 4;

        // Memanggil method
        double sisiMiring = hitungSisiMiring(sisiA, sisiB);

        // Menampilkan hasil
        System.out.println("Sisi A       : " + sisiA);
        System.out.println("Sisi B       : " + sisiB);
        System.out.println("Sisi Miring  : " + sisiMiring);
    }
}
