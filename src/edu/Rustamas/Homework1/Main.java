package edu.Rustamas.Homework1;

import java.time.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2. Create a program that prints the following patterns.
        System.out.println("2.a");
        System.out.println("x         x");
        System.out.println("  x    x");
        System.out.println("    xx");
        System.out.println("   x  x");
        System.out.println(" x      x");
        System.out.println("x         x");
        System.out.println(" ");
        System.out.println("2.b");
        System.out.println("x=============x");
        System.out.println("|             |");
        System.out.println("|             |");
        System.out.println("|             |");
        System.out.println("x=============x");
        System.out.println(" ");
        System.out.println("2.c");
        System.out.println("****************");
        System.out.println("*   RUSTAMAS   *");
        System.out.println("****************");

        //3. In 3-5 sentences describe yourself and your expectations of this boot camp. Message me (privately)
        System.out.println("\n3 užduotis. Esu vardu Rustamas. 2006-ais metais baigiau statybos inžinerijos magistrą. Nelabai turiu programavimo patirties. 1998-2000 mokyklos metais teko trumpai mokintis: Basic, Pascal, Turbo Pascal, C++ kalbas. Dabar užsibrėžiau tikslą išmokti Java ir Python programavimo kalbas. Per šį „boot camp“ norėtųsi daugiau praktinių dalykų, testų, įvairių užduočių." +
        "\n" +
        "\n" +

        //4. Do what you did in task 2, but use a single.
        "4.a\n" +
        "x         x\n" +
        "  x    x\n" +
        "    xx\n" +
        "   x  x\n" +
        " x      x\n" +
        "x         x\n" +
        "\n" +
        "4.b\n" +
        "x=============x\n" +
        "|             |\n" +
        "|             |\n" +
        "|             |\n" +
        "x=============x\n" +
        "\n" +
        "4.c\n" +
        "****************\n" +
        "*   RUSTAMAS   *\n" +
        "****************\n");

        //5. Calculate your body-mass index.
        //Body Mass Index (1). My version.
        System.out.println("5.a");
        double weightInKg = 70;
        double heightInCm = 182;
        double bmi = weightInKg/(heightInCm * heightInCm);
        String name = "Rustamas";
        String lastname = "Safar-Zadė";
        System.out.println(name + " " + lastname + "\n Weight is: " + weightInKg + "\n Height is: " + heightInCm + "\n BMI is: " + bmi + " kg/m2");
        System.out.println(" ");

        //Body Mass Index (2). Internet version.
        System.out.println("5.b");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        double weight = sc.nextDouble();
        System.out.print("\nInput height in meters: ");
        double height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2\n");

        //7. Store your name in a String. Capitalize all letter.
        System.out.println("\n7.");
        String vardas = "rustamas".toUpperCase();
        System.out.println(vardas);

        //8. Write a program that takes 2a pattern and cuts it in half (don't print V, but make V from X):
        System.out.println("\n8.");
        System.out.println("Buvo:");
        System.out.println("\nx        x\n  x    x\n    xx\n   x  x\n  x    x\n x      x\n ");
        String one = "x        x\n  x    x\n    xx\n x    x\n  x    x\nx        x\n ";
        System.out.println(one.length());
        System.out.println("\nPadarė:\n");
        System.out.println(one.substring(0, 26));

        //9. X can be any size. Cut it in half, to make V
        System.out.println("\n9.");
        System.out.println("Buvo:");
        System.out.println("\nx        x\n  x    x\n    xx\n   x  x\n  x    x\n x      x\n ");
        System.out.println("Padarė:");
        String X = "\nx        x\n  x    x\n    xx\n   x  x\n  x    x\n x      x\n ";
        System.out.println(X.substring(0,one.indexOf("xx")+3));

        //BANDYMAS
        System.out.println("\n");
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

    }
}