import java.util.Scanner;

public class Kubus {

    // Method menghitung volume kubus
    static double hitungVolume(double sisi) {
        return Math.pow(sisi, 3);
    }

    // Method menghitung luas permukaan kubus
    static double hitungLuasPermukaan(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        // Memanggil method
        double volume = hitungVolume(sisi);
        double luasPermukaan = hitungLuasPermukaan(sisi);

        // Output
        System.out.println("\n=== HASIL PERHITUNGAN KUBUS ===");
        System.out.println("Sisi             : " + sisi);
        System.out.println("Volume           : " + volume);
        System.out.println("Luas Permukaan   : " + luasPermukaan);

        input.close();
    }
}