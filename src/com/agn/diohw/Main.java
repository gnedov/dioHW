package com.agn.diohw;

public class Main {

    public static void main(String[] arg0) {
/* HomeWork. Part1.
     Создайте POJO класс, поля которого являются final (Person)
Создайте Enum который характеризует экзмпляр POJO класса (Должность:DIRECTOR, DEVELOPER, QA)
Добавьте Enum как поле в POJO
Cгенерируйте equals/hashcode методы
Создайте Main класс, в main методе которого проведите сравнение экземпляров по ссылке и через метод equals
        */

        // Init unique persons
        Person personIvan = new Person("Ivan", "Ivanov", 23, EnumRank.TESTER);
        Person personPetro = new Person("Petro", "Petrov", 27, EnumRank.SELLER);
        // Init identical persons
        Person clone_1 = new Person("aa", "bb", 28, EnumRank.DEVELOPER);
        Person clone_2 = new Person("aa", "bb", 28, EnumRank.DEVELOPER);
        //compare persons with ==, .equals, and hashCode
        comparePersons(personIvan, personPetro);
        comparePersons(clone_1, clone_2);

/* HomeWork. Part2.
     Создайте два массива элементами которых Являются ранее созданные Pojo объекты
Создайте Main класс, в main методе которого проведите распечатку в консоль и сравнение двух масивов
         */
        // TODO

    }

    private static void comparePersons(Person p1, Person p2) {
        System.out.println("==========================delimitor====================================");
        System.out.println("Compare " + p1.getFirstName() + " and " + p2.getFirstName() + ":");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("Compare by reference (using == ): ");
        printCompareResult(p1 == p2);
        System.out.println("Compare by fields value (using .equals keyword ): ");
        printCompareResult(p1.equals(p2));
        System.out.println("Compare by hashCode: " + p1.hashCode() + " and " + p2.hashCode());
        printCompareResult(p1.hashCode() == p2.hashCode());
    }

    private static void printCompareResult(boolean isIdentical) {
        if (isIdentical)
            System.out.println("_>Persons are equal!");
        else
            System.out.println("_>Persons are not equal!");
    }
}
