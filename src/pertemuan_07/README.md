# Pertemuan 7 — Memory Management

Repository ini berisi materi pembelajaran **Object-Oriented Programming (OOP) menggunakan Java**, khususnya mengenai **Memory Management** atau pengelolaan memori.

Pada pertemuan ini, kita mempelajari bagaimana Java mengelola memori ketika program dijalankan, bagaimana method dipanggil, bagaimana variabel disimpan dalam *call frame*, serta bagaimana variabel referensi berhubungan dengan objek di memori.

Materi dilengkapi dengan beberapa contoh program Java untuk membantu memahami konsep melalui praktik langsung.

## 📚 Daftar Isi

- [Tujuan Pembelajaran](#-tujuan-pembelajaran)
- [Pengertian Memory Management](#-pengertian-memory-management)
- [1. Memory Allocation in Java](#1-memory-allocation-in-java)
- [2. Stack dan Heap](#2-stack-dan-heap)
- [3. Method dan Memory Management](#3-method-dan-memory-management)
- [4. Typical Calling Sequence](#4-typical-calling-sequence)
- [5. Call Frames dengan Simple Variables](#5-call-frames-dengan-simple-variables)
- [6. Call Frames dengan Reference Variables](#6-call-frames-dengan-reference-variables)
- [7. Memory Deallocation](#7-memory-deallocation)
- [Daftar File Program](#-daftar-file-program)
- [Penjelasan Setiap File Java](#-penjelasan-setiap-file-java)
- [Cara Menjalankan Program](#-cara-menjalankan-program)
- [Kesimpulan](#-kesimpulan)
- [Referensi](#-referensi)

---

## 🎯 Tujuan Pembelajaran

Setelah mempelajari materi ini, mahasiswa diharapkan mampu:

1. Memahami konsep dasar Memory Management dalam Java.
2. Mengetahui peran stack dan heap dalam pengelolaan memori.
3. Memahami proses pemanggilan method dalam program Java.
4. Memahami konsep *call frame* dan variabel lokal.
5. Membedakan variabel sederhana (*simple variables*) dengan variabel referensi (*reference variables*).
6. Memahami bagaimana objek dibuat dan diakses melalui variabel referensi.
7. Mengimplementasikan konsep Memory Management melalui program Java sederhana.

## 💡 Pengertian Memory Management

**Memory Management** adalah proses pengelolaan memori yang digunakan oleh program ketika dijalankan.

Ketika program Java dieksekusi, program membutuhkan memori untuk menyimpan berbagai informasi, seperti:

- Variabel yang digunakan oleh method.
- Parameter yang diterima oleh method.
- Informasi pemanggilan method.
- Objek yang dibuat selama program berjalan.
- Data yang diperlukan selama proses eksekusi.

Pengelolaan memori penting karena setiap variabel dan objek memiliki peran selama program dijalankan.

Sebagai contoh, perhatikan program berikut:

```java
public class MemoryExample {
    public static void main(String[] args) {
        int angka = 10;

        System.out.println(angka);
    }
}
```

Pada program tersebut, variabel `angka` menyimpan nilai `10`. Java perlu menyediakan tempat untuk menyimpan nilai tersebut selama variabel digunakan.

Ketika program menjalankan method, Java juga perlu mengelola informasi mengenai method tersebut, termasuk parameter dan variabel lokalnya.

Untuk memahami proses tersebut, kita perlu mengenal konsep **stack, heap, calling sequence, dan call frame**.

---

## 1. Memory Allocation in Java

**Memory allocation** adalah proses penyediaan ruang memori yang diperlukan oleh program.

Ketika program Java berjalan, JVM (*Java Virtual Machine*) mengelola beberapa area memori dengan fungsi yang berbeda.

Dua area yang penting untuk memahami materi ini adalah:

1. **Stack** — berkaitan dengan pemanggilan method dan penyimpanan variabel lokal.
2. **Heap** — digunakan untuk menyimpan objek dan array yang dibuat selama program berjalan.

Pembagian tersebut merupakan gambaran konseptual untuk memahami pengelolaan memori Java. Detail implementasi dapat bergantung pada JVM yang digunakan.

Contoh:

```java
public class AllocationExample {
    public static void main(String[] args) {
        int umur = 20;

        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.nama = "Ilham";

        System.out.println(umur);
        System.out.println(mahasiswa.nama);
    }
}

class Mahasiswa {
    String nama;
}
```

Penjelasan:

- `umur` merupakan variabel lokal bertipe primitif `int`.
- `mahasiswa` merupakan variabel referensi yang menunjuk ke objek `Mahasiswa`.
- `new Mahasiswa()` membuat sebuah objek `Mahasiswa`.
- Objek tersebut memiliki atribut `nama`.

Dalam gambaran umum pengelolaan memori Java, variabel lokal dan referensinya berkaitan dengan *stack frame*, sedangkan objek yang dibuat menggunakan `new` berada di heap.

**Hal yang perlu dipahami:** variabel referensi dan objek yang dirujuknya merupakan dua hal berbeda. Variabel referensi digunakan untuk mengakses objek, bukan menjadi objek itu sendiri.

---

## 2. Stack dan Heap

Stack dan heap memiliki fungsi berbeda dalam pengelolaan memori.

### A. Stack

Stack berkaitan dengan proses pemanggilan method.

Ketika sebuah method dipanggil, JVM menggunakan *stack frame* untuk mengelola informasi pemanggilan tersebut.

Informasi yang berkaitan dengan sebuah pemanggilan method dapat mencakup:

- Parameter method.
- Variabel lokal.
- Informasi yang dibutuhkan untuk melanjutkan eksekusi setelah method selesai.

Setiap pemanggilan method memiliki konteks eksekusinya sendiri.

Contoh:

```java
public class StackExample {
    public static void main(String[] args) {
        int angka = 10;

        tampilkanAngka();

        System.out.println("Angka di main: " + angka);
    }

    static void tampilkanAngka() {
        int angka = 50;

        System.out.println("Angka di tampilkanAngka: " + angka);
    }
}
```

Output:

```text
Angka di tampilkanAngka: 50
Angka di main: 10
```

Penjelasan:

Method `main()` memiliki variabel lokal `angka` dengan nilai `10`.

Ketika `tampilkanAngka()` dipanggil, method tersebut memiliki variabel lokal `angka` sendiri dengan nilai `50`.

Walaupun nama variabelnya sama, keduanya merupakan variabel lokal yang berbeda karena berada dalam method yang berbeda.

### B. Heap

Heap digunakan untuk menyimpan objek dan array yang dibuat selama program berjalan.

Contoh:

```java
public class HeapExample {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.nama = "Ilham";

        System.out.println(mahasiswa.nama);
    }
}

class Mahasiswa {
    String nama;
}
```

Output:

```text
Ilham
```

Penjelasan:

- `new Mahasiswa()` membuat objek `Mahasiswa`.
- Variabel `mahasiswa` digunakan untuk merujuk ke objek tersebut.
- Atribut `nama` menyimpan informasi nama mahasiswa.

Secara konseptual, objek `Mahasiswa` berada di heap, sedangkan variabel lokal `mahasiswa` menyimpan referensi yang memungkinkan program mengakses objek tersebut.

### C. Perbedaan Stack dan Heap

| Aspek | Stack | Heap |
|---|---|---|
| Fungsi utama | Mengelola konteks pemanggilan method | Menyimpan objek dan array |
| Contoh informasi | Parameter dan variabel lokal | Objek `Mahasiswa` dan array |
| Pengelolaan | Berkaitan dengan pemanggilan dan penyelesaian method | Objek yang tidak lagi dapat dijangkau dapat dibersihkan oleh garbage collector |
| Contoh dalam kode | Variabel lokal `int angka` | Objek yang dibuat dengan `new Mahasiswa()` |

Tabel tersebut merupakan penyederhanaan konseptual untuk pembelajaran. Detail penempatan dan optimasi memori ditentukan oleh implementasi JVM.

---

## 3. Method dan Memory Management

Method adalah bagian dari program yang berisi sekumpulan pernyataan untuk menjalankan tugas tertentu.

Ketika sebuah method dipanggil, program berpindah untuk menjalankan perintah di dalam method tersebut.

Setelah method selesai, eksekusi dapat kembali ke bagian program yang memanggilnya.

Contoh:

```java
public class MethodExample {
    public static void main(String[] args) {
        System.out.println("Program dimulai");

        sapa();

        System.out.println("Program selesai");
    }

    static void sapa() {
        System.out.println("Halo, mahasiswa!");
    }
}
```

Output:

```text
Program dimulai
Halo, mahasiswa!
Program selesai
```

Urutan prosesnya adalah:

1. Program menjalankan method `main()`.
2. Program mencetak `Program dimulai`.
3. Method `sapa()` dipanggil.
4. Method `sapa()` mencetak `Halo, mahasiswa!`.
5. Method `sapa()` selesai.
6. Eksekusi kembali ke `main()`.
7. Program mencetak `Program selesai`.

Proses tersebut berhubungan dengan pengelolaan memori karena setiap pemanggilan method membutuhkan konteks eksekusi.

---

## 4. Typical Calling Sequence

**Typical Calling Sequence** adalah urutan proses yang terjadi ketika suatu method dipanggil dan dijalankan sampai kontrol program kembali ke method pemanggilnya.

Dalam contoh sederhana, urutannya dapat digambarkan sebagai berikut:

```text
main()
  |
  |-- memanggil methodPertama()
          |
          |-- memanggil methodKedua()
          |
          |-- methodKedua() selesai
  |
  |-- methodPertama() selesai
  |
main() selesai
```

Contoh program:

```java
public class CallingSequence {
    public static void main(String[] args) {
        System.out.println("1. Program dimulai");

        methodPertama();

        System.out.println("4. Program selesai");
    }

    static void methodPertama() {
        System.out.println("2. Method pertama dijalankan");

        methodKedua();

        System.out.println("3. Method pertama selesai");
    }

    static void methodKedua() {
        System.out.println("Method kedua dijalankan");
    }
}
```

Output:

```text
1. Program dimulai
2. Method pertama dijalankan
Method kedua dijalankan
3. Method pertama selesai
4. Program selesai
```

### Penjelasan

**1. `main()` mulai dijalankan**

Program Java memulai eksekusi dari method `main()`.

**2. `methodPertama()` dipanggil**

Program menjalankan perintah yang terdapat dalam `methodPertama()`.

**3. `methodKedua()` dipanggil**

Sebelum `methodPertama()` selesai, method tersebut memanggil `methodKedua()`.

Program menjalankan `methodKedua()` terlebih dahulu.

**4. Eksekusi kembali ke `methodPertama()`**

Setelah `methodKedua()` selesai, program melanjutkan perintah berikutnya dalam `methodPertama()`.

**5. Eksekusi kembali ke `main()`**

Setelah `methodPertama()` selesai, program melanjutkan perintah berikutnya dalam `main()`.

Urutan ini menunjukkan bahwa pemanggilan method tidak berjalan secara acak. Program mengikuti urutan pemanggilan dan penyelesaian method.

---

## 5. Call Frames dengan Simple Variables

**Call frame** adalah konteks yang digunakan untuk mengelola sebuah pemanggilan method.

Salah satu informasi yang berkaitan dengan call frame adalah variabel lokal milik method tersebut.

Variabel lokal adalah variabel yang dideklarasikan di dalam method dan hanya dapat diakses dalam cakupan tempat variabel tersebut dideklarasikan.

Contoh:

```java
public class CallFrameVariables {
    public static void main(String[] args) {
        int angka = 10;

        System.out.println("Nilai di main: " + angka);

        hitung();

        System.out.println("Nilai di main setelah hitung(): " + angka);
    }

    static void hitung() {
        int angka = 50;

        System.out.println("Nilai di hitung: " + angka);
    }
}
```

Output:

```text
Nilai di main: 10
Nilai di hitung: 50
Nilai di main setelah hitung(): 10
```

### Mengapa nilainya berbeda?

Method `main()` memiliki variabel lokal:

```java
int angka = 10;
```

Sementara itu, method `hitung()` memiliki variabel lokal lain:

```java
int angka = 50;
```

Walaupun namanya sama, keduanya tidak saling menggantikan.

Variabel `angka` di dalam `hitung()` hanya digunakan dalam method tersebut. Ketika `hitung()` selesai, variabel lokal itu tidak lagi dapat diakses melalui method tersebut.

Variabel `angka` di dalam `main()` tetap bernilai `10`.

### Konsep penting

- Setiap pemanggilan method memiliki konteks eksekusinya sendiri.
- Variabel lokal terikat pada cakupan tempat variabel tersebut dideklarasikan.
- Variabel dengan nama yang sama di method berbeda tidak otomatis menjadi variabel yang sama.
- Ketika method selesai, konteks pemanggilannya tidak lagi diperlukan untuk melanjutkan eksekusi normal.

---

## 6. Call Frames dengan Reference Variables

Selain variabel primitif, method Java juga dapat menggunakan variabel referensi.

**Variabel referensi** digunakan untuk merujuk ke objek.

Contohnya:

```java
Mahasiswa mahasiswa = new Mahasiswa("Ilham");
```

Pada kode tersebut:

- `Mahasiswa` adalah tipe data kelas.
- `mahasiswa` adalah variabel referensi.
- `new Mahasiswa("Ilham")` membuat objek baru.
- Objek tersebut memiliki atribut `nama` yang bernilai `"Ilham"`.

Untuk memahami variabel referensi, kita perlu membedakan dua hal:

1. Menyalin nilai variabel primitif.
2. Menyalin referensi yang menunjuk ke objek.

### A. Menyalin Nilai Variabel Primitif

Contoh:

```java
int angka1 = 10;
int angka2 = angka1;

angka2 = 20;

System.out.println("Angka 1: " + angka1);
System.out.println("Angka 2: " + angka2);
```

Output:

```text
Angka 1: 10
Angka 2: 20
```

Penjelasan:

Ketika `angka2 = angka1` dijalankan, nilai `10` disalin ke `angka2`.

Ketika `angka2` diubah menjadi `20`, nilai `angka1` tetap `10`.

Kedua variabel tersebut menyimpan nilai masing-masing.

### B. Menyalin Variabel Referensi

Contoh:

```java
Mahasiswa mhs1 = new Mahasiswa("Ilham");
Mahasiswa mhs2 = mhs1;

mhs2.nama = "Budi";

System.out.println(mhs1.nama);
System.out.println(mhs2.nama);
```

Jika kelas `Mahasiswa` memiliki atribut `nama` dan konstruktor yang sesuai, outputnya adalah:

```text
Budi
Budi
```

Penjelasan:

Pada baris berikut:

```java
Mahasiswa mhs2 = mhs1;
```

Referensi yang disimpan di `mhs1` disalin ke `mhs2`.

Akibatnya, kedua variabel merujuk ke objek yang sama.

Ketika program menjalankan:

```java
mhs2.nama = "Budi";
```

Atribut `nama` pada objek yang dirujuk tersebut berubah menjadi `"Budi"`.

Karena `mhs1` dan `mhs2` merujuk ke objek yang sama, perubahan tersebut terlihat melalui kedua variabel.

**Penting:** yang disalin adalah nilai referensinya, bukan objeknya.

### C. Ketika Referensi Diubah ke Objek Lain

Perhatikan contoh berikut:

```java
Mahasiswa mhs1 = new Mahasiswa("Ilham");
Mahasiswa mhs2 = mhs1;

mhs2 = new Mahasiswa("Budi");

System.out.println(mhs1.nama);
System.out.println(mhs2.nama);
```

Output:

```text
Ilham
Budi
```

Penjelasan:

Pada awalnya, `mhs1` dan `mhs2` merujuk ke objek yang sama.

Namun, ketika baris berikut dijalankan:

```java
mhs2 = new Mahasiswa("Budi");
```

Variabel `mhs2` mulai merujuk ke objek baru.

Variabel `mhs1` tetap merujuk ke objek sebelumnya yang memiliki nama `"Ilham"`.

Jadi, perubahan referensi `mhs2` tidak membuat `mhs1` ikut menunjuk ke objek baru.

### D. Java Menggunakan Pass-by-Value

Java menggunakan mekanisme **pass-by-value**, yaitu nilai argumen disalin ketika diberikan kepada parameter method.

- Untuk variabel primitif, nilai primitifnya yang disalin.
- Untuk objek, nilai referensinya yang disalin.

Karena itu, sebuah method dapat mengubah atribut objek melalui referensi yang diterimanya. Namun, mengubah parameter referensi agar menunjuk ke objek lain tidak otomatis mengubah variabel referensi milik pemanggil.

Konsep ini membantu menjelaskan hubungan antara method, call frame, dan objek dalam memori.

---

## 7. Memory Deallocation

**Memory deallocation** adalah proses pembebasan memori yang sudah tidak diperlukan.

Dalam Java, pengelolaan memori objek umumnya dibantu oleh **Garbage Collector (GC)**.

Garbage Collector dapat membersihkan objek yang sudah tidak dapat dijangkau (*unreachable*) oleh program.

Contoh:

```java
public class GarbageCollectionExample {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.nama = "Ilham";

        System.out.println(mahasiswa.nama);

        mahasiswa = null;

        System.out.println("Referensi mahasiswa sudah diubah menjadi null");
    }
}

class Mahasiswa {
    String nama;
}
```

Output:

```text
Ilham
Referensi mahasiswa sudah diubah menjadi null
```

Penjelasan:

Pada awal program, variabel `mahasiswa` merujuk ke objek `Mahasiswa`.

Setelah baris berikut dijalankan:

```java
mahasiswa = null;
```

Variabel tersebut tidak lagi merujuk ke objek sebelumnya.

Jika tidak ada referensi lain yang masih dapat menjangkau objek tersebut, objek itu menjadi kandidat untuk dibersihkan oleh Garbage Collector.

Namun, **`mahasiswa = null` tidak secara langsung menghapus objek dari memori**. Waktu pembersihan oleh Garbage Collector tidak dapat dipastikan hanya berdasarkan baris tersebut.

Java mengelola proses pembersihan objek secara otomatis sehingga programmer umumnya tidak perlu membebaskan memori objek secara manual seperti pada beberapa bahasa pemrograman lain.

---

## 📂 Daftar File Program

Semua contoh program pertemuan ini disimpan di folder `contoh/`.

```text
pertemuan_07/
├── contoh/
│   ├── MemoryManagementDemo.java
│   ├── Person.java
│   ├── CallingSequence.java
│   ├── CallFrameVariables.java
│   ├── ReferenceDemo.java
│   ├── ReferenceChangeDemo.java
│   └── ReturnValueDemo.java
└── README.md
```

### Ringkasan File

| No. | Nama File | Materi Utama |
|---|---|---|
| 1 | `MemoryManagementDemo.java` | Contoh utama yang menggabungkan beberapa konsep Memory Management |
| 2 | `Person.java` | Class untuk merepresentasikan objek orang dengan atribut nama dan umur |
| 3 | `CallingSequence.java` | Urutan pemanggilan dan penyelesaian method |
| 4 | `CallFrameVariables.java` | Variabel lokal pada method yang berbeda |
| 5 | `ReferenceDemo.java` | Perbedaan penyalinan nilai primitif dan penyalinan referensi |
| 6 | `ReferenceChangeDemo.java` | Perubahan referensi agar menunjuk ke objek lain |
| 7 | `ReturnValueDemo.java` | Pemanggilan method yang mengembalikan nilai |

**Catatan:** `MemoryManagementDemo.java` dan `Person.java` merupakan contoh utama yang kita susun untuk mempraktikkan konsep materi. File lainnya merupakan contoh tambahan untuk memperjelas konsep melalui program-program yang lebih kecil.

---

## 🧩 Penjelasan Setiap File Java

### 1. `MemoryManagementDemo.java`

File ini merupakan contoh utama yang menggabungkan beberapa konsep dalam satu program.

Materi yang dipraktikkan:

- Typical Calling Sequence melalui pemanggilan `addNumbers()`.
- Call Frames dengan Simple Variables melalui method `simpleVariables()`.
- Call Frames dengan Reference Variables melalui method `referenceVariables()`.
- Pembuatan objek `Person`.
- Pembuatan array dan pembacaan elemen-elemennya.

Method utama dalam file ini:

| Method | Fungsi |
|---|---|
| `main()` | Menjalankan semua contoh secara berurutan |
| `addNumbers(int a, int b)` | Menjumlahkan dua angka dan mengembalikan hasilnya |
| `simpleVariables()` | Menampilkan contoh penggunaan variabel lokal |
| `referenceVariables()` | Menampilkan contoh penggunaan array dan objek `Person` |

File ini cocok digunakan pertama kali karena beberapa konsep dapat diamati dalam satu program.

### 2. `Person.java`

File ini berisi class `Person` yang digunakan untuk membuat objek orang.

Atributnya:

```java
String name;
int age;
```

Atribut `name` menyimpan nama, sedangkan `age` menyimpan umur.

Class ini juga memiliki konstruktor:

```java
Person(String name, int age) {
    this.name = name;
    this.age = age;
}
```

Konstruktor tersebut digunakan untuk memberikan nilai awal ketika objek dibuat.

Method `toString()` digunakan untuk menghasilkan representasi teks objek, sehingga objek dapat ditampilkan dengan lebih mudah.

Contoh penggunaan:

```java
Person person = new Person("Dina", 22);

System.out.println(person);
```

Output:

```text
Person{name='Dina', age=22}
```

File `Person.java` mendukung `MemoryManagementDemo.java`, sehingga keduanya perlu tersedia dalam folder yang sama ketika dikompilasi bersama.

### 3. `CallingSequence.java`

File ini menunjukkan urutan pemanggilan method secara bertingkat.

Method `main()` memanggil `methodPertama()`, lalu `methodPertama()` memanggil `methodKedua()`.

Program menunjukkan bahwa method yang dipanggil harus menyelesaikan eksekusinya terlebih dahulu sebelum program melanjutkan perintah setelah pemanggilan tersebut.

File ini membantu memahami **Typical Calling Sequence** dengan contoh yang sederhana.

### 4. `CallFrameVariables.java`

File ini menunjukkan bahwa method yang berbeda dapat memiliki variabel lokal dengan nama yang sama.

Method `main()` mempunyai variabel `angka` bernilai `10`, sedangkan method `hitung()` mempunyai variabel `angka` bernilai `50`.

Ketika `hitung()` selesai, nilai variabel lokal `angka` di `main()` tetap `10`.

File ini membantu memahami hubungan antara variabel lokal, cakupan variabel, dan konteks pemanggilan method.

### 5. `ReferenceDemo.java`

File ini menunjukkan perbedaan antara variabel primitif dan variabel referensi.

Bagian pertama memperlihatkan bahwa menyalin nilai primitif tidak membuat kedua variabel menjadi satu variabel yang sama.

Bagian kedua memperlihatkan bahwa dua variabel referensi dapat menunjuk ke objek yang sama.

Program mengubah nama objek melalui `mhs2`, lalu menampilkan nama melalui `mhs1` dan `mhs2`.

Keduanya menampilkan nama yang sama karena masih merujuk ke objek yang sama.

File ini juga menggunakan class `Mahasiswa` sederhana yang didefinisikan di dalam file yang sama, sehingga tidak membutuhkan file `Mahasiswa.java` tambahan.

### 6. `ReferenceChangeDemo.java`

File ini melanjutkan contoh variabel referensi.

Pada awalnya, `mhs1` dan `mhs2` menunjuk ke objek yang sama.

Kemudian, `mhs2` diberikan objek baru melalui:

```java
mhs2 = new Mahasiswa("Budi");
```

Setelah itu, `mhs1` masih merujuk ke objek lama, sedangkan `mhs2` merujuk ke objek baru.

File ini membantu memahami bahwa **mengubah referensi agar menunjuk ke objek lain berbeda dengan mengubah atribut objek yang sama**.

### 7. `ReturnValueDemo.java`

File ini menunjukkan proses pemanggilan method yang menghasilkan nilai balik (*return value*).

Method `kuadrat()` menerima sebuah bilangan, menghitung kuadratnya, kemudian mengembalikan hasil melalui `return`.

Contoh pemanggilan:

```java
int hasil = kuadrat(5);
```

Nilai `25` yang dikembalikan oleh `kuadrat()` disimpan ke variabel `hasil`.

Program ini membantu memahami bahwa method dapat menyelesaikan tugasnya dan mengembalikan hasil kepada method pemanggil.

Contoh ini merupakan materi pendukung untuk memahami alur pemanggilan method dan pengembalian nilai.

---

## ▶️ Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terpasang dan perintah `java` serta `javac` dapat dijalankan melalui terminal.

Periksa instalasi Java:

```bash
java -version
```

Periksa compiler Java:

```bash
javac -version
```

### A. Menjalankan `CallingSequence.java`

Masuk ke folder `contoh`:

```bash
cd src/pertemuan_07/contoh
```

Kompilasi:

```bash
javac CallingSequence.java
```

Jalankan:

```bash
java CallingSequence
```

### B. Menjalankan `CallFrameVariables.java`

```bash
javac CallFrameVariables.java
java CallFrameVariables
```

### C. Menjalankan `ReferenceDemo.java`

```bash
javac ReferenceDemo.java
java ReferenceDemo
```

### D. Menjalankan `ReferenceChangeDemo.java`

```bash
javac ReferenceChangeDemo.java
java ReferenceChangeDemo
```

### E. Menjalankan `ReturnValueDemo.java`

```bash
javac ReturnValueDemo.java
java ReturnValueDemo
```

### F. Menjalankan `MemoryManagementDemo.java`

Karena `MemoryManagementDemo.java` menggunakan class `Person`, kedua file perlu dikompilasi:

```bash
javac Person.java MemoryManagementDemo.java
```

Kemudian jalankan:

```bash
java MemoryManagementDemo
```

**Catatan:** perintah di atas mengasumsikan file berada di folder `src/pertemuan_07/contoh/` dan tidak menggunakan deklarasi `package`. Jika struktur folder atau deklarasi package berbeda, perintah perlu disesuaikan.

---

## 📝 Kesimpulan

Memory Management merupakan bagian penting dalam memahami bagaimana program Java berjalan dan menggunakan memori.

Melalui materi dan contoh program pada pertemuan ini, kita mempelajari beberapa konsep utama:

1. **Stack dan Heap** memiliki peran berbeda dalam pengelolaan memori.
2. **Typical Calling Sequence** menjelaskan urutan pemanggilan dan penyelesaian method.
3. **Call Frame** berkaitan dengan konteks setiap pemanggilan method.
4. **Simple Variables** menunjukkan bagaimana variabel lokal digunakan dalam method.
5. **Reference Variables** digunakan untuk merujuk ke objek.
6. Menyalin variabel referensi tidak otomatis membuat objek baru.
7. **Garbage Collector** membantu membersihkan objek yang tidak lagi dapat dijangkau oleh program.
8. Method dapat mengembalikan nilai kepada pemanggilnya menggunakan `return`.

Dengan mencoba setiap file Java, mahasiswa dapat melihat bagaimana konsep-konsep tersebut bekerja dalam program sederhana.

Pemahaman ini juga menjadi dasar untuk mempelajari materi OOP berikutnya, seperti inheritance dan polymorphism.

---

## 📖 Referensi

- Materi perkuliahan Object-Oriented Programming (OOP), **Week 7 — Memory Management**.
- Dokumentasi resmi Java: [Java Documentation](https://docs.oracle.com/en/java/).
- Dokumentasi resmi Garbage Collector: [Java Garbage Collection Basics](https://docs.oracle.com/en/java/javase/).

---

**Author:** Ilham Firmansyah

**Topic:** Object-Oriented Programming — Memory Management

**Language:** Java