# Single Inheritance

## 1. Pengertian

Single Inheritance merupakan salah satu jenis pewarisan dalam Pemrograman Berorientasi Objek (OOP) yang memungkinkan sebuah subclass (kelas anak) mewarisi atribut dan method dari satu superclass (kelas induk).

Dengan inheritance, subclass dapat menggunakan kembali atribut dan method yang telah didefinisikan pada superclass tanpa harus menuliskan ulang seluruh kode tersebut.

Selain menggunakan fitur yang diwariskan, subclass juga dapat memiliki atribut dan method tambahan sesuai kebutuhan.

## 2. Tujuan Pembelajaran

Setelah mempelajari contoh program ini, diharapkan dapat:

- Memahami konsep Single Inheritance dalam Java.
- Mengetahui perbedaan superclass dan subclass.
- Memahami penggunaan keyword `extends`.
- Memahami penggunaan `super()` untuk memanggil constructor superclass.
- Memahami penggunaan access modifier `protected`.
- Mengetahui bagaimana subclass menggunakan atribut dan method superclass.
- Memahami manfaat inheritance dalam mengurangi duplikasi kode.

## 3. Studi Kasus

Contoh implementasi menggunakan studi kasus kendaraan.

Terdapat dua class utama:

**Kendaraan (Superclass)**

Berfungsi sebagai kelas induk yang menyimpan informasi umum kendaraan, yaitu:

- `merk`
- `tahunProduksi`
- `nyalakan()`
- `tampilkanInfo()`

**Mobil (Subclass)**

Merupakan kelas turunan dari `Kendaraan` yang memiliki:

- `jumlahPintu`
- `bukaBagasi()`
- `tampilkanJumlahPintu()`

Class `Mobil` mewarisi atribut dan method dari `Kendaraan`, kemudian menambahkan fitur khusus yang hanya dimiliki oleh mobil.

## 4. Struktur Class

```text
Kendaraan (Superclass)
        |
        | extends
        |
       Mobil (Subclass)
```

Hubungan tersebut menunjukkan bahwa `Mobil` merupakan turunan dari `Kendaraan`.

## 5. Struktur File

```text
single_inheritance/
├── Kendaraan.java
├── Mobil.java
├── DemoSingleInheritance.java
└── README.md
```

| File | Fungsi |
|---|---|
| `Kendaraan.java` | Superclass yang menyediakan atribut dan method umum kendaraan. |
| `Mobil.java` | Subclass yang mewarisi class Kendaraan dan menambahkan fitur khusus. |
| `DemoSingleInheritance.java` | Main class untuk menjalankan dan menguji implementasi Single Inheritance. |

## 6. Konsep dan Sintaks yang Digunakan

### A. Extends

Keyword `extends` digunakan untuk menghubungkan subclass dengan superclass.

```java
public class Mobil extends Kendaraan {
}
```

Dengan menggunakan `extends`, class `Mobil` dapat mewarisi fitur dari class `Kendaraan`.

### B. Super

Keyword `super` digunakan untuk mengakses anggota superclass.

Contoh pemanggilan constructor:

```java
super(merk, tahunProduksi);
```

Pemanggilan tersebut menjalankan constructor superclass untuk menginisialisasi atribut yang diwariskan.

### C. Protected

Access modifier `protected` memungkinkan atribut atau method diakses oleh subclass, termasuk dalam package berbeda melalui pewarisan.

```java
protected String merk;
protected int tahunProduksi;
```

### D. Constructor

Constructor digunakan untuk menginisialisasi objek ketika dibuat.

Pada contoh ini, constructor subclass memanggil constructor superclass menggunakan `super()`.

### E. Code Reusability

Inheritance memungkinkan subclass menggunakan kembali kode dari superclass sehingga mengurangi penulisan kode yang berulang.

## 7. Alur Program

1. Program membuat objek `Mobil`.
2. Constructor `Mobil` dijalankan.
3. Constructor superclass dipanggil menggunakan `super()`.
4. Atribut superclass dan subclass diinisialisasi.
5. Objek memanggil method yang diwariskan dari `Kendaraan`.
6. Objek memanggil method khusus yang dimiliki `Mobil`.
7. Program menampilkan seluruh informasi kendaraan.

## 8. Output Program

```text
=== INFORMASI KENDARAAN ===
Merk           : Toyota Avanza
Tahun Produksi : 2024
Toyota Avanza sedang dinyalakan.

Jumlah Pintu   : 4
Bagasi mobil Toyota Avanza berhasil dibuka.
```

## 9. Kesimpulan

Single Inheritance memungkinkan sebuah class mewarisi atribut dan method dari satu superclass.

Melalui contoh `Kendaraan` dan `Mobil`, dapat dipahami bahwa subclass tidak perlu mendefinisikan ulang seluruh fitur yang telah tersedia pada superclass. Subclass cukup menggunakan fitur yang diwariskan dan menambahkan kemampuan baru sesuai kebutuhannya.

Konsep ini menjadi dasar untuk memahami jenis inheritance lainnya, seperti Multilevel Inheritance dan Hierarchical Inheritance.