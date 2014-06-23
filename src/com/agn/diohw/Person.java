package com.agn.diohw;

public class Person {
    final private String firstName;
    final private String lastName;
    final private int age;
    final private EnumRank rank;

    public Person() {
        this.firstName = null;
        this.lastName = null;
        this.age = -1;
        this.rank = null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", rank=" + rank +
                '}';
    }

    public Person(String firstName, String lastName, int age, EnumRank rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.rank = rank;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public EnumRank getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        if (rank != person.rank) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        return result;
    }

}
