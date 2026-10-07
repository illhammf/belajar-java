package pertemuan_04.contoh;

class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

    public static void changeName(Person person) {
        person.name = "Rani";
    }

    public static void main(String[] args) {

        Person person = new Person("Rena");

        changeName(person); // memanggil fungsi untuk mengubah nama, yang tadinya "Rena" menjadi "Rani"

        System.out.println(person.name);
        // Output: Rani (objek asli berubah)
    }
}
