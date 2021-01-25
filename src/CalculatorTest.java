import java.util.Scanner;

public class CalculatorTest {
    /*
    Praca domowa 1:
    Napisz program, który poprosi użytkownika o dwie liczby, a następnie wykona na nich podstawowe operacje matematyczne
    Został wykomentowany
     */

  /*  public static void main(String[] args) {
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

    }*/


    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz nazwę działania, jakie chcesz wykonać (dodawanie, odejmowanie, mnożenie, dzielenie, modulo");

        String działanie = scanner.next();

        switch (działanie) {
            case "dodawanie":
                calculator.addition();
                break;
            case "odejmowanie":
                calculator.subtraction();
                break;
            case "mnożenie":
                calculator.multiplication();
                break;
            case "dzielenie":
                calculator.division();
                break;
            case "modulo":
                calculator.modulo();
                break;
            default:
                System.out.println("Wybierz działanie z dostępnych: dodawanie, odejmowanie, mnożenie, dzielenie, modulo");
        }


    }



}
