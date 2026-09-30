package pertemuan_03.contoh;

public class IfDua2 {

    public static void main(String[] args) {

        // Deklarasi variabel berisi nilai B
        char ch = 'B';

        // Memeriksa apakah karakter merupakan huruf vokal
        if (
            ch == 'a' || ch == 'A' ||
            ch == 'i' || ch == 'I' ||
            ch == 'u' || ch == 'U' ||
            ch == 'e' || ch == 'E' ||
            ch == 'o' || ch == 'O'
        ) {
            System.out.println(ch + " adalah huruf vokal");
        } else {
            System.out.println(ch + " adalah huruf mati (konsonan).");
        }
    }
}
