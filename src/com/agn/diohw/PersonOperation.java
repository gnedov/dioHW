package com.agn.diohw;

public class PersonOperation {

    public PersonOperation() {

    }

    public PersonB[] mergePersons(PersonB[] arrPers1, PersonB[] arrPers2) {
        PersonB[] arrResMerge = new PersonB[arrPers1.length + arrPers2.length];

        System.arraycopy(arrPers1, 0, arrResMerge, 0, arrPers1.length);
        System.arraycopy(arrPers2, 0, arrResMerge, arrPers1.length, arrPers2.length);

        return arrResMerge;
    }

    public void printArray(PersonB[] arrPers) {
        for (PersonB pers : arrPers) {
            if (pers != null)
                System.out.println(pers.toString());
        }
    }

    public PersonB[] removeDuplicates(PersonB[] arrInput) {
        PersonB[] arrResult;
        boolean blnNonUnique;
        if (arrInput != null) {
            arrResult = new PersonB[arrInput.length];
            for (int i = arrInput.length - 1, k = 0; i >= 0; i--) {
                blnNonUnique = false;
                for (int j = i - 1; j >= 0; j--) {
                    if (arrInput[i].equals(arrInput[j])) {
                        blnNonUnique = true;
                        break;
                    }
                }
                if (!blnNonUnique) {
                    arrResult[k] = arrInput[i];
                    k++;
                }
            }
        } else
            arrResult = null;
        return revertArray(arrResult);
    }


    private PersonB[] revertArray(PersonB[] arrInput) {
        PersonB[] arrResult = new PersonB[arrInput.length];
        int i = arrInput.length - 1;
        for (PersonB p : arrInput) {
            arrResult[i] = p;
            i--;
        }

        return arrResult;
    }
}
