package pertemuan_03.contoh;

import java.util.Scanner;

public class IfTiga1 {

    public static void main(String[] args) {

        Scanner ctk = new Scanner(System.in);

        // Deklarasi variabel
        int bilangan;

        // Memasukkan nilai bilangan
        System.out.print("Masukkan bilangan: ");
        bilangan = ctk.nextInt();

        // Tiga kondisi if
        if (bilangan < 0) {
            System.out.println(
                bilangan + " merupakan bilangan NEGATIF."
            );
        } else if (bilangan == 0) {
            System.out.println(
                "Nilai yang dimasukkan adalah NOL"
            );
        } else {
            System.out.println(
                bilangan + " merupakan bilangan POSITIF."
            );
        }

        ctk.close();
    }
}
