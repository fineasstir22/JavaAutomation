package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    // clasa = sablon care defineste proprietatile si comportamentul unei entitati specifice
    // intr-un fisier Java putem avea mai multe clase diferentiate pe baza numelui
    // nu este un practice bun sa avem mai multe clase intr-un fisier
    // intr-o clasa putem defini proprietatile si actiunile entitatii

    // variabila = proprietatea unei clase
    // variabilele pot fi de 2 feluri: globala si locala
    // variabile globale = sunt vizibile peste tot in proiect | variabilele locale = sunt vizibile doar in locul in care sunt declarate
    // ca sa definim o variabila globala: accessControl (public), type, name
    // in momentul cand definim o variabila nu este obligatoriu sa ii dam o valoare

    // metoda = actiunea unei clase
    // 2 tipuri de metode: void si return


    public String surname;
    public String name;
    public Integer age;
    public String address;
    public Double height;
    public Float weight;
    public Character gender;
    public Boolean isGraduated;


    @Test
    public void prezentareStudent(){

        surname = "Stir";
        name = "Fineas";
        age = 30;
        address = "Cluj-Napoca";
        height = 1.77;
        weight = 81.5f;
        gender = 'M';
        isGraduated = true;

        //System.out.println(surname + " " + name + " " + age + " " + address + " " + height + " " + weight + " " + gender + " " + isGraduated);
        System.out.println("Student surname is: " + surname);
        System.out.println("Student name is: " + name);
        System.out.println("Student age is: " + age);
        System.out.println("Student address is: " + address);
        System.out.println("Student height is: " + height);
        System.out.println("Student weight is: " + weight);
        System.out.println("Student gender is: " + gender);
        System.out.println("Student is graduated? " + isGraduated);

        calculMedie();
    }

    public void calculMedie(){

        Integer grade1 = 8;
        Integer grade2 = 9;
        Integer grade3 = 10;
        Integer average = (grade1 + grade2 + grade3) / 3;

        System.out.println("Student average is: " + average);


    }

}
