package pertemuan_04.contoh;

public class parametervalue {

    public static void manipulateValue(int x) {
        x = x + 1;
    }

    public static void main(String[] args) {
        int number = 5;

        manipulateValue(number); // untuk memanipulasi nilai parameter, jadi nilai asli tidak berubah

        System.out.println(number);
        // Output: 5 (nilai asli tidak berubah)
    }
}
