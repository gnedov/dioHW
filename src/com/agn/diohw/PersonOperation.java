package com.agn.diohw;

public class PersonOperation {

    public PersonOperation(){

    }

    public PersonB[] mergePersons(PersonB[] arrPers1, PersonB[] arrPers2){
        PersonB[] arrResMerge = new PersonB[arrPers1.length + arrPers2.length];

        System.arraycopy(arrPers1,0,arrResMerge,0,arrPers1.length);
        System.arraycopy(arrPers2,0,arrResMerge,arrPers1.length,arrPers2.length );

        return arrResMerge;
    }

    public void printArray(PersonB[] arrPers){
        for (PersonB pers : arrPers){
            System.out.println(pers.toString());
        }
    }

    //  удаление дубликатов в результате мержа
}
