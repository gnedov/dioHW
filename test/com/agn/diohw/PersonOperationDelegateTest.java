package com.agn.diohw;

import org.junit.Before;
import org.junit.Test;

import static com.agn.diohw.EnumRank.*;
import static org.junit.Assert.assertArrayEquals;


public class PersonOperationDelegateTest {
    private PersonOperationDelegate perOpDelegate;
    private PersonOperation perOp;

    @Before
    public void setUp() throws Exception {
        PersonOperation perOp = new PersonOperation();
        PersonOperationDelegate perOpDelegate = new PersonOperationDelegate(perOp);
    }

    @Test
    public void mergePersonsTest() throws Exception {
        PersonB p1 = new PersonB.Builder()
                .firstName("Ivan").lastName("Ivanov").age(23).rank(TESTER)
                .build();
        PersonB p2 = new PersonB.Builder()
                .firstName("Petro").lastName("Petrov").age(27).rank(SELLER)
                .build();
        PersonB p3 = new PersonB.Builder()
                .firstName("Igor").lastName("Komarov").age(28).rank(DEVELOPER)
                .build();
        PersonB p4 = new PersonB.Builder()
                .firstName("Victor").lastName("Lomov").age(29).rank(DEVELOPER)
                .build();
        PersonB p5 = new PersonB.Builder()
                .firstName("Eugene").lastName("Koval").age(23).rank(TESTER)
                .build();
        PersonB p6 = new PersonB.Builder()
                .firstName("Sidor").lastName("Kozlov").age(33).rank(MANAGER)
                .build();
        PersonB p7 = new PersonB.Builder()
                .firstName("Anna").lastName("Zaharova").age(19).rank(DIRECTOR)
                .build();
        PersonB p8 = new PersonB.Builder()
                .firstName("Olga").lastName("Sidorchuk").age(52).rank(CLEANER)
                .build();

        PersonB[] arrFirstOffice = new PersonB[]{p1, p2, p3, p4, p8};
        PersonB[] arrSecondOffice = new PersonB[]{p2, p5, p6, p7, p8};
        PersonB[] arrMerged;

        PersonOperation perOp = new PersonOperation(); // not initialized in @Before statement! Why?
        PersonOperationDelegate perOpDelegate = new PersonOperationDelegate(perOp); // not initialized in @Before statement! Why?

        arrMerged = perOpDelegate.mergePersons(arrFirstOffice, arrSecondOffice);
        PersonB[] arrExpected = new PersonB[]{p1, p2, p3, p4, p8, p2, p5, p6, p7, p8};
        assertArrayEquals(arrExpected, arrMerged);
    }

    @Test
    public void printArrayTest() throws Exception {
        // how to test Print method?
    }
    
    @Test
    public void removeDuplicateTest() throws Exception{
        
        PersonB p7 = new PersonB.Builder()
                .firstName("Anna").lastName("Zaharova").age(19).rank(DIRECTOR)
                .build();
        PersonB p8 = new PersonB.Builder()
                .firstName("Olga").lastName("Sidorchuk").age(52).rank(CLEANER)
                .build();
        
        PersonB[] arrPers = new PersonB[]{p7, p8, p7, p7, p8, p8, p8, p7};
        PersonB[] arrExpected = new PersonB[]{p7,  p8};
        PersonOperation perOp = new PersonOperation(); // not initialized in @Before statement! Why?
        PersonB[] arrActual = perOp.removeDuplicates(arrPers);
        assertArrayEquals(arrExpected, arrActual); // WARN: size NOT equal!
    }
}
