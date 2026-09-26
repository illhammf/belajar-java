package pertemuan_02.bangunruang;

import java.util.Scanner;

public class Kerucut {

    // Method menghitung garis pelukis
    static double hitungGarisPelukis(
            double jariJari,
            double tinggi) {

        return Math.sqrt(
                Math.pow(jariJari, 2)
                + Math.pow(tinggi, 2)
        );
    }

    // Method menghitung volume kerucut
    static double hitungVolume(
            double jariJari,
            double tinggi) {

        return (1.0 / 3.0)
                * Math.PI
                * Math.pow(jariJari, 2)
                * tinggi;
    }

    // Method menghitung luas permukaan kerucut
    static double hitungLuasPermukaan(
            double jariJari,
            double tinggi) {

        double garisPelukis = hitungGarisPelukis(
                jariJari,
                tinggi
        );

        return Math.PI
                * jariJari
                * (jariJari + garisPelukis);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari kerucut: ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi kerucut: ");
        double tinggi = input.nextDouble();

        double garisPelukis = hitungGarisPelukis(
                jariJari,
                tinggi
        );

        double volume = hitungVolume(
                jariJari,
                tinggi
        );

        double luasPermukaan = hitungLuasPermukaan(
                jariJari,
                tinggi
        );

        System.out.println("\n=== HASIL PERHITUNGAN KERUCUT ===");
        System.out.println("Jari-jari        : " + jariJari);
        System.out.println("Tinggi           : " + tinggi);
        System.out.println("Garis Pelukis    : " + garisPelukis);
        System.out.println("Volume           : " + volume);
        System.out.println("Luas Permukaan   : " + luasPermukaan);

        input.close();
    }
}
