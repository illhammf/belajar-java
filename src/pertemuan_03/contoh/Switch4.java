package pertemuan_03.contoh;

import java.util.Scanner;

public class Switch4 {

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
                break;

            case 2:
                System.out.println("Pilihan kedua");
                break;

            case 3:
                System.out.println("Pilihan ketiga");
                break;

            case 4:
                System.out.println("Pilihan keempat");
                break;

            case 5:
                System.out.println("Pilihan default");
                break;

            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }

        ctk.close();
    }
}
