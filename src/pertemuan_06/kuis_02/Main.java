package pertemuan_06.kuis_02;


public class Main {

    public static void main(String[] args) {

        // Membuat rekening dengan saldo awal positif
        RekeningBank rekening = new RekeningBank(
            "0895336900466",
            1500000.0
        );

        // Menampilkan data melalui getter
        System.out.println(
            "Nomor Rekening: " + rekening.getNomorRekening()
        );

        System.out.println(
            "Saldo: " + rekening.getSaldo()
        );

        // Menguji validasi dengan saldo negatif, ini akan memicu pesan error dari setter
        rekening.setSaldo(-500000.0);

        // Saldo tidak berubah karena setter menolak nilai negatif
        System.out.println(
            "Saldo setelah validasi: " + rekening.getSaldo()
        );
    }
}

