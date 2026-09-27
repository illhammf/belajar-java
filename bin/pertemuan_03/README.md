# Pertemuan 03 — Control Statement

## 📚 Deskripsi

Pada pertemuan ketiga, pembelajaran Java berfokus pada **Control Statement** atau pernyataan pengendali alur program.

Control Statement digunakan untuk menentukan statement yang akan dieksekusi berdasarkan kondisi tertentu.

Pada pertemuan ini dipelajari dua bentuk utama percabangan:

- `if`
- `if-else`
- `if-else if-else`
- `switch`
- `break`
- `return`

---

## 🎯 Tujuan Pembelajaran

Setelah mempelajari materi ini, mahasiswa diharapkan mampu:

- Memahami konsep Control Statement dalam Java.
- Memahami percabangan menggunakan `if`.
- Menggunakan `if-else` untuk dua kondisi.
- Menggunakan `if-else if-else` untuk beberapa kondisi.
- Menggunakan `switch` untuk beberapa pilihan berdasarkan nilai.
- Memahami penggunaan `break` pada `switch`.
- Mengimplementasikan Control Statement ke dalam program Java.

---

# 1. Control Statement

Control Statement merupakan mekanisme untuk mengendalikan jalannya alur program berdasarkan kondisi tertentu.

Secara sederhana:

```text
Program
   ↓
Kondisi
   ↓
┌───────────────┐
│ Kondisi benar │
│ atau salah?   │
└───────────────┘
   ↓
Menentukan statement
yang akan dijalankan
```

Dalam materi ini, percabangan dilakukan menggunakan:

```text
if - else
switch - break
```

---

# 2. `if` Statement

`if` digunakan ketika program hanya membutuhkan satu kondisi.

Bentuk dasar:

```java
if (kondisi) {
    statement;
}
```

Contoh:

```java
int nilai = 80;

if (nilai >= 75) {
    System.out.println("Lulus");
}
```

Jika kondisi:

```java
nilai >= 75
```

bernilai `true`, maka statement di dalam `if` akan dijalankan.

---

## 2.1 `if` dengan Beberapa Statement

Jika terdapat lebih dari satu statement, gunakan `{}`.

```java
if (nilai >= 75) {

    System.out.println("Nilai memenuhi syarat.");
    System.out.println("Mahasiswa dinyatakan lulus.");

}
```

---

# 3. `if-else`

`if-else` digunakan ketika terdapat dua kemungkinan kondisi.

Bentuk dasar:

```java
if (kondisi) {

    // Statement jika kondisi benar

} else {

    // Statement jika kondisi salah

}
```

Contoh:

```java
int nilai = 60;

if (nilai >= 75) {

    System.out.println("Lulus");

} else {

    System.out.println("Tidak Lulus");

}
```

Output:

```text
Tidak Lulus
```

---

# 4. `if-else if-else`

Jika terdapat tiga kondisi atau lebih, kita dapat menggunakan `else if`.

Bentuk dasar:

```java
if (kondisi1) {

    statement;

} else if (kondisi2) {

    statement;

} else {

    statement;

}
```

Contoh:

```java
int nilai = 85;

if (nilai >= 90) {

    System.out.println("A");

} else if (nilai >= 80) {

    System.out.println("B");

} else if (nilai >= 70) {

    System.out.println("C");

} else {

    System.out.println("D");

}
```

Output:

```text
B
```

Program akan mengevaluasi kondisi dari atas ke bawah.

---

# 5. `switch`

Selain `if`, percabangan dengan beberapa pilihan dapat dibuat menggunakan `switch`.

Bentuk dasar:

```java
switch (ekspresi) {

    case nilai1:
        statement;
        break;

    case nilai2:
        statement;
        break;

    default:
        statement;
}
```

Contoh:

```java
int kodeHari = 1;

switch (kodeHari) {

    case 0:
        System.out.println("Minggu");
        break;

    case 1:
        System.out.println("Senin");
        break;

    case 2:
        System.out.println("Selasa");
        break;

    default:
        System.out.println("Kode tidak valid");
}
```

Output:

```text
Senin
```

---

# 6. `break`

`break` digunakan untuk menghentikan eksekusi pada `switch`.

Contoh:

```java
switch (kode) {

    case 1:
        System.out.println("Pilihan 1");
        break;

    case 2:
        System.out.println("Pilihan 2");
        break;

}
```

Jika `break` tidak digunakan, program dapat melanjutkan eksekusi ke `case` berikutnya.

---

# 7. `return`

`return` digunakan untuk mengembalikan nilai dari sebuah method atau menghentikan eksekusi method.

Contoh:

```java
static int tambah(int a, int b) {

    return a + b;

}
```

Method tersebut mengembalikan hasil:

```java
a + b
```

yang bertipe `int`.

---

# 🧩 Quiz

Pada pertemuan ini terdapat empat latihan program.

---

## Quiz 1 — Bilangan Terbesar

Buatlah program untuk menentukan bilangan terbesar di antara dua bilangan menggunakan `if-else`.

Source code:

👉 [Bilangan Terbesar](./quiz/BilanganTerbesar.java)

Konsep yang digunakan:

- Variabel
- Input
- `if-else`
- Comparison Operator
- Output

---

## Quiz 2 — Bilangan Ganjil atau Genap

Buatlah program untuk menentukan apakah sebuah bilangan merupakan bilangan ganjil atau genap menggunakan `if-else`.

Source code:

👉 [Ganjil Genap](./quiz/GanjilGenap.java)

Konsep yang digunakan:

- Variabel
- Operator modulus `%`
- `if-else`
- Output

---

## Quiz 3 — Pemberian Diskon

Buatlah program pemberian diskon berdasarkan jumlah pembelian tertentu.

Source code:

👉 [Diskon Pembelian](./quiz/DiskonPembelian.java)

Konsep yang digunakan:

- Variabel
- Input
- `if-else`
- Arithmetic Operator
- Perhitungan harga
- Output

---

## Quiz 4 — Menentukan Nama Hari

Buatlah program untuk menentukan nama hari berdasarkan kode:

| Kode | Hari |
|---:|---|
| 0 | Minggu |
| 1 | Senin |
| 2 | Selasa |
| 3 | Rabu |
| 4 | Kamis |
| 5 | Jumat |
| 6 | Sabtu |

Program menggunakan percabangan untuk menentukan nama hari.

Source code:

👉 [Nama Hari](./quiz/NamaHari.java)

Konsep yang digunakan:

- Variabel
- Input
- `switch`
- `case`
- `break`
- `default`
- Output

---

# 📂 Struktur Folder

```text
pertemuan-03/
├── README.md
│
└── quiz/
    ├── BilanganTerbesar.java
    ├── GanjilGenap.java
    ├── DiskonPembelian.java
    └── NamaHari.java
```

---

# 🚀 Project

Pada pertemuan ini, project yang telah ditentukan pada Pertemuan 2 dilanjutkan dengan menambahkan **Control Statement**.

Implementasi disesuaikan dengan tahap awal project masing-masing mahasiswa.

Konsep yang dapat ditambahkan:

```text
Project Pertemuan 2
        ↓
Data & Variable
        ↓
Method & Expression
        ↓
Control Statement
        ↓
if / if-else / switch
```

Project akan terus dikembangkan pada pertemuan-pertemuan berikutnya sesuai dengan materi yang dipelajari.

---

# 📌 Kesimpulan

Pada Pertemuan 3 dipelajari bagaimana mengendalikan alur program menggunakan kondisi.

Konsep utama:

```text
if
│
├── Satu kondisi
│
└── if-else
    │
    └── Dua kondisi
        │
        └── else-if
            │
            └── Banyak kondisi


switch
│
├── case
├── break
└── default
```

Control Statement merupakan salah satu dasar penting dalam pembuatan program karena memungkinkan program mengambil keputusan berdasarkan kondisi tertentu.