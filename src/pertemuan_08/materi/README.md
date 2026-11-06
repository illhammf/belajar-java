# Materi Pertemuan 8 — Inheritance (Basic)

## Deskripsi

Folder ini berisi materi pembelajaran Object Oriented Programming (OOP) menggunakan bahasa Java dengan topik **Inheritance (Pewarisan)**.

Inheritance merupakan salah satu konsep utama dalam OOP yang memungkinkan sebuah class mewarisi atribut (field) dan method dari class lain. Dengan konsep ini, programmer dapat menggunakan kembali kode yang sudah dibuat tanpa harus menuliskan ulang seluruh atribut dan method.

Materi ini berfokus pada dasar-dasar Inheritance, pengenalan superclass dan subclass, serta implementasi pewarisan sederhana menggunakan Java.

## Tujuan Pembelajaran

Setelah mempelajari materi ini, diharapkan mahasiswa mampu:

1. Memahami pengertian dan konsep dasar Inheritance.
2. Mengetahui perbedaan Superclass dan Subclass.
3. Memahami penggunaan keyword `extends` dalam Java.
4. Memahami manfaat penggunaan Inheritance dalam pemrograman berorientasi objek.
5. Membuat dan mengimplementasikan Inheritance sederhana menggunakan Java.

## Daftar Materi

### 1. Pengertian Inheritance

Inheritance atau pewarisan adalah mekanisme dalam Java yang memungkinkan sebuah class memperoleh atribut dan method dari class lain.

Class yang memberikan pewarisan disebut **Superclass (kelas induk)**, sedangkan class yang menerima pewarisan disebut **Subclass (kelas anak)**.

Subclass dapat menggunakan kembali fitur yang dimiliki superclass serta menambahkan atribut dan method baru sesuai kebutuhannya.

### 2. Superclass (Kelas Induk)

Superclass merupakan class yang menjadi sumber pewarisan bagi class lain.

Superclass biasanya berisi atribut dan method umum yang dapat digunakan oleh beberapa subclass.

Contoh:

```java
public class Hewan {

    protected String nama;
    protected int umur;

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur.");
    }
}
```

Pada contoh tersebut, `Hewan` merupakan superclass yang memiliki atribut `nama` dan `umur`, serta method `makan()` dan `tidur()`.

### 3. Subclass (Kelas Anak)

Subclass merupakan class yang mewarisi atribut dan method dari superclass.

Dalam Java, pewarisan class dilakukan menggunakan keyword `extends`.

Contoh:

```java
public class Kucing extends Hewan {

    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara: Meow!");
    }
}
```

Pada contoh tersebut, `Kucing` merupakan subclass dari `Hewan`.

Karena menggunakan keyword `extends`, class `Kucing` dapat menggunakan atribut `nama` dan `umur`, serta method `makan()` dan `tidur()` yang diwariskan dari class `Hewan`.

Class `Kucing` juga memiliki method tambahan yaitu `bersuara()`.

### 4. Keyword extends

Keyword `extends` digunakan untuk menunjukkan bahwa sebuah class merupakan turunan dari class lain.

Bentuk umum:

```java
class NamaSubclass extends NamaSuperclass {
    // Atribut dan method tambahan
}
```

Contoh:

```java
public class Kucing extends Hewan {
    // Class Kucing mewarisi class Hewan
}
```

Dengan menggunakan `extends`, subclass dapat menggunakan fitur yang diwariskan dari superclass sesuai aturan akses yang berlaku.

### 5. Mengapa Inheritance Dibutuhkan?

Berdasarkan materi perkuliahan, Inheritance memiliki beberapa kegunaan:

**a. Code Reusability (Penggunaan Ulang Kode)**

Atribut dan method yang sudah ditulis dalam superclass dapat digunakan kembali oleh subclass. Hal ini membantu mengurangi penulisan kode yang berulang.

**b. Method Overriding**

Inheritance memungkinkan subclass menggantikan implementasi method yang berasal dari superclass dengan implementasi yang sesuai kebutuhan subclass.

Konsep ini dikenal sebagai method overriding dan menjadi salah satu cara Java mendukung Runtime Polymorphism.

**c. Abstraction**

Inheritance juga berkaitan dengan abstraksi, yaitu konsep yang memungkinkan detail implementasi disembunyikan sehingga pengguna cukup mengetahui fungsionalitas yang tersedia.

## Struktur Folder

```text
materi/
├── README.md
└── contoh/
    ├── Hewan.java
    └── Kucing.java
```

## Penjelasan Contoh Program

Contoh program yang terdapat dalam folder `contoh` menggunakan kasus pewarisan antara class `Hewan` dan `Kucing`.

| File | Keterangan |
|---|---|
| `Hewan.java` | Superclass yang memiliki atribut `nama`, `umur`, serta method `makan()` dan `tidur()`. |
| `Kucing.java` | Subclass yang mewarisi class `Hewan` dan memiliki method tambahan `bersuara()`. |

Melalui program tersebut, kita dapat melihat bahwa objek `Kucing` dapat menggunakan atribut dan method dari class `Hewan` tanpa perlu mendefinisikannya kembali.

## Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terpasang dan dapat digunakan melalui terminal.

Masuk ke folder `contoh`, kemudian jalankan perintah berikut:

**1. Compile program**

```bash
javac Hewan.java Kucing.java
```

**2. Jalankan program**

```bash
java Kucing
```

**3. Output program**

```text
Nama: Milo
Umur: 2 tahun
Milo sedang makan.
Milo sedang tidur.
Milo mengeluarkan suara: Meow!
```

## Kesimpulan

Inheritance merupakan konsep OOP yang memungkinkan sebuah class mewarisi atribut dan method dari class lain.

Dengan adanya superclass dan subclass, program dapat disusun menjadi lebih terstruktur serta mendukung penggunaan ulang kode.

Penggunaan keyword `extends` menjadi dasar implementasi Inheritance dalam Java.

Materi ini menjadi dasar untuk memahami Inheritance lebih lanjut, termasuk berbagai tipe pewarisan dan implementasinya dalam studi kasus pada pertemuan berikutnya.

---

**Mata Kuliah:** Object Oriented Programming (PBO)  
**Pertemuan:** 8  
**Topik:** Inheritance (Basic)  
**Bahasa Pemrograman:** Java