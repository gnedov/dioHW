package com.agn.diohw;

public class PersonB {

        final private String firstName;
        final private String lastName;
        final private int age;
        final private EnumRank rank;

    private PersonB(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.rank = builder.rank;
    }

    @Override
    public String toString() {
        return "PersonB{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", rank=" + rank +
                '}';
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

            PersonB person = (PersonB) o;

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

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private EnumRank rank;

        public Builder() {

        }

        public Builder(PersonB original) {
            this.firstName = original.firstName;
            this.lastName = original.lastName;
            this.age = original.age;
            this.rank = original.rank;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder rank(EnumRank rank) {
            this.rank = rank;
            return this;
        }

        public PersonB build() {
            return new PersonB(this);
        }

    }

}
