packege pertemuan_04.contoh;

import java.util.Scanner;

public class Mainparameter2 {

    // fungsi dengan 2 parameter
    public static void mahasiswa(String nama, int umur) {
        System.out.println(nama + " berumur " + umur + "th");
    }

    public static void main(String[] args) {
        String nm;
        int umr;

        Scanner ctk = new Scanner(System.in);

        System.out.print("Nama : ");
        nm = ctk.nextLine();

        System.out.print("Umur : ");
        umr = ctk.nextInt();

        System.out.println("output : ");
        mahasiswa(nm, umr);

        ctk.close();
    }
}