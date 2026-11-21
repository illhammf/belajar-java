# Belajar Java

Repository ini berisi dokumentasi pembelajaran **Java dan Pemrograman Berorientasi Objek (PBO)** yang disusun berdasarkan materi perkuliahan selama 14 pertemuan.

Repository ini dibuat sebagai media pembelajaran, catatan materi, serta dokumentasi praktik coding Java. Pembahasan dimulai dari pengenalan pemrograman berorientasi objek, fundamental Java, hingga penerapan berbagai konsep Object-Oriented Programming (OOP) dalam pengembangan program.

Selain mempelajari materi melalui contoh program dan latihan, repository ini juga dilengkapi dengan pengembangan project **EcoCycle (Bank Sampah)** sebagai implementasi materi perkuliahan secara bertahap.

---

## 📚 Materi Pembelajaran

Berikut merupakan daftar materi yang dipelajari berdasarkan urutan pertemuan perkuliahan.

| Pertemuan | Materi | Status |
|---|---|---|
| [Pertemuan 01](src/pertemuan_01/) | Introduction to Object Oriented Programming | ✅ |
| [Pertemuan 02](src/pertemuan_02/) | Data Type, Variable, Method and Expression | ✅ |
| [Pertemuan 03](src/pertemuan_03/) | Control Statement | ✅ |
| [Pertemuan 04](src/pertemuan_04/) | Function and Parameter | ✅ |
| [Pertemuan 05](src/pertemuan_05/) | Encapsulation (Concept) | ✅ |
| [Pertemuan 06](src/pertemuan_06/) | Encapsulation (Lanjutan) | ✅ |
| [Pertemuan 07](src/pertemuan_07/) | Memory Management | ✅ |
| [Pertemuan 08](src/pertemuan_08/) | Inheritance (Basic) | ✅ |
| Pertemuan 09 | - | ⏳ |
| Pertemuan 10 | - | ⏳ |
| Pertemuan 11 | - | ⏳ |
| Pertemuan 12 | - | ⏳ |
| Pertemuan 13 | - | ⏳ |
| Pertemuan 14 | - | ⏳ |

> Materi setiap pertemuan akan diperbarui secara bertahap mengikuti proses pembelajaran dan materi perkuliahan.

---

## 🛠️ Development Environment

Repository ini dikembangkan menggunakan beberapa tools dan teknologi berikut:

| Tools | Keterangan |
|---|---|
| Java JDK 25 | Java Development Kit |
| Visual Studio Code | Code Editor |
| Extension Pack for Java | Ekstensi untuk pengembangan Java di VS Code |
| Git & GitHub | Version Control dan pengelolaan repository |

### Panduan Instalasi

Untuk menyiapkan lingkungan pengembangan Java, silakan kunjungi dokumentasi berikut:

👉 **[Panduan Instalasi Java & Visual Studio Code](src/pertemuan_01/instalasi/README.md)**

---

## 📁 Struktur Repository

Repository ini memiliki dua bagian utama, yaitu dokumentasi materi pembelajaran dan implementasi project EcoCycle.

```text
Belajar Java/
│
├── src/
│   │
│   ├── pertemuan_01/
│   │   ├── instalasi/
│   │   ├── contoh/
│   │   ├── kuis/
│   │   └── README.md
│   │
│   ├── pertemuan_02/
│   ├── pertemuan_03/
│   ├── pertemuan_04/
│   ├── pertemuan_05/
│   ├── pertemuan_06/
│   ├── pertemuan_07/
│   ├── pertemuan_08/
│   │
│   └── project_ecocycle/
│       ├── pertemuan_03/
│       ├── pertemuan_04/
│       ├── pertemuan_05/
│       ├── pertemuan_06/
│       ├── pertemuan_07/
│       └── pertemuan_08/
│
└── README.md
```

*Struktur di atas merupakan gambaran organisasi repository dan dapat berkembang mengikuti penambahan materi.*

### Penjelasan Direktori

**1. `src/pertemuan_xx/`**

Direktori utama untuk menyimpan materi pembelajaran berdasarkan pertemuan perkuliahan.

Setiap folder pertemuan dapat berisi:

- `README.md` — Dokumentasi dan penjelasan materi.
- `contoh/` — Implementasi kode dari contoh yang terdapat dalam materi perkuliahan.
- `kuis/` — Latihan, tugas, atau kuis yang diberikan pada akhir materi.
- File pendukung lainnya sesuai kebutuhan materi.

**2. `src/project_ecocycle/`**

Direktori khusus untuk menyimpan pengembangan project EcoCycle.

Project ini dikembangkan secara bertahap berdasarkan materi yang telah dipelajari pada setiap pertemuan.

Setiap folder pertemuan memiliki implementasi tersendiri sehingga perkembangan kode dapat dipelajari dan dibandingkan dari satu pertemuan ke pertemuan berikutnya.

**3. `README.md`**

Dokumentasi utama repository yang berisi informasi pembelajaran, daftar materi, struktur direktori, lingkungan pengembangan, dan progress pengerjaan.

---

## ♻️ Project Implementation — EcoCycle

**EcoCycle** merupakan project simulasi sistem bank sampah yang dikembangkan menggunakan Java dengan pendekatan Object-Oriented Programming (OOP).

Project ini digunakan sebagai media praktik untuk menerapkan konsep-konsep pemrograman yang telah dipelajari selama perkuliahan.

Pengembangan dilakukan secara bertahap berdasarkan materi setiap pertemuan, mulai dari fundamental Java hingga penerapan konsep OOP yang lebih kompleks.

### Tujuan Pengembangan

- Menerapkan teori pemrograman ke dalam sebuah project nyata.
- Memahami hubungan antara class, object, atribut, dan method.
- Mengembangkan kemampuan dalam menerapkan konsep OOP.
- Memahami perkembangan struktur program berdasarkan materi perkuliahan.
- Membiasakan penggunaan struktur kode yang terorganisasi dan mudah dikembangkan.

### Dokumentasi Project

Source code setiap tahap pengembangan dapat ditemukan pada direktori berikut:

`src/project_ecocycle/`

Setiap folder pertemuan menyimpan versi pengembangan EcoCycle sesuai dengan materi yang sedang dipelajari.

Dengan pendekatan ini, perubahan dan perkembangan implementasi project dapat dipelajari secara berurutan tanpa mengubah source code dari pertemuan sebelumnya.

---

## 🎯 Tujuan Repository

Repository ini dibuat untuk:

1. Mendokumentasikan proses pembelajaran Java secara terstruktur.
2. Memahami fundamental Java dan konsep Pemrograman Berorientasi Objek.
3. Menyediakan contoh implementasi kode berdasarkan materi perkuliahan.
4. Menyimpan latihan, kuis, dan tugas pemrograman.
5. Menerapkan materi pembelajaran melalui pengembangan project EcoCycle.
6. Menjadi referensi belajar yang dapat digunakan kembali untuk memahami Java dan OOP.

Materi dalam repository ini tidak hanya berisi source code, tetapi juga dilengkapi dengan dokumentasi penjelasan agar setiap konsep dapat dipahami dengan lebih mudah.

---

## 📈 Learning Progress

Repository ini direncanakan mencakup **14 pertemuan pembelajaran**.

Berikut merupakan progress dokumentasi dan implementasi materi yang telah dikerjakan:

```text
Pertemuan 01  ████████████████████ 100%
Pertemuan 02  ████████████████████ 100%
Pertemuan 03  ████████████████████ 100%
Pertemuan 04  ████████████████████ 100%
Pertemuan 05  ████████████████████ 100%
Pertemuan 06  ████████████████████ 100%
Pertemuan 07  ████████████████████ 100%
Pertemuan 08  ████████████████████ 100%
Pertemuan 09  ░░░░░░░░░░░░░░░░░░░░   0%
Pertemuan 10  ░░░░░░░░░░░░░░░░░░░░   0%
Pertemuan 11  ░░░░░░░░░░░░░░░░░░░░   0%
Pertemuan 12  ░░░░░░░░░░░░░░░░░░░░   0%
Pertemuan 13  ░░░░░░░░░░░░░░░░░░░░   0%
Pertemuan 14  ░░░░░░░░░░░░░░░░░░░░   0%
```

**Progress saat ini: 8 dari 14 pertemuan (57,14%).**

> Progress akan diperbarui seiring dengan bertambahnya materi, contoh program, latihan, dan dokumentasi setiap pertemuan.

---

## 👨‍💻 Author

**Ilham Firmansyah**

GitHub: [@illhammf](https://github.com/illhammf)

---

*Learning Java, Understanding OOP, and Building Something Useful.*