# Pertemuan 4 — Function and Parameter

## 📖 Deskripsi

Pertemuan ini membahas penggunaan function dan parameter dalam pemrograman Java. Function digunakan untuk memisahkan proses tertentu menjadi bagian program yang dapat dipanggil ketika diperlukan.

Materi ini mencakup function dengan nilai balik (*return value*), function `void`, parameter, serta fungsi rekursif.

## 🎯 Tujuan Pembelajaran

- Memahami konsep function dalam Java.
- Membuat dan memanggil function.
- Menggunakan parameter dan argument.
- Memahami function dengan return value dan `void`.
- Memahami perbedaan value parameter dan perubahan atribut object.
- Memahami konsep recursive function.

## 📂 Struktur Folder

```text
pertemuan_04/
├── contoh/
│   ├── Mainparameter2.java
│   ├── Fungsireturnvalue.java
│   ├── Fungsinonreturn.java
│   ├── Lpersegipanjang.java
│   ├── parametervalue.java
│   ├── Person.java
│   └── FakRekursif.java
│
├── README.md
└── Week 4 - Function and Parameter.pptx
```

Folder `quiz/` tidak dibuat karena PPT pertemuan ini tidak menyediakan bagian kuis tersendiri.

## 🧠 Ringkasan Materi

### 1. Function

Function merupakan bagian program yang berisi instruksi untuk menjalankan tugas tertentu. Dalam Java, function biasanya disebut method ketika didefinisikan di dalam class.

Contoh:

```java
public static void sapa() {
    System.out.println("Halo!");
}
```

Function tersebut dapat dipanggil menggunakan `sapa();`.

### 2. Parameter dan Argument

Parameter merupakan variabel yang ditulis pada deklarasi method, sedangkan argument merupakan nilai yang diberikan ketika method dipanggil.

```java
public static void mahasiswa(String nama, int umur) {
    System.out.println(nama + " berumur " + umur + "th");
}
```

Pemanggilan:

```java
mahasiswa("Raihan", 19);
```

Pada contoh tersebut, `nama` dan `umur` merupakan parameter, sedangkan `"Raihan"` dan `19` merupakan argument.

### 3. Function dengan Return Value

Method dengan return value mengembalikan hasil menggunakan `return`.

```java
public static int area(int panjang, int lebar) {
    return panjang * lebar;
}
```

Pemanggilan:

```java
int luas = area(4, 5);
System.out.println(luas);
```

Output:

```text
20
```

### 4. Function `void`

Method `void` digunakan untuk menjalankan proses tanpa mengembalikan nilai.

```java
public static void printHello(String nama) {
    System.out.println("Hello World, " + nama);
}
```

Pemanggilan:

```java
printHello("PBO");
```

Output:

```text
Hello World, PBO
```

### 5. Value Parameter dan Object

Pada contoh parameter bertipe primitif, perubahan terhadap parameter di dalam method tidak mengubah variabel primitif asal.

Sementara itu, method yang menerima referensi object dapat mengubah atribut object tersebut. Java tetap meneruskan nilai parameter berdasarkan mekanisme *pass-by-value*, termasuk ketika nilainya berupa referensi object.

### 6. Recursive Function

Recursive function adalah method yang memanggil dirinya sendiri. Rekursi memerlukan kondisi dasar (*base case*) agar pemanggilan dapat berhenti.

Contoh faktorial:

```java
public static int faktorial(int n) {
    if (n == 1) {
        return 1;
    }

    return n * faktorial(n - 1);
}
```

Contoh di atas mengikuti pola faktorial pada materi. Implementasi tersebut ditujukan untuk bilangan bulat positif mulai dari 1; nilai 0 dan bilangan negatif belum ditangani.

## 💻 Daftar Contoh Program

| No. | Nama File | Materi |
|---:|---|---|
| 1 | `Mainparameter2.java` | Function dengan dua parameter dan input pengguna |
| 2 | `Fungsireturnvalue.java` | Function yang mengembalikan nilai |
| 3 | `Fungsinonreturn.java` | Function `void` |
| 4 | `Lpersegipanjang.java` | Function untuk menghitung luas persegi panjang |
| 5 | `parametervalue.java` | Value parameter |
| 6 | `Person.java` | Perubahan atribut object melalui parameter |
| 7 | `FakRekursif.java` | Recursive function untuk faktorial |

## ▶️ Cara Menjalankan Program

Pastikan JDK sudah terpasang. Buka terminal VS Code dari folder `pertemuan_04`, kemudian masuk ke folder contoh:

```powershell
cd contoh
```

Setiap contoh merupakan program terpisah. Kompilasi dan jalankan satu per satu, misalnya:

```powershell
javac Mainparameter2.java
java Mainparameter2
```

Contoh lain:

```powershell
javac Fungsireturnvalue.java
java Fungsireturnvalue
```

```powershell
javac Fungsinonreturn.java
java Fungsinonreturn
```

Untuk menjalankan contoh lain, ganti nama file pada perintah `javac` dan nama class pada perintah `java` sesuai contoh yang ingin diuji.

## 📝 Catatan

- Setiap file contoh dipelajari secara terpisah.
- `Lpersegipanjang.java` menggunakan `Scanner` untuk membaca input pengguna.
- `Mainparameter2.java` juga meminta input nama dan umur.
- Harga, ukuran, atau nilai yang digunakan pada contoh merupakan data latihan sesuai kebutuhan program.
- Materi pada pertemuan berikutnya akan dikembangkan secara bertahap sesuai topik perkuliahan.

## 📚 Referensi Materi

**Week 4 — Function and Parameter**

Mata Kuliah: Pemrograman Berorientasi Objek (PBO)

Bahasa Pemrograman: Java