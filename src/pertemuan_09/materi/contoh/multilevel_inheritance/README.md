# Multilevel Inheritance

## 1. Pengertian

Multilevel Inheritance merupakan jenis pewarisan dalam Pemrograman Berorientasi Objek (OOP) ketika sebuah subclass menjadi superclass bagi class lainnya.

Pewarisan terjadi secara bertingkat atau berantai. Dengan demikian, class yang berada pada tingkatan terakhir dapat menggunakan atribut dan method dari superclass langsung maupun superclass pada tingkatan sebelumnya, selama hak aksesnya memungkinkan.

## 2. Tujuan Pembelajaran

Setelah mempelajari contoh program ini, diharapkan dapat:

- Memahami konsep Multilevel Inheritance dalam Java.
- Mengetahui hubungan pewarisan bertingkat antarclass.
- Memahami peran class yang menjadi subclass sekaligus superclass.
- Memahami penggunaan keyword `extends` dalam pewarisan berantai.
- Memahami pemanggilan constructor bertingkat menggunakan `super()`.
- Mengetahui urutan eksekusi constructor dalam Multilevel Inheritance.
- Memahami pewarisan atribut dan method dari beberapa tingkatan class.

## 3. Studi Kasus

Contoh implementasi menggunakan studi kasus makhluk hidup dengan tiga tingkatan class.

**Organisme (Superclass Tingkat Pertama)**

Merupakan kelas induk paling atas yang memiliki:

- `nama`
- `bernapas()`
- `tampilkanNama()`

**Hewan (Superclass Tingkat Kedua)**

Merupakan subclass dari `Organisme` sekaligus superclass bagi `Kucing`.

Memiliki:

- `jenisMakanan`
- `bergerak()`
- `tampilkanJenisMakanan()`

**Kucing (Subclass Tingkat Ketiga)**

Merupakan subclass dari `Hewan` yang memiliki:

- `ras`
- `mengeong()`
- `tampilkanRas()`

Dengan struktur tersebut, `Kucing` dapat menggunakan fitur yang diwariskan dari `Hewan` dan `Organisme`.

## 4. Struktur Pewarisan

```text
Organisme
    |
    | extends
    |
   Hewan
    |
    | extends
    |
   Kucing
```

Class `Hewan` memiliki dua peran, yaitu sebagai subclass dari `Organisme` dan superclass dari `Kucing`.

## 5. Struktur File

```text
multilevel_inheritance/
├── Organisme.java
├── Hewan.java
├── Kucing.java
├── DemoMultilevelInheritance.java
└── README.md
```

| File | Fungsi |
|---|---|
| `Organisme.java` | Superclass tingkat pertama yang menyediakan atribut dan method umum organisme. |
| `Hewan.java` | Class turunan Organisme sekaligus superclass bagi Kucing. |
| `Kucing.java` | Subclass yang mewarisi fitur dari Hewan dan Organisme serta memiliki fitur khusus. |
| `DemoMultilevelInheritance.java` | Main class untuk menjalankan dan menguji implementasi Multilevel Inheritance. |

## 6. Konsep dan Sintaks yang Digunakan

### A. Extends

Keyword `extends` digunakan untuk membentuk hubungan pewarisan antarclass.

```java
public class Hewan extends Organisme {
}

public class Kucing extends Hewan {
}
```

Pewarisan tersebut membentuk hubungan bertingkat sehingga Kucing dapat menggunakan fitur yang diwariskan melalui Hewan.

### B. Super

Keyword `super` digunakan untuk mengakses anggota superclass langsung.

Contoh pemanggilan constructor:

```java
super(nama, jenisMakanan);
```

Pemanggilan tersebut menjalankan constructor class `Hewan`.

### C. Constructor Chaining

Constructor chaining merupakan proses pemanggilan constructor secara berantai dari subclass menuju superclass.

Pada contoh ini, urutannya adalah:

1. Constructor `Organisme`.
2. Constructor `Hewan`.
3. Constructor `Kucing`.

Proses ini memastikan atribut pada setiap tingkatan class diinisialisasi dengan benar.

### D. Protected

Access modifier `protected` memungkinkan atribut atau method digunakan oleh subclass.

Contohnya:

```java
protected String nama;
```

Dengan demikian, class `Kucing` dapat menggunakan atribut `nama` yang dideklarasikan pada class `Organisme` melalui hubungan pewarisan.

### E. This dan Super

`this` digunakan untuk mengakses anggota objek atau class saat ini, sedangkan `super` digunakan untuk mengakses anggota superclass langsung.

Contoh:

```java
this.ras = ras;
super(nama, jenisMakanan);
```

## 7. Alur Program

1. Program membuat objek dari class `Kucing`.
2. Constructor `Kucing` memanggil constructor `Hewan`.
3. Constructor `Hewan` memanggil constructor `Organisme`.
4. Atribut `nama` diinisialisasi pada `Organisme`.
5. Atribut `jenisMakanan` diinisialisasi pada `Hewan`.
6. Atribut `ras` diinisialisasi pada `Kucing`.
7. Objek memanggil method yang diwariskan dari `Organisme`.
8. Objek memanggil method yang diwariskan dari `Hewan`.
9. Objek memanggil method khusus milik `Kucing`.

## 8. Output Program

```text
=== INFORMASI KUCING ===
Nama Organisme : Milo
Milo sedang bernapas.

Jenis Makanan  : Daging
Milo sedang bergerak.

Ras            : Persia
Milo mengeluarkan suara: Meow!
```

## 9. Kesimpulan

Multilevel Inheritance memungkinkan pewarisan atribut dan method berlangsung secara bertingkat melalui beberapa class.

Melalui contoh `Organisme`, `Hewan`, dan `Kucing`, dapat dipahami bahwa sebuah subclass tidak hanya dapat menggunakan fitur dari superclass langsung, tetapi juga fitur yang diwariskan dari tingkatan superclass sebelumnya.

Konsep ini membantu membangun hubungan antarclass secara terstruktur dan memungkinkan penggunaan kembali kode dalam program Java.