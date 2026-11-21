# EcoCycle — Pertemuan 8 (Inheritance)

EcoCycle merupakan project simulasi sistem bank sampah yang dikembangkan menggunakan bahasa pemrograman Java dengan pendekatan Object-Oriented Programming (OOP).

Pada Pertemuan 8, project ini dikembangkan dengan menerapkan konsep **Inheritance (Pewarisan)**. Pengembangan dilakukan dengan mempertahankan struktur superclass dan subclass dari pertemuan sebelumnya, kemudian menambahkan konsep Multilevel Inheritance serta Interface.

Melalui implementasi ini, setiap jenis setoran sampah dapat memiliki karakteristik dan perilaku tersendiri tanpa harus mendefinisikan ulang seluruh atribut dan method yang sudah tersedia pada kelas induk.

## 📚 Daftar Isi

- [Tujuan Pengembangan](#-tujuan-pengembangan)
- [Struktur Folder](#-struktur-folder)
- [Gambaran Arsitektur](#-gambaran-arsitektur)
- [1. SetoranSampah.java](#1-setoransampahjava)
- [2. DapatDidaurUlang.java](#2-dapatdidaurulangjava)
- [3. SetoranKertas.java](#3-setorankertasjava)
- [4. SetoranPlastik.java](#4-setoranplastikjava)
- [5. SetoranBotolPET.java](#5-setoranbotolpetjava)
- [6. EcoCycle.java](#6-ecocyclejava)
- [Konsep OOP yang Diterapkan](#-konsep-oop-yang-diterapkan)
- [Alur Program](#-alur-program)
- [Output Program](#-output-program)
- [Cara Menjalankan Program](#-cara-menjalankan-program)
- [Kesimpulan](#-kesimpulan)

## 🎯 Tujuan Pengembangan

Pengembangan EcoCycle pada Pertemuan 8 bertujuan untuk:

1. Memahami konsep Inheritance dalam pemrograman Java.
2. Mengimplementasikan superclass dan subclass.
3. Menggunakan keyword `extends` untuk membangun hubungan pewarisan.
4. Memahami penggunaan constructor dan keyword `super()`.
5. Menerapkan Method Overriding menggunakan annotation `@Override`.
6. Memahami konsep Single, Hierarchical, dan Multilevel Inheritance.
7. Mengimplementasikan Interface menggunakan keyword `implements`.
8. Memahami konsep Multiple Inheritance melalui Interface di Java.
9. Menggabungkan beberapa pola inheritance dalam pengembangan aplikasi.

## 📂 Struktur Folder

Berikut struktur project EcoCycle pada Pertemuan 8:

```text
pertemuan_08/
│
├── EcoCycle.java
├── SetoranSampah.java
├── SetoranKertas.java
├── SetoranPlastik.java
├── SetoranBotolPET.java
├── DapatDidaurUlang.java
│
└── README.md
```

### Keterangan File

| File | Fungsi |
|---|---|
| `EcoCycle.java` | Class utama untuk menjalankan aplikasi dan mengelola proses setoran |
| `SetoranSampah.java` | Superclass yang menyimpan atribut dan method umum setoran sampah |
| `SetoranKertas.java` | Subclass untuk merepresentasikan setoran sampah kertas |
| `SetoranPlastik.java` | Subclass untuk merepresentasikan setoran sampah plastik |
| `SetoranBotolPET.java` | Subclass dari SetoranPlastik yang merepresentasikan setoran botol PET |
| `DapatDidaurUlang.java` | Interface yang mendefinisikan perilaku proses daur ulang |

## 🏗️ Gambaran Arsitektur

Project ini menggunakan beberapa pola inheritance yang saling berhubungan.

### 1. Hierarchical Inheritance

Hierarchical Inheritance merupakan pola pewarisan ketika beberapa subclass memiliki satu superclass yang sama.

Pada EcoCycle, class `SetoranKertas` dan `SetoranPlastik` sama-sama mewarisi class `SetoranSampah`.

```text
             SetoranSampah
             (Superclass)
                    |
           +--------+--------+
           |                 |
           v                 v
     SetoranKertas     SetoranPlastik
       (Subclass)        (Subclass)
```

### 2. Multilevel Inheritance

Multilevel Inheritance merupakan pola pewarisan bertingkat, ketika sebuah subclass menjadi superclass bagi class lainnya.

Pada EcoCycle, `SetoranBotolPET` mewarisi `SetoranPlastik`, sedangkan `SetoranPlastik` sendiri mewarisi `SetoranSampah`.

```text
       SetoranSampah
             |
             v
       SetoranPlastik
             |
             v
       SetoranBotolPET
```

Dengan struktur ini, `SetoranBotolPET` dapat menggunakan fitur yang berasal dari dua tingkat superclass.

### 3. Interface

Selain pewarisan antarkelas, EcoCycle juga menggunakan interface `DapatDidaurUlang`.

```text
       DapatDidaurUlang
              |
       +------+------+
       |             |
       v             v
SetoranKertas  SetoranPlastik
                      |
                      v
                SetoranBotolPET
```

Interface tersebut mendefinisikan perilaku `prosesDaurUlang()` yang diimplementasikan oleh class terkait.

## 1. SetoranSampah.java

`SetoranSampah` merupakan superclass utama yang menjadi dasar bagi seluruh jenis setoran sampah.

Class ini menyimpan data umum yang dimiliki setiap transaksi setoran, sehingga subclass tidak perlu mendefinisikan ulang atribut dan method yang sama.

### Atribut

```java
private String namaNasabah;
private double berat;
private double hargaPerKg;
```

Penjelasan:

- `namaNasabah`: Menyimpan nama nasabah yang melakukan setoran.
- `berat`: Menyimpan berat sampah dalam kilogram.
- `hargaPerKg`: Menyimpan harga sampah per kilogram.

Semua atribut menggunakan access modifier `private` untuk menerapkan Encapsulation.

### Constructor

```java
public SetoranSampah(
        String namaNasabah,
        double berat,
        double hargaPerKg) {

    setNamaNasabah(namaNasabah);
    setBerat(berat);
    setHargaPerKg(hargaPerKg);
}
```

Constructor digunakan untuk menginisialisasi objek setoran ketika dibuat.

Pada implementasi ini, constructor memanggil setter untuk memastikan nilai yang diberikan melewati proses validasi.

### Getter dan Setter

Getter digunakan untuk mengambil nilai atribut, sedangkan setter digunakan untuk mengubah nilai atribut dengan aturan tertentu.

Contoh:

```java
public double getBerat() {
    return berat;
}

public void setBerat(double berat) {
    if (berat > 0) {
        this.berat = berat;
    }
}
```

Pada setter `setBerat()`, nilai hanya akan disimpan apabila berat lebih besar dari nol.

Validasi serupa diterapkan pada nama nasabah dan harga per kilogram.

### Method hitungNilaiSetoran()

```java
public double hitungNilaiSetoran() {
    double beratSampah = this.berat;
    double hargaSampahPerKg = this.hargaPerKg;

    return beratSampah * hargaSampahPerKg;
}
```

Method ini digunakan untuk menghitung nilai setoran berdasarkan berat sampah dan harga per kilogram.

Rumus:

**Nilai Setoran = Berat Sampah × Harga per Kg**

Variabel lokal digunakan untuk menyimpan nilai sementara selama proses perhitungan.

### Method tampilkanInformasi()

```java
public void tampilkanInformasi() {
    System.out.println("Nama Nasabah : " + namaNasabah);
    System.out.println("Berat Sampah : " + berat + " kg");
    System.out.println("Harga per Kg : Rp" + formatRupiah(hargaPerKg));
    System.out.println("Nilai Setoran: Rp" + formatRupiah(hitungNilaiSetoran()));
}
```

Method ini menampilkan informasi umum mengenai transaksi setoran.

Method tersebut nantinya dapat dipanggil atau di-override oleh subclass.

### Method formatRupiah()

```java
protected String formatRupiah(double nilai) {
    return String.format("%,.0f", nilai).replace(',', '.');
}
```

Method ini digunakan untuk memformat angka agar lebih mudah dibaca dalam bentuk nilai rupiah.

Access modifier `protected` memungkinkan method digunakan oleh subclass.

## 2. DapatDidaurUlang.java

`DapatDidaurUlang` merupakan interface yang digunakan untuk mendefinisikan perilaku daur ulang pada jenis sampah.

### Source Code

```java
public interface DapatDidaurUlang {

    void prosesDaurUlang();
}
```

### Penjelasan

Keyword `interface` digunakan untuk membuat sebuah kontrak yang harus dipenuhi oleh class yang mengimplementasikannya.

Method:

```java
void prosesDaurUlang();
```

merupakan deklarasi method tanpa implementasi.

Class yang menggunakan interface ini wajib menyediakan implementasi method tersebut.

Dalam EcoCycle, interface ini digunakan oleh:

- `SetoranKertas`
- `SetoranPlastik`

Class `SetoranBotolPET` juga memiliki perilaku tersebut karena mewarisi `SetoranPlastik`.

Penggunaan interface membuat perilaku daur ulang dapat diterapkan pada beberapa jenis sampah tanpa mengharuskan seluruh class memiliki superclass tambahan.

## 3. SetoranKertas.java

`SetoranKertas` merupakan subclass yang mewarisi class `SetoranSampah` dan mengimplementasikan interface `DapatDidaurUlang`.

### Deklarasi Class

```java
public class SetoranKertas extends SetoranSampah
        implements DapatDidaurUlang {
```

Penjelasan:

- `extends SetoranSampah`: Menunjukkan bahwa class mewarisi superclass `SetoranSampah`.
- `implements DapatDidaurUlang`: Menunjukkan bahwa class mengimplementasikan interface `DapatDidaurUlang`.

### Atribut Khusus

```java
private String jenisKertas;
```

Atribut ini digunakan untuk menyimpan jenis kertas yang disetorkan, misalnya kardus.

### Constructor dan super()

```java
public SetoranKertas(
        String namaNasabah,
        double berat,
        double hargaPerKg,
        String jenisKertas) {

    super(namaNasabah, berat, hargaPerKg);
    setJenisKertas(jenisKertas);
}
```

Keyword `super()` digunakan untuk memanggil constructor superclass.

Dengan demikian, atribut umum seperti nama nasabah, berat, dan harga per kilogram dapat diinisialisasi melalui constructor `SetoranSampah`.

Selanjutnya, atribut khusus `jenisKertas` diinisialisasi menggunakan setter.

### Method Overriding

```java
@Override
public void tampilkanInformasi() {
    System.out.println("=== SETORAN SAMPAH KERTAS ===");
    super.tampilkanInformasi();
    System.out.println("Jenis Kertas: " + jenisKertas);
}
```

Annotation `@Override` digunakan untuk menandai bahwa subclass menyediakan implementasi baru dari method yang diwariskan.

Keyword `super` pada:

```java
super.tampilkanInformasi();
```

digunakan untuk memanggil implementasi method `tampilkanInformasi()` milik superclass.

Setelah informasi umum ditampilkan, subclass menambahkan informasi khusus berupa jenis kertas.

### Implementasi Interface

```java
@Override
public void prosesDaurUlang() {
    System.out.println(
        "Kertas dipilah, dihancurkan, dan diproses menjadi bahan kertas baru."
    );
}
```

Method ini merupakan implementasi dari interface `DapatDidaurUlang`.

Fungsinya adalah menampilkan proses daur ulang sampah kertas.

## 4. SetoranPlastik.java

`SetoranPlastik` merupakan subclass dari `SetoranSampah` yang mengimplementasikan interface `DapatDidaurUlang`.

### Deklarasi Class

```java
public class SetoranPlastik extends SetoranSampah
        implements DapatDidaurUlang {
```

Class ini memiliki hubungan inheritance yang sama dengan `SetoranKertas`.

Perbedaannya terletak pada atribut dan perilaku khusus yang dimiliki.

### Atribut Khusus

```java
private String jenisPlastik;
```

Atribut ini digunakan untuk menyimpan jenis plastik yang disetorkan, misalnya botol PET.

### Constructor

```java
public SetoranPlastik(
        String namaNasabah,
        double berat,
        double hargaPerKg,
        String jenisPlastik) {

    super(namaNasabah, berat, hargaPerKg);
    setJenisPlastik(jenisPlastik);
}
```

Constructor menggunakan `super()` untuk memanggil constructor superclass dan menginisialisasi data umum setoran.

Sementara itu, `setJenisPlastik()` digunakan untuk mengisi atribut khusus milik subclass.

### Method Overriding

```java
@Override
public void tampilkanInformasi() {
    System.out.println("=== SETORAN SAMPAH PLASTIK ===");
    super.tampilkanInformasi();
    System.out.println("Jenis Plastik: " + jenisPlastik);
}
```

Method ini menggantikan implementasi `tampilkanInformasi()` dari superclass.

Dengan demikian, informasi umum setoran tetap ditampilkan, kemudian ditambahkan jenis plastik.

### Implementasi Interface

```java
@Override
public void prosesDaurUlang() {
    System.out.println(
        "Plastik dipilah, dibersihkan, dan diolah menjadi bahan baku plastik."
    );
}
```

Method ini merupakan implementasi perilaku daur ulang khusus untuk sampah plastik.

## 5. SetoranBotolPET.java

`SetoranBotolPET` merupakan subclass dari `SetoranPlastik`.

Class ini menjadi pengembangan baru pada Pertemuan 8 untuk menerapkan konsep Multilevel Inheritance.

### Deklarasi Class

```java
public class SetoranBotolPET extends SetoranPlastik {
```

Dengan menggunakan `extends SetoranPlastik`, class ini mewarisi atribut dan method dari `SetoranPlastik`.

Secara tidak langsung, class ini juga mendapatkan fitur yang berasal dari `SetoranSampah`.

### Atribut Khusus

```java
private String kodeResin;
```

Atribut ini digunakan untuk menyimpan kode resin plastik.

Pada contoh program, botol PET menggunakan kode resin `PET-1`.

### Constructor dan super()

```java
public SetoranBotolPET(
        String namaNasabah,
        double berat,
        double hargaPerKg,
        String kodeResin) {

    super(namaNasabah, berat, hargaPerKg, "Botol PET");
    setKodeResin(kodeResin);
}
```

Pemanggilan `super()` mengarah ke constructor `SetoranPlastik`.

Karena `SetoranPlastik` merupakan subclass dari `SetoranSampah`, constructor tersebut juga memanggil constructor superclass berikutnya.

Dengan demikian, proses inisialisasi berlangsung secara bertingkat.

Nilai `"Botol PET"` digunakan sebagai jenis plastik untuk setiap objek `SetoranBotolPET`.

### Method Overriding

```java
@Override
public void tampilkanInformasi() {
    System.out.println("=== SETORAN BOTOL PET ===");
    super.tampilkanInformasi();
    System.out.println("Kode Resin: " + kodeResin);
}
```

Method ini menggantikan implementasi `tampilkanInformasi()` yang diwariskan dari `SetoranPlastik`.

Pemanggilan `super.tampilkanInformasi()` menjalankan implementasi milik `SetoranPlastik`, yang kemudian memanggil implementasi milik `SetoranSampah`.

Hal ini menunjukkan bagaimana method dapat diwariskan dan dipanggil secara bertingkat dalam Multilevel Inheritance.

### Method prosesDaurUlang()

```java
@Override
public void prosesDaurUlang() {
    System.out.println(
        "Botol PET dipilah, dibersihkan, dan diproses menjadi serpihan plastik untuk didaur ulang."
    );
}
```

Meskipun `SetoranBotolPET` tidak mengimplementasikan interface secara langsung, class ini mewarisi interface `DapatDidaurUlang` melalui `SetoranPlastik`.

Method tersebut kemudian di-override untuk memberikan perilaku daur ulang yang lebih spesifik.

## 6. EcoCycle.java

`EcoCycle` merupakan class utama yang bertanggung jawab menjalankan aplikasi.

Class ini menghubungkan seluruh implementasi inheritance, interface, dan polymorphism yang telah dibuat.

### Method main()

```java
public static void main(String[] args) {
    jalankanAplikasi();
}
```

Method `main()` merupakan titik awal eksekusi program Java.

Ketika program dijalankan, method ini akan memanggil `jalankanAplikasi()`.

### Membuat Objek

```java
SetoranPlastik setoranPlastik = new SetoranPlastik(
    "Ilham",
    5.0,
    3000,
    "Botol PET Campuran"
);
```

Kode tersebut membuat objek dari class `SetoranPlastik`.

Objek lainnya dibuat menggunakan class `SetoranKertas` dan `SetoranBotolPET`.

Setiap objek memiliki data nasabah, berat sampah, harga per kilogram, serta atribut khusus masing-masing.

### Polymorphism

```java
static void tampilkanSetoran(SetoranSampah setoran) {
    setoran.tampilkanInformasi();
}
```

Method ini menerima parameter bertipe `SetoranSampah`.

Meskipun demikian, objek yang dikirim dapat berasal dari subclass seperti `SetoranKertas`, `SetoranPlastik`, atau `SetoranBotolPET`.

Ketika method dipanggil, Java akan menjalankan implementasi `tampilkanInformasi()` sesuai tipe objek sebenarnya.

Hal ini merupakan penerapan Runtime Polymorphism.

### Pemanggilan Interface

```java
static void tampilkanProsesDaurUlang(DapatDidaurUlang material) {
    material.prosesDaurUlang();
}
```

Method ini menerima objek yang memiliki tipe interface `DapatDidaurUlang`.

Dengan demikian, berbagai jenis setoran dapat menjalankan perilaku daur ulang melalui satu method yang sama.

### Menghitung Total Setoran

```java
static double hitungTotalSetoran(
        double nilaiPertama,
        double nilaiKedua,
        double nilaiKetiga) {

    return nilaiPertama + nilaiKedua + nilaiKetiga;
}
```

Method ini digunakan untuk menjumlahkan nilai dari tiga transaksi setoran.

Hasilnya kemudian ditampilkan sebagai total seluruh setoran.

## 🧠 Konsep OOP yang Diterapkan

Berikut rangkuman konsep OOP yang digunakan dalam pengembangan EcoCycle Pertemuan 8.

| Konsep | Implementasi |
|---|---|
| Class & Object | Seluruh class dan objek transaksi setoran |
| Encapsulation | Atribut `private`, getter, dan setter |
| Inheritance | `extends` |
| Superclass | `SetoranSampah` |
| Subclass | `SetoranKertas`, `SetoranPlastik`, `SetoranBotolPET` |
| Constructor | Inisialisasi objek setoran |
| `super()` | Memanggil constructor superclass |
| Method Overriding | `@Override` |
| `super.method()` | Memanggil implementasi method superclass |
| Hierarchical Inheritance | Kertas dan plastik mewarisi SetoranSampah |
| Multilevel Inheritance | Botol PET mewarisi SetoranPlastik |
| Interface | `DapatDidaurUlang` |
| Multiple Inheritance melalui Interface | Class mewarisi superclass dan mengimplementasikan interface |
| Polymorphism | Referensi superclass dan interface |

## 🔄 Alur Program

Berikut urutan proses yang dilakukan ketika aplikasi dijalankan:

1. Program dimulai melalui method `main()`.
2. Method `jalankanAplikasi()` dipanggil.
3. Program membuat objek `SetoranPlastik`, `SetoranKertas`, dan `SetoranBotolPET`.
4. Setiap objek menyimpan informasi transaksi sesuai class masing-masing.
5. Method `tampilkanSetoran()` dipanggil untuk menampilkan informasi setiap objek.
6. Java menjalankan method `tampilkanInformasi()` berdasarkan class objek sebenarnya.
7. Method `tampilkanProsesDaurUlang()` dipanggil untuk menjalankan perilaku daur ulang melalui interface.
8. Program menghitung nilai setiap setoran.
9. Seluruh nilai transaksi dijumlahkan.
10. Program menampilkan ringkasan total setoran.

## 🖥️ Output Program

Berikut gambaran hasil eksekusi program EcoCycle Pertemuan 8:

```text
====================================
       EcoCycle - Bank Sampah
       Pertemuan 8
====================================

=== SETORAN SAMPAH PLASTIK ===
Nama Nasabah : Ilham
Berat Sampah : 5.0 kg
Harga per Kg : Rp3.000
Nilai Setoran: Rp15.000
Jenis Plastik: Botol PET Campuran

=== SETORAN SAMPAH KERTAS ===
Nama Nasabah : Budi
Berat Sampah : 4.0 kg
Harga per Kg : Rp2.000
Nilai Setoran: Rp8.000
Jenis Kertas: Kardus

=== SETORAN BOTOL PET ===
=== SETORAN SAMPAH PLASTIK ===
Nama Nasabah : Andi
Berat Sampah : 3.0 kg
Harga per Kg : Rp5.000
Nilai Setoran: Rp15.000
Jenis Plastik: Botol PET
Kode Resin: PET-1

=== PROSES DAUR ULANG ===
Plastik dipilah, dibersihkan, dan diolah menjadi bahan baku plastik.
Kertas dipilah, dihancurkan, dan diproses menjadi bahan kertas baru.
Botol PET dipilah, dibersihkan, dan diproses menjadi serpihan plastik untuk didaur ulang.

=== RINGKASAN SETORAN ===
Nilai setoran plastik : Rp15.000
Nilai setoran kertas  : Rp8.000
Nilai setoran botol PET: Rp15.000
------------------------------------
Total seluruh setoran : Rp38.000
```

**Catatan:** Pada objek `SetoranBotolPET`, terdapat dua judul informasi karena method `tampilkanInformasi()` milik `SetoranBotolPET` memanggil implementasi `SetoranPlastik` melalui `super.tampilkanInformasi()`. Ini merupakan efek dari pemanggilan method secara bertingkat.

## ▶️ Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terpasang.

Periksa instalasi Java:

```bash
java -version
javac -version
```

Pastikan terminal berada di root repository `Belajar Java`.

### 1. Kompilasi Program

```bash
javac -d out src/project_ecocycle/pertemuan_08/*.java
```

Perintah tersebut digunakan untuk mengompilasi seluruh file Java pada folder Pertemuan 8.

### 2. Menjalankan Program

```bash
java -cp out project_ecocycle.pertemuan_08.EcoCycle
```

Jika proses kompilasi berhasil, program akan menampilkan informasi setoran plastik, kertas, botol PET, proses daur ulang, serta ringkasan total setoran.

## 📝 Kesimpulan

Pengembangan EcoCycle pada Pertemuan 8 menunjukkan penerapan konsep Inheritance yang lebih luas dibandingkan pertemuan sebelumnya.

Melalui class `SetoranSampah`, `SetoranKertas`, dan `SetoranPlastik`, program menerapkan Hierarchical Inheritance. Selanjutnya, penambahan class `SetoranBotolPET` memperlihatkan penerapan Multilevel Inheritance.

Selain itu, penggunaan interface `DapatDidaurUlang` memungkinkan beberapa jenis setoran memiliki perilaku daur ulang yang dapat diimplementasikan secara berbeda.

Project ini juga mempertahankan konsep Encapsulation, Constructor, Method Overriding, dan Polymorphism yang telah dipelajari sebelumnya.

Dengan pengembangan ini, EcoCycle menjadi contoh penerapan berbagai konsep OOP dalam sebuah project Java yang saling berhubungan dan dikembangkan secara bertahap sesuai materi perkuliahan.

---

**Author:** Ilham Firmansyah

**Course:** Object-Oriented Programming (CSF308)

**Project:** EcoCycle — Bank Sampah

**Meeting:** Pertemuan 8

**Topic:** Inheritance (Basic & Detail)

**Language:** Java