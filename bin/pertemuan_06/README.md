# Pertemuan 6 — Encapsulation Lanjutan

## 📖 Deskripsi

Pertemuan 6 membahas lanjutan konsep **Encapsulation** dalam pemrograman berorientasi objek (*Object-Oriented Programming* atau OOP) menggunakan bahasa Java.

Encapsulation merupakan konsep yang digunakan untuk melindungi data di dalam class dengan mengatur bagaimana data tersebut dapat diakses dan diubah. Pada materi sebelumnya, kita telah mempelajari penggunaan atribut `private`, getter, setter, dan constructor.

Pada pertemuan ini, konsep tersebut diperdalam melalui beberapa studi kasus praktikum, seperti pengelolaan data mahasiswa, rekening bank, dan produk. Setiap studi kasus menunjukkan bagaimana data disimpan di dalam class, diakses melalui method, serta dijaga agar tetap sesuai dengan aturan program.

Selain itu, terdapat tugas tambahan yang memperkenalkan konsep **Inheritance (Pewarisan)** melalui class `Elektronik` yang merupakan turunan dari class `Produk`.

## 🎯 Tujuan Pembelajaran

Setelah menyelesaikan materi dan praktikum ini, mahasiswa diharapkan mampu:

- Memahami kembali konsep encapsulation dalam Java.
- Memahami fungsi atribut `private` dalam melindungi data.
- Menggunakan getter untuk membaca nilai atribut.
- Menggunakan setter untuk mengubah nilai atribut.
- Memahami penggunaan constructor untuk memberikan nilai awal pada object.
- Menerapkan validasi untuk menjaga agar data tetap sesuai aturan.
- Membuat method untuk mengelola data dan menjalankan operasi tertentu.
- Memahami konsep dasar inheritance melalui class induk dan class turunan.
- Menggunakan keyword `extends` dan `super` pada pewarisan class.

## 🧠 Materi Pembelajaran

### 1. Pengertian Encapsulation

**Encapsulation** adalah konsep OOP yang menggabungkan data dan method dalam sebuah class serta mengatur akses terhadap data tersebut.

Dalam Java, atribut dapat dibuat `private` agar tidak dapat diakses secara langsung dari luar class yang mendeklarasikannya. Jika class lain membutuhkan data tersebut, class dapat menyediakan method yang sesuai.

Contoh:

```java
public class Mahasiswa {

    // Atribut hanya dapat diakses langsung dari dalam class Mahasiswa
    private String nama;

    // Method untuk mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method untuk membaca nilai nama
    public String getNama() {
        return nama;
    }
}
```

Pada contoh tersebut, atribut `nama` tidak dapat diakses langsung oleh class lain. Untuk mengubah nilainya, digunakan method `setNama()`, sedangkan untuk membaca nilainya digunakan `getNama()`.

Dengan demikian, akses terhadap data dapat dikelola melalui method yang disediakan oleh class.

### 2. Access Modifier

Access modifier adalah kata kunci yang menentukan bagian program mana yang dapat mengakses suatu class atau anggotanya.

Java menyediakan beberapa access modifier, di antaranya:

| Modifier | Penjelasan |
|---|---|
| `private` | Hanya dapat diakses langsung dari dalam class yang mendeklarasikannya. |
| `protected` | Dapat diakses dari dalam package yang sama dan oleh subclass sesuai aturan akses Java. |
| `public` | Dapat diakses dari class lain selama class dan anggotanya dapat dijangkau. |

Contoh:

```java
public class Produk {

    private String namaProduk;
    protected double harga;
    public String kategori;
}
```

Pada contoh tersebut, ketiga atribut memiliki aturan akses yang berbeda.

Dalam penerapan encapsulation, atribut umumnya dibuat `private` agar akses langsung terhadap data dapat dibatasi. Method yang memang diperlukan oleh class lain dapat disediakan dengan modifier `public`.

### 3. Getter dan Setter

Getter dan setter merupakan method yang sering digunakan untuk mengelola akses terhadap atribut `private`.

#### A. Getter

Getter digunakan untuk mengambil nilai atribut atau memperoleh hasil tertentu dari sebuah object.

Contoh:

```java
private String nama;

public String getNama() {
    return nama;
}
```

Ketika method `getNama()` dipanggil, method tersebut mengembalikan nilai atribut `nama`.

Contoh penggunaannya:

```java
Mahasiswa mhs = new Mahasiswa();

mhs.setNama("Ilham");

System.out.println(mhs.getNama());
```

Output:

```text
Ilham
```

#### B. Setter

Setter digunakan untuk mengatur atau memperbarui nilai atribut.

Contoh:

```java
private String nama;

public void setNama(String nama) {
    this.nama = nama;
}
```

Parameter `nama` menerima nilai yang ingin disimpan. Selanjutnya, `this.nama` menunjuk pada atribut milik object saat ini.

Setter juga dapat dilengkapi validasi agar nilai yang diberikan sesuai dengan aturan program.

Contoh:

```java
private double harga;

public void setHarga(double harga) {
    if (harga >= 0) {
        this.harga = harga;
    }
}
```

Pada contoh tersebut, harga hanya diperbarui jika nilainya tidak negatif.

#### Perbedaan Getter dan Setter

| Getter | Setter |
|---|---|
| Digunakan untuk membaca nilai atau memperoleh hasil. | Digunakan untuk mengubah nilai atribut. |
| Umumnya mengembalikan suatu nilai menggunakan `return`. | Umumnya menggunakan `void` jika tidak perlu mengembalikan hasil. |
| Contoh: `getNama()` | Contoh: `setNama("Ilham")` |

Getter dan setter tidak harus selalu dibuat untuk setiap atribut. Method yang disediakan sebaiknya disesuaikan dengan kebutuhan dan aturan data dalam class.

### 4. Constructor

Constructor merupakan bagian khusus dari class yang digunakan untuk menginisialisasi object ketika object dibuat.

Ciri-ciri constructor:

- Nama constructor sama dengan nama class.
- Constructor tidak memiliki tipe return, termasuk `void`.
- Constructor dipanggil ketika object dibuat menggunakan keyword `new`.
- Constructor dapat memiliki parameter untuk menerima nilai awal object.

Contoh:

```java
public class Mahasiswa {

    private String nama;
    private String nim;

    // Constructor dengan dua parameter
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
}
```

Cara membuat object:

```java
Mahasiswa mhs = new Mahasiswa(
    "Ilham Firmansyah",
    "20240801102"
);

System.out.println(mhs.getNama());
System.out.println(mhs.getNim());
```

Output:

```text
Ilham Firmansyah
20240801102
```

Constructor tersebut memberikan nilai awal pada atribut `nama` dan `nim` saat object dibuat.

Jika sebuah class tidak mendeklarasikan constructor, Java dapat menyediakan default constructor tanpa parameter. Namun, jika constructor telah dideklarasikan sendiri, default constructor tidak otomatis disediakan lagi.

### 5. Validasi Data

Validasi adalah proses memeriksa data sebelum data diterima atau digunakan oleh program.

Validasi penting karena data yang tidak sesuai aturan dapat menyebabkan hasil perhitungan atau proses program menjadi tidak benar.

Contohnya, pada sistem rekening bank, saldo tidak seharusnya menjadi negatif akibat perubahan saldo yang tidak valid.

```java
public void setSaldo(double saldo) {
    if (saldo < 0) {
        System.out.println("Saldo tidak boleh negatif!");
    } else {
        this.saldo = saldo;
    }
}
```

Pada contoh tersebut:

1. Method menerima nilai saldo baru.
2. Program memeriksa apakah saldo kurang dari nol.
3. Jika negatif, program menampilkan pesan penolakan.
4. Jika tidak negatif, nilai saldo diperbarui.

Validasi dapat diterapkan pada berbagai jenis data, seperti harga, stok, jumlah barang, berat, dan nilai mahasiswa.

**Catatan:** validasi harus diterapkan pada semua jalur yang dapat mengubah data. Jika constructor menerima nilai awal, constructor juga perlu memeriksa validitas nilai tersebut.

### 6. Inheritance atau Pewarisan

Inheritance adalah konsep OOP yang memungkinkan sebuah class mewarisi anggota yang dapat diakses dari class lain.

Dalam inheritance, terdapat dua istilah utama:

- **Parent class / superclass:** class induk yang menyediakan atribut dan method.
- **Child class / subclass:** class turunan yang mewarisi anggota yang dapat diakses dari class induk dan dapat menambahkan fitur khusus.

Contoh hubungan class:

```java
public class Produk {
    private String namaProduk;
    private double harga;
}
```

Class `Elektronik` dapat dibuat sebagai turunan dari `Produk`:

```java
public class Elektronik extends Produk {
    private String garansi;
}
```

Keyword `extends` menunjukkan bahwa `Elektronik` merupakan subclass dari `Produk`.

Class turunan dapat menambahkan atribut atau method khusus tanpa harus mendefinisikan ulang seluruh perilaku umum dari class induk.

#### A. Keyword `super`

Keyword `super` dapat digunakan untuk mengakses anggota superclass yang dapat dijangkau atau memanggil constructor superclass.

Contoh:

```java
public class Produk {

    private String namaProduk;

    public Produk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }
}
```

Class turunannya:

```java
public class Elektronik extends Produk {

    private String garansi;

    public Elektronik(String namaProduk, String garansi) {
        // Memanggil constructor milik class Produk
        super(namaProduk);

        // Mengisi atribut milik class Elektronik
        this.garansi = garansi;
    }

    public String getGaransi() {
        return garansi;
    }
}
```

Pada contoh tersebut, `super(namaProduk)` memanggil constructor milik `Produk` untuk menginisialisasi nama produk.

Atribut `namaProduk` tetap bersifat `private`, sehingga class `Elektronik` tidak dapat mengaksesnya secara langsung. Untuk membaca nilainya, class turunan menggunakan method `getNamaProduk()` yang disediakan oleh superclass.

Dengan demikian, inheritance dan encapsulation dapat digunakan bersama-sama.

## 🧪 Daftar Kuis dan Praktikum

Praktikum pada pertemuan ini terdiri dari tiga studi kasus utama dan satu tugas tambahan opsional.

### Kuis 1 — Konsep Dasar Enkapsulasi

**File:** `Mahasiswa.java` dan `Main.java`

Kuis ini menggunakan class `Mahasiswa` untuk menyimpan informasi mahasiswa.

Konsep yang dipelajari:

- Atribut `private`.
- Constructor.
- Getter dan setter.
- Pembuatan object menggunakan `new`.
- Pengambilan data melalui getter.

Tujuan praktikum adalah memahami bagaimana atribut dalam class dikelola melalui method.

### Kuis 2 — Enkapsulasi dengan Validasi

**File:** `RekeningBank.java` dan `Main.java`

Kuis ini menggunakan class `RekeningBank` untuk menyimpan nomor rekening dan saldo.

Konsep yang dipelajari:

- Melindungi atribut rekening menggunakan `private`.
- Membuat getter dan setter.
- Memvalidasi perubahan saldo.
- Menolak perubahan saldo yang tidak valid.
- Memastikan saldo tetap sesuai aturan program.

Tujuan praktikum adalah memahami bagaimana validasi diterapkan saat data diperbarui.

### Kuis 3 — Pengelolaan Produk

**File:** `Produk.java` dan `Main.java`

Kuis ini menggunakan class `Produk` untuk mengelola nama produk, harga, dan stok.

Konsep yang dipelajari:

- Menyimpan informasi produk melalui atribut `private`.
- Mengakses data menggunakan getter.
- Mengubah data menggunakan setter.
- Menambah stok melalui method `tambahStok()`.
- Mengurangi stok melalui method `kurangiStok()`.
- Menampilkan informasi produk melalui method `tampilkanInfo()`.

Tujuan praktikum adalah menerapkan encapsulation pada pengelolaan data produk dan operasi stok.

### Kuis 4 — Kelas Turunan Produk Elektronik (Opsional)

**File:** `Produk.java`, `Elektronik.java`, dan `Main.java`

Kuis tambahan ini mengembangkan class `Produk` dengan membuat subclass `Elektronik`.

Konsep yang dipelajari:

- Inheritance menggunakan `extends`.
- Pemanggilan constructor superclass menggunakan `super()`.
- Penambahan atribut khusus pada subclass.
- Penggunaan getter dan setter untuk mengelola data.
- Pemanfaatan method dari class induk.

Tujuan praktikum adalah memahami hubungan antara encapsulation dan inheritance.

## 📂 Struktur Folder

```text
pertemuan_06/
├── quiz/
│   ├── kuis_01/
│   │   ├── Mahasiswa.java
│   │   └── Main.java
│   ├── kuis_02/
│   │   ├── RekeningBank.java
│   │   └── Main.java
│   ├── kuis_03/
│   │   ├── Produk.java
│   │   └── Main.java
│   └── kuis_04_opsional/
│       ├── Produk.java
│       ├── Elektronik.java
│       └── Main.java
└── README.md
```

Setiap kuis memiliki folder terpisah agar class dengan nama yang sama, seperti `Main` dan `Produk`, tidak menimbulkan konflik saat kompilasi.

## ▶️ Cara Menjalankan Program

Pastikan JDK telah terpasang dan perintah `java` serta `javac` dapat digunakan melalui terminal.

### Menjalankan Kuis 1

```powershell
cd src/pertemuan_06/quiz/kuis_01
javac *.java
java Main
```

### Menjalankan Kuis 2

```powershell
cd src/pertemuan_06/quiz/kuis_02
javac *.java
java Main
```

### Menjalankan Kuis 3

```powershell
cd src/pertemuan_06/quiz/kuis_03
javac *.java
java Main
```

### Menjalankan Kuis 4 (Opsional)

```powershell
cd src/pertemuan_06/quiz/kuis_04_opsional
javac *.java
java Main
```

Jalankan setiap perintah dari direktori repository yang sesuai. Jika terminal sudah berada di folder kuis sebelumnya, kembali ke direktori utama sebelum berpindah ke folder kuis lainnya.

## 📝 Kesimpulan

Encapsulation membantu mengontrol akses terhadap data dan menjaga agar perubahan data mengikuti aturan yang ditentukan oleh program.

Melalui penggunaan atribut `private`, getter, setter, constructor, dan validasi, data dapat dikelola secara lebih terstruktur. Konsep ini diterapkan pada pengelolaan data mahasiswa, rekening bank, dan produk.

Selain itu, inheritance memungkinkan sebuah class memperoleh anggota yang dapat diakses dari class induk serta menambahkan atribut dan method khusus. Penggunaan `extends` dan `super` memperkenalkan hubungan antara superclass dan subclass, sementara encapsulation tetap digunakan untuk menjaga akses terhadap data.

Kedua konsep tersebut merupakan bagian penting dalam memahami pemrograman berorientasi objek menggunakan Java.

## 📚 Referensi

**Week 5–6 — Encapsulation (Concept)**

Laporan Praktikum Pertemuan 6 — Encapsulation.

Mata Kuliah: Pemrograman Berorientasi Objek (PBO).

Bahasa Pemrograman: Java.