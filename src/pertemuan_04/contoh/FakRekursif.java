package pertemuan_04.contoh;

public class FakRekursif {

    public static void main(String[] args) {

        System.out.println("4! = " + faktorial(4));
        System.out.println("6! = " + faktorial(6));
    }

    public static int faktorial(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
}
