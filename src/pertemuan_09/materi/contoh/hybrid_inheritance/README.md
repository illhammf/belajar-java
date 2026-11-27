# Hybrid Inheritance

## Deskripsi

Hybrid Inheritance merupakan kombinasi dari dua atau lebih pola inheritance dalam pemrograman berorientasi objek.

Pada Java, Hybrid Inheritance dapat diterapkan dengan menggabungkan pewarisan class menggunakan `extends` dan implementasi interface menggunakan `implements`.

Java tidak mendukung pewarisan dari beberapa class secara langsung. Namun, sebuah class dapat mewarisi satu superclass dan mengimplementasikan beberapa interface sekaligus.

## Studi Kasus

Contoh ini menggunakan sistem perangkat komputer dengan struktur:

- `Perangkat` sebagai superclass utama.
- `Komputer` sebagai subclass dari `Perangkat`.
- `Laptop` sebagai subclass dari `Komputer`.
- `BisaDibawa` sebagai interface kemampuan membawa perangkat.
- `BisaDiisiDaya` sebagai interface kemampuan mengisi daya perangkat.

Class `Laptop` menggabungkan pewarisan dari class `Komputer` dan implementasi dua interface.

## Struktur File

```text
hybrid_inheritance/
├── Perangkat.java
├── Komputer.java
├── BisaDibawa.java
├── BisaDiisiDaya.java
├── Laptop.java
├── DemoHybridInheritance.java
└── README.md
```

## Penjelasan Program

### 1. Class Perangkat

`Perangkat` merupakan superclass yang memiliki atribut `merk` serta method `nyalakan()` dan `tampilkanMerk()`.

Atribut `merk` menggunakan access modifier `protected` agar dapat diakses oleh subclass.

### 2. Class Komputer

`Komputer` menggunakan `extends Perangkat` untuk mewarisi atribut dan method dari superclass.

Class ini juga memiliki atribut `prosesor` dan method `menjalankanProgram()`.

Constructor `Komputer` menggunakan `super(merk)` untuk meneruskan nilai merk kepada constructor `Perangkat`.

### 3. Interface BisaDibawa

Interface ini mendefinisikan method `bawa()` yang harus diimplementasikan oleh class yang menggunakannya.

### 4. Interface BisaDiisiDaya

Interface ini mendefinisikan method `isiDaya()` sebagai kemampuan perangkat untuk mengisi daya.

### 5. Class Laptop

`Laptop` merupakan subclass dari `Komputer` dan mengimplementasikan dua interface:

```java
public class Laptop extends Komputer
        implements BisaDibawa, BisaDiisiDaya
```

Artinya, `Laptop` memperoleh atribut dan method dari `Perangkat` serta `Komputer`, sekaligus wajib menyediakan implementasi method dari kedua interface.

Method `bawa()` dan `isiDaya()` menggunakan anotasi `@Override` karena mengimplementasikan method yang didefinisikan pada interface.

### 6. Class DemoHybridInheritance

Class ini berisi method `main()` untuk membuat objek `Laptop` dan menjalankan seluruh method yang diwarisi maupun diimplementasikan.

## Konsep Java yang Digunakan

| Konsep | Penjelasan |
|---|---|
| Inheritance | Pewarisan atribut dan method dari superclass |
| Multilevel Inheritance | Pewarisan bertingkat dari `Perangkat` ke `Komputer`, kemudian `Laptop` |
| Interface | Kontrak method yang harus diimplementasikan class |
| Multiple Interface | Implementasi lebih dari satu interface |
| `extends` | Kata kunci untuk pewarisan class |
| `implements` | Kata kunci untuk implementasi interface |
| `super()` | Memanggil constructor superclass |
| `@Override` | Menandai implementasi ulang method |

## Cara Menjalankan

Jalankan perintah berikut dari root repository:

```powershell
javac -d out src/pertemuan_09/materi/contoh/hybrid_inheritance/*.java
```

Kemudian jalankan:

```powershell
java -cp out pertemuan_09.materi.contoh.hybrid_inheritance.DemoHybridInheritance
```

## Kesimpulan

Hybrid Inheritance memungkinkan penggabungan beberapa pola inheritance dalam satu struktur program.

Pada Java, pendekatan ini dapat dilakukan dengan menggabungkan pewarisan class dan implementasi beberapa interface. Dengan demikian, sebuah class dapat memperoleh perilaku dari superclass sekaligus memenuhi beberapa kontrak kemampuan yang berbeda.