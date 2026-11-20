# Materi — Inheritance Basic

Folder ini berisi implementasi dasar konsep **Inheritance (Pewarisan)** menggunakan bahasa pemrograman Java.

Pada contoh ini, digunakan dua class, yaitu `Hewan` sebagai superclass (kelas induk) dan `Kucing` sebagai subclass (kelas anak).

Class `Kucing` mewarisi atribut dan method dari class `Hewan`. Dengan demikian, class `Kucing` dapat menggunakan atribut `nama`, `umur`, serta method `makan()` dan `tidur()` tanpa harus mendefinisikannya kembali.

## 📚 Daftar Isi

- [Struktur Class](#-struktur-class)
- [1. Superclass — Hewan.java](#1-superclass--hewanjava)
- [2. Subclass — Kucing.java](#2-subclass--kucingjava)
- [3. Penjelasan Sintaks Penting](#3-penjelasan-sintaks-penting)
- [4. Konsep Inheritance pada Program](#4-konsep-inheritance-pada-program)
- [5. Output Program](#5-output-program)
- [Kesimpulan](#-kesimpulan)

## 📂 Struktur Class

```text
materi/
└── contoh/
    ├── Hewan.java
    └── Kucing.java
```

Keterangan:

| File | Fungsi |
|---|---|
| `Hewan.java` | Superclass yang menyimpan atribut dan method umum untuk hewan |
| `Kucing.java` | Subclass yang mewarisi class `Hewan` dan memiliki method tambahan |

## 1. Superclass — Hewan.java

Class `Hewan` berperan sebagai kelas induk yang menyediakan atribut dan method umum yang dapat digunakan oleh kelas turunannya.

### Source Code

```java
package pertemuan_08.materi.contoh;

// Superclass (Kelas Induk)
public class Hewan {

    // Atribut superclass
    protected String nama;
    protected int umur;

    // Method superclass
    public void makan() {
        System.out.println(nama + " sedang makan.");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur.");
    }
}
```

### Penjelasan Kode

**1. Package Declaration**

```java
package pertemuan_08.materi.contoh;
```

`package` digunakan untuk menentukan lokasi atau kelompok class dalam struktur project Java.

Pada program ini, class `Hewan` dan `Kucing` berada dalam package `pertemuan_08.materi.contoh`.

**2. Deklarasi Class**

```java
public class Hewan {
```

- `public` merupakan access modifier yang memungkinkan class diakses dari class lain sesuai aturan package dan akses Java.
- `class` merupakan keyword untuk mendefinisikan sebuah kelas.
- `Hewan` merupakan nama class yang digunakan sebagai superclass.

**3. Atribut dengan Access Modifier Protected**

```java
protected String nama;
protected int umur;
```

Kedua variabel tersebut merupakan atribut yang dimiliki oleh class `Hewan`.

- `protected` merupakan access modifier yang memungkinkan atribut diakses oleh class dalam package yang sama serta subclass, termasuk subclass yang berada di package berbeda melalui aturan akses Java.
- `String` merupakan tipe data untuk menyimpan teks.
- `int` merupakan tipe data untuk menyimpan bilangan bulat.
- `nama` dan `umur` merupakan nama variabel.

Penggunaan `protected` memungkinkan subclass `Kucing` mengakses atribut yang diwariskan dari superclass `Hewan`.

**4. Method makan()**

```java
public void makan() {
    System.out.println(nama + " sedang makan.");
}
```

Method `makan()` digunakan untuk menampilkan aktivitas makan.

Penjelasan sintaks:

- `public` membuat method dapat diakses dari luar class.
- `void` menunjukkan bahwa method tidak mengembalikan nilai.
- `makan()` merupakan nama method.
- `System.out.println()` digunakan untuk menampilkan teks ke console.
- `nama` mengambil nilai atribut yang dimiliki objek.

**5. Method tidur()**

```java
public void tidur() {
    System.out.println(nama + " sedang tidur.");
}
```

Method `tidur()` memiliki fungsi untuk menampilkan aktivitas tidur.

Kedua method tersebut nantinya dapat digunakan langsung oleh subclass karena diwariskan melalui inheritance.

## 2. Subclass — Kucing.java

Class `Kucing` merupakan kelas turunan dari `Hewan`.

Melalui keyword `extends`, class `Kucing` dapat menggunakan atribut dan method yang telah didefinisikan dalam superclass.

### Source Code

```java
package pertemuan_08.materi.contoh;

// Subclass (Kelas Anak)
public class Kucing extends Hewan {

    // Method khusus subclass
    public void bersuara() {
        System.out.println(nama + " mengeluarkan suara: Meow!");
    }

    public static void main(String[] args) {

        // Membuat objek Kucing
        Kucing kucing = new Kucing();

        // Mengisi atribut warisan dari superclass
        kucing.nama = "Milo";
        kucing.umur = 2;

        // Menampilkan atribut
        System.out.println("Nama: " + kucing.nama);
        System.out.println("Umur: " + kucing.umur + " tahun");

        // Memanggil method superclass
        kucing.makan();
        kucing.tidur();

        // Memanggil method subclass
        kucing.bersuara();
    }
}
```

### Penjelasan Kode

**1. Deklarasi Subclass dengan extends**

```java
public class Kucing extends Hewan {
```

Keyword `extends` digunakan untuk menghubungkan subclass dengan superclass.

Dalam kode tersebut:

- `Kucing` merupakan subclass.
- `Hewan` merupakan superclass.
- `extends` menunjukkan bahwa `Kucing` mewarisi fitur dari `Hewan`.

Karena hubungan inheritance tersebut, class `Kucing` dapat menggunakan atribut `nama`, `umur`, serta method `makan()` dan `tidur()`.

**2. Method Khusus Subclass**

```java
public void bersuara() {
    System.out.println(nama + " mengeluarkan suara: Meow!");
}
```

Method `bersuara()` merupakan method tambahan yang dibuat khusus untuk class `Kucing`.

Method ini tidak berasal dari superclass `Hewan`, melainkan didefinisikan langsung di dalam subclass.

Menariknya, method ini tetap dapat menggunakan atribut `nama` karena atribut tersebut diwariskan dari superclass.

**3. Method main()**

```java
public static void main(String[] args) {
```

Method `main()` merupakan titik awal eksekusi program Java.

Penjelasan sintaks:

- `public`: Method dapat diakses oleh JVM.
- `static`: Method dapat dijalankan tanpa harus membuat objek terlebih dahulu untuk class yang mendefinisikannya.
- `void`: Method tidak mengembalikan nilai.
- `main`: Nama method utama yang dikenali JVM.
- `String[] args`: Parameter untuk menerima argumen berupa kumpulan teks dari command line.

**4. Membuat Objek**

```java
Kucing kucing = new Kucing();
```

Baris tersebut digunakan untuk membuat objek dari class `Kucing`.

Penjelasan:

- `Kucing` merupakan tipe data atau class yang digunakan.
- `kucing` merupakan nama variabel referensi objek.
- `new` merupakan keyword untuk membuat objek baru.
- `Kucing()` merupakan pemanggilan constructor.

Objek `kucing` nantinya dapat menggunakan atribut dan method milik class `Kucing` maupun fitur yang diwarisi dari `Hewan`.

**5. Mengisi Atribut Warisan**

```java
kucing.nama = "Milo";
kucing.umur = 2;
```

Kode tersebut digunakan untuk memberikan nilai pada atribut `nama` dan `umur`.

Meskipun kedua atribut didefinisikan dalam class `Hewan`, objek `kucing` dapat mengaksesnya karena class `Kucing` merupakan subclass dari `Hewan` dan kedua atribut memiliki access modifier `protected`.

Nilai yang diberikan:

- `nama` diisi dengan `"Milo"`.
- `umur` diisi dengan `2`.

**6. Menampilkan Atribut**

```java
System.out.println("Nama: " + kucing.nama);
System.out.println("Umur: " + kucing.umur + " tahun");
```

`System.out.println()` digunakan untuk menampilkan informasi ke console.

Operator `+` digunakan untuk menggabungkan teks dengan nilai atribut objek.

Hasilnya akan menampilkan nama dan umur kucing.

**7. Memanggil Method dari Superclass**

```java
kucing.makan();
kucing.tidur();
```

Kedua method tersebut sebenarnya didefinisikan di dalam class `Hewan`.

Namun, objek `kucing` tetap dapat memanggilnya karena class `Kucing` mewarisi class `Hewan`.

Inilah salah satu penerapan utama inheritance, yaitu menggunakan kembali method dari kelas induk tanpa harus menuliskan ulang kodenya.

**8. Memanggil Method dari Subclass**

```java
kucing.bersuara();
```

Berbeda dengan `makan()` dan `tidur()`, method `bersuara()` didefinisikan langsung di dalam class `Kucing`.

Method ini digunakan untuk menampilkan suara khas kucing.

Dengan demikian, objek `kucing` dapat menggunakan method yang diwariskan dari superclass sekaligus method khusus milik subclass.

## 3. Penjelasan Sintaks Penting

Berikut beberapa keyword dan sintaks Java yang berkaitan dengan materi inheritance.

### A. extends

```java
class Kucing extends Hewan {
}
```

`extends` digunakan untuk membuat hubungan pewarisan antara superclass dan subclass.

Dengan keyword ini, subclass dapat menggunakan fitur yang diwariskan dari superclass.

### B. protected

```java
protected String nama;
```

`protected` merupakan access modifier yang memberikan akses kepada class dalam package yang sama dan subclass, dengan tetap mengikuti aturan akses Java.

Access modifier ini sering digunakan ketika sebuah atribut atau method memang ditujukan untuk digunakan oleh kelas turunannya.

### C. @Override

```java
@Override
public void makan() {
    System.out.println("Kucing sedang makan.");
}
```

`@Override` merupakan annotation yang digunakan untuk menandai bahwa sebuah method di subclass dimaksudkan untuk menggantikan implementasi method yang diwarisi dari superclass.

Contohnya, jika superclass `Hewan` memiliki method `makan()`, subclass `Kucing` dapat membuat implementasi `makan()` sendiri.

Dengan demikian, ketika `makan()` dipanggil melalui objek `Kucing`, implementasi milik `Kucing` yang dijalankan.

**Catatan:** Annotation `@Override` belum digunakan pada contoh program `Hewan.java` dan `Kucing.java` di atas. Potongan kode tersebut merupakan contoh tambahan untuk memahami konsep method overriding.

### D. super

```java
@Override
public void makan() {
    super.makan();
    System.out.println("Kucing sedang makan ikan.");
}
```

Keyword `super` digunakan untuk mengakses anggota superclass dari dalam subclass.

Pada contoh tersebut, `super.makan()` digunakan untuk memanggil implementasi method `makan()` milik superclass `Hewan`.

Setelah itu, subclass menambahkan instruksi sendiri.

**Catatan:** Penggunaan `super` juga merupakan contoh tambahan dan tidak terdapat dalam source code utama.

### E. new

```java
Kucing kucing = new Kucing();
```

Keyword `new` digunakan untuk membuat objek baru dari sebuah class.

Objek merupakan hasil instansiasi class yang dapat digunakan untuk mengakses atribut dan method sesuai aturan akses Java.

### F. void

```java
public void bersuara() {
}
```

`void` menunjukkan bahwa sebuah method tidak mengembalikan nilai.

Method tersebut dapat menjalankan instruksi seperti menampilkan teks atau melakukan proses lainnya tanpa menggunakan perintah `return` untuk mengembalikan nilai.

### G. System.out.println()

```java
System.out.println("Hello Java");
```

Digunakan untuk menampilkan teks atau nilai ke console dan secara otomatis membuat baris baru setelah output ditampilkan.

---

## 4. Konsep Inheritance pada Program

Berdasarkan implementasi di atas, hubungan antara kedua class dapat digambarkan sebagai berikut:

```text
          Hewan
       (Superclass)
             |
          extends
             |
          Kucing
        (Subclass)
```

Class `Hewan` menyediakan atribut dan method umum, sedangkan class `Kucing` mewarisi fitur tersebut dan menambahkan perilaku khusus berupa method `bersuara()`.

Berikut pembagian fitur setiap class:

| Fitur | Hewan | Kucing |
|---|---|---|
| `nama` | Atribut | Diwarisi |
| `umur` | Atribut | Diwarisi |
| `makan()` | Method | Diwarisi |
| `tidur()` | Method | Diwarisi |
| `bersuara()` | - | Method sendiri |

Melalui contoh ini, dapat dipahami bahwa subclass tidak harus membuat ulang seluruh atribut dan method yang sudah tersedia pada superclass.

Subclass cukup menggunakan fitur yang diwariskan dan menambahkan fungsionalitas baru sesuai kebutuhan.

## 5. Output Program

Apabila program dijalankan, hasil yang ditampilkan pada console adalah:

```text
Nama: Milo
Umur: 2 tahun
Milo sedang makan.
Milo sedang tidur.
Milo mengeluarkan suara: Meow!
```

Output tersebut menunjukkan bahwa objek `kucing` berhasil menggunakan:

1. Atribut `nama` dan `umur` dari superclass.
2. Method `makan()` dari superclass.
3. Method `tidur()` dari superclass.
4. Method `bersuara()` dari subclass.

## ▶️ Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terpasang.

Masuk ke direktori project utama, kemudian jalankan perintah berikut:

```bash
javac -d out src/pertemuan_08/materi/contoh/*.java
```

Setelah proses kompilasi selesai, jalankan program menggunakan:

```bash
java -cp out pertemuan_08.materi.contoh.Kucing
```

Perintah tersebut mengasumsikan struktur direktori source sesuai package yang digunakan dalam program.

---

## 📝 Kesimpulan

Melalui contoh program `Hewan` dan `Kucing`, dapat dipahami bahwa inheritance memungkinkan sebuah class mewarisi atribut dan method dari class lain.

Class `Hewan` berperan sebagai superclass yang menyediakan atribut `nama`, `umur`, serta method `makan()` dan `tidur()`.

Sementara itu, class `Kucing` menjadi subclass yang menggunakan keyword `extends` untuk mewarisi fitur dari `Hewan` dan menambahkan method khusus berupa `bersuara()`.

Beberapa sintaks penting yang perlu dipahami dalam implementasi ini adalah `extends`, `protected`, `public`, `void`, `new`, serta annotation `@Override` dan keyword `super` sebagai konsep tambahan dalam inheritance.

Dengan memahami contoh ini, mahasiswa diharapkan mampu membuat hubungan pewarisan antarkelas dan menerapkannya dalam program Java yang lebih kompleks.

---

**Author:** Ilham Firmansyah

**Course:** Object-Oriented Programming (CSF308)

**Topic:** Inheritance Basic

**Language:** Java