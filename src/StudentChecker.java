import java.util.Scanner;

public class StudentChecker {
    /*
    Praca domowa:
    Stwórz trzy obiekty klasy student. Przypisz wartości do pól. Stwórz tablicę i dodaj studentów do tablicy.
    Przejdź przez elementy tablicy i dla każdego ze studentów z tablicy wywołaj wszystkie metody
     */

    public static void main(String[] args) {

        Student osoba1 = new Student();
        osoba1.imie = "Ania";
        osoba1.nazwisko = "Kowalska";
        osoba1.nick = "ania";
        osoba1.email = "ania@mail.com";
        osoba1.numerIndeksu = 894623;

        Student osoba2 = new Student();
        osoba2.imie = "Piotr";
        osoba2.nazwisko = "Nowak";
        osoba2.nick = "piotr";
        osoba2.email = "piotr@mail.com";
        osoba2.numerIndeksu = 876130;

        Student osoba3 = new Student();
        osoba3.imie = "Monika";
        osoba3.nazwisko = "Kwiatkowska";
        osoba3.nick = "monia";
        osoba3.email = "monia@mail.com";
        osoba3.numerIndeksu = 134689;

     /*
        Teraz musimy stworzyć tablicę
        Zaczynamy od określenia typu danych - w naszym przypadku będzie to Student, następnie nawiasy, potem nazwa tablicy
        Tworzymy nową tablicę, określając ile elementów będzie zawierać tablica - u nas 3, tyle ilu mamy studentów
        Następnie przypisujemy elementy tablicy
      */


        Student[] students = new Student[3];
        students[0]=osoba1;
        students[1]=osoba2;
        students[2]=osoba3;


        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajNrIndeksu();
            students[i].podajEmail();
            students[i].zalogujSie();
        }

        /*
        Klasa String dostarczona przez javę, to też jest klasa, podobnie jak Scanner

        Jak podejrzeć co się znajduje w danej klasie? Naciskamy ctrl, najeżdżamy na klasę, a następnie klikamy w podświetloną klasę
        Klasa String posiada również pola prywatne np. value, coder itd., mamy też zdefiniowane metody
        */

        String imie = "Kasia";
        Scanner scanner = new Scanner(System.in);





    }

}
