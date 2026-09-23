package pertemuan_01.quiz;

import java.util.Scanner;

public class KelilingLingkaran {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input jari-jari
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        // Menghitung keliling
        double keliling = 2 * Math.PI * jariJari;

        // Menampilkan hasil
        System.out.println("Keliling lingkaran = " + keliling);

        input.close();
    }
}