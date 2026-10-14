# Pertemuan 5 — Encapsulation (Concept)

## 📖 Deskripsi

Pertemuan ini membahas salah satu konsep dasar dalam **Object-Oriented Programming (OOP)**, yaitu **Encapsulation** atau enkapsulasi menggunakan bahasa pemrograman Java.

Dalam pemrograman berorientasi objek, sebuah class dapat memiliki atribut untuk menyimpan data dan method untuk mengolah data tersebut. Namun, jika semua atribut dapat diakses dan diubah secara bebas dari luar class, data berisiko berubah menjadi nilai yang tidak sesuai dengan aturan program.

Encapsulation digunakan untuk mengatur bagaimana data di dalam sebuah class dapat diakses dan diubah. Salah satu cara menerapkannya adalah dengan menjadikan atribut sebagai `private`, kemudian menyediakan method `public` seperti setter dan getter sebagai perantara.

Melalui materi ini, kita akan mempelajari bagaimana encapsulation diterapkan pada program perhitungan luas bangun datar, mulai dari luas segitiga, persegi panjang, hingga lingkaran.

## 🎯 Tujuan Pembelajaran

Setelah mempelajari materi ini, diharapkan dapat:

- Memahami pengertian dan tujuan encapsulation dalam Java.
- Memahami hubungan antara class, object, atribut, dan method.
- Mengenal access modifier `private`, `protected`, dan `public`.
- Memahami cara melindungi atribut menggunakan `private`.
- Membuat dan menggunakan setter untuk mengubah nilai atribut.
- Membuat dan menggunakan getter untuk membaca nilai atau memperoleh hasil perhitungan.
- Memahami penggunaan keyword `this` dalam sebuah class.
- Memahami fungsi constructor dalam proses pembuatan object.
- Menerapkan encapsulation pada program perhitungan luas bangun datar.

## 🧠 Ringkasan Materi

### 1. Pengertian Encapsulation

**Encapsulation** adalah konsep OOP yang menggabungkan data dan method dalam sebuah class serta mengatur akses terhadap data tersebut.

Misalnya, kita mempunyai class `LuasSegitiga` dengan atribut `alas` dan `tinggi`. Kedua atribut tersebut digunakan untuk menghitung luas segitiga.

Tanpa encapsulation, atribut dapat dibuat terbuka sehingga class lain bisa mengubah nilainya secara langsung. Hal ini dapat menimbulkan masalah ketika nilai yang diberikan tidak sesuai dengan aturan program.

Dengan encapsulation, atribut dapat dibuat `private`, sehingga akses langsung dari luar class dibatasi. Class kemudian menyediakan method tertentu untuk mengatur atau membaca data tersebut.

**Contoh sederhana:**

```java
public class Mahasiswa {
    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
```

Pada contoh di atas:

- `Mahasiswa` merupakan nama class.
- `nama` merupakan atribut yang menyimpan data.
- `private` membatasi akses langsung terhadap atribut `nama`.
- `setNama()` digunakan untuk mengubah nama.
- `getNama()` digunakan untuk membaca nama.

Dengan pendekatan tersebut, class lain tidak dapat mengakses atribut `nama` secara langsung, tetapi dapat menggunakan method yang telah disediakan.

### 2. Mengapa Encapsulation Penting?

Bayangkan sebuah aplikasi bank sampah yang memiliki data berat sampah dan harga per kilogram. Jika nilai berat dapat diubah menjadi angka negatif secara bebas, hasil perhitungan setoran akan menjadi tidak masuk akal.

Encapsulation memungkinkan kita membuat aturan ketika data diubah.

Contohnya:

```java
private double berat;

public void setBerat(double berat) {
    if (berat > 0) {
        this.berat = berat;
    }
}
```

Method tersebut hanya menerima berat yang lebih besar dari nol. Jika nilai yang dimasukkan nol atau negatif, nilai atribut tidak akan diperbarui oleh method tersebut.

Beberapa manfaat encapsulation adalah:

1. **Melindungi data** agar tidak diakses secara langsung dari luar class.
2. **Mengontrol perubahan data** melalui method yang telah disediakan.
3. **Melakukan validasi** sebelum data disimpan.
4. **Mempermudah pemeliharaan program** karena aturan pengelolaan data berada di dalam class.
5. **Meningkatkan keteraturan kode** dengan memisahkan tanggung jawab pengelolaan data dan penggunaan data.

Perlu diingat bahwa encapsulation bukan sekadar membuat semua atribut menjadi `private`. Hal yang penting adalah merancang akses yang sesuai dengan kebutuhan class.

### 3. Access Modifier

Access modifier merupakan kata kunci yang menentukan bagian program mana yang dapat mengakses suatu class, atribut, constructor, atau method.

Dalam Java, tiga access modifier yang sering dipelajari adalah `private`, `protected`, dan `public`.

| Modifier | Penjelasan |
|---|---|
| `private` | Hanya dapat diakses langsung dari dalam class yang mendeklarasikannya. |
| `protected` | Dapat diakses dari dalam package yang sama dan oleh subclass sesuai aturan akses Java. |
| `public` | Dapat diakses dari class lain selama class dan anggotanya dapat dijangkau. |

Contoh penggunaan:

```java
public class Produk {
    private String nama;
    protected double harga;
    public String kategori;
}
```

Pada contoh tersebut, setiap atribut mempunyai aturan akses yang berbeda.

- `nama` hanya dapat diakses langsung dari dalam class `Produk`.
- `harga` memiliki akses `protected`.
- `kategori` memiliki akses `public`.

Dalam penerapan encapsulation, atribut umumnya dibuat `private`, sedangkan method yang memang diperlukan oleh class lain dapat disediakan sebagai `public`.

### 4. Atribut dan Method dalam Class

Sebelum memahami getter dan setter, kita perlu mengenal dua bagian penting dalam sebuah class.

**Atribut** adalah variabel yang digunakan untuk menyimpan data atau keadaan suatu object.

Contoh:

```java
private int alas;
private int tinggi;
private double luas;
```

**Method** adalah bagian program yang mendefinisikan tindakan atau operasi yang dapat dilakukan oleh sebuah object.

Contoh:

```java
public double getLuas() {
    return alas * tinggi * 0.5;
}
```

Dalam contoh perhitungan segitiga, atribut menyimpan nilai alas dan tinggi, sedangkan method menghitung luas berdasarkan nilai tersebut.

### 5. Getter dan Setter

Getter dan setter merupakan method yang umum digunakan untuk mengelola akses terhadap atribut `private`.

#### A. Setter

Setter digunakan untuk mengatur atau memperbarui nilai atribut.

Contoh:

```java
private int alas;

public void setAlas(int alas) {
    if (alas > 0) {
        this.alas = alas;
    }
}
```

Penjelasan:

- `setAlas` merupakan nama method setter.
- Parameter `int alas` menerima nilai yang ingin diberikan.
- Kondisi `alas > 0` memeriksa apakah nilai yang diberikan valid.
- `this.alas` menunjuk pada atribut milik object saat ini.
- `alas` di sebelah kanan `=` merupakan parameter yang diterima method.

Jika method dipanggil dengan `setAlas(10)`, nilai alas akan diperbarui menjadi 10.

Jika dipanggil dengan `setAlas(-5)`, kondisi tidak terpenuhi sehingga nilai atribut tidak berubah.

#### B. Getter

Getter digunakan untuk mengambil nilai atribut atau menghasilkan nilai berdasarkan atribut yang dimiliki object.

Contoh:

```java
public int getAlas() {
    return alas;
}
```

Method tersebut mengembalikan nilai atribut `alas`.

Getter juga dapat digunakan untuk melakukan perhitungan, seperti pada contoh berikut:

```java
public double getLuas() {
    return alas * tinggi * 0.5;
}
```

Pada contoh ini, `getLuas()` tidak hanya membaca satu atribut, tetapi menghitung luas segitiga dan mengembalikan hasilnya.

**Perbedaan utamanya:**

| Getter | Setter |
|---|---|
| Digunakan untuk membaca nilai atau memperoleh hasil. | Digunakan untuk mengubah nilai atribut. |
| Biasanya memiliki tipe return selain `void`. | Sering menggunakan `void` karena tidak mengembalikan hasil. |
| Contoh: `getLuas()` | Contoh: `setAlas(10)` |

Getter tidak harus selalu mengembalikan atribut secara langsung, dan setter tidak harus selalu menerima semua nilai. Keduanya dirancang sesuai kebutuhan class.

### 6. Keyword `this`

Keyword `this` merujuk pada object yang sedang menjalankan method atau constructor.

Contoh:

```java
private int alas;

public void setAlas(int alas) {
    this.alas = alas;
}
```

Mengapa menggunakan `this.alas`?

Karena nama parameter dan nama atribut sama-sama `alas`.

- `this.alas` adalah atribut milik object.
- `alas` adalah parameter method.

Dengan demikian, perintah `this.alas = alas;` berarti memberikan nilai dari parameter ke atribut object.

Keyword `this` sering digunakan pada setter dan constructor untuk memperjelas perbedaan antara atribut dan parameter.

### 7. Constructor

Constructor merupakan bagian khusus dari class yang digunakan untuk menginisialisasi object ketika object dibuat.

Ciri-ciri constructor:

- Namanya sama dengan nama class.
- Tidak memiliki tipe return, bahkan bukan `void`.
- Dipanggil ketika object dibuat menggunakan `new`.
- Dapat memiliki parameter untuk menerima nilai awal object.

Contoh:

```java
public class Mahasiswa {
    private String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
```

Cara membuat object:

```java
Mahasiswa mhs = new Mahasiswa("Ilham");

System.out.println(mhs.getNama());
```

Output:

```text
Ilham
```

Ketika `new Mahasiswa("Ilham")` dijalankan, constructor menerima argument `"Ilham"` dan menyimpannya ke atribut `nama`.

Jika suatu class tidak mendeklarasikan constructor, Java dapat menyediakan default constructor tanpa parameter. Namun, ketika constructor sendiri dideklarasikan, default constructor tersebut tidak otomatis disediakan lagi.

Pada contoh bangun datar di materi ini, object dibuat menggunakan constructor tanpa parameter yang disediakan Java. Nilai atribut kemudian diberikan melalui setter.

### 8. Penerapan Encapsulation pada Perhitungan Bangun Datar

Materi ini menerapkan encapsulation pada tiga jenis bangun datar.

#### A. Luas Segitiga

Class `LuasSegitiga` menyimpan nilai alas, tinggi, dan luas.

Rumus:

\[
L=\frac{1}{2}\times alas\times tinggi
\]

Contoh method:

```java
private int alas;
private int tinggi;
private double luas;

public void setAlas(int a) {
    if (a > 0) {
        this.alas = a;
    } else {
        this.alas = 0;
    }
}

public void setTinggi(int t) {
    if (t > 0) {
        this.tinggi = t;
    } else {
        this.tinggi = 0;
    }
}

public double getLuas() {
    this.luas = this.alas * this.tinggi * 0.5;
    return this.luas;
}
```

Jika alas bernilai 2 dan tinggi bernilai 3, luas segitiga adalah 3.

#### B. Luas Persegi Panjang

Class `PersegiPanjang` menyimpan nilai panjang, lebar, dan luas.

Rumus:

\[
L=panjang\times lebar
\]

Contoh perhitungan:

```java
public double getLuas() {
    this.luas = this.panjang * this.lebar;
    return this.luas;
}
```

Jika panjang bernilai 4 dan lebar bernilai 2, luas persegi panjang adalah 8.

#### C. Luas Lingkaran

Class `LuasLingkaran` menyimpan jari-jari dan luas lingkaran.

Rumus:

\[
L=\pi r^2
\]

Contoh perhitungan:

```java
public double getLuas() {
    this.luas = Math.PI * Math.pow(this.jejari, 2);
    return this.luas;
}
```

Method `Math.pow()` digunakan untuk menghitung perpangkatan, sedangkan `Math.PI` menyediakan nilai konstanta pi.

Jika jari-jari bernilai 2, luas lingkaran adalah sekitar 12,5664 satuan luas.

Pada program utama, hasil tersebut dikalikan `0.5` karena yang digunakan adalah setengah luas lingkaran.

### 9. Hubungan Antarclass dan Object

Ketiga class bangun datar tidak harus memiliki method `main()` sendiri. Class tersebut berfungsi untuk menyimpan atribut dan menyediakan operasi perhitungan.

Class `Main` bertindak sebagai titik awal program. Di dalamnya, object dibuat dan digunakan melalui setter serta getter.

Contoh:

```java
LuasSegitiga st1 = new LuasSegitiga();

st1.setAlas(2);
st1.setTinggi(3);

double luasSegitiga = st1.getLuas();
```

Urutan prosesnya adalah:

1. Membuat object `LuasSegitiga`.
2. Memberikan nilai alas melalui `setAlas(2)`.
3. Memberikan nilai tinggi melalui `setTinggi(3)`.
4. Memanggil `getLuas()` untuk menghitung dan mengambil hasil.
5. Menyimpan hasil perhitungan ke variabel `luasSegitiga`.

Dengan cara ini, class `Main` tidak perlu mengakses atribut `private` secara langsung.

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

**Catatan:** Sesuaikan nama file PDF dengan nama file yang tersimpan di repository. Tidak ada folder `quiz/` karena materi yang digunakan tidak menyediakan bagian kuis tersendiri.

## 💻 Daftar Contoh Program

| No. | File | Materi |
|---:|---|---|
| 1 | `LuasSegitiga.java` | Encapsulation, atribut `private`, setter, dan getter |
| 2 | `PersegiPanjang.java` | Encapsulation dalam perhitungan luas persegi panjang |
| 3 | `LuasLingkaran.java` | Encapsulation dan perhitungan luas lingkaran |
| 4 | `Main.java` | Membuat object dan menggunakan setter serta getter |

## ▶️ Cara Menjalankan Program

Pastikan Java Development Kit (JDK) telah terpasang dan dapat digunakan melalui terminal.

Buka terminal VS Code, lalu masuk ke folder `contoh`:

```powershell
cd src/pertemuan_05/contoh
```

Kompilasi semua file Java:

```powershell
javac *.java
```

Jika proses kompilasi berhasil, jalankan class utama:

```powershell
java Main
```

Ketiga class bangun datar akan digunakan oleh `Main.java`. Karena seluruh file berada dalam folder yang sama dan tidak menggunakan deklarasi `package`, semua file dapat dikompilasi bersama menggunakan perintah tersebut.

## 🧪 Contoh Pengujian

Program utama menggunakan nilai berikut:

| Bangun Datar | Nilai | Hasil |
|---|---|---:|
| Segitiga | Alas 2, tinggi 3 | 3 cm² |
| Persegi panjang | Panjang 4, lebar 2 | 8 cm² |
| Lingkaran | Jari-jari 2 | Sekitar 12,5664 cm² |

Program menghitung luas daerah diarsir menggunakan rumus:

\[
L_{\text{arsir}}=L_{\text{segitiga}}+L_{\text{persegi panjang}}-\frac{1}{2}L_{\text{lingkaran}}
\]

Sehingga:

\[
L_{\text{arsir}}=3+8-\frac{1}{2}(12{,}5663706)
\]

Hasil output:

```text
Luas daerah diarsir: 4.716814692820414 cm2
```

Hasil tersebut menunjukkan bahwa ketiga object dapat digunakan untuk melakukan perhitungan, sementara atributnya dikelola melalui method yang disediakan.

## ⚠️ Catatan Pembelajaran

- Atribut pada class bangun datar dideklarasikan menggunakan `private`.
- Nilai atribut diubah melalui setter.
- Hasil perhitungan diperoleh melalui getter.
- Setter pada contoh memeriksa agar nilai dimensi lebih besar dari nol.
- Constructor dibahas sebagai konsep, tetapi contoh bangun datar menggunakan constructor tanpa parameter.
- Validasi setter dalam contoh merupakan ilustrasi dasar. Pada program yang lebih kompleks, penanganan data tidak valid dapat dirancang dengan aturan yang lebih ketat.
- Contoh program mengikuti pola materi perkuliahan, sehingga beberapa bagian dibuat sederhana agar mudah dipahami.

## 📝 Kesimpulan

Encapsulation merupakan konsep penting dalam pemrograman berorientasi objek karena membantu mengontrol akses dan perubahan data di dalam class.

Melalui penggunaan `private`, getter, setter, constructor, dan `this`, data dapat dikelola dengan lebih terstruktur. Contoh perhitungan luas bangun datar memperlihatkan bagaimana sebuah class menyimpan data sekaligus menyediakan method untuk mengolahnya.

Konsep ini akan menjadi dasar untuk membangun program yang lebih kompleks, termasuk pengelolaan data setoran sampah pada project EcoCycle.

## 📚 Referensi

**Week 5-6 — Encapsulation (Concept)**

Mata Kuliah: Pemrograman Berorientasi Objek (PBO)

Bahasa Pemrograman: Java