# Pertemuan 02 — Data Type, Variable, Method and Expression

## 📚 Deskripsi

Pada pertemuan kedua, pembelajaran Java dilanjutkan dengan mempelajari beberapa konsep dasar yang sering digunakan dalam pembuatan program, yaitu:

- Tipe Data
- Variabel
- Method
- Statement
- Expression
- Operator
- Input dan Output sederhana
- Math Method

Materi ini menjadi dasar untuk memahami bagaimana data disimpan, diproses, dan digunakan dalam sebuah program Java.

---

## 🎯 Tujuan Pembelajaran

Setelah mempelajari materi ini, mahasiswa diharapkan mampu:

- Mengetahui tipe data, variabel, method, dan ekspresi.
- Menggunakan tipe data dalam program Java.
- Membuat dan menggunakan variabel.
- Memahami method dalam Java.
- Menggunakan ekspresi dan operator.
- Menggunakan method dari class `Math`.
- Membuat program sederhana dengan menggabungkan konsep-konsep tersebut.

---

# 1. Tipe Data

**Tipe data** merupakan klasifikasi nilai yang digunakan oleh program untuk menentukan jenis data yang dapat disimpan dan bagaimana data tersebut diproses.

Beberapa tipe data dasar pada Java:

| Tipe Data | Ukuran | Contoh |
|---|---:|---|
| `boolean` | 1 bit* | `true` / `false` |
| `char` | 2 byte | `'A'` |
| `byte` | 1 byte | `100` |
| `short` | 2 byte | `1000` |
| `int` | 4 byte | `100000` |
| `long` | 8 byte | `100000L` |
| `float` | 4 byte | `3.14f` |
| `double` | 8 byte | `3.14` |

> *Ukuran `boolean` tidak ditetapkan secara sederhana sebagai ukuran penyimpanan JVM yang universal. Tabel di atas digunakan sebagai pengenalan tipe data.

Contoh:

```java
int umur = 20;
double tinggi = 170.5;
char jenisKelamin = 'L';
boolean mahasiswa = true;
```

---

# 2. Variabel

**Variabel** merupakan tempat untuk menyimpan sebuah nilai yang dapat digunakan dan diubah selama program berjalan.

Bentuk dasar deklarasi variabel:

```java
tipeData namaVariabel = nilai;
```

Contoh:

```java
int umur = 20;
String nama = "Ilham";
double nilai = 85.5;
```

Pada contoh:

```java
int umur = 20;
```

- `int` → tipe data
- `umur` → nama variabel
- `20` → nilai yang disimpan

---

## 2.1 Aturan Penamaan Variabel

Beberapa aturan dasar penamaan variabel Java:

- Karakter pertama harus berupa huruf, `_`, atau `$`.
- Karakter berikutnya dapat berupa huruf, angka, `_`, atau `$`.
- Tidak boleh menggunakan spasi.
- Tidak boleh diawali dengan angka.
- Java bersifat **case-sensitive**.
- Tidak boleh menggunakan Java keyword sebagai nama variabel.

### Contoh benar

```java
String nama;
int umur;
double nilaiAkhir;
String _alamat;
int alamat2;
```

### Contoh salah

```java
String nama mahasiswa; // Mengandung spasi
int 2alamat;           // Diawali angka
String alamat-alamat;  // Menggunakan tanda -
```

---

# 3. Assignment / Penugasan Variabel

Pemberian nilai kepada variabel disebut assignment.

Contoh:

```java
int angka;

angka = 100;
```

Atau dapat langsung dilakukan ketika deklarasi:

```java
int angka = 100;
```

Nilai variabel juga dapat diubah:

```java
int angka = 100;

angka = 200;

System.out.println(angka);
```

Output:

```text
200
```

---

# 4. Method

**Method** merupakan blok program yang digunakan untuk melakukan tugas tertentu.

Method membantu kita membagi program menjadi bagian-bagian yang lebih terorganisir.

Contoh:

```java
static void salam() {
    System.out.println("Halo, Java!");
}
```

Method tersebut dapat dipanggil:

```java
salam();
```

Contoh lengkap:

```java
public class MethodExample {

    static void salam() {
        System.out.println("Halo, Java!");
    }

    public static void main(String[] args) {

        salam();

    }
}
```

Output:

```text
Halo, Java!
```

---

# 5. Method dengan Parameter

Method juga dapat menerima data melalui parameter.

Contoh:

```java
static void tampilkanNama(String nama) {
    System.out.println("Nama saya " + nama);
}
```

Pemanggilan:

```java
tampilkanNama("Ilham");
```

Output:

```text
Nama saya Ilham
```

Parameter:

```java
String nama
```

merupakan data yang diterima oleh method.

---

# 6. Method dengan Return Value

Method juga dapat mengembalikan sebuah nilai.

Contoh:

```java
static int tambah(int a, int b) {

    return a + b;

}
```

Method tersebut mengembalikan hasil berupa `int`.

Pemanggilan:

```java
int hasil = tambah(10, 5);

System.out.println(hasil);
```

Output:

```text
15
```

Struktur sederhananya:

```text
Input
  ↓
Method
  ↓
Proses
  ↓
Return
  ↓
Hasil
```

---

# 7. Method `main()`

Program Java mulai dieksekusi melalui method:

```java
public static void main(String[] args)
```

Contoh:

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Program dimulai.");

    }
}
```

Method `main()` menjadi titik awal eksekusi aplikasi Java.

---

# 8. Statement

**Statement** merupakan instruksi yang digunakan untuk melakukan suatu operasi.

Pada Java, statement umumnya diakhiri dengan tanda titik koma:

```java
;
```

Contoh:

```java
int umur = 20;
System.out.println(umur);
```

Kedua baris tersebut merupakan statement.

---

# 9. Output pada Java

Java menyediakan beberapa cara untuk menampilkan informasi ke console.

## `System.out.println()`

Menampilkan teks kemudian berpindah ke baris berikutnya.

```java
System.out.println("Hello");
System.out.println("Java");
```

Output:

```text
Hello
Java
```

---

## `System.out.print()`

Menampilkan teks tanpa berpindah ke baris berikutnya.

```java
System.out.print("Hello ");
System.out.print("Java");
```

Output:

```text
Hello Java
```

---

## `System.out.printf()`

Digunakan untuk menampilkan teks dengan format tertentu.

```java
String nama = "Ilham";
int umur = 20;

System.out.printf("Nama: %s, Umur: %d%n", nama, umur);
```

Output:

```text
Nama: Ilham, Umur: 20
```

Beberapa format yang umum:

| Format | Penggunaan |
|---|---|
| `%d` | Bilangan bulat |
| `%f` | Bilangan pecahan |
| `%c` | Karakter |
| `%s` | String |
| `%b` | Boolean |
| `%n` | Baris baru |

---

# 10. Comment

Comment digunakan untuk memberikan penjelasan pada source code dan tidak dieksekusi oleh program.

## Single-line Comment

Menggunakan:

```java
//
```

Contoh:

```java
// Menampilkan nama
System.out.println("Ilham");
```

## Multi-line Comment

Menggunakan:

```java
/*
   Isi komentar
*/
```

Contoh:

```java
/*
    Program sederhana
    untuk menampilkan data mahasiswa.
*/
```

Comment sangat berguna agar source code lebih mudah dipahami.

---

# 11. Escape Sequence

Escape sequence digunakan untuk menghasilkan karakter khusus dalam String.

Beberapa escape sequence yang umum digunakan:

| Escape Sequence | Fungsi |
|---|---|
| `\n` | New line |
| `\t` | Tab |
| `\\` | Backslash |
| `\"` | Double quote |
| `\b` | Backspace |
| `\f` | Form feed |

Contoh:

```java
System.out.println("Nama:\tIlham");
System.out.println("Java\nProgramming");
```

Output:

```text
Nama:   Ilham
Java
Programming
```

---

# 12. Separator

Separator digunakan untuk memisahkan bagian-bagian tertentu dalam program Java.

Beberapa separator yang sering digunakan:

```text
()
{}
[]
;
,
.
```

Contoh:

### `()`

Digunakan pada parameter method atau operasi.

```java
System.out.println("Hello");
```

### `{}`

Digunakan untuk membuat blok program.

```java
public class Main {

}
```

### `[]`

Digunakan pada array.

```java
int[] angka;
```

### `;`

Digunakan untuk mengakhiri statement.

```java
int umur = 20;
```

### `,`

Digunakan untuk memisahkan beberapa nilai atau variabel.

```java
int a = 10, b = 20;
```

### `.`

Digunakan untuk mengakses member atau method dari object/class.

```java
System.out.println();
Math.sqrt(25);
```

---

# 13. Ekspresi, Operator, dan Operand

**Ekspresi** merupakan bentuk penulisan yang menghasilkan suatu nilai.

Ekspresi dapat terdiri dari:

- Nilai
- Variabel
- Operator
- Method

Contoh:

```java
5 + 7
```

Pada ekspresi tersebut:

```text
5 dan 7 → Operand
+       → Operator
5 + 7   → Ekspresi
```

Contoh lainnya:

```java
int hasil = 10 + 5;
```

Ekspresi:

```java
10 + 5
```

menghasilkan:

```text
15
```

kemudian hasil tersebut disimpan ke variabel `hasil`.

---

# 14. Arithmetic Operator

Operator aritmatika digunakan untuk melakukan operasi matematika.

| Operator | Operasi | Contoh |
|---|---|---|
| `+` | Penjumlahan | `5 + 3` |
| `-` | Pengurangan | `5 - 3` |
| `*` | Perkalian | `5 * 3` |
| `/` | Pembagian | `10 / 2` |
| `%` | Modulus / sisa bagi | `10 % 3` |

Contoh:

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

Output:

```text
13
7
30
3
1
```

> Perhatikan bahwa `10 / 3` dengan kedua operand bertipe `int` menghasilkan `3`, bukan `3.333...`. Jika ingin hasil pecahan, gunakan tipe pecahan seperti `double`.

---

# 15. Assignment Operator

Assignment operator digunakan untuk memberikan atau mengubah nilai variabel.

| Operator | Contoh | Arti |
|---|---|---|
| `=` | `x = 10` | Memberikan nilai |
| `+=` | `x += 5` | `x = x + 5` |
| `-=` | `x -= 5` | `x = x - 5` |
| `*=` | `x *= 5` | `x = x * 5` |
| `/=` | `x /= 5` | `x = x / 5` |
| `%=` | `x %= 5` | `x = x % 5` |

Contoh:

```java
int x = 10;

x += 5;

System.out.println(x);
```

Output:

```text
15
```

---

# 16. Comparison Operator

Comparison operator digunakan untuk membandingkan dua nilai.

Hasil perbandingan berupa:

```text
true
```

atau:

```text
false
```

| Operator | Arti |
|---|---|
| `==` | Sama dengan |
| `!=` | Tidak sama dengan |
| `<` | Kurang dari |
| `>` | Lebih dari |
| `<=` | Kurang dari atau sama dengan |
| `>=` | Lebih dari atau sama dengan |

Contoh:

```java
int a = 10;
int b = 5;

System.out.println(a > b);
System.out.println(a == b);
System.out.println(a != b);
```

Output:

```text
true
false
true
```

---

# 17. Logical Operator

Logical operator digunakan untuk menggabungkan kondisi.

| Operator | Nama | Keterangan |
|---|---|---|
| `&&` | AND | True jika kedua kondisi true |
| `||` | OR | True jika salah satu kondisi true |
| `!` | NOT | Membalik nilai boolean |
| `^` | XOR | True jika hanya salah satu kondisi true |

Contoh:

```java
int umur = 20;
boolean mahasiswa = true;

System.out.println(umur >= 18 && mahasiswa);
```

Output:

```text
true
```

---

# 18. Math Method

Java menyediakan class `Math` yang memiliki berbagai method untuk operasi matematika.

Contoh:

```java
Math.abs()
Math.ceil()
Math.round()
Math.sqrt()
Math.pow()
Math.sin()
```

## `Math.abs()`

Menghasilkan nilai absolut.

```java
int angka = -10;

System.out.println(Math.abs(angka));
```

Output:

```text
10
```

---

## `Math.ceil()`

Membulatkan nilai ke atas.

```java
double angka = 5.2;

System.out.println(Math.ceil(angka));
```

Output:

```text
6.0
```

---

## `Math.round()`

Membulatkan ke bilangan terdekat.

```java
double angka = 5.6;

System.out.println(Math.round(angka));
```

Output:

```text
6
```

---

## `Math.sqrt()`

Menghitung akar kuadrat.

```java
double hasil = Math.sqrt(25);

System.out.println(hasil);
```

Output:

```text
5.0
```

---

## `Math.pow()`

Menghitung perpangkatan.

```java
double hasil = Math.pow(2, 3);

System.out.println(hasil);
```

Output:

```text
8.0
```

---

# 19. Contoh Program

Berikut contoh program yang menggabungkan tipe data, variabel, method, ekspresi, operator, dan `Math`.

```java
public class MathMethod {

    static double hitungLuasLingkaran(double jariJari) {

        return Math.PI * Math.pow(jariJari, 2);

    }

    public static void main(String[] args) {

        double jariJari = 7;

        double luas = hitungLuasLingkaran(jariJari);

        System.out.println("Jari-jari : " + jariJari);
        System.out.println("Luas      : " + luas);

    }
}
```

Output:

```text
Jari-jari : 7.0
Luas      : 153.93804002589985
```

Pada program tersebut terdapat:

```text
double
   ↓
Tipe data

jariJari
   ↓
Variabel

hitungLuasLingkaran()
   ↓
Method

Math.PI
Math.pow()
   ↓
Math Method

Math.PI * Math.pow(jariJari, 2)
   ↓
Ekspresi
```

---

# 20. Quiz

Buatlah program sederhana yang menerapkan:

- Tipe data
- Variabel
- Method
- Ekspresi
- Salah satu method dari class `Math`

Program dapat berupa permasalahan matematika sederhana.

Contoh implementasi terdapat pada:

```text
quiz/
└── KalkulatorMatematika.java
```

---

# 21. Task — Ide Project

Pada pertemuan ini mulai ditentukan permasalahan yang dapat dijadikan **judul project program** untuk mata kuliah PBO.

Project tersebut akan dikembangkan secara bertahap pada setiap pertemuan sesuai dengan materi yang diberikan.

### Ketentuan

- Tentukan permasalahan yang ingin diselesaikan dengan program.
- Buat judul project.
- Setiap mahasiswa menggunakan permasalahan yang berbeda.
- Project akan terus dikembangkan pada pertemuan berikutnya.
- Pada tahap ini, implementasikan konsep:
  - Tipe data
  - Variabel
  - Method
  - Ekspresi

Contoh ide:

```text
Sistem Pengelolaan Data Mahasiswa
Aplikasi Kasir Sederhana
Sistem Perpustakaan
Aplikasi Penghitung Nilai Mahasiswa
Sistem Pemesanan Makanan
Aplikasi Pengelolaan Keuangan
```

> Judul project yang dipilih pada tahap ini akan menjadi dasar pengembangan project pada pertemuan-pertemuan berikutnya.

---

# 📂 Struktur Folder

```text
pertemuan-02/
├── README.md
│
├── contoh/
│   ├── TipeData.java
│   ├── Variabel.java
│   ├── Method.java
│   ├── MathMethod.java
│   └── Operator.java
│
├── quiz/
│   └── KalkulatorMatematika.java
│
└── task/
    └── IdeProject.java
```

---

# 📌 Kesimpulan

Pada pertemuan kedua, kita telah mempelajari dasar penggunaan data dan operasi dalam Java.

Konsep utama yang perlu dipahami:

```text
Tipe Data
    ↓
Variabel
    ↓
Data disimpan
    ↓
Operator & Ekspresi
    ↓
Data diproses
    ↓
Method
    ↓
Program menjadi lebih terorganisir
```

Konsep-konsep tersebut akan menjadi dasar untuk mempelajari materi Java dan Pemrograman Berorientasi Objek pada pertemuan berikutnya.