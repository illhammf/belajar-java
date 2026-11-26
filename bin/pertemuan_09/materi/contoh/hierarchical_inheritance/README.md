# Hierarchical Inheritance

## 1. Pengertian

Hierarchical Inheritance merupakan jenis pewarisan dalam Pemrograman Berorientasi Objek (OOP) ketika beberapa subclass mewarisi atribut dan method dari satu superclass yang sama.

Dengan konsep ini, satu class induk dapat memiliki banyak class anak. Setiap subclass dapat menggunakan fitur umum dari superclass sekaligus memiliki atribut dan method khusus sesuai kebutuhannya.

## 2. Tujuan Pembelajaran

Setelah mempelajari contoh program ini, diharapkan dapat:

- Memahami konsep Hierarchical Inheritance dalam Java.
- Mengetahui hubungan satu superclass dengan beberapa subclass.
- Memahami penggunaan keyword `extends`.
- Memahami pemanggilan constructor superclass menggunakan `super()`.
- Mengetahui perbedaan atribut dan method umum dengan fitur khusus subclass.
- Memahami manfaat penggunaan inheritance untuk mengurangi duplikasi kode.

## 3. Studi Kasus

Contoh implementasi menggunakan studi kasus sistem pegawai perusahaan.

Terdapat empat class utama:

**Pegawai (Superclass)**

Merupakan kelas induk yang menyediakan informasi umum seluruh pegawai, yaitu:

- `nama`
- `gajiPokok`
- `tampilkanInfo()`
- `bekerja()`

**Manager (Subclass)**

Merupakan class turunan dari Pegawai yang memiliki:

- `jumlahTim`
- `mengelolaTim()`

**Developer (Subclass)**

Merupakan class turunan dari Pegawai yang memiliki:

- `bahasaPemrograman`
- `menulisKode()`

**Designer (Subclass)**

Merupakan class turunan dari Pegawai yang memiliki:

- `aplikasiDesain`
- `membuatDesain()`

Ketiga subclass tersebut mewarisi informasi umum dari Pegawai, tetapi masing-masing memiliki kemampuan khusus yang berbeda.

## 4. Struktur Pewarisan

```text
              Pegawai
                 |
       +---------+---------+
       |         |         |
    Manager  Developer  Designer
```

Ketiga subclass memiliki superclass yang sama, tetapi tidak saling mewarisi satu sama lain.

## 5. Struktur File

```text
hierarchical_inheritance/
├── Pegawai.java
├── Manager.java
├── Developer.java
├── Designer.java
├── DemoHierarchicalInheritance.java
└── README.md
```

| File | Fungsi |
|---|---|
| `Pegawai.java` | Superclass yang menyediakan atribut dan method umum pegawai. |
| `Manager.java` | Subclass yang memiliki fitur khusus untuk mengelola tim. |
| `Developer.java` | Subclass yang memiliki fitur khusus untuk aktivitas pemrograman. |
| `Designer.java` | Subclass yang memiliki fitur khusus untuk aktivitas desain. |
| `DemoHierarchicalInheritance.java` | Main class untuk menjalankan dan menguji ketiga subclass. |

## 6. Konsep dan Sintaks yang Digunakan

### A. Extends

Keyword `extends` digunakan untuk menghubungkan subclass dengan superclass.

```java
public class Manager extends Pegawai {
}

public class Developer extends Pegawai {
}

public class Designer extends Pegawai {
}
```

Ketiga class tersebut mewarisi atribut dan method dari class `Pegawai`.

### B. Super

Keyword `super` digunakan untuk memanggil constructor atau mengakses anggota superclass.

Contoh:

```java
super(nama, gajiPokok);
```

Pemanggilan tersebut menjalankan constructor `Pegawai` untuk menginisialisasi atribut umum.

### C. Protected

Access modifier `protected` memungkinkan atribut dan method digunakan oleh subclass.

Contoh:

```java
protected String nama;
protected double gajiPokok;
```

Dengan demikian, setiap subclass dapat menggunakan atribut tersebut melalui pewarisan.

### D. Constructor Subclass

Setiap subclass memiliki constructor sendiri untuk menginisialisasi atribut khusus.

Contohnya pada `Manager`:

```java
public Manager(String nama, double gajiPokok, int jumlahTim) {
    super(nama, gajiPokok);
    this.jumlahTim = jumlahTim;
}
```

Atribut umum diteruskan ke superclass, sedangkan atribut khusus diinisialisasi oleh subclass.

### E. Method Pewarisan dan Method Khusus

Method `tampilkanInfo()` dan `bekerja()` berasal dari superclass sehingga dapat digunakan oleh semua subclass.

Sementara itu, method `mengelolaTim()`, `menulisKode()`, dan `membuatDesain()` merupakan method khusus yang dimiliki masing-masing subclass.

## 7. Alur Program

1. Program membuat objek Manager, Developer, dan Designer.
2. Masing-masing constructor subclass memanggil constructor superclass menggunakan `super()`.
3. Atribut umum pegawai diinisialisasi pada superclass.
4. Atribut khusus masing-masing subclass diinisialisasi.
5. Setiap objek memanggil method umum yang diwariskan dari superclass.
6. Setiap objek memanggil method khusus sesuai jenis pegawainya.
7. Program menampilkan informasi seluruh pegawai.

## 8. Output Program

```text
=== DATA MANAGER ===
Nama       : Andi
Gaji Pokok : Rp8000000.0
Andi sedang bekerja.
Andi sedang mengelola 5 anggota tim.

=== DATA DEVELOPER ===
Nama       : Budi
Gaji Pokok : Rp6000000.0
Budi sedang bekerja.
Budi sedang menulis kode menggunakan Java.

=== DATA DESIGNER ===
Nama       : Citra
Gaji Pokok : Rp5500000.0
Citra sedang bekerja.
Citra sedang membuat desain menggunakan Figma.
```

## 9. Kesimpulan

Hierarchical Inheritance memungkinkan beberapa subclass mewarisi atribut dan method dari satu superclass yang sama.

Melalui contoh `Pegawai`, `Manager`, `Developer`, dan `Designer`, dapat dipahami bahwa beberapa class dapat menggunakan fitur umum yang sama tanpa harus menuliskan ulang kode pada masing-masing class.

Setiap subclass juga dapat memiliki atribut dan method khusus sesuai karakteristiknya.

Konsep ini sangat berguna ketika sebuah program memiliki beberapa jenis objek yang mempunyai karakteristik umum, tetapi tetap memiliki fungsi yang berbeda.