# ♻️ EcoCycle — Implementasi Pertemuan 7: Memory Management

## Deskripsi

Pertemuan 7 mengembangkan project EcoCycle dengan menerapkan konsep **Memory Management** dalam Java. Implementasi ini mempertahankan konsep encapsulation dan inheritance dari pertemuan sebelumnya, kemudian memperjelas alur pemanggilan method, penggunaan variabel lokal, dan penggunaan variabel referensi.

Project ini masih berupa program Java berbasis console. Database PostgreSQL dan antarmuka desktop belum ditambahkan pada tahap ini.

## Tujuan Implementasi

- Menunjukkan **Typical Calling Sequence** melalui pemanggilan method dari `main()` ke `jalankanAplikasi()`, lalu ke method-method pendukung.
- Menunjukkan **Call Frames with Simple Variables** melalui parameter dan variabel lokal untuk menghitung nilai setoran.
- Menunjukkan **Call Frames with Reference Variables** melalui variabel referensi yang menunjuk ke objek `SetoranPlastik` dan `SetoranKertas`.
- Mempertahankan encapsulation, inheritance, constructor, dan method overriding dari pertemuan sebelumnya.

## Struktur Folder

```text
src/
└── project_ecocycle/
    └── pertemuan_07/
        ├── EcoCycle.java
        ├── SetoranSampah.java
        ├── SetoranPlastik.java
        ├── SetoranKertas.java
        └── README.md
```

## Penjelasan File

### 1. `EcoCycle.java`

Class utama yang menjalankan program. Method `main()` memanggil `jalankanAplikasi()`. Method tersebut menyiapkan objek setoran plastik dan kertas, menampilkan informasi setoran, lalu menghitung total nilai setoran.

Di sini terlihat alur pemanggilan method dan penggunaan variabel referensi:

```java
SetoranSampah setoranPlastik = new SetoranPlastik(
    "Ilham", 5.0, 3000, "Botol PET"
);
```

Variabel `setoranPlastik` bertipe `SetoranSampah`, tetapi objek yang dibuat adalah `SetoranPlastik`. Ini dimungkinkan karena `SetoranPlastik` merupakan subclass dari `SetoranSampah`.

### 2. `SetoranSampah.java`

Class induk untuk data umum setoran: nama nasabah, berat, dan harga per kilogram. Atribut tetap `private`, sedangkan akses dan perubahan data dilakukan melalui getter dan setter.

Method `hitungNilaiSetoran()` menggunakan variabel lokal `beratSampah`, `hargaSampahPerKg`, dan `nilaiSetoran`. Variabel tersebut menjadi contoh sederhana variabel lokal yang digunakan saat sebuah method dieksekusi.

### 3. `SetoranPlastik.java`

Subclass dari `SetoranSampah` dengan atribut tambahan `jenisPlastik`. Constructor memanggil constructor induk melalui `super()`, dan method `tampilkanInformasi()` di-override untuk menampilkan informasi khusus plastik.

### 4. `SetoranKertas.java`

Subclass dari `SetoranSampah` dengan atribut tambahan `jenisKertas`. Class ini juga menggunakan `super()` dan meng-override `tampilkanInformasi()` untuk menampilkan informasi khusus kertas.

## Konsep Memory Management yang Diterapkan

### A. Typical Calling Sequence

Alur ringkas program:

```text
main()
  └── jalankanAplikasi()
      ├── tampilkanJudul()
      ├── membuat objek setoran
      ├── tampilkanSetoran(setoranPlastik)
      │   └── tampilkanInformasi()
      │       └── hitungNilaiSetoran()
      ├── tampilkanSetoran(setoranKertas)
      │   └── tampilkanInformasi()
      │       └── hitungNilaiSetoran()
      └── hitungTotalSetoran()
```

Ketika method yang dipanggil selesai, alur eksekusi kembali ke method pemanggil dan berlanjut ke perintah berikutnya.

### B. Call Frames with Simple Variables

Contoh variabel lokal:

```java
double nilaiPlastik = setoranPlastik.hitungNilaiSetoran();
double nilaiKertas = setoranKertas.hitungNilaiSetoran();
double totalSetoran = hitungTotalSetoran(nilaiPlastik, nilaiKertas);
```

Nilai `nilaiPlastik`, `nilaiKertas`, dan `totalSetoran` merupakan variabel lokal di dalam `jalankanAplikasi()`. Method `hitungTotalSetoran()` juga memiliki parameter dan variabel lokalnya sendiri.

Setiap pemanggilan method memiliki konteks eksekusi sendiri. Variabel lokal dengan nama yang sama di method berbeda tetap merupakan variabel yang berbeda.

### C. Call Frames with Reference Variables

Contoh:

```java
SetoranSampah setoranPlastik = new SetoranPlastik(...);
tampilkanSetoran(setoranPlastik);
```

Variabel `setoranPlastik` menyimpan referensi ke objek. Ketika variabel tersebut dikirim ke parameter `setoran`, nilai referensinya disalin ke parameter. Parameter tersebut kemudian dapat digunakan untuk memanggil method pada objek yang sama.

Java menggunakan **pass-by-value**. Untuk objek, nilai yang disalin adalah nilai referensinya; objeknya tidak otomatis disalin atau dibuat menjadi objek baru.

## Cara Menjalankan

Jalankan dari root repository:

```powershell
javac -d out src/project_ecocycle/pertemuan_07/*.java
java -cp out project_ecocycle.pertemuan_07.EcoCycle
```

Perintah `javac -d out` mengompilasi file dan menempatkan hasil `.class` ke folder `out`. Jika folder `out` belum ada, compiler akan membuatnya.

## Contoh Pengujian

Data contoh yang digunakan:

- Plastik: 5 kg × Rp3.000/kg = Rp15.000.
- Kertas: 4 kg × Rp2.000/kg = Rp8.000.
- Total nilai setoran = Rp23.000.

Harga tersebut hanya data contoh untuk pengujian program, bukan harga resmi bank sampah.

## Catatan

- Versi ini dibuat sebagai folder terpisah dari `pertemuan_06` agar perkembangan tiap pertemuan dapat dipelajari dan dibandingkan.
- Encapsulation dan inheritance dari pertemuan 6 tetap dipertahankan.
- Implementasi ini belum menggunakan database PostgreSQL atau antarmuka desktop.
- Pembagian stack dan heap merupakan model konseptual untuk memahami pemanggilan method dan objek; detail internal dapat bergantung pada JVM.

## Referensi

- Materi perkuliahan PBO, Week 7 — Memory Management.
- [Dokumentasi Java](https://docs.oracle.com/en/java/).
