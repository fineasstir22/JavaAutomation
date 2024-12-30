package VariabilaMetoda;

import org.testng.annotations.Test;

public class AlternativeStructures {

    //Structurile alternative = if-then-else; switch-case;

    @Test
    public void metodaTest() {
//        compareNumbers(7);
//        compareNumbers(5);
        numberEvenPositive(3);
        numberEvenPositive(8);
        numberEvenNegative(-6);
        numberEvenNegative(-5);
        numberEvenNegative(0);

    }

    //Verificare un numar mai mare decat 5
    public void compareNumbers(int introducedNumber) {
        if (introducedNumber > 5) {
            System.out.println("Number " + introducedNumber + " is greater than 5");
        } else if (introducedNumber < 5) {
            System.out.println("Number " + introducedNumber + " is less than 5");
        } else {
            System.out.println("Number " + introducedNumber + " is equal to 5");
        }

    }

    //Verificare daca numar e par pozitiv sau negativ
    public void numberEvenPositive(int introducedNumber) {
        if (introducedNumber > 0) {
            if (introducedNumber % 2 == 0) {
                System.out.println("Number " + introducedNumber + " is even and positive");
            } else {
                System.out.println("Number " + introducedNumber + " is not even but positive");
            }
        }
    }

    public void numberEvenNegative(int introducedNumber) {
        if (introducedNumber < 0) {
            if (introducedNumber % 2 == 0) {
                System.out.println("Number " + introducedNumber + " is even and negative");
            } else {
                System.out.println("Number " + introducedNumber + " is not even but negative");
            }
        } else if (introducedNumber == 0) {
            System.out.println("Number is zero");
        }
    }





}
