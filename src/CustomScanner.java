import java.util.Scanner;

public class CustomScanner {

    /*
    klasa Scanner umożliwia nam pobieranie danych od użytkownika aplikacji
    Jest to gotowa klasa w javie
    Poniżej, po wybraniu klasy Scanner (typ obiektowy), określamy zmienną z nazwą scanner, a następnie tworzymy nowy obiekt klasy Scanner
     */


    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj swoje imię (w konsoli i naciśnij enter)");
        String name = scanner.nextLine();
        System.out.println("Czesc " + name + "!");
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj jakąś liczbę");
        int firstNumber = scanner.nextInt();
        int result = firstNumber*firstNumber;
        System.out.println("Kwadrat tej liczby to: " + result); // opcjonalnie moglibyśmy napisać po znaku + firstNumber*firstNumber
    }
}
