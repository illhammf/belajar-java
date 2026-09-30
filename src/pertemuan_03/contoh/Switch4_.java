package pertemuan_03.contoh;

import java.util.Scanner;

public class Switch4_ {

    public static void main(String[] args) {

        Scanner ctk = new Scanner(System.in);

        // Deklarasi tipe data dan variabel
        int a;

        // Memasukkan nilai variabel
        System.out.print("Masukkan pilihan: ");
        a = ctk.nextInt();

        switch (a) {
            case 1:
                System.out.println("Pilihan pertama");

            case 2:
                System.out.println("Pilihan kedua");

            case 3:
                System.out.println("Pilihan ketiga");

            case 4:
                System.out.println("Pilihan keempat");

            case 5:
                System.out.println("Pilihan default");
        }

        ctk.close();
    }
}
