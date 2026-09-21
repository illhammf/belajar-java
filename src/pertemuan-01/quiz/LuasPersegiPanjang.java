import java.util.Scanner; // Import class Scanner untuk input dari user

public class LuasPersegiPanjang {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input panjang
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();

        // Input lebar
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();

        // Menghitung luas
        double luas = panjang * lebar;

        // Menampilkan hasil
        System.out.println("Luas persegi panjang = " + luas);

        input.close(); // Menutup scanner untuk mencegah memory leak
    }
}