# ♻️ EcoCycle — Pengembangan Pertemuan 6

## 📖 Deskripsi

Pertemuan 6 mengembangkan EcoCycle dengan menerapkan konsep encapsulation lanjutan dan inheritance dalam Java.

Pada versi ini, data umum setoran sampah dikelola melalui class induk `SetoranSampah`. Selanjutnya, class `SetoranPlastik` dan `SetoranKertas` menjadi class turunan yang mewarisi atribut serta perilaku yang dapat diakses dari class induk.

Pengembangan ini bertujuan agar data dan perilaku umum tidak perlu ditulis ulang pada setiap jenis sampah, sedangkan setiap subclass dapat memiliki informasi tambahan sesuai kategorinya.

## 🎯 Tujuan Pengembangan

- Mempertahankan encapsulation menggunakan atribut `private`.
- Menggunakan getter dan setter untuk mengelola data.
- Menerapkan inheritance menggunakan `extends`.
- Memanggil constructor superclass menggunakan `super()`.
- Menggunakan `@Override` untuk menyesuaikan perilaku method.
- Menghitung nilai setoran berdasarkan berat dan harga per kilogram.

## 📂 Struktur Folder

```text
pertemuan_06/
├── SetoranSampah.java
├── SetoranPlastik.java
├── SetoranKertas.java
├── EcoCycle.java
└── README.md
```

## 💻 Penjelasan Class

### 1. SetoranSampah

Class induk yang menyimpan data umum berupa nama nasabah, berat sampah, dan harga per kilogram. Class ini juga menyediakan validasi data, perhitungan nilai setoran, serta method untuk menampilkan informasi.

### 2. SetoranPlastik

Class turunan dari `SetoranSampah` yang menambahkan atribut `jenisPlastik`. Class ini menggunakan constructor superclass dan meng-override method `tampilkanInformasi()`.

### 3. SetoranKertas

Class turunan dari `SetoranSampah` yang menambahkan atribut `jenisKertas`. Class ini menggunakan perilaku umum dari superclass dan menampilkan informasi tambahan tentang jenis kertas.

### 4. EcoCycle

Class utama untuk membuat object setoran plastik dan kertas, menampilkan informasi setiap setoran, serta menghitung total nilai setoran.

## 🧠 Konsep OOP yang Diterapkan

| Konsep | Implementasi |
|---|---|
| Encapsulation | Atribut menggunakan `private`. |
| Getter dan setter | Mengakses dan mengubah atribut melalui method. |
| Validasi | Memeriksa berat, harga, dan teks sebelum diperbarui. |
| Inheritance | `SetoranPlastik` dan `SetoranKertas` menggunakan `extends SetoranSampah`. |
| Constructor | Menginisialisasi data object. |
| `super()` | Memanggil constructor atau method superclass. |
| Method overriding | Subclass menyesuaikan `tampilkanInformasi()`. |

## ▶️ Cara Menjalankan

Jalankan perintah berikut dari root repository:

```powershell
cd src/project_ecocycle/pertemuan_06
javac *.java
java EcoCycle
```

## 🧪 Pengujian

Program diuji menggunakan dua object:

- Setoran plastik seberat 5 kg dengan harga contoh Rp3.000/kg.
- Setoran kertas seberat 4 kg dengan harga contoh Rp2.000/kg.

Program menampilkan informasi setiap setoran dan menghitung total nilai setoran sebesar Rp23.000.

Harga tersebut hanya digunakan untuk pengujian.

## 📝 Catatan

Versi ini merupakan pengembangan demonstrasi inheritance dan encapsulation. Integrasi dengan menu, data nasabah, riwayat setoran, serta penyimpanan database dapat dilanjutkan pada tahapan pengembangan berikutnya.

## 📚 Materi

Mata Kuliah: Pemrograman Berorientasi Objek (PBO).

Bahasa Pemrograman: Java.