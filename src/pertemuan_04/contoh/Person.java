package pertemuan_04.contoh;

class Person {

    String name;
    int umur;

    Person(String name, int umur) {
        this.name = name;
        this.umur = umur;
    }

    public static void changeName(Person person) {
        person.name = "Rani";
    }

    public static void main(String[] args) {

        Person person = new Person("Rena", 20);

        changeName(person); // memanggil fungsi untuk mengubah nama, yang tadinya "Rena" menjadi "Rani"

        System.out.println(person.name);
        System.out.println(person.umur);
        // Output: Rani (objek asli berubah)
    }
}
