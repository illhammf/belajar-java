# Pertemuan 8–9 — Inheritance (Basic & Case Study)

Repository ini berisi materi pembelajaran **Object-Oriented Programming (OOP) menggunakan Java**, khususnya mengenai **Inheritance** atau pewarisan dalam pemrograman berorientasi objek.

Pada pertemuan ini, kita mempelajari bagaimana sebuah kelas dapat mewarisi atribut (*fields*) dan method dari kelas lain. Konsep ini memungkinkan programmer menggunakan kembali kode yang sudah ada, mengembangkan kelas baru, serta membangun hubungan antarkelas secara lebih terstruktur.

Materi dibagi menjadi dua pembahasan utama, yaitu **Inheritance Basic** pada sesi 8 dan **Inheritance Detail (Case Study)** pada sesi 9.

Pembelajaran dilengkapi dengan contoh program Java, implementasi berbagai tipe inheritance, serta latihan melalui quiz dan penerapan inheritance ke dalam project yang telah dibuat.

## 📚 Daftar Isi

- [Tujuan Pembelajaran](#-tujuan-pembelajaran)
- [Pengertian Inheritance](#-pengertian-inheritance)
- [1. Konsep Dasar Inheritance](#1-konsep-dasar-inheritance)
- [2. Mengapa Membutuhkan Inheritance?](#2-mengapa-membutuhkan-inheritance)
- [3. Istilah Penting dalam Inheritance](#3-istilah-penting-dalam-inheritance)
- [4. Inheritance dalam Case Study](#4-inheritance-dalam-case-study)
- [5. Tipe-Tipe Inheritance di Java](#5-tipe-tipe-inheritance-di-java)
- [6. Method Overriding](#6-method-overriding)
- [7. Multiple Inheritance Menggunakan Interface](#7-multiple-inheritance-menggunakan-interface)
- [8. Quiz dan Tugas Praktik](#8-quiz-dan-tugas-praktik)
- [Daftar File Program](#-daftar-file-program)
- [Penjelasan Setiap File Java](#-penjelasan-setiap-file-java)
- [Cara Menjalankan Program](#-cara-menjalankan-program)
- [Kesimpulan](#-kesimpulan)
- [Referensi](#-referensi)

---

## 🎯 Tujuan Pembelajaran

Setelah mempelajari materi ini, mahasiswa diharapkan mampu:

1. Memahami konsep dasar Inheritance dalam Object-Oriented Programming.
2. Menjelaskan hubungan antara superclass dan subclass.
3. Memahami manfaat penggunaan inheritance dalam pengembangan program.
4. Mengimplementasikan inheritance menggunakan keyword `extends` pada Java.
5. Mengenali berbagai tipe inheritance, yaitu Single, Multilevel, Hierarchical, Multiple, dan Hybrid Inheritance.
6. Memahami konsep method overriding pada inheritance.
7. Memahami penggunaan interface untuk mencapai pewarisan berganda dalam Java.
8. Membuat program Java yang menerapkan konsep inheritance.
9. Mengimplementasikan inheritance ke dalam project yang telah dibuat.

## 💡 Pengertian Inheritance

**Inheritance** atau pewarisan adalah salah satu fitur utama dalam Object-Oriented Programming (OOP) yang memungkinkan sebuah kelas mewarisi fitur dari kelas lain.

Fitur yang dapat diwariskan meliputi atribut (*fields*) dan method yang dimiliki oleh kelas induk.

Dengan inheritance, programmer dapat membuat kelas baru berdasarkan kelas yang sudah ada tanpa harus menuliskan kembali seluruh kode yang sebelumnya telah dibuat.

Sebagai contoh, sebuah kelas `Person` dapat memiliki atribut umum seperti nama dan umur. Kemudian, kelas `Student` dan `Lecturer` dapat mewarisi atribut serta perilaku umum dari kelas `Person`.

Dengan demikian, kelas turunan dapat menggunakan fitur dari kelas induk sekaligus menambahkan atribut dan method khusus sesuai kebutuhan.

Untuk memahami konsep inheritance, kita perlu mengenal hubungan antara superclass dan subclass.

---

## 1. Konsep Dasar Inheritance

Inheritance memungkinkan sebuah kelas memperoleh karakteristik dan perilaku dari kelas lain.

Dalam Java, inheritance pada class diimplementasikan menggunakan keyword `extends`.

Bentuk umum penulisannya:

```java
class Superclass {
    // Atribut dan method kelas induk
}

class Subclass extends Superclass {
    // Atribut dan method tambahan kelas anak
}
```

Penjelasan:

- `Superclass` merupakan kelas induk yang menyediakan atribut dan method untuk diwariskan.
- `Subclass` merupakan kelas anak yang mewarisi fitur dari superclass.
- `extends` merupakan keyword yang digunakan untuk menyatakan hubungan pewarisan antarkelas.

Contoh sederhana:

```java
class Person {
    String nama;

    void perkenalan() {
        System.out.println("Nama: " + nama);
    }
}

class Student extends Person {
    String nim;
}
```

Pada contoh tersebut, kelas `Student` mewarisi atribut `nama` dan method `perkenalan()` dari kelas `Person`.

Selain itu, kelas `Student` memiliki atribut tambahan berupa `nim`.

Artinya, kelas turunan dapat menggunakan fitur kelas induk sekaligus mempunyai karakteristiknya sendiri.

## 2. Mengapa Membutuhkan Inheritance?

Inheritance memiliki beberapa kegunaan penting dalam pengembangan program Java.

### A. Code Reusability (Penggunaan Ulang Kode)

Inheritance memungkinkan programmer menggunakan kembali kode yang sudah ditulis dalam superclass.

Kelas anak dapat menggunakan atribut dan method yang diwariskan tanpa harus menuliskan ulang implementasinya.

Contohnya, beberapa kelas yang memiliki informasi nama dan umur dapat menggunakan satu superclass yang sama.

### B. Method Overriding

Inheritance memungkinkan subclass menyediakan implementasi method yang berbeda dari superclass.

Konsep tersebut dikenal sebagai **method overriding**.

Dengan overriding, kelas anak dapat menyesuaikan perilaku method sesuai kebutuhan masing-masing.

Konsep ini juga menjadi salah satu dasar penerapan Polymorphism dalam Java.

### C. Abstraction

Inheritance dapat digunakan untuk membangun hubungan antarkelas yang menggambarkan karakteristik umum dan khusus.

Dengan demikian, programmer dapat mengorganisasi fungsionalitas program berdasarkan hubungan pewarisan.

---

## 3. Istilah Penting dalam Inheritance

Sebelum mempelajari berbagai tipe inheritance, terdapat beberapa istilah yang perlu dipahami.

### A. Class

**Class** adalah cetak biru (*blueprint*), template, atau prototipe yang digunakan untuk membuat objek.

Sebuah class mendefinisikan atribut dan perilaku yang dimiliki oleh objek.

Contohnya, class `Mahasiswa` dapat memiliki atribut nama, NIM, dan program studi.

### B. Superclass (Parent Class)

**Superclass** merupakan kelas induk yang fitur-fiturnya diwariskan kepada kelas lain.

Superclass dapat menyediakan atribut dan method umum yang dapat digunakan oleh subclass.

### C. Subclass (Child Class)

**Subclass** merupakan kelas turunan yang mewarisi fitur dari superclass.

Selain menggunakan fitur yang diwariskan, subclass juga dapat menambahkan atribut dan method baru sesuai kebutuhan.

Contoh hubungan antarkelas:

```java
class Kendaraan {
    String merek;

    void bergerak() {
        System.out.println("Kendaraan sedang bergerak");
    }
}

class Mobil extends Kendaraan {
    int jumlahPintu;
}
```

Pada contoh tersebut:

- `Kendaraan` merupakan superclass.
- `Mobil` merupakan subclass.
- `merek` merupakan atribut yang diwariskan.
- `bergerak()` merupakan method yang diwariskan.
- `jumlahPintu` merupakan atribut tambahan milik subclass.

---

## 4. Inheritance dalam Case Study

Pada materi pertemuan ini, terdapat contoh penerapan inheritance menggunakan studi kasus **Employee** atau karyawan.

Contoh tersebut menggambarkan bagaimana sebuah kelas karyawan dapat memiliki kelas turunan yang mewarisi informasi umum dari kelas induknya.

Misalnya, terdapat superclass `Employee` dengan atribut gaji (*salary*).

Kemudian, dibuat subclass `Lecturer` yang mewarisi kelas `Employee` dan memiliki atribut tambahan berupa *benefits*.

Gambaran struktur kelas:

```text
        Employee
            |
          extends
            |
         Lecturer
```

Contoh implementasi:

```java
class Employee {
    int salary = 8000000;
}

class Lecturer extends Employee {
    int benefits = 5000000;
}
```

Kelas `Lecturer` dapat menggunakan atribut `salary` yang diwarisi dari `Employee`, sekaligus memiliki atribut `benefits` sendiri.

Dengan demikian, informasi umum mengenai karyawan dapat diletakkan pada kelas induk, sedangkan informasi khusus dapat ditambahkan pada kelas turunannya.

Studi kasus ini menunjukkan bagaimana inheritance membantu mengurangi pengulangan kode dan membangun struktur program yang lebih terorganisasi.

---

## 5. Tipe-Tipe Inheritance di Java

Dalam materi perkuliahan, terdapat lima tipe inheritance yang perlu dipahami, yaitu Single, Multilevel, Hierarchical, Multiple, dan Hybrid Inheritance.

### A. Single Inheritance

**Single Inheritance** merupakan tipe inheritance ketika satu subclass diturunkan dari satu superclass.

Struktur:

```text
       Class A
           |
         extends
           |
       Class B
```

Contoh:

```java
class One {
    public void print_pbo() {
        System.out.println("Pemrograman Berorientasi Objek");
    }
}

class Two extends One {
    public void print_for() {
        System.out.println("dengan JAVA");
    }
}
```

Pada contoh tersebut, `Two` mewarisi method `print_pbo()` dari kelas `One`.

Dengan demikian, objek dari kelas `Two` dapat menggunakan method milik kelas `One` sekaligus method miliknya sendiri.

### B. Multilevel Inheritance

**Multilevel Inheritance** merupakan tipe inheritance ketika sebuah subclass kembali menjadi superclass bagi kelas lainnya.

Struktur:

```text
       Class A
           |
         extends
           |
       Class B
           |
         extends
           |
       Class C
```

Contoh:

```java
class Satu {
    public void print_pbo() {
        System.out.println("Pemrograman Berorientasi Objek");
    }
}

class Dua extends Satu {
    public void print_for() {
        System.out.println("dengan JAVA");
    }
}

class Tiga extends Dua {
    public void print_again() {
        System.out.println("Belajar Inheritance");
    }
}
```

Pada contoh tersebut:

- `Satu` merupakan superclass dari `Dua`.
- `Dua` merupakan subclass dari `Satu`.
- `Dua` juga menjadi superclass dari `Tiga`.
- `Tiga` dapat menggunakan method yang diwariskan melalui kedua tingkat kelas sebelumnya.

### C. Hierarchical Inheritance

**Hierarchical Inheritance** merupakan tipe inheritance ketika beberapa subclass diturunkan dari satu superclass yang sama.

Struktur:

```text
             Class A
             /     \
            /       \
       Class B     Class C
```

Contoh:

```java
class PBO {
    public void print_PBO() {
        System.out.println("Class PBO");
    }
}

class ControlStatement extends PBO {
    public void print_ControlStatement() {
        System.out.println("Class ControlStatement");
    }
}

class Encapsulation extends PBO {
    public void print_Encapsulation() {
        System.out.println("Class Encapsulation");
    }
}

class Inheritance extends PBO {
    public void print_Inheritance() {
        System.out.println("Class Inheritance");
    }
}
```

Pada contoh tersebut, kelas `ControlStatement`, `Encapsulation`, dan `Inheritance` sama-sama mewarisi kelas `PBO`.

Setiap subclass dapat menggunakan method `print_PBO()` dan memiliki method tambahan masing-masing.

### D. Multiple Inheritance

**Multiple Inheritance** merupakan konsep pewarisan ketika satu kelas memperoleh fitur dari lebih dari satu superclass.

Namun, Java tidak mendukung multiple inheritance menggunakan pewarisan langsung dari beberapa class.

Contohnya, Java tidak mengizinkan bentuk deklarasi class seperti berikut:

```java
// Tidak didukung oleh Java
class C extends A, B {
}
```

Sebagai alternatif, Java menyediakan mekanisme interface untuk memungkinkan sebuah class mengimplementasikan beberapa kontrak sekaligus.

Pembahasan implementasinya terdapat pada bagian Multiple Inheritance Menggunakan Interface.

### E. Hybrid Inheritance

**Hybrid Inheritance** merupakan gabungan dari dua jenis inheritance atau lebih.

Contoh pada materi menggunakan ilustrasi objek tata surya.

Struktur hubungan kelas:

```text
          Tata_surya
           /      \
          /        \
        Bumi       Mars
          |
         Bulan
```

Contoh implementasi:

```java
class Tata_surya {
}

class Bumi extends Tata_surya {
}

class Mars extends Tata_surya {
}

class Bulan extends Bumi {
}
```

Pada contoh tersebut:

- `Tata_surya` merupakan superclass dari `Bumi`.
- `Tata_surya` merupakan superclass dari `Mars`.
- `Bumi` dan `Mars` merupakan subclass dari `Tata_surya`.
- `Bulan` merupakan subclass dari `Bumi`.

Contoh tersebut menggabungkan konsep Hierarchical Inheritance dan Multilevel Inheritance.

**Catatan:** Hybrid Inheritance tidak selalu membutuhkan Multiple Inheritance. Kombinasi beberapa pola pewarisan dapat dibangun menggunakan class Java tanpa harus mewarisi beberapa superclass sekaligus.

---

## 6. Method Overriding

**Method Overriding** merupakan kondisi ketika subclass menyediakan implementasi baru untuk method yang sebelumnya sudah didefinisikan dalam superclass.

Dengan overriding, subclass dapat mengubah perilaku method sesuai kebutuhan.

Contohnya, superclass memiliki method `connectServer()`, kemudian subclass menyediakan implementasi `connectServer()` yang berbeda.

Contoh sederhana:

```java
class Backend {
    public void connectServer() {
        System.out.println("Menghubungkan ke server");
    }
}

class Language extends Backend {
    @Override
    public void connectServer() {
        System.out.println("Java berhasil terhubung ke server");
    }
}
```

Pada contoh tersebut, method `connectServer()` di kelas `Language` menggantikan implementasi method yang diwarisi dari `Backend` ketika dipanggil melalui objek `Language`.

Annotation `@Override` digunakan untuk menunjukkan bahwa method tersebut dimaksudkan untuk melakukan overriding.

---

## 7. Multiple Inheritance Menggunakan Interface

Java memungkinkan sebuah class mengimplementasikan lebih dari satu interface.

Mekanisme ini dapat digunakan untuk memperoleh kemampuan dari beberapa interface sekaligus.

Pada materi PPT, terdapat contoh penggunaan:

- `Backend` sebagai interface.
- `Frontend` sebagai superclass.
- `Language` sebagai subclass yang mewarisi `Frontend` dan mengimplementasikan `Backend`.

Struktur:

```text
       Backend          Frontend
       (Interface)      (Superclass)
             \             /
              \           /
                Language
                 (Subclass)
```

Contoh implementasi:

```java
interface Backend {
    public void connectServer();
}

class Frontend {
    public void response(String text) {
        System.out.println(text);
    }
}

class Language extends Frontend implements Backend {
    String language = "Java";

    @Override
    public void connectServer() {
        System.out.println(language + " dapat digunakan sebagai backend");
    }
}
```

Penjelasan:

1. `Backend` merupakan interface yang mendefinisikan method `connectServer()`.
2. `Frontend` merupakan class yang memiliki method `response()`.
3. `Language` mewarisi class `Frontend` menggunakan `extends`.
4. `Language` mengimplementasikan interface `Backend` menggunakan `implements`.
5. Kelas `Language` menyediakan implementasi method `connectServer()`.

Dengan demikian, objek `Language` dapat menggunakan method `response()` dari `Frontend` dan mengimplementasikan kemampuan yang didefinisikan oleh `Backend`.

**Hal penting:** Java hanya memperbolehkan sebuah class mewarisi satu superclass langsung, tetapi sebuah class dapat mengimplementasikan beberapa interface.

---

## 8. Quiz dan Tugas Praktik

Pada bagian akhir materi PPT, terdapat tiga latihan quiz dan satu tugas implementasi program.

### A. Quiz

Mahasiswa diminta membuat program inheritance berdasarkan tiga studi kasus berikut:

**1. Employee**

Buatlah program inheritance mengenai `Employee` dengan menambahkan class turunan lain selain class yang telah diberikan pada contoh materi.

**2. Fruits**

Buatlah program inheritance dengan `Fruits` sebagai superclass.

Buat kelas turunan yang merepresentasikan beberapa jenis buah dengan karakteristik masing-masing.

**3. Person**

Buatlah program inheritance dengan `Person` sebagai superclass.

Buat kelas turunan yang memiliki karakteristik tambahan berdasarkan konsep pewarisan.

### B. Task — Demo Program

Selain quiz, terdapat tugas untuk mengimplementasikan konsep inheritance ke dalam program yang telah dibuat masing-masing.

Tugas ini bertujuan agar mahasiswa mampu menerapkan hubungan superclass dan subclass pada project yang sudah dikembangkan sebelumnya.

Melalui tugas ini, mahasiswa diharapkan dapat memahami bagaimana inheritance digunakan dalam pengembangan program yang lebih nyata, bukan hanya melalui contoh sederhana.

---

## 📂 Daftar File Program

Seluruh implementasi program untuk pertemuan ini disimpan di dalam folder `contoh/` dan `kuis/`.

Struktur direktori:

```text
pertemuan_08/
│
├── contoh/
│   ├── ...
│   └── README.md
│
├── kuis/
│   ├── ...
│   └── README.md
│
└── README.md
```

Keterangan:

| Folder | Keterangan |
|---|---|
| `contoh/` | Berisi implementasi contoh program dari materi PPT Inheritance Basic dan Inheritance Detail |
| `kuis/` | Berisi penyelesaian tiga latihan quiz mengenai Employee, Fruits, dan Person |
| `README.md` | Dokumentasi utama materi pertemuan 8–9 |

Setiap folder memiliki README tersendiri yang menjelaskan implementasi program, fungsi setiap file Java, serta cara menjalankannya.

---

## 🧩 Penjelasan Setiap File Java

Folder `contoh/` berisi implementasi program berdasarkan contoh-contoh yang terdapat dalam materi perkuliahan.

Secara umum, program-program tersebut mencakup:

1. Implementasi superclass dan subclass.
2. Penggunaan keyword `extends`.
3. Penerapan Single Inheritance.
4. Penerapan Multilevel Inheritance.
5. Penerapan Hierarchical Inheritance.
6. Implementasi Multiple Inheritance menggunakan interface.
7. Penerapan Hybrid Inheritance.
8. Implementasi method overriding.
9. Studi kasus Employee.

Sementara itu, folder `kuis/` berisi implementasi tiga latihan yang diberikan pada slide terakhir materi.

Penjelasan lebih terperinci mengenai nama file, fungsi setiap class, dan alur program dapat dilihat pada README masing-masing folder.

---

## ▶️ Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terpasang pada komputer.

Periksa instalasi Java:

```bash
java -version
```

Periksa compiler Java:

```bash
javac -version
```

### A. Masuk ke Folder Contoh

```bash
cd src/pertemuan_08/contoh
```

### B. Kompilasi Program

Untuk program sederhana yang tidak menggunakan deklarasi package dan seluruh file terkait berada dalam satu folder:

```bash
javac NamaFile.java
```

Jika program terdiri dari beberapa file Java yang saling berhubungan, kompilasikan seluruh file yang diperlukan.

### C. Menjalankan Program

```bash
java NamaClass
```

Ganti `NamaFile.java` dan `NamaClass` sesuai nama file dan class utama yang ingin dijalankan.

### D. Menjalankan Program Quiz

Masuk ke folder quiz:

```bash
cd src/pertemuan_08/kuis
```

Kemudian kompilasikan dan jalankan program sesuai class utama masing-masing latihan.

**Catatan:** Perintah di atas mengasumsikan program tidak menggunakan deklarasi `package`. Jika program menggunakan package atau struktur direktori yang berbeda, perintah kompilasi dan eksekusi perlu disesuaikan.

---

## 📝 Kesimpulan

Inheritance merupakan salah satu konsep penting dalam Object-Oriented Programming yang memungkinkan sebuah class mewarisi atribut dan method dari class lain.

Melalui materi dan contoh program pada pertemuan 8–9, kita mempelajari beberapa konsep utama:

1. **Inheritance** memungkinkan penggunaan kembali kode melalui hubungan pewarisan antarkelas.
2. **Superclass** merupakan kelas induk yang menyediakan fitur untuk diwariskan.
3. **Subclass** merupakan kelas turunan yang dapat menggunakan dan mengembangkan fitur superclass.
4. Keyword `extends` digunakan untuk menerapkan inheritance pada class Java.
5. **Single Inheritance** melibatkan satu superclass dan satu subclass.
6. **Multilevel Inheritance** membentuk hubungan pewarisan bertingkat.
7. **Hierarchical Inheritance** memungkinkan beberapa subclass mewarisi satu superclass.
8. **Multiple Inheritance** dapat dicapai melalui implementasi beberapa interface, bukan pewarisan langsung dari beberapa class.
9. **Hybrid Inheritance** merupakan kombinasi dari beberapa pola inheritance.
10. **Method Overriding** memungkinkan subclass menyediakan implementasi method yang berbeda dari superclass.

Dengan mempraktikkan setiap contoh dan mengerjakan quiz, mahasiswa diharapkan mampu memahami konsep inheritance serta mengimplementasikannya ke dalam project Java yang dikembangkan.

Pemahaman inheritance juga menjadi dasar penting untuk mempelajari materi OOP berikutnya, khususnya **Polymorphism**.

---

## 📖 Referensi

- Materi perkuliahan Object-Oriented Programming (OOP), **Week 8–9 — Inheritance (Basic & Case Study)**.
- Dokumentasi resmi Java: [Java Documentation](https://docs.oracle.com/en/java/).
- Dokumentasi resmi Java tentang Inheritance: [Inheritance - The Java Tutorials](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html).
- Dokumentasi resmi Java tentang Interface: [Interfaces - The Java Tutorials](https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html).

---

**Author:** Ilham Firmansyah

**Topic:** Object-Oriented Programming — Inheritance (Basic & Case Study)

**Language:** Java