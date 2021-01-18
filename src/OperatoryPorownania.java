import java.util.Scanner;

public class OperatoryPorownania {
    // Operatory porównują elementy równania i zwracają logiczną wartość (true / false)

    public static void main(String[] args) {

       //Poniżej opcja z dostarczonymi danymi, dalej z dostarczonymi przez użytkownika

       /*
        int firstNumber = 4;
        int secondNumber = 6;

        boolean result = firstNumber > secondNumber;
        System.out.println(result);

        *//*
        Nie musimy wyników przypisywać do nowych zmiennych, tak jak jest to powyżej
        Możemy to robić bezpośrednio wewnątrz wywoływania metody sout
         *//*

        System.out.println(firstNumber == secondNumber);    // równy (użycie jednego znaku = spowodowałoby przypisanie lub nadpisanie wartości
        System.out.println(firstNumber != secondNumber);    // różny
        System.out.println(firstNumber > secondNumber);     // większy
        System.out.println(firstNumber < secondNumber);     // mniejszy
        System.out.println(firstNumber >= secondNumber);    // większy lub równy
        System.out.println(firstNumber <= secondNumber);    // mniejszy lub równy

        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj liczbę a: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Proszę podaj liczbę b: ");
        int secondNumber = scanner.nextInt();


        System.out.println("a jest równe b: " + (firstNumber == secondNumber));
        System.out.println("a jest różne od b: " + (firstNumber != secondNumber));
        System.out.println("a jest większe niż b: " + (firstNumber > secondNumber));
        System.out.println("a jest mniejsze niż b: " + (firstNumber < secondNumber));
        System.out.println("a jest większe lub równe: " +(firstNumber >= secondNumber));
        System.out.println("a jest mniejsze lub równe: " + (firstNumber <= secondNumber));



    }
}
