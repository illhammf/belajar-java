# ♻️ EcoCycle — Pertemuan 5: Encapsulation

## 📖 Deskripsi

Pada Pertemuan 5, EcoCycle dikembangkan dengan menerapkan konsep **Encapsulation** dalam Java. Data setoran sampah dipisahkan ke dalam class `SetoranSampah`, dengan atribut `private` dan method `public` untuk mengakses serta mengelola data.

## 🎯 Tujuan Pengembangan

- Menerapkan atribut `private`.
- Menggunakan getter dan setter.
- Memvalidasi data melalui setter.
- Menggunakan constructor untuk membuat object.
- Memisahkan data setoran dari program utama.
- Mempertahankan function dan control statement dari pertemuan sebelumnya.

## ✨ Fitur

1. Menampilkan informasi EcoCycle.
2. Memilih jenis sampah.
3. Memasukkan berat sampah.
4. Memvalidasi kategori dan berat.
5. Membuat object `SetoranSampah`.
6. Menghitung dan menampilkan nilai setoran.

## 📂 Struktur Folder

```text
pertemuan_05/
├── EcoCycle.java
├── SetoranSampah.java
└── README.md
```

## 🧠 Penerapan Encapsulation

### Class `SetoranSampah`

Class ini menyimpan data setoran melalui atribut:

- `jenisSampah`
- `berat`
- `hargaPerKg`

Seluruh atribut menggunakan access modifier `private`.

Method `public` yang tersedia meliputi setter, getter, constructor, dan `hitungNilaiSetoran()`.

### Class `EcoCycle`

Class ini menangani menu, input pengguna, pemilihan kategori, dan tampilan hasil. Data setoran dikelola melalui object `SetoranSampah`.

Contoh:

```java
SetoranSampah setoran = new SetoranSampah(
    jenis,
    berat,
    harga
);
```

Nilai atribut dibaca melalui getter, bukan dengan mengakses atribut `private` secara langsung.

## 💰 Harga Simulasi

| Jenis Sampah | Harga per kg |
|---|---:|
| Plastik | Rp4.000 |
| Kertas | Rp2.000 |
| Logam | Rp3.000 |

Harga hanya digunakan sebagai data simulasi pembelajaran.

## ▶️ Cara Menjalankan

Jalankan dari folder `pertemuan_05`:

```powershell
javac *.java
java EcoCycle
```

## 🔄 Perkembangan dari Pertemuan 4

Pada Pertemuan 4, data dan perhitungan masih dikelola melalui method dalam class `EcoCycle`.

Pada Pertemuan 5, data setoran dipindahkan ke class `SetoranSampah`. Atributnya dilindungi menggunakan `private`, sedangkan akses dilakukan melalui getter dan setter.

## ⚠️ Batasan

- Program masih berbasis console.
- Data belum disimpan secara permanen.
- Harga sampah masih berupa simulasi.
- Belum ada data nasabah dan riwayat transaksi.
- PostgreSQL belum diintegrasikan.

## 🚀 Pengembangan Selanjutnya

EcoCycle akan terus dikembangkan sesuai materi PBO pada pertemuan berikutnya. Struktur class dan fitur akan ditingkatkan secara bertahap.

---

**Project:** EcoCycle  
**Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)  
**Pertemuan:** 5 — Encapsulation