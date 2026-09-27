package pertemuan_03.quiz;

import java.util.Scanner;

public class BilanganTerbesar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();

        if (bilangan1 > bilangan2) {

            System.out.println(
                "Bilangan terbesar adalah " + bilangan1
            );

        } else if (bilangan2 > bilangan1) {

            System.out.println(
                "Bilangan terbesar adalah " + bilangan2
            );

        } else {

            System.out.println("Kedua bilangan sama besar.");

        }

        input.close();
    }
}