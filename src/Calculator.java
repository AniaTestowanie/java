import java.util.Scanner;

public class Calculator {
    /*
    Praca domowa:
    Napisz program, który poprosi użytkownika o dwie liczby, a następnie wykona na nich podstawowe operacje matematyczne
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podaj pierwszą liczbę: ");
        float firstNumber = scanner.nextFloat();
        System.out.println("Proszę podaj drugą liczbę: ");
        float secondNumber = scanner.nextFloat();

        float addition = firstNumber + secondNumber;
        float subtraction = firstNumber - secondNumber;
        float multiplication = firstNumber * secondNumber;
        float division = firstNumber/secondNumber;
        float mod = firstNumber%secondNumber;

        System.out.println("Poniżej przedstawiam Ci podstawowe działania na podanych przez Ciebie liczbach");
        System.out.println("Dodawanie: " + firstNumber + " + " + secondNumber + " = " + addition);
        System.out.println("Odejmowanie: " + firstNumber + " - " + secondNumber + " = " + subtraction);
        System.out.println("Mnożenie: " + firstNumber + " * " + secondNumber + " = " + multiplication);
        System.out.println("Dzielenie: " + firstNumber + " / " + secondNumber + " = " + division);
        System.out.println("Modulo: " + mod);



    }


}
