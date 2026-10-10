# ♻️ EcoCycle — Pertemuan 4: Function and Parameter

## 📖 Deskripsi

Pada pertemuan 4, EcoCycle dikembangkan dengan menerapkan materi **Function and Parameter** dalam Java.

Dibandingkan versi Pertemuan 3, proses program kini dipisahkan menjadi beberapa method agar kode lebih terstruktur, mudah dipahami, dan dapat digunakan kembali.

## 🎯 Tujuan Pengembangan

- Menerapkan function `void`.
- Membuat function dengan parameter dan return value.
- Memisahkan proses pemilihan kategori, perhitungan, dan tampilan hasil.
- Memanggil method dari method lainnya.
- Mempertahankan percabangan dan validasi dari Pertemuan 3.

## ✨ Fitur

1. Menampilkan informasi EcoCycle.
2. Memilih kategori sampah plastik, kertas, atau logam.
3. Memasukkan berat sampah.
4. Menghitung nilai setoran berdasarkan berat dan harga simulasi.
5. Memvalidasi kategori dan berat sampah.
6. Menampilkan hasil perhitungan setoran.

## 🧠 Penerapan Materi

| Materi | Method |
|---|---|
| Function `void` | `tampilkanMenu()`, `tampilkanInformasi()` |
| Parameter | `getJenisSampah(int kategori)` |
| Return value | `getHargaPerKg(int kategori)` |
| Dua parameter | `hitungNilaiSetoran(double berat, double hargaPerKg)` |
| Pemanggilan function | `prosesSetoran(Scanner input)` |
| Beberapa parameter | `tampilkanHasilSetoran(...)` |

## 💰 Harga Simulasi

| Jenis Sampah | Harga per kg |
|---|---:|
| Plastik | Rp4.000 |
| Kertas | Rp2.000 |
| Logam | Rp3.000 |

Harga tersebut hanya digunakan sebagai contoh pembelajaran.

**Rumus:** Nilai Setoran = Berat Sampah × Harga per Kilogram.

## ▶️ Cara Menjalankan

```powershell
javac EcoCycle.java
java EcoCycle
```

Jalankan perintah dari folder `src/project_ecocycle/pertemuan_04`.

## 🧪 Skenario Pengujian

| Pengujian | Hasil yang Diharapkan |
|---|---|
| Memilih menu informasi | Informasi EcoCycle ditampilkan |
| Memilih plastik dan berat 3 kg | Nilai setoran Rp12.000 |
| Memilih kategori tidak tersedia | Pesan kesalahan ditampilkan |
| Memasukkan berat 0 atau negatif | Pesan validasi berat ditampilkan |
| Memilih menu tidak tersedia | Pesan kesalahan menu ditampilkan |
| Memilih keluar | Pesan terima kasih ditampilkan |

## 🔄 Perkembangan dari Pertemuan 3

Pada Pertemuan 3, logika utama masih berada di dalam `main()`. Pada Pertemuan 4, logika tersebut dipisahkan menjadi beberapa method dengan tanggung jawab masing-masing.

Materi `if-else`, `switch`, `case`, `break`, dan `default` tetap dipakai sebagai dasar pengambilan keputusan.

## ⚠️ Batasan

- Program masih berbasis console.
- Data belum disimpan secara permanen.
- Harga sampah masih berupa simulasi.
- Belum ada data nasabah, saldo, dan riwayat transaksi.
- PostgreSQL belum diintegrasikan.

## 🚀 Pengembangan Berikutnya

EcoCycle akan dikembangkan kembali sesuai materi PBO pada pertemuan selanjutnya. Fitur dan struktur program akan ditambahkan secara bertahap, dengan tetap mempertahankan perkembangan sebelumnya.

---

**Project:** EcoCycle  
**Pengembang:** Ilham Firmansyah  
**Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)  
**Versi:** Pertemuan 4 — Function and Parameter