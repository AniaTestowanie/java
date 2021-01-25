import java.util.Scanner;

public class Calculator {
    /*
    Praca domowa:
    zmieniamy wcześniej stworzoną klasę Calculator w taki sposób, żeby teraz wewnątrz niej zdefiniować same metody, a wywołać je w CalculatorTest

    mamy zdefiniować 5 metod, każda ma zwracać wartość int
     */


        public void addition() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Proszę podaj pierwszą liczbę: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Proszę podaj drugą liczbę: ");
            int secondNumber = scanner.nextInt();
            int addResult = firstNumber + secondNumber;
            System.out.println("Dodawanie: " + firstNumber + " + " + secondNumber + " = " + addResult);
        }

        public void subtraction() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Proszę podaj pierwszą liczbę: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Proszę podaj drugą liczbę: ");
            int secondNumber = scanner.nextInt();
            int subtractionResult = firstNumber - secondNumber;
            System.out.println("Odejmowanie: " + firstNumber + " - " + secondNumber + " = " + subtractionResult);
        }


    public void multiplication() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();
        int multiplicationResult = firstNumber * secondNumber;
        System.out.println("Mnożenie: " + firstNumber + " * " + secondNumber + " = " + multiplicationResult);
    }

    public void division() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();
        int divisionResult = firstNumber / secondNumber;
        System.out.println("Dzielenie: " + firstNumber + " / " + secondNumber + " = " + divisionResult);
    }

    public void modulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();
        int modResult = firstNumber%secondNumber;
        System.out.println("Modulo to: " + modResult);
    }
}
