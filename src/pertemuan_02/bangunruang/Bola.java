package pertemuan_02.bangunruang;

import java.util.Scanner;

public class Bola {

    // Method menghitung volume bola
    static double hitungVolume(double jariJari) {
        return (4.0 / 3.0)
                * Math.PI
                * Math.pow(jariJari, 3);
    }

    // Method menghitung luas permukaan bola
    static double hitungLuasPermukaan(double jariJari) {
        return 4
                * Math.PI
                * Math.pow(jariJari, 2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = input.nextDouble();

        double volume = hitungVolume(jariJari);
        double luasPermukaan = hitungLuasPermukaan(jariJari);

        System.out.println("\n=== HASIL PERHITUNGAN BOLA ===");
        System.out.println("Jari-jari        : " + jariJari);
        System.out.println("Volume           : " + volume);
        System.out.println("Luas Permukaan   : " + luasPermukaan);

        input.close();
    }
}
