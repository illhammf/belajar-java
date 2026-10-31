# 📝 Kuis Praktikum Pemrograman Berorientasi Objek (PBO)

Repository ini berisi implementasi tiga studi kasus praktikum **Pemrograman Berorientasi Objek (PBO) menggunakan Java**. Program dibuat untuk menerapkan konsep class, object, attribute, method, constructor, encapsulation, getter, setter, validasi data, serta interaksi pengguna menggunakan `Scanner`.

Kuis ini terdiri dari tiga studi kasus dengan tingkat kesulitan berbeda, mulai dari pengelolaan data buku, pengelolaan nilai mahasiswa, hingga sistem transaksi penjualan.

## 📚 Daftar Isi

- [Informasi Kuis](#-informasi-kuis)
- [Tujuan Pembelajaran](#-tujuan-pembelajaran)
- [Struktur Folder](#-struktur-folder)
- [Persiapan Lingkungan](#-persiapan-lingkungan)
- [Soal 1 — Sistem Informasi Buku](#-soal-1--sistem-informasi-buku)
- [Soal 2 — Pengelolaan Nilai Mahasiswa](#-soal-2--pengelolaan-nilai-mahasiswa)
- [Soal 3 — Sistem Transaksi Penjualan](#-soal-3--sistem-transaksi-penjualan)
- [Konsep PBO yang Digunakan](#-konsep-pbo-yang-digunakan)
- [Panduan Kompilasi dan Eksekusi](#-panduan-kompilasi-dan-eksekusi)
- [Skenario Pengujian](#-skenario-pengujian)
- [Kesimpulan](#-kesimpulan)

---

## 📌 Informasi Kuis

| Informasi | Keterangan |
|---|---|
| Mata Kuliah | Pemrograman Berorientasi Objek |
| Bahasa Pemrograman | Java |
| Materi | Class, Object, Constructor, Encapsulation, Getter, Setter, dan Validasi |
| Jumlah Studi Kasus | 3 soal |
| Total Poin | 100 poin |
| Durasi Kuis | 90 menit |
| Metode Pengerjaan | Individu |

### Pembagian Soal

| No. | Studi Kasus | Tingkat Kesulitan | Poin |
|---|---|---|---:|
| 1 | Sistem Informasi Buku | Mudah | 20 |
| 2 | Pengelolaan Nilai Mahasiswa | Sedang | 30 |
| 3 | Sistem Transaksi Penjualan | Sulit | 50 |
| | **Total** | | **100** |

## 🎯 Tujuan Pembelajaran

Melalui ketiga studi kasus ini, mahasiswa diharapkan mampu:

1. Membuat class sebagai cetak biru objek dalam Java.
2. Mendefinisikan attribute untuk menyimpan data suatu objek.
3. Membuat constructor untuk menginisialisasi objek.
4. Membuat object berdasarkan class yang telah didefinisikan.
5. Membuat method untuk menjalankan fungsi tertentu.
6. Menerapkan encapsulation menggunakan access modifier `private`.
7. Menggunakan getter untuk membaca atribut dan setter untuk mengubah atribut.
8. Menerapkan validasi agar data tetap sesuai dengan aturan program.
9. Menerima input pengguna menggunakan class `Scanner`.
10. Mengimplementasikan logika perhitungan dan pengambilan keputusan.

> **Batasan materi:** Sesuai instruksi kuis, implementasi tidak menggunakan inheritance, polymorphism, abstract class, maupun interface.

---

## 📂 Struktur Folder

```text
KUIS-PBO/
├── README.md
│
├── Soal1/
│   └── Buku.java
│
├── Soal2/
│   └── Mahasiswa.java
│
└── Soal3/
    ├── Barang.java
    └── Toko.java
```

### Penjelasan Struktur

| File | Fungsi |
|---|---|
| `README.md` | Dokumentasi seluruh studi kasus dan panduan menjalankan program |
| `Soal1/Buku.java` | Mengelola data buku dan menampilkan informasinya |
| `Soal2/Mahasiswa.java` | Mengelola identitas, nilai, perhitungan nilai akhir, dan status kelulusan |
| `Soal3/Barang.java` | Mengelola informasi barang, validasi, stok, dan perhitungan pembayaran |
| `Soal3/Toko.java` | Menampilkan menu toko, menerima input, memproses transaksi, dan mencetak struk |

Setiap folder soal memiliki implementasi yang terpisah agar program mudah dipelajari, diuji, dan dikembangkan.

---

## 🛠️ Persiapan Lingkungan

Sebelum menjalankan program, pastikan perangkat telah memiliki:

- **Java Development Kit (JDK)** untuk melakukan kompilasi dan menjalankan program Java.
- **Visual Studio Code** atau editor Java lainnya.
- Terminal untuk menjalankan perintah kompilasi dan eksekusi.

Periksa instalasi Java melalui terminal:

```bash
java -version
javac -version
```

Jika kedua perintah menampilkan versi Java, lingkungan pengembangan siap digunakan.

---

# 🟢 Soal 1 — Sistem Informasi Buku

**Tingkat Kesulitan:** Mudah  
**Bobot:** 20 poin  
**File:** `Soal1/Buku.java`

## 1. Deskripsi Studi Kasus

Studi kasus pertama adalah program sederhana untuk mengelola informasi buku.

Program meminta pengguna memasukkan data dua buku. Setiap buku memiliki judul, penulis, dan tahun terbit. Setelah data dimasukkan, program membuat dua objek `Buku` dan menampilkan informasi masing-masing objek.

## 2. Ketentuan Program

Program harus memiliki:

- Class `Buku`.
- Attribute `judul`, `penulis`, dan `tahunTerbit`.
- Constructor untuk menginisialisasi seluruh attribute.
- Method `tampilkanInfo()` untuk menampilkan data buku.
- Minimal dua objek dengan data berbeda.
- Pemanggilan method `tampilkanInfo()` pada setiap objek.

## 3. Konsep PBO yang Digunakan

### A. Class

Class `Buku` menjadi cetak biru untuk membuat objek buku.

```java
public class Buku {
    // Atribut dan method buku
}
```

Class mendefinisikan data apa saja yang dimiliki buku dan tindakan apa yang dapat dilakukan terhadap data tersebut.

### B. Attribute

Attribute menyimpan informasi setiap buku.

```java
private String judul;
private String penulis;
private int tahunTerbit;
```

Penjelasan:

| Attribute | Tipe Data | Kegunaan |
|---|---|---|
| `judul` | `String` | Menyimpan judul buku |
| `penulis` | `String` | Menyimpan nama penulis |
| `tahunTerbit` | `int` | Menyimpan tahun terbit buku |

Attribute menggunakan `private` agar data tidak dapat diakses langsung dari luar class.

### C. Constructor

Constructor digunakan untuk memberikan nilai awal ketika objek dibuat.

```java
public Buku(String judul, String penulis, int tahunTerbit) {
    this.judul = judul;
    this.penulis = penulis;
    this.tahunTerbit = tahunTerbit;
}
```

Sebagai contoh:

```java
Buku buku1 = new Buku("Pemrograman Java", "Andi", 2024);
```

Ketika objek dibuat, constructor menerima tiga parameter dan menyimpannya ke attribute objek.

Keyword `this` merujuk pada attribute milik objek yang sedang dibuat.

### D. Object

Objek merupakan instance dari class.

```java
Buku buku1 = new Buku("Pemrograman Java", "Andi", 2024);
Buku buku2 = new Buku("Dasar Pemrograman", "Budi", 2023);
```

Kedua objek menggunakan class yang sama, tetapi masing-masing memiliki data sendiri.

### E. Method

Method `tampilkanInfo()` bertugas menampilkan informasi buku.

```java
public void tampilkanInfo() {
    System.out.println("Judul        : " + judul);
    System.out.println("Penulis      : " + penulis);
    System.out.println("Tahun Terbit : " + tahunTerbit);
}
```

Method dipanggil melalui objek:

```java
buku1.tampilkanInfo();
buku2.tampilkanInfo();
```

### F. Scanner

`Scanner` digunakan untuk menerima data yang dimasukkan pengguna melalui keyboard.

```java
import java.util.Scanner;
```

Objek `Scanner` dibuat menggunakan:

```java
Scanner input = new Scanner(System.in);
```

Data teks dibaca dengan:

```java
String judul = input.nextLine();
```

Sedangkan tahun terbit dibaca sebagai bilangan bulat menggunakan:

```java
int tahun = Integer.parseInt(input.nextLine());
```

Dengan `Scanner`, data buku tidak harus ditentukan langsung di dalam kode program.

## 4. Alur Program

1. Program meminta judul, penulis, dan tahun terbit buku pertama.
2. Data tersebut digunakan untuk membuat objek `buku1`.
3. Program meminta data buku kedua.
4. Data digunakan untuk membuat objek `buku2`.
5. Program memanggil `tampilkanInfo()` pada kedua objek.
6. Informasi kedua buku ditampilkan di terminal.

## 5. Contoh Input

```text
=== INPUT BUKU PERTAMA ===
Judul buku   : Pemrograman Java
Penulis      : Andi
Tahun terbit : 2024

=== INPUT BUKU KEDUA ===
Judul buku   : Dasar Pemrograman
Penulis      : Budi
Tahun terbit : 2023
```

## 6. Contoh Output

```text
=== DATA BUKU ===
Judul        : Pemrograman Java
Penulis      : Andi
Tahun Terbit : 2024

=== DATA BUKU ===
Judul        : Dasar Pemrograman
Penulis      : Budi
Tahun Terbit : 2023
```

## 7. Kesimpulan Soal 1

Studi kasus ini menerapkan konsep dasar PBO melalui class, attribute, constructor, object, dan method. Penggunaan `Scanner` memungkinkan pengguna memasukkan data buku secara langsung, sedangkan `tampilkanInfo()` digunakan untuk menampilkan data dari setiap objek.

---

# 🟡 Soal 2 — Pengelolaan Nilai Mahasiswa

**Tingkat Kesulitan:** Sedang  
**Bobot:** 30 poin  
**File:** `Soal2/Mahasiswa.java`

## 1. Deskripsi Studi Kasus

Studi kasus kedua adalah program untuk mengelola nilai mahasiswa dan menentukan status kelulusannya.

Program meminta pengguna memasukkan NIM, nama, nilai tugas, nilai UTS, dan nilai UAS. Seluruh nilai harus berada dalam rentang 0–100.

Setelah data valid diterima, program menghitung nilai akhir berdasarkan bobot yang ditentukan dan menampilkan status kelulusan mahasiswa.

## 2. Ketentuan Program

Program harus memiliki:

- Class `Mahasiswa`.
- Attribute `nim`, `nama`, `nilaiTugas`, `nilaiUTS`, dan `nilaiUAS`.
- Seluruh attribute menggunakan `private`.
- Constructor, getter, dan setter nilai.
- Validasi nilai dari 0 sampai 100.
- Method `hitungNilaiAkhir()`.
- Method `tentukanStatus()`.
- Tampilan data mahasiswa dan hasil penilaian.

### Bobot Penilaian

| Komponen | Bobot |
|---|---:|
| Tugas | 30% |
| UTS | 30% |
| UAS | 40% |
| **Total** | **100%** |

Mahasiswa dinyatakan **LULUS** apabila nilai akhir lebih besar dari atau sama dengan 60.

## 3. Konsep PBO yang Digunakan

### A. Class dan Attribute

Class `Mahasiswa` mendefinisikan data dan operasi yang berkaitan dengan penilaian mahasiswa.

```java
public class Mahasiswa {
    private String nim;
    private String nama;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;
}
```

Attribute `nim` dan `nama` menyimpan identitas mahasiswa, sedangkan tiga attribute nilai menyimpan komponen penilaian.

Tipe data `double` digunakan agar nilai dapat berupa bilangan desimal.

### B. Encapsulation

Encapsulation membatasi akses langsung ke attribute suatu objek.

```java
private double nilaiTugas;
private double nilaiUTS;
private double nilaiUAS;
```

Karena attribute menggunakan `private`, class lain tidak dapat membaca atau mengubahnya secara langsung.

Pengaksesan dan perubahan data dilakukan melalui method yang disediakan class.

### C. Constructor

Constructor digunakan untuk menginisialisasi identitas dan nilai mahasiswa.

```java
public Mahasiswa(String nim, String nama,
                 double nilaiTugas, double nilaiUTS, double nilaiUAS) {
    this.nim = nim;
    this.nama = nama;

    this.nilaiTugas = 0;
    this.nilaiUTS = 0;
    this.nilaiUAS = 0;

    setNilaiTugas(nilaiTugas);
    setNilaiUTS(nilaiUTS);
    setNilaiUAS(nilaiUAS);
}
```

Pada implementasi ini, nilai awal ditetapkan menjadi nol terlebih dahulu. Selanjutnya, setter dipanggil untuk memastikan setiap nilai melewati proses validasi.

### D. Getter

Getter digunakan untuk membaca nilai attribute.

Contoh:

```java
public double getNilaiTugas() {
    return nilaiTugas;
}
```

Method tersebut mengembalikan nilai tugas yang tersimpan di dalam objek.

Getter lainnya digunakan untuk membaca NIM, nama, nilai UTS, dan nilai UAS.

### E. Setter dan Validasi

Setter digunakan untuk mengubah nilai attribute.

```java
public void setNilaiTugas(double nilaiTugas) {
    if (Double.isFinite(nilaiTugas)
            && nilaiTugas >= 0 && nilaiTugas <= 100) {
        this.nilaiTugas = nilaiTugas;
    } else {
        System.out.println("Nilai tugas tidak valid! Nilai harus 0-100.");
    }
}
```

Validasi memastikan nilai berada pada rentang 0–100.

`Double.isFinite()` juga mencegah nilai seperti `NaN` dan tak hingga diterima sebagai nilai yang valid.

Jika input tidak valid, nilai sebelumnya tidak diubah.

Pola yang sama diterapkan pada setter nilai UTS dan UAS.

### F. Perhitungan Nilai Akhir

Method `hitungNilaiAkhir()` menghitung nilai akhir berdasarkan bobot yang ditentukan.

```java
public double hitungNilaiAkhir() {
    return (nilaiTugas * 0.30)
            + (nilaiUTS * 0.30)
            + (nilaiUAS * 0.40);
}
```

Rumus:

**Nilai Akhir = (Tugas × 30%) + (UTS × 30%) + (UAS × 40%)**

Contoh:

- Nilai tugas = 80
- Nilai UTS = 75
- Nilai UAS = 90

Perhitungan:

```text
Nilai Akhir = (80 × 0.30) + (75 × 0.30) + (90 × 0.40)
            = 24 + 22.5 + 36
            = 82.50
```

### G. Penentuan Status Kelulusan

```java
public String tentukanStatus() {
    if (hitungNilaiAkhir() >= 60) {
        return "LULUS";
    }

    return "TIDAK LULUS";
}
```

Method memeriksa nilai akhir mahasiswa.

- Nilai akhir ≥ 60: `LULUS`.
- Nilai akhir < 60: `TIDAK LULUS`.

### H. Scanner dan Input Nilai

Program menggunakan `Scanner` untuk membaca identitas dan nilai mahasiswa.

```java
Scanner input = new Scanner(System.in);
```

Method `bacaNilai()` digunakan untuk menerima nilai dari pengguna.

```java
double tugas = bacaNilai(input, "Nilai Tugas");
```

Method tersebut meminta input kembali apabila pengguna memasukkan teks yang bukan angka atau nilai di luar rentang 0–100.

Dengan demikian, program tidak langsung melanjutkan proses selama nilai yang dimasukkan belum valid.

## 4. Alur Program

1. Pengguna memasukkan NIM.
2. Pengguna memasukkan nama mahasiswa.
3. Pengguna memasukkan nilai tugas.
4. Program memvalidasi nilai tugas.
5. Pengguna memasukkan nilai UTS dan UAS, masing-masing dengan validasi.
6. Program membuat objek `Mahasiswa`.
7. Program menghitung nilai akhir.
8. Program menentukan status kelulusan.
9. Program menampilkan identitas, nilai, nilai akhir, dan status mahasiswa.

## 5. Contoh Input

```text
=== INPUT DATA MAHASISWA ===
NIM          : 2026001
Nama         : Sinta
Nilai Tugas (0-100): 80
Nilai UTS (0-100): 75
Nilai UAS (0-100): 90
```

## 6. Contoh Output

```text
=== HASIL PENILAIAN MAHASISWA ===
NIM          : 2026001
Nama         : Sinta
Nilai Tugas  : 80.0
Nilai UTS    : 75.0
Nilai UAS    : 90.0
Nilai Akhir  : 82.50
Status       : LULUS
```

## 7. Contoh Validasi Input

Misalnya pengguna memasukkan nilai UTS sebesar 120.

```text
Nilai UTS (0-100): 120
Nilai harus berada di antara 0 dan 100.
Nilai UTS (0-100):
```

Program meminta pengguna memasukkan nilai kembali sampai nilainya valid.

## 8. Kesimpulan Soal 2

Studi kasus ini menerapkan encapsulation melalui attribute `private`, getter, dan setter. Validasi memastikan nilai mahasiswa tetap berada dalam rentang yang diperbolehkan.

Selain itu, method `hitungNilaiAkhir()` dan `tentukanStatus()` memisahkan logika perhitungan nilai dari proses input dan tampilan program.

---

# 🔴 Soal 3 — Sistem Transaksi Penjualan

**Tingkat Kesulitan:** Sulit  
**Bobot:** 50 poin  
**File:** `Soal3/Barang.java` dan `Soal3/Toko.java`

## 1. Deskripsi Studi Kasus

Studi kasus ketiga adalah program sederhana untuk mengelola barang dan transaksi penjualan.

Program menyediakan menu untuk menampilkan informasi barang, menambah stok, melakukan pembelian, dan keluar dari aplikasi.

Setiap barang memiliki kode, nama, harga, dan stok. Program memvalidasi jumlah stok dan pembelian agar transaksi tidak melanggar ketentuan.

Jika subtotal pembelian mencapai Rp500.000 atau lebih, pembeli memperoleh diskon sebesar 10%.

## 2. Ketentuan Program

Program harus memiliki:

- Class `Barang`.
- Attribute `kodeBarang`, `namaBarang`, `harga`, dan `stok`.
- Seluruh attribute menggunakan `private`.
- Constructor dan getter.
- Method `tambahStok(int)`.
- Method `jualBarang(int)`.
- Method `hitungTotal(int)`.
- Diskon 10% untuk subtotal minimal Rp500.000.
- Validasi harga, stok awal, dan jumlah pembelian.
- Menu interaktif yang terus berjalan sampai pengguna memilih keluar.

## 3. Pembagian Tanggung Jawab Class

### A. Class `Barang`

Class `Barang` menangani data dan aturan transaksi pada tingkat barang.

Tanggung jawabnya meliputi:

- Menyimpan identitas barang.
- Menyimpan harga dan stok.
- Menyediakan getter.
- Menambah stok.
- Memvalidasi penjualan.
- Mengurangi stok pada transaksi yang valid.
- Menghitung total pembayaran dan diskon.

### B. Class `Toko`

Class `Toko` berfungsi sebagai program utama.

Tanggung jawabnya meliputi:

- Membuat objek barang.
- Menampilkan menu.
- Membaca input pengguna menggunakan `Scanner`.
- Memanggil method pada objek `Barang`.
- Menampilkan informasi barang.
- Menampilkan struk transaksi.
- Mengulang menu sampai pengguna memilih keluar.

Pemisahan ini membantu menjaga agar logika pengelolaan barang tidak bercampur dengan proses interaksi pengguna.

## 4. Konsep PBO yang Digunakan

### A. Encapsulation

Attribute pada class `Barang` dibuat `private`.

```java
private String kodeBarang;
private String namaBarang;
private double harga;
private int stok;
```

Class lain tidak dapat mengubah stok secara langsung.

Sebagai gantinya, class `Barang` menyediakan method `tambahStok()` dan `jualBarang()` untuk mengelola perubahan stok.

### B. Constructor dan Validasi Data

Constructor digunakan untuk menginisialisasi barang.

```java
public Barang(String kodeBarang, String namaBarang, double harga, int stok) {
    if (harga <= 0 || !Double.isFinite(harga)) {
        throw new IllegalArgumentException("Harga harus lebih dari 0!");
    }

    if (stok < 0) {
        throw new IllegalArgumentException("Stok tidak boleh negatif!");
    }

    this.kodeBarang = kodeBarang;
    this.namaBarang = namaBarang;
    this.harga = harga;
    this.stok = stok;
}
```

Validasi memastikan harga harus lebih dari nol dan stok awal tidak boleh negatif.

### C. Getter

Getter digunakan untuk membaca informasi barang.

```java
public String getNamaBarang() {
    return namaBarang;
}

public double getHarga() {
    return harga;
}

public int getStok() {
    return stok;
}
```

Sebagai contoh, `Toko` menggunakan `barang.getStok()` untuk mengetahui jumlah stok yang tersedia.

### D. Method `tambahStok(int)`

Method ini menambahkan stok jika jumlah yang dimasukkan valid.

```java
public boolean tambahStok(int jumlah) {
    if (jumlah <= 0) {
        System.out.println("Gagal! Jumlah stok harus lebih dari 0.");
        return false;
    }

    if (jumlah > Integer.MAX_VALUE - stok) {
        System.out.println("Gagal! Jumlah stok terlalu besar.");
        return false;
    }

    stok += jumlah;
    return true;
}
```

Method mengembalikan `true` apabila stok berhasil ditambahkan dan `false` apabila penambahan ditolak.

### E. Method `jualBarang(int)`

Method ini memvalidasi jumlah pembelian dan stok yang tersedia.

```java
public boolean jualBarang(int jumlah) {
    if (jumlah <= 0) {
        System.out.println("Gagal! Jumlah pembelian harus lebih dari 0.");
        return false;
    }

    if (jumlah > stok) {
        System.out.println("Gagal! Stok barang tidak mencukupi.");
        return false;
    }

    stok -= jumlah;
    return true;
}
```

Jika jumlah pembelian tidak valid atau stok tidak mencukupi, transaksi ditolak.

Jika transaksi valid, stok dikurangi sesuai jumlah pembelian.

### F. Method `hitungTotal(int)`

Method ini menghitung pembayaran setelah diskon.

```java
public double hitungTotal(int jumlah) {
    if (jumlah <= 0) {
        throw new IllegalArgumentException(
                "Jumlah pembelian harus lebih dari 0!"
        );
    }

    double subtotal = harga * jumlah;

    if (subtotal >= 500000) {
        return subtotal - (subtotal * 0.10);
    }

    return subtotal;
}
```

Rumus perhitungan:

**Subtotal = Harga × Jumlah Pembelian**

Jika subtotal minimal Rp500.000:

**Diskon = Subtotal × 10%**

**Total Bayar = Subtotal − Diskon**

Jika subtotal kurang dari Rp500.000, total pembayaran sama dengan subtotal.

### G. Scanner dan Menu Interaktif

Class `Toko` menggunakan:

```java
private static final Scanner input = new Scanner(System.in);
```

`Scanner` digunakan untuk membaca pilihan menu dan jumlah stok atau pembelian.

Menu menggunakan struktur `do-while` agar ditampilkan setidaknya sekali dan terus diulang selama pengguna belum memilih menu keluar.

```java
do {
    tampilkanMenu();
    pilihan = bacaInteger("Pilih menu: ");

    switch (pilihan) {
        // Memproses pilihan pengguna
    }
} while (pilihan != 4);
```

Struktur `switch` menentukan operasi berdasarkan pilihan pengguna.

| Pilihan | Operasi |
|---|---|
| 1 | Menampilkan barang |
| 2 | Menambahkan stok |
| 3 | Membeli barang |
| 4 | Keluar dari program |

### H. Perhitungan dan Struk Pembelian

Setelah transaksi dinyatakan valid, program menghitung subtotal, diskon, dan total pembayaran.

```java
double subtotal = barang.getHarga() * jumlah;
double totalBayar = barang.hitungTotal(jumlah);
double diskon = subtotal - totalBayar;
```

Program kemudian menampilkan rincian transaksi.

Method `formatRupiah()` digunakan agar nominal ditampilkan dengan format seperti `Rp150.000` dan `Rp540.000`.

## 5. Alur Program

1. Program membuat objek barang Keyboard dengan harga Rp150.000 dan stok awal 10 unit.
2. Program menampilkan menu utama.
3. Pengguna memilih salah satu menu.
4. Jika memilih menu 1, program menampilkan informasi barang.
5. Jika memilih menu 2, program meminta jumlah stok yang akan ditambahkan.
6. Jika memilih menu 3, program meminta jumlah barang yang ingin dibeli.
7. Program memvalidasi jumlah pembelian dan stok.
8. Jika transaksi valid, program mengurangi stok, menghitung pembayaran, dan menampilkan struk.
9. Menu ditampilkan kembali.
10. Program berhenti jika pengguna memilih menu 4.

## 6. Contoh Input Transaksi

```text
=== MENU TOKO ===
1. Tampilkan Barang
2. Tambah Stok
3. Beli Barang
4. Keluar

Pilih menu: 3
Jumlah yang dibeli: 4
```

## 7. Contoh Output Struk

```text
=== STRUK PEMBELIAN ===
Nama Barang : Keyboard
Harga       : Rp150.000
Jumlah      : 4
Subtotal    : Rp600.000
Diskon 10%  : Rp60.000
Total Bayar : Rp540.000
Sisa Stok   : 6
Transaksi berhasil!
```

## 8. Contoh Validasi

### Pembelian melebihi stok

Jika stok tersedia 10 unit, tetapi pengguna membeli 15 unit, program menolak transaksi karena stok tidak mencukupi.

### Jumlah pembelian nol atau negatif

Pembelian dengan jumlah nol atau negatif ditolak karena jumlah pembelian harus lebih dari nol.

### Penambahan stok tidak valid

Penambahan stok dengan jumlah nol atau negatif ditolak.

### Input menu bukan angka

Jika pengguna memasukkan teks yang bukan bilangan bulat, method `bacaInteger()` meminta input kembali.

### Diskon

Diskon diberikan ketika subtotal pembelian mencapai atau melebihi Rp500.000.

## 9. Kesimpulan Soal 3

Studi kasus ini menerapkan encapsulation, constructor, getter, method, validasi data, pengambilan keputusan, serta pengulangan menu.

Pemisahan class `Barang` dan `Toko` membantu membedakan logika bisnis dengan interaksi pengguna. Program juga menerapkan validasi untuk menjaga agar stok tidak berubah ketika transaksi ditolak.

---

# 🧠 Konsep PBO yang Digunakan

Bagian ini merangkum konsep utama yang diterapkan pada ketiga studi kasus.

## 1. Class

Class merupakan cetak biru yang mendefinisikan attribute dan method objek.

Contoh:

```java
public class Buku {
    // Attribute dan method
}
```

## 2. Object

Object merupakan instance dari class.

Contoh:

```java
Buku buku1 = new Buku("Pemrograman Java", "Andi", 2024);
```

Objek dibuat menggunakan keyword `new`.

## 3. Attribute

Attribute menyimpan data yang dimiliki objek.

Contoh pada class `Buku`:

```java
private String judul;
private String penulis;
private int tahunTerbit;
```

## 4. Constructor

Constructor menginisialisasi objek ketika dibuat.

Contoh:

```java
public Buku(String judul, String penulis, int tahunTerbit) {
    this.judul = judul;
    this.penulis = penulis;
    this.tahunTerbit = tahunTerbit;
}
```

## 5. Method

Method merupakan fungsi yang didefinisikan di dalam class untuk melakukan operasi tertentu.

Contoh:

```java
public void tampilkanInfo() {
    System.out.println("Judul: " + judul);
}
```

## 6. Encapsulation

Encapsulation membatasi akses langsung terhadap data objek.

Contoh:

```java
private double nilaiTugas;
```

Data diakses atau diubah melalui method yang disediakan class.

## 7. Getter dan Setter

Getter digunakan untuk membaca nilai attribute.

```java
public double getNilaiTugas() {
    return nilaiTugas;
}
```

Setter digunakan untuk mengubah nilai attribute dengan validasi.

```java
public void setNilaiTugas(double nilaiTugas) {
    if (nilaiTugas >= 0 && nilaiTugas <= 100) {
        this.nilaiTugas = nilaiTugas;
    }
}
```

## 8. Validasi Data

Validasi memastikan data yang diterima sesuai aturan program.

Contoh:

- Nilai mahasiswa harus berada pada rentang 0–100.
- Harga barang harus lebih dari nol.
- Stok awal tidak boleh negatif.
- Jumlah pembelian harus lebih dari nol.
- Pembelian tidak boleh melebihi stok.

## 9. Input Menggunakan Scanner

`Scanner` menerima input dari keyboard.

```java
Scanner input = new Scanner(System.in);
String nama = input.nextLine();
```

Pada ketiga program, `Scanner` memungkinkan pengguna memasukkan data tanpa mengubah source code.

---

# ▶️ Panduan Kompilasi dan Eksekusi

## Soal 1 — Buku

Masuk ke folder `Soal1`:

```bash
cd Soal1
```

Kompilasi:

```bash
javac Buku.java
```

Jalankan:

```bash
java Buku
```

## Soal 2 — Mahasiswa

Masuk ke folder `Soal2`:

```bash
cd Soal2
```

Kompilasi:

```bash
javac Mahasiswa.java
```

Jalankan:

```bash
java Mahasiswa
```

## Soal 3 — Toko

Masuk ke folder `Soal3`:

```bash
cd Soal3
```

Kompilasi kedua file:

```bash
javac Barang.java Toko.java
```

Jalankan:

```bash
java Toko
```

> **Catatan:** Perintah `cd` dijalankan dari direktori induk yang sesuai. Jika terminal sudah berada di dalam folder soal, kamu tidak perlu menjalankan `cd` lagi.

---

# 🧪 Skenario Pengujian

Pengujian dilakukan untuk memastikan program berjalan sesuai ketentuan.

## Soal 1 — Buku

| No. | Pengujian | Hasil yang Diharapkan |
|---:|---|---|
| 1 | Memasukkan data buku pertama | Data berhasil diterima |
| 2 | Memasukkan data buku kedua | Data berhasil diterima |
| 3 | Menampilkan kedua buku | Informasi kedua buku ditampilkan |

**Catatan:** Implementasi Soal 1 saat ini mengharapkan tahun terbit berupa bilangan bulat. Validasi untuk input tahun yang bukan angka belum ditambahkan.

## Soal 2 — Mahasiswa

| No. | Pengujian | Hasil yang Diharapkan |
|---:|---|---|
| 1 | Memasukkan nilai 80 | Nilai diterima |
| 2 | Memasukkan nilai 120 | Program meminta input ulang |
| 3 | Memasukkan nilai -10 | Program meminta input ulang |
| 4 | Memasukkan teks pada kolom nilai | Program meminta input angka |
| 5 | Nilai akhir 82,50 | Status `LULUS` |
| 6 | Nilai akhir kurang dari 60 | Status `TIDAK LULUS` |

## Soal 3 — Toko

| No. | Pengujian | Hasil yang Diharapkan |
|---:|---|---|
| 1 | Menampilkan barang | Informasi barang ditampilkan |
| 2 | Menambah stok dengan jumlah valid | Stok bertambah |
| 3 | Menambah stok dengan jumlah negatif | Penambahan ditolak |
| 4 | Membeli barang dengan jumlah valid | Transaksi berhasil |
| 5 | Membeli barang melebihi stok | Transaksi ditolak |
| 6 | Membeli barang dengan jumlah nol | Transaksi ditolak |
| 7 | Subtotal Rp600.000 | Diskon Rp60.000 |
| 8 | Subtotal kurang dari Rp500.000 | Tidak ada diskon |
| 9 | Memasukkan pilihan menu yang tidak tersedia | Pesan pilihan tidak valid |
| 10 | Memasukkan teks pada menu | Program meminta input angka kembali |

---

# 🏁 Kesimpulan

Ketiga studi kasus pada Kuis Praktikum PBO Pertemuan 7 menerapkan konsep dasar Pemrograman Berorientasi Objek menggunakan Java.

**Soal 1 — Sistem Informasi Buku** berfokus pada class, object, attribute, constructor, dan method.

**Soal 2 — Pengelolaan Nilai Mahasiswa** memperdalam penggunaan encapsulation, getter, setter, validasi nilai, perhitungan nilai akhir, dan penentuan status kelulusan.

**Soal 3 — Sistem Transaksi Penjualan** menerapkan konsep PBO untuk mengelola data barang, memvalidasi transaksi, mengatur stok, menghitung diskon, dan membangun menu interaktif.

Penggunaan `Scanner` pada ketiga program memungkinkan interaksi langsung dengan pengguna. Secara keseluruhan, studi kasus ini menjadi latihan untuk memahami bagaimana konsep PBO diterapkan dalam program sederhana yang memiliki kebutuhan dan aturan berbeda.

---

## 📖 Referensi

- Materi dan instruksi **Kuis Praktikum Pemrograman Berorientasi Objek (PBO)**.
- Dokumentasi Java: [Java Documentation](https://docs.oracle.com/en/java/).
- Dokumentasi class `Scanner`: [Java Scanner API](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Scanner.html).