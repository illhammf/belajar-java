package pertemuan_04.contoh;

import java.util.Scanner;

public class Lpersegipanjang {

    public static double hitungarea(int pLong, int pWidth) {
        int area = pLong * pWidth;

        return Math.round(area * 100) / 100.0;
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("## Program Java Luas Persegi Panjang ##");
        System.out.println("==============================");
        System.out.println();

        int pLong, pWidth;

        System.out.print("Input panjang persegi: ");
        pLong = input.nextInt();

        System.out.print("Input lebar persegi: ");
        pWidth = input.nextInt();

        System.out.println(
            "Luas persegi panjang: " +
            hitungarea(pLong, pWidth)
        );

        input.close();
    }
}