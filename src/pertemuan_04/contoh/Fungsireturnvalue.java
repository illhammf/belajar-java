package pertemuan_04.contoh;

// contoh fungsi yang mengembalikan nilai
public class Fungsireturnvalue {

    // fungsi luas segi empat
    public static int area(int pLong, int pWidth) {
        return pLong * pWidth;
    }

    // memanggil fungsi
    public static void main(String[] args) {
        int luas = area(4, 5);

        System.out.println("Output Luas: " + luas);
    }
}