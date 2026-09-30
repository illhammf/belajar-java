package pertemuan_03.contoh;

public class IfSatu2 {

    public static void main(String[] args) {

        // Deklarasi variabel karakter
        char ch = 'o';

        // Memeriksa huruf vokal
        if (
            ch == 'a' || ch == 'A' ||
            ch == 'i' || ch == 'I' ||
            ch == 'u' || ch == 'U' ||
            ch == 'e' || ch == 'E' ||
            ch == 'o' || ch == 'O'
        ) {
            System.out.println(ch + " adalah huruf vokal.");
        }
    }
}
