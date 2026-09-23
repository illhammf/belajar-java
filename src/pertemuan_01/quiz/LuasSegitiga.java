package pertemuan_01.quiz;

import java.util.Scanner; // Import class Scanner untuk input dari user

public class LuasSegitiga {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input alas
        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();

        // Input tinggi
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        // Menghitung luas
        double luas = 0.5 * alas * tinggi;

        // Menampilkan hasil
        System.out.println("Luas segitiga = " + luas);

        input.close();
    }
}