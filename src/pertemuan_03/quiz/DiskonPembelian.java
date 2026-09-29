package pertemuan_03.quiz;

import java.util.Scanner;

public class DiskonPembelian {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total pembelian: Rp ");
        double totalPembelian = input.nextDouble();

        double diskon;

        if (totalPembelian >= 500000) {

            diskon = 0.20;

        } else if (totalPembelian >= 250000) {

            diskon = 0.10;

        } else {

            diskon = 0.0;

        }

        double jumlahDiskon = totalPembelian * diskon;
        double totalBayar = totalPembelian - jumlahDiskon;

        System.out.println("\n=== DETAIL PEMBELIAN ===");
        System.out.println(
            "Total Pembelian : Rp " + totalPembelian
        );
        System.out.println(
            "Diskon          : " + (diskon * 100) + "%"
        );
        System.out.println(
            "Jumlah Diskon   : Rp " + jumlahDiskon
        );
        System.out.println(
            "Total Bayar     : Rp " + totalBayar
        );

        input.close();
    }
}
