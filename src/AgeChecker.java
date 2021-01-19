import java.util.Scanner;

public class AgeChecker {
    /*
    Praca domowa:
    Zapytaj użytkownika o wiek.
    W przypadku gdy ma mniej niż 18 lat wypisz na ekranie infomację, że nie może kupić alkoholu
    Gdy ma więcej, życz mu udanych zakupów
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj swój wiek w latach:");
        int wiek = scanner.nextInt();

        if((wiek >= 18) && (wiek < 120)) {
            System.out.println("Życzę udanych zakupów!");
        } else if(wiek >= 120) {
            System.out.println("Powinieneś już nie żyć");
        } else if(wiek < 0) {
            System.out.println("Wpisz poprawną wartość");
        } else {
            System.out.println("Przykro mi, nie możesz kupić alkoholu");
        }

    }



}
