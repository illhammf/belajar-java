# Pertemuan 5 — Encapsulation (Concept)

## 📖 Deskripsi

Pertemuan ini membahas konsep **Encapsulation** dalam pemrograman berorientasi objek menggunakan Java.

Encapsulation adalah konsep membungkus data dan method dalam sebuah class serta membatasi akses langsung ke data tersebut. Salah satu penerapannya adalah menggunakan atribut `private` dan menyediakan method `public` sebagai perantara untuk mengakses atau mengubah nilai atribut.

## 🎯 Tujuan Pembelajaran

- Memahami konsep encapsulation.
- Memahami class dan object.
- Memahami access modifier `private`, `protected`, dan `public`.
- Membuat getter dan setter.
- Memahami fungsi constructor.
- Menerapkan encapsulation pada program Java.

## 🧠 Ringkasan Materi

### 1. Encapsulation

Encapsulation digunakan untuk membatasi akses langsung ke data dalam class. Dengan demikian, perubahan data dapat dikontrol melalui method yang disediakan.

### 2. Access Modifier

| Modifier | Keterangan |
|---|---|
| `private` | Dapat diakses langsung dari class yang mendeklarasikannya |
| `protected` | Dapat diakses dalam package yang sama dan oleh subclass sesuai aturan akses Java |
| `public` | Dapat diakses dari class lain selama class tersebut dapat dijangkau |

### 3. Getter dan Setter

**Setter** digunakan untuk mengatur atau memperbarui nilai atribut.

**Getter** digunakan untuk mengambil atau mengembalikan nilai atribut.

Contoh:

```java
private int alas;

public void setAlas(int alas) {
    if (alas > 0) {
        this.alas = alas;
    }
}
```

### 4. Constructor

Constructor adalah bagian khusus dari class yang dipanggil ketika object dibuat. Nama constructor sama dengan nama class dan tidak memiliki tipe return.

Contoh:

```java
public class Mahasiswa {
    private String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }
}
```

### 5. Manfaat Encapsulation

- Mengontrol akses terhadap atribut.
- Melindungi integritas data.
- Memungkinkan validasi sebelum data diubah.
- Membuat struktur program lebih terorganisasi.
- Mempermudah pemeliharaan kode.

## 📂 Struktur Folder

```text
pertemuan_05/
├── contoh/
│   ├── LuasSegitiga.java
│   ├── PersegiPanjang.java
│   ├── LuasLingkaran.java
│   └── Main.java
│
├── README.md
└── Week 5-6 - Encapsulation (Concept).pdf
```

Tidak ada folder `quiz/` karena materi ini tidak menyediakan bagian kuis tersendiri.

## 💻 Daftar Contoh Program

| No. | File | Materi |
|---:|---|---|
| 1 | `LuasSegitiga.java` | Encapsulation, atribut private, setter, dan getter |
| 2 | `PersegiPanjang.java` | Encapsulation pada perhitungan luas persegi panjang |
| 3 | `LuasLingkaran.java` | Encapsulation dan perhitungan luas lingkaran |
| 4 | `Main.java` | Membuat object dan menggunakan setter serta getter |

## ▶️ Cara Menjalankan

Buka terminal VS Code dan masuk ke folder `contoh`:

```powershell
cd src/pertemuan_05/contoh
```

Kompilasi seluruh file:

```powershell
javac *.java
```

Jalankan program utama:

```powershell
java Main
```

## 🧪 Contoh Pengujian

Program menggunakan nilai berikut:

- Segitiga: alas 2 dan tinggi 3.
- Persegi panjang: panjang 4 dan lebar 2.
- Lingkaran: jari-jari 2.

Output:

```text
Luas daerah diarsir: 4.716814692820414 cm2
```

## ⚠️ Catatan

- Atribut pada class bangun datar dideklarasikan sebagai `private`.
- Perubahan nilai dilakukan melalui setter.
- Perhitungan luas dilakukan melalui getter.
- Setter memeriksa apakah nilai yang dimasukkan lebih besar dari nol.
- Contoh mengikuti pola program dalam materi perkuliahan.
- Constructor dibahas sebagai konsep, tetapi contoh bangun datar pada materi ini tidak memerlukan constructor khusus.

## 📚 Referensi

**Week 5-6 — Encapsulation (Concept)**

Mata Kuliah: Pemrograman Berorientasi Objek (PBO)

Bahasa Pemrograman: Java