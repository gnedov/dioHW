package com.agn.diohw;

public class PersonOperationDelegate {

    private final PersonOperation resource;

    public PersonOperationDelegate(PersonOperation resource) {
        this.resource = resource;
    }

    public PersonB[] mergePersons(PersonB[] arrPers1, PersonB[] arrPers2) {
        return resource.mergePersons(arrPers1, arrPers2);
    }

    public void printArray(PersonB[] arrPers) {
        resource.printArray(arrPers);
    }

    public PersonB[] removeDuplicates(PersonB[] arrInput) {
        return resource.removeDuplicates(arrInput);
    }
}
