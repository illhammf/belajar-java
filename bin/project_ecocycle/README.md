# ♻️ EcoCycle — Sistem Pengelolaan Sampah Rumah Tangga dan Bank Sampah Digital

EcoCycle adalah project pembelajaran Java yang dikembangkan secara bertahap untuk menerapkan materi mata kuliah Pemrograman Berorientasi Objek (PBO) dari pertemuan 3 hingga pertemuan 14.

Project ini bertujuan untuk membangun aplikasi pengelolaan sampah rumah tangga dan bank sampah digital, mulai dari program sederhana hingga aplikasi yang memiliki struktur kode lebih terorganisasi dan terintegrasi dengan database.

## 🎯 Tujuan Project

* Menerapkan materi PBO ke dalam sebuah project yang berkembang secara bertahap.
* Mengembangkan kemampuan pemrograman Java melalui studi kasus nyata.
* Menerapkan konsep pemrograman sesuai materi setiap pertemuan.
* Mengembangkan pengelolaan data nasabah, kategori sampah, setoran, dan transaksi.
* Mempersiapkan integrasi dengan PostgreSQL melalui mata kuliah Basis Data.
* Mendokumentasikan proses pengembangan project menggunakan GitHub.

## 🌱 Gambaran Sistem

EcoCycle dirancang untuk membantu pengelolaan kegiatan bank sampah, meliputi:

* Pendataan nasabah.
* Pengelolaan kategori dan harga sampah.
* Pencatatan setoran sampah.
* Perhitungan nilai setoran berdasarkan berat dan harga.
* Pencatatan saldo dan riwayat transaksi.
* Pengelolaan jadwal penjemputan sampah.
* Penyajian laporan pengelolaan sampah.

Fitur-fitur tersebut akan ditambahkan secara bertahap sesuai materi yang dipelajari dan kebutuhan pengembangan project.

## 🛠️ Teknologi

* **Bahasa Pemrograman:** Java
* **Code Editor:** Visual Studio Code
* **Database:** PostgreSQL (direncanakan untuk tahap integrasi Basis Data)
* **Version Control:** Git dan GitHub

Teknologi dan struktur aplikasi dapat berkembang sesuai kebutuhan project serta materi perkuliahan.

## 📚 Perkembangan Project

### Pertemuan 3 — Control Statement

**Status:** Dalam pengembangan.

Pada pertemuan ini, EcoCycle mulai dikembangkan dengan menerapkan materi Control Statement.

Rencana implementasi:

* Menampilkan menu utama aplikasi.
* Memproses pilihan menu menggunakan `switch`.
* Menggunakan `if-else` untuk validasi pilihan.
* Menerima input sederhana terkait data sampah.
* Menampilkan informasi sesuai pilihan pengguna.

**Konsep yang diterapkan:** `if`, `if-else`, `else-if`, dan `switch` sesuai kebutuhan program.

Folder implementasi: [`pertemuan_03/`](./pertemuan_03/)

### Pertemuan 4 — Function and Parameter

**Status:** Direncanakan.

Program akan dikembangkan dengan memisahkan beberapa proses ke dalam method sesuai materi pertemuan 4.

Rencana implementasi:

* Memisahkan proses tampilan menu ke dalam method.
* Membuat method untuk menghitung nilai setoran sampah.
* Mempelajari penggunaan parameter dan nilai kembalian sesuai materi.
* Mengurangi pengulangan kode melalui penggunaan method.

Folder implementasi: [`pertemuan_04/`](./pertemuan_04/)

### Pertemuan 5–14

Bagian ini akan diperbarui secara bertahap mengikuti materi PBO setiap pertemuan. Setiap penambahan fitur akan didokumentasikan setelah implementasi dan pengujian dilakukan.

## 🗂️ Struktur Folder

```text
project_ecocycle/
├── README.md
├── pertemuan_03/
│   └── (kode EcoCycle berdasarkan materi pertemuan 3)
├── pertemuan_04/
│   └── (kode EcoCycle berdasarkan materi pertemuan 4)
└── ...
```

Struktur dapat berkembang sesuai kebutuhan implementasi. Setiap folder pertemuan menyimpan versi pengembangan EcoCycle berdasarkan materi yang dipelajari pada pertemuan tersebut.

## 🗄️ Rencana Integrasi Database

EcoCycle direncanakan menggunakan PostgreSQL untuk menyimpan data secara permanen.

Entitas yang berpotensi digunakan antara lain:

* Nasabah
* Kategori sampah
* Setoran sampah
* Transaksi saldo
* Penjemputan sampah

Rancangan tabel, relasi, dan koneksi Java ke PostgreSQL akan dibuat ketika tahap integrasi database dimulai.

## 🚀 Rencana Pengembangan

1. Mengembangkan program berdasarkan materi Control Statement.
2. Memperbaiki struktur program menggunakan method dan parameter.
3. Menambahkan fitur secara bertahap sesuai materi PBO.
4. Mengembangkan struktur objek dan relasi antarkomponen ketika materi OOP terkait dipelajari.
5. Mengintegrasikan PostgreSQL sesuai materi Basis Data.
6. Menguji dan menyempurnakan fitur aplikasi.
7. Melengkapi dokumentasi project hingga pertemuan 14.

## 👨‍💻 Pengembang

**Ilham Firmansyah**

Project pembelajaran Java untuk mata kuliah Pemrograman Berorientasi Objek (PBO).
