package pertemuan_07.KUIS.Soal1;

import java.util.Scanner;

public class Buku2 {
    // Atribut buku
    private String judul;
    private String penulis;
    private int tahunTerbit;

    // Constructor
    public Buku2 (String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("\n=== DATA BUKU ===");
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan data buku pertama
        System.out.println("=== INPUT BUKU PERTAMA ===");
        System.out.print("Judul buku   : ");
        String judul1 = input.nextLine();

        System.out.print("Penulis      : ");
        String penulis1 = input.nextLine();

        System.out.print("Tahun terbit : ");
        int tahun1 = Integer.parseInt(input.nextLine());

        // Membuat objek buku pertama
        Buku2 buku1 = new Buku2(judul1, penulis1, tahun1);

        // Memasukkan data buku kedua
        System.out.println("\n=== INPUT BUKU KEDUA ===");
        System.out.print("Judul buku   : ");
        String judul2 = input.nextLine();

        System.out.print("Penulis      : ");
        String penulis2 = input.nextLine();

        System.out.print("Tahun terbit : ");
        int tahun2 = Integer.parseInt(input.nextLine());

        // Membuat objek buku kedua
        Buku2 buku2 = new Buku2(judul2, penulis2, tahun2);

        // Menampilkan informasi kedua buku
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();

        input.close();
    }
}