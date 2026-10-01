# ♻️ EcoCycle — Pertemuan 3: Control Statement

## 📖 Deskripsi

Pada pertemuan 3, project EcoCycle mulai dikembangkan dengan menerapkan materi **Control Statement** dalam Java.

Versi ini merupakan implementasi awal aplikasi pengelolaan sampah rumah tangga dan bank sampah digital. Program berjalan melalui terminal atau console dan belum menggunakan database.

## 🎯 Tujuan Pembelajaran

* Menerapkan percabangan `switch`.
* Memahami penggunaan `case`, `break`, dan `default`.
* Menerapkan kondisi menggunakan `if-else`.
* Melakukan validasi sederhana terhadap input pengguna.
* Menghitung nilai setoran sampah berdasarkan berat dan harga per kilogram.

## ✨ Fitur

1. Menampilkan informasi EcoCycle.
2. Memilih jenis sampah: plastik, kertas, atau logam.
3. Memasukkan berat sampah dalam kilogram.
4. Menghitung estimasi nilai setoran.
5. Memvalidasi pilihan menu, kategori sampah, dan berat setoran.
6. Menampilkan pesan ketika pengguna memilih menu yang tidak tersedia.

## 🧠 Materi Java yang Digunakan

| Materi              | Penerapan                                 |
| ------------------- | ----------------------------------------- |
| `switch`            | Memproses menu utama dan kategori sampah. |
| `case`              | Menentukan tindakan berdasarkan pilihan.  |
| `break`             | Mengakhiri pemrosesan pada suatu case.    |
| `default`           | Menangani pilihan yang tidak tersedia.    |
| `if-else`           | Memvalidasi berat sampah.                 |
| `Scanner`           | Membaca input dari pengguna.              |
| Operator aritmetika | Menghitung nilai setoran.                 |

## 💰 Simulasi Perhitungan

Harga sampah berikut hanya digunakan sebagai contoh latihan.

| Jenis Sampah | Harga per kg |
| ------------ | -----------: |
| Plastik      |      Rp4.000 |
| Kertas       |      Rp2.000 |
| Logam        |      Rp3.000 |

Rumus perhitungan:

**Nilai Setoran = Berat Sampah × Harga per Kilogram**

Contoh: jika pengguna menyetorkan 3 kg plastik dengan harga simulasi Rp4.000/kg, nilai setoran yang diperoleh adalah Rp12.000.

Nilai tersebut merupakan hasil perhitungan setoran, bukan saldo nasabah yang tersimpan secara permanen.

## ▶️ Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terpasang.

Buka terminal VS Code, lalu masuk ke folder pertemuan 3:

```powershell
cd src/project_ecocycle/pertemuan_03
```

Kompilasi program:

```powershell
javac EcoCycle.java
```

Jalankan program:

```powershell
java EcoCycle
```

## 🧪 Skenario Pengujian

| Skenario                    | Input                    | Hasil yang Diharapkan              |
| --------------------------- | ------------------------ | ---------------------------------- |
| Menampilkan informasi       | Menu `1`                 | Informasi EcoCycle ditampilkan.    |
| Menghitung setoran          | Menu `2`, plastik, 3 kg  | Nilai setoran Rp12.000.            |
| Pilihan menu tidak valid    | Menu `9`                 | Pesan pilihan menu tidak tersedia. |
| Kategori sampah tidak valid | Menu `2`, kategori `9`   | Pesan kategori tidak tersedia.     |
| Berat tidak valid           | Menu `2`, plastik, 0 kg  | Pesan berat harus lebih dari 0 kg. |
| Berat negatif               | Menu `2`, plastik, -2 kg | Pesan berat harus lebih dari 0 kg. |
| Keluar                      | Menu `3`                 | Pesan terima kasih ditampilkan.    |

## ⚠️ Batasan Versi Ini

* Program baru berjalan melalui console.
* Menu hanya diproses satu kali setiap program dijalankan.
* Data belum disimpan secara permanen.
* Harga sampah masih berupa nilai simulasi.
* Belum ada pengelolaan data nasabah dan saldo.
* Program mengasumsikan pengguna memasukkan data numerik sesuai permintaan.

## 🚀 Pengembangan Selanjutnya

Pada pertemuan 4, EcoCycle akan dikembangkan menggunakan materi **Function and Parameter**. Proses tertentu akan dipisahkan menjadi method sesuai materi, sehingga struktur program lebih terorganisasi.

Pengembangan berikutnya akan tetap mempertahankan fitur yang sudah dibuat dan menambahkan kemampuan baru secara bertahap.

---

**Project:** EcoCycle
**Pengembang:** Ilham Firmansyah
**Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)
**Pertemuan:** 3 — Control Statement
