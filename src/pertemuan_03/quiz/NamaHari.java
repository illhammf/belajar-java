package pertemuan_03.quiz;

import java.util.Scanner;

public class NamaHari {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENENTUKAN HARI ===");
        System.out.println("0 = Minggu");
        System.out.println("1 = Senin");
        System.out.println("2 = Selasa");
        System.out.println("3 = Rabu");
        System.out.println("4 = Kamis");
        System.out.println("5 = Jumat");
        System.out.println("6 = Sabtu");

        System.out.print("Masukkan kode hari: ");
        int kodeHari = input.nextInt();

        switch (kodeHari) {

            case 0:
                System.out.println("Hari: Minggu");
                break;

            case 1:
                System.out.println("Hari: Senin");
                break;

            case 2:
                System.out.println("Hari: Selasa");
                break;

            case 3:
                System.out.println("Hari: Rabu");
                break;

            case 4:
                System.out.println("Hari: Kamis");
                break;

            case 5:
                System.out.println("Hari: Jumat");
                break;

            case 6:
                System.out.println("Hari: Sabtu");
                break;

            default:
                System.out.println("Kode hari tidak valid.");

        }

        input.close();
    }
}
