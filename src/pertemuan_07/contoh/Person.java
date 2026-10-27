package pertemuan_07.contoh;

public class Person {

    // Atribut name bertipe String untuk menyimpan nama.
    // String merupakan tipe referensi.
    String name;

    // Atribut age bertipe int untuk menyimpan umur.
    int age;

    // Constructor dipanggil ketika object Person dibuat.
    Person(String name, int age) {

        // Menyimpan parameter ke atribut object.
        this.name = name;
        this.age = age;
    }

    // Mengembalikan representasi String dari object Person.
    // Method ini otomatis digunakan ketika object dicetak
    // menggunakan System.out.println(person).
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}