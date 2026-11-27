# Multiple Inheritance

## 1. Pengertian

Multiple Inheritance merupakan konsep pewarisan dalam Pemrograman Berorientasi Objek (OOP) ketika sebuah class memperoleh kemampuan dari lebih dari satu sumber pewarisan.

Pada Java, sebuah class tidak dapat mewarisi beberapa superclass sekaligus menggunakan keyword `extends`. Namun, Java mendukung implementasi beberapa interface menggunakan keyword `implements`.

Interface memungkinkan sebuah class memiliki berbagai kemampuan yang didefinisikan melalui kontrak method.

## 2. Tujuan Pembelajaran

Setelah mempelajari contoh program ini, diharapkan dapat:

- Memahami konsep Multiple Inheritance.
- Mengetahui keterbatasan Multiple Inheritance pada Java.
- Memahami pengertian dan fungsi interface.
- Memahami perbedaan `extends` dan `implements`.
- Memahami penggunaan beberapa interface dalam satu class.
- Memahami implementasi abstract method.
- Memahami penggunaan anotasi `@Override`.
- Mengetahui alasan penggunaan interface untuk mendukung berbagai kemampuan dalam Java.

## 3. Studi Kasus

Contoh implementasi menggunakan studi kasus smartphone.

Sebuah smartphone memiliki beberapa kemampuan yang berasal dari interface berbeda.

**Kamera (Interface Pertama)**

Mendefinisikan kemampuan mengambil foto melalui:

- `ambilFoto()`

**PemutarMusik (Interface Kedua)**

Mendefinisikan kemampuan memutar musik melalui:

- `putarMusik()`

**Smartphone (Class Implementasi)**

Mengimplementasikan kedua interface tersebut dan memiliki fitur tambahan:

- `merk`
- `model`
- `tampilkanInfo()`

Dengan demikian, satu objek Smartphone dapat menggunakan kemampuan dari kedua interface sekaligus.

## 4. Struktur Pewarisan

```text
      Kamera          PemutarMusik
     (Interface)       (Interface)
          \               /
           \             /
            \           /
              Smartphone
                (Class)
```

Class `Smartphone` mengimplementasikan interface `Kamera` dan `PemutarMusik` menggunakan keyword `implements`.

## 5. Struktur File

```text
multiple_inheritance/
├── Kamera.java
├── PemutarMusik.java
├── Smartphone.java
├── DemoMultipleInheritance.java
└── README.md
```

| File | Fungsi |
|---|---|
| `Kamera.java` | Interface yang mendefinisikan kemampuan mengambil foto. |
| `PemutarMusik.java` | Interface yang mendefinisikan kemampuan memutar musik. |
| `Smartphone.java` | Class yang mengimplementasikan kedua interface. |
| `DemoMultipleInheritance.java` | Main class untuk menjalankan dan menguji implementasi interface. |

## 6. Konsep dan Sintaks yang Digunakan

### A. Interface

Keyword `interface` digunakan untuk mendefinisikan kontrak yang dapat diimplementasikan oleh sebuah class.

Contoh:

```java
public interface Kamera {
    void ambilFoto();
}
```

Interface dapat mendefinisikan abstract method dan juga mendukung method dengan implementasi seperti `default` dan `static`.

Interface tidak memiliki constructor dan tidak dapat dibuat objeknya secara langsung.

### B. Implements

Keyword `implements` digunakan oleh class untuk mengimplementasikan interface.

Contoh:

```java
public class Smartphone implements Kamera, PemutarMusik {
}
```

Sebuah class dapat mengimplementasikan lebih dari satu interface sekaligus.

### C. Abstract Method

Abstract method merupakan method yang hanya memiliki deklarasi tanpa implementasi.

Contoh:

```java
void ambilFoto();
```

Class yang mengimplementasikan interface harus menyediakan implementasi method tersebut, kecuali class tersebut dideklarasikan sebagai `abstract`.

### D. Method Overriding

Anotasi `@Override` digunakan untuk menandai method yang mengimplementasikan atau mengganti deklarasi method dari interface maupun superclass.

Contoh:

```java
@Override
public void ambilFoto() {
    System.out.println("Sedang mengambil foto.");
}
```

### E. Beberapa Interface dalam Satu Class

Java memungkinkan satu class mengimplementasikan beberapa interface menggunakan pemisah koma.

Contoh:

```java
public class Smartphone implements Kamera, PemutarMusik {
}
```

Dengan demikian, class Smartphone dapat menyediakan berbagai kemampuan yang berasal dari interface berbeda.

## 7. Perbedaan Class dan Interface

| Aspek | Class | Interface |
|---|---|---|
| Deklarasi | `class` | `interface` |
| Pewarisan dan implementasi | `extends` | `implements` |
| Constructor | Memiliki constructor | Tidak memiliki constructor |
| Abstract method | Dapat memilikinya jika abstract | Dapat mendefinisikannya |
| Jumlah sumber | Satu superclass langsung | Dapat mengimplementasikan beberapa interface |

## 8. Alur Program

1. Program membuat objek `Smartphone`.
2. Constructor menginisialisasi atribut merk dan model.
3. Objek memanggil method `tampilkanInfo()`.
4. Objek memanggil method `ambilFoto()` dari implementasi interface Kamera.
5. Objek memanggil method `putarMusik()` dari implementasi interface PemutarMusik.
6. Program menampilkan seluruh informasi dan kemampuan smartphone.

## 9. Output Program

```text
=== INFORMASI SMARTPHONE ===
Merk  : Samsung
Model : Galaxy S24

Samsung Galaxy S24 sedang mengambil foto.
Samsung Galaxy S24 sedang memutar musik.
```

## 10. Kesimpulan

Multiple Inheritance merupakan konsep ketika sebuah class memperoleh kemampuan dari lebih dari satu sumber pewarisan.

Java tidak mendukung pewarisan beberapa superclass menggunakan `extends`, tetapi menyediakan interface yang memungkinkan sebuah class mengimplementasikan beberapa kontrak sekaligus.

Melalui contoh `Kamera`, `PemutarMusik`, dan `Smartphone`, dapat dipahami bagaimana satu class dapat memiliki berbagai kemampuan dari beberapa interface berbeda.

Konsep ini membantu membuat program yang lebih fleksibel dan memungkinkan pemisahan kemampuan berdasarkan tanggung jawab masing-masing interface.