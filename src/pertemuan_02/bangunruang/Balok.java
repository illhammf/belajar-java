package pertemuan_02.bangunruang;

import java.util.Scanner;

public class Balok {

    // Method menghitung volume balok
    static double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    // Method menghitung luas permukaan balok
    static double hitungLuasPermukaan(
            double panjang,
            double lebar,
            double tinggi) {

        return 2 * (
                (panjang * lebar)
                + (panjang * tinggi)
                + (lebar * tinggi)
        );
    }

    // Method menghitung diagonal ruang
    static double hitungDiagonal(
            double panjang,
            double lebar,
            double tinggi) {

        return Math.sqrt(
                Math.pow(panjang, 2)
                + Math.pow(lebar, 2)
                + Math.pow(tinggi, 2)
        );
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();

        double volume = hitungVolume(panjang, lebar, tinggi);
        double luasPermukaan = hitungLuasPermukaan(
                panjang,
                lebar,
                tinggi
        );
        double diagonal = hitungDiagonal(
                panjang,
                lebar,
                tinggi
        );

        System.out.println("\n=== HASIL PERHITUNGAN BALOK ===");
        System.out.println("Panjang          : " + panjang);
        System.out.println("Lebar            : " + lebar);
        System.out.println("Tinggi           : " + tinggi);
        System.out.println("Volume           : " + volume);
        System.out.println("Luas Permukaan   : " + luasPermukaan);
        System.out.println("Diagonal Ruang   : " + diagonal);

        input.close();
    }
}