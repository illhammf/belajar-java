# Pertemuan 01 — Introduction to Object Oriented Programming

## 📚 Deskripsi

Pertemuan pertama membahas pengenalan **Pemrograman Berorientasi Objek (PBO)** atau **Object Oriented Programming (OOP)**.

Pada pertemuan ini, kita akan memahami konsep dasar PBO, perbedaan pemrograman prosedural dengan pemrograman berorientasi objek, serta mengenal beberapa istilah dasar dalam OOP menggunakan bahasa Java.

### Tujuan Pembelajaran

Setelah mempelajari materi ini, diharapkan mahasiswa mampu:

- Memahami konsep Pemrograman Berorientasi Objek.
- Mendeskripsikan prinsip dasar Pemrograman Berorientasi Objek.
- Mendeskripsikan karakteristik dan fitur-fitur Pemrograman Berorientasi Objek.

---

# 1. Apa itu Pemrograman Berorientasi Objek?

**Pemrograman Berorientasi Objek (PBO)** atau **Object Oriented Programming (OOP)** merupakan paradigma pemrograman yang berorientasi pada objek.

Dalam PBO, data dan fungsi yang berkaitan dengan suatu objek dapat dibungkus dan dikelompokkan ke dalam sebuah **class**.

Contoh objek yang dapat kita temui dalam kehidupan sehari-hari:

- Mobil
- Mahasiswa
- Buku
- Hewan
- Rekening Bank

Setiap objek dapat memiliki:

- **Attribute** → data atau karakteristik yang dimiliki objek.
- **Method** → aksi atau perilaku yang dapat dilakukan objek.

Contoh:

```text
Objek: Mobil

Attribute:
- warna
- merk
- tahun

Method:
- maju()
- mundur()
- berhenti()
```

---

# 2. Pemrograman Prosedural

Pada pemrograman prosedural, program lebih berorientasi pada **fungsi atau prosedur**.

Setiap fungsi biasanya dibuat untuk menyelesaikan tugas tertentu.

Contoh sederhana:

```text
Program
├── Fungsi 1
├── Fungsi 2
├── Fungsi 3
└── Program Utama
```

Pendekatan ini berfokus pada bagaimana program menjalankan serangkaian proses atau fungsi.

---

# 3. Pemrograman Berorientasi Objek

Berbeda dengan pemrograman prosedural, PBO menyusun program berdasarkan **objek dan class**.

Program dapat terdiri dari beberapa class yang masing-masing digunakan untuk memodelkan objek tertentu.

Contoh:

```text
Program
├── Class Mahasiswa
├── Class Dosen
├── Class MataKuliah
└── Program Utama
```

Class yang saling berkaitan juga dapat ditempatkan dalam modul atau file yang berbeda sehingga kode menjadi lebih terorganisir.

---

# 4. Class dan Object

## Class

**Class** merupakan model atau blueprint yang digunakan untuk merepresentasikan suatu objek.

Sederhananya:

> Class adalah cetak biru untuk membuat objek.

Contoh:

```text
Class: Mobil
```

Class `Mobil` dapat memiliki attribute:

```text
merk
warna
tahun
```

dan method:

```text
maju()
mundur()
berhenti()
```

## Object

**Object** merupakan instance atau wujud nyata dari sebuah class.

Jika:

```text
Class = Mobil
```

maka objeknya dapat berupa:

```text
mobilSaya
mobilAyah
mobilTeman
```

Analogi sederhananya:

```text
Class
  ↓
Blueprint / Cetak Biru
  ↓
Object
  ↓
Hasil nyata dari blueprint
```

---

# 5. Prinsip Dasar PBO

Terdapat beberapa prinsip dasar yang penting dalam Pemrograman Berorientasi Objek.

## 5.1 Encapsulation

**Encapsulation** merupakan konsep menggabungkan data dan method yang berkaitan ke dalam sebuah class.

Tujuannya adalah menjaga data dan perilaku objek tetap berada dalam satu kesatuan.

Contoh:

```java
class Mahasiswa {
    String nama;

    void belajar() {
        System.out.println("Mahasiswa sedang belajar.");
    }
}
```

Pada contoh tersebut, `nama` merupakan data/attribute dan `belajar()` merupakan method yang berada dalam class `Mahasiswa`.

---

## 5.2 Abstraction

**Abstraction** merupakan konsep untuk menyederhanakan objek dengan hanya menampilkan bagian yang penting dan menyembunyikan detail yang tidak diperlukan.

Contoh sederhana:

Ketika menggunakan sebuah mobil, kita cukup mengetahui cara:

```text
menyalakan mobil
menjalankan mobil
menghentikan mobil
```

Kita tidak harus mengetahui seluruh proses internal yang terjadi di dalam mesin.

---

## 5.3 Polymorphism

**Polymorphism** berarti satu bentuk atau cara pemanggilan dapat memiliki perilaku yang berbeda tergantung objek atau class yang digunakan.

Konsep ini akan dipelajari lebih lanjut pada pertemuan berikutnya.

---

## 5.4 Inheritance

**Inheritance** atau pewarisan merupakan proses pembentukan class baru yang diturunkan dari class lain yang sudah ada.

Contoh sederhana:

```text
Hewan
  │
  ├── Kucing
  └── Anjing
```

Class `Kucing` dan `Anjing` dapat mewarisi karakteristik tertentu dari class `Hewan`.

---

# 6. Java dan PBO

**Java** merupakan bahasa pemrograman yang mendukung Pemrograman Berorientasi Objek.

Java dirancang agar program dapat dijalankan pada berbagai platform selama sistem tersebut memiliki **Java Virtual Machine (JVM)**.

Secara sederhana:

```text
Java Source Code
       ↓
   Compiler
       ↓
  Java Bytecode
       ↓
      JVM
       ↓
Operating System
```

Hal ini membuat Java dikenal sebagai bahasa pemrograman yang mendukung konsep **write once, run anywhere**.

---

# 7. Istilah Dasar OOP pada Java

Beberapa istilah yang akan sering digunakan ketika belajar Java dan PBO adalah:

| Istilah | Pengertian |
|---|---|
| Object | Entitas yang memiliki state, behavior, dan identity |
| Class | Blueprint atau cetak biru dari sebuah object |
| Attribute | Variabel yang terikat pada sebuah class |
| Method | Aksi atau perilaku yang dapat dilakukan object |
| Constructor | Bagian khusus yang digunakan untuk membuat dan menginisialisasi object |

Contoh sederhana:

```java
class Mahasiswa {

    // Attribute
    String nama;
    int umur;

    // Method
    void belajar() {
        System.out.println(nama + " sedang belajar.");
    }
}
```

Pada contoh tersebut:

```text
Mahasiswa  → Class
nama       → Attribute
umur       → Attribute
belajar()  → Method
```

---

# 8. Contoh Class dan Object

Berikut contoh sederhana penerapan class dan object dalam Java:

```java
class Mahasiswa {

    String nama;

    void belajar() {
        System.out.println(nama + " sedang belajar.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Membuat object
        Mahasiswa mahasiswa = new Mahasiswa();

        // Mengisi attribute
        mahasiswa.nama = "Ilham";

        // Memanggil method
        mahasiswa.belajar();
    }
}
```

### Output

```text
Ilham sedang belajar.
```

### Penjelasan

```java
class Mahasiswa
```

Digunakan untuk membuat sebuah class bernama `Mahasiswa`.

```java
String nama;
```

Merupakan attribute yang menyimpan nama mahasiswa.

```java
void belajar()
```

Merupakan method yang menggambarkan perilaku mahasiswa.

```java
Mahasiswa mahasiswa = new Mahasiswa();
```

Digunakan untuk membuat sebuah object dari class `Mahasiswa`.

```java
mahasiswa.nama = "Ilham";
```

Digunakan untuk memberikan nilai pada attribute `nama`.

```java
mahasiswa.belajar();
```

Digunakan untuk memanggil method `belajar()`.

---

# 9. Karakteristik PBO

Beberapa karakteristik Pemrograman Berorientasi Objek antara lain:

- Penekanan program berada pada data dibandingkan prosedur.
- Program dibagi menjadi beberapa objek.
- Struktur data dirancang berdasarkan objek.
- Fungsi yang beroperasi pada data suatu objek dapat ditempatkan bersama dalam struktur objek.
- Data dapat disembunyikan dari akses eksternal.
- Objek dapat berkomunikasi satu sama lain melalui method.

---

# 10. Fitur Pemrograman Berorientasi Objek

Beberapa fitur yang berkaitan dengan PBO antara lain:

### Natural

PBO mengikuti cara manusia memandang dunia sebagai kumpulan objek yang saling berinteraksi.

### Abstraction

Menyederhanakan suatu entitas dengan menampilkan bagian yang penting.

### Encapsulation

Menggabungkan data dan behavior ke dalam sebuah class.

### Information Hiding

Menyembunyikan detail yang tidak perlu diketahui oleh bagian lain dari program.

### Modular

Object dapat menjadi entitas yang relatif independen sehingga program dapat dibagi menjadi bagian-bagian yang lebih terorganisir.

---

# 11. Struktur Dasar Program Java

Sebelum masuk lebih jauh ke PBO, kita juga perlu memahami bentuk dasar program Java.

Contoh:

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, Java!");

    }
}
```

### Penjelasan

#### `public class Main`

Mendefinisikan sebuah class bernama `Main`.

#### `public static void main(String[] args)`

Merupakan method utama yang menjadi titik awal eksekusi program Java.

#### `System.out.println()`

Digunakan untuk menampilkan teks ke console.

Contoh:

```java
System.out.println("Hello, Java!");
```

Output:

```text
Hello, Java!
```

---

# 12. Menjalankan Program Java di Visual Studio Code

Pada repository ini, proses pembelajaran Java menggunakan **Visual Studio Code** sebagai code editor.

Panduan instalasi Java, JDK, Visual Studio Code, dan extension yang diperlukan dapat dilihat pada:

👉 [Panduan Instalasi Java & Visual Studio Code](../../instalasi/README.md)

Setelah environment selesai disiapkan, program Java dapat dijalankan melalui terminal:

```bash
javac Main.java
java Main
```

Atau menggunakan fitur **Run** yang tersedia pada Visual Studio Code.

---

# 13. Quiz

Pada akhir pertemuan terdapat tiga soal pemrograman sederhana.

## Soal 1 — Luas Segitiga

Buatlah program Java untuk menghitung **luas segitiga**.

Rumus:

```text
Luas = 1/2 × alas × tinggi
```

Program harus menerima nilai alas dan tinggi kemudian menampilkan hasil luas segitiga.

---

## Soal 2 — Luas Persegi Panjang

Buatlah program Java untuk menghitung **luas persegi panjang**.

Rumus:

```text
Luas = panjang × lebar
```

Program harus menerima nilai panjang dan lebar kemudian menampilkan hasil luas persegi panjang.

---

## Soal 3 — Keliling Lingkaran

Buatlah program Java untuk menghitung **keliling lingkaran**.

Rumus:

```text
Keliling = 2 × π × r
```

Program harus menerima nilai jari-jari kemudian menampilkan hasil keliling lingkaran.

---

### 📂 Jawaban Quiz

Implementasi ketiga soal dapat ditemukan pada folder:

```text
quiz/
├── LuasSegitiga.java
├── LuasPersegiPanjang.java
└── KelilingLingkaran.java
```

---

# 📌 Kesimpulan

Pada pertemuan pertama, kita telah mempelajari dasar-dasar Pemrograman Berorientasi Objek, mulai dari pengertian PBO, perbedaan pemrograman prosedural dan PBO, konsep **class** dan **object**, prinsip dasar PBO, hingga istilah-istilah dasar OOP dalam Java.

Konsep yang perlu dipahami sebelum melanjutkan ke materi berikutnya:

```text
PBO
│
├── Class
├── Object
├── Attribute
├── Method
├── Constructor
│
├── Encapsulation
├── Abstraction
├── Polymorphism
└── Inheritance
```

Pemahaman konsep-konsep dasar tersebut akan menjadi dasar untuk mempelajari materi PBO pada pertemuan berikutnya.