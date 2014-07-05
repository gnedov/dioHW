package com.agn.diohw;

public class Main {

    public static void main(String[] arg0) {
    //    pojoPerson();  // HomeWork. Part1.
     //   arrayPersons(); //  HomeWork. Part2.

        patternBuilder();   // ClassWork. Implements Builder pattern.

    }

    private static void pojoPerson(){
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
    }

    private static void comparePersons(PersonB p1, PersonB p2) {
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

    private static void arrayPersons(){
        /* HomeWork. Part2.
    Создайте два массива элементами которых Являются ранее созданные Pojo объекты
Создайте Main класс, в main методе которого проведите распечатку в консоль и сравнение двух масивов
        */
        // Init unique persons
        Person p1 = new Person("Ivan", "Ivanov", 23, EnumRank.TESTER);
        Person p2 = new Person("Petro", "Petrov", 27, EnumRank.SELLER);
        Person p3 = new Person("Igor", "Komarov", 28, EnumRank.DEVELOPER);
        Person p4 = new Person("Victor", "Lomov", 29, EnumRank.DEVELOPER);
        Person p5 = new Person("Eugene", "Koval", 23, EnumRank.TESTER);
        Person p6 = new Person("Sidor", "Kozlov", 33, EnumRank.MANAGER);
        Person p7 = new Person("Anna", "Zaharova", 19, EnumRank.DIRECTOR);
        Person p8 = new Person("Olga", "Sidorchuk", 52, EnumRank.CLEANER);

        Person[] arrFirstOffice = new Person[] {p1,p2,p3,p4,p8};
        Person[] arrSecondOffice = new Person[] {p2,p5,p6,p7,p8};

        for (Person i : arrFirstOffice){
            for (Person j : arrSecondOffice){
                if (i != null && j != null){
                    if (i.equals(j))
                        System.out.printf("Person %s %s %s works in both offices.%n",
                                i.getRank(), i.getFirstName(), i.getLastName());
                }
            }
        }
    }
    
    private static void patternBuilder(){
        PersonB person = new PersonB.Builder()
                .firstName("firstAAA")
                .lastName("lastBBB")
                .age(55)
                .rank(EnumRank.DEVELOPER)
                .build();

        PersonB personCopy = new PersonB.Builder(person)
                .age(56)
                .build();

        comparePersons(person, personCopy);
        // Init unique persons
        PersonB personIvan = new PersonB("Ivan", "Ivanov", 23, EnumRank.TESTER);
        PersonB personPetro = new PersonB("Petro", "Petrov", 27, EnumRank.SELLER);

        PersonB[] arrPers1 = new PersonB[]{personIvan, personPetro};
        PersonB[] arrPers2 = new PersonB[]{person, personCopy};
      //  PersonB[] arrMerge;

      //  PersonOperation perOp = new PersonOperation();
      //  arrMerge = perOp.mergePersons(arrPers1, arrPers2);
      //  perOp.printArray(arrMerge);
    }
}
