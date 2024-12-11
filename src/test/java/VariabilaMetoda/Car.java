package VariabilaMetoda;

import org.testng.annotations.Test;

public class Car {

    public String brand;
    public String model;
    public int year;


    @Test
    public void testCar() {

        displayCarData("BMW", "X5", 2020);
        displayCarData("Audi", "Q7", 2020);
        displayCarData("VW", "Passat", 2023);

    }

    public void displayCarData(String param1, String param2, int param3) {

        brand = param1;
        model = param2;
        year = param3;

        //brand = "BMW";
        //model = "X5";
        //year = 2018;

        System.out.println(brand + " " + model + " " + year);
    }


    @Test
    public void averageCalculationTest(){

        averageCalculation(8,10);
        averageCalculation(5,10);

    }

    //Calculam media pentru 2 numere
    public void averageCalculation(int param1, int param2) {

        int firstNumber = param1;
        int secondNumber = param2;

        int result = (firstNumber + secondNumber) / 2;

        System.out.println(result);
    }

}
