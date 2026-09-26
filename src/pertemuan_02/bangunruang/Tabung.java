package pertemuan_02.bangunruang;

import java.util.Scanner;

public class Tabung {

    // Method menghitung volume tabung
    static double hitungVolume(double jariJari, double tinggi) {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    // Method menghitung luas permukaan tabung
    static double hitungLuasPermukaan(
            double jariJari,
            double tinggi) {

        return 2 * Math.PI * jariJari
                * (jariJari + tinggi);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = input.nextDouble();

        double volume = hitungVolume(jariJari, tinggi);
        double luasPermukaan = hitungLuasPermukaan(
                jariJari,
                tinggi
        );

        System.out.println("\n=== HASIL PERHITUNGAN TABUNG ===");
        System.out.println("Jari-jari        : " + jariJari);
        System.out.println("Tinggi           : " + tinggi);
        System.out.println("Volume           : " + volume);
        System.out.println("Luas Permukaan   : " + luasPermukaan);

        input.close();
    }
}
