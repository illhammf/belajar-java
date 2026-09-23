package pertemuan_02.contoh;

public class MathMethod {

    public static void main(String[] args) {

        double angka = -10;
        double desimal = 5.7;

        System.out.println("Nilai absolut : " + Math.abs(angka));
        System.out.println("Pembulatan atas : " + Math.ceil(desimal));
        System.out.println("Pembulatan terdekat : " + Math.round(desimal));
        System.out.println("Akar 25 : " + Math.sqrt(25));
        System.out.println("2 pangkat 3 : " + Math.pow(2, 3));
    }
}