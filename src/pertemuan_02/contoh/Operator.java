package pertemuan_02.contoh;

public class Operator {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Arithmetic Operator
        System.out.println("Penjumlahan : " + (a + b));
        System.out.println("Pengurangan : " + (a - b));
        System.out.println("Perkalian   : " + (a * b));
        System.out.println("Pembagian   : " + (a / b));
        System.out.println("Modulus     : " + (a % b));

        // Comparison Operator
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical Operator
        boolean kondisiA = true;
        boolean kondisiB = false;

        System.out.println("AND : " + (kondisiA && kondisiB));
        System.out.println("OR  : " + (kondisiA || kondisiB));
        System.out.println("NOT : " + (!kondisiA));
        System.out.println("XOR : " + (kondisiA ^ kondisiB));
    }
}