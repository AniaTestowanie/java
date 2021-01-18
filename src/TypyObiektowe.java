import java.sql.SQLOutput;

public class TypyObiektowe {

    // Typy obiektowe przechowują aktualną wartość oraz umożliwiają wykonanie akcji (wywołanie metod) na tych danych
    // Typy obiektowe pisane są wielką literą; wyświetlają się też w innym kolorze niż typy proste
    // Zmienne, które zostały zdefiniowane, a nie zostały wykorzystane są wyszarzone, zmienne wykorzystane mają kolor biały

    public static void main(String[] args) {

        //liczby stałoprzecinkowe

        Byte firstNumber = 127;     // 1 bajt zawiera zakres: -128 do 127
        Short secondNumber = 32689; // 2 bajty -32 768 do 32 767
        Integer thirdNumber = 32768999; // 4 bajty -2 147 483 648 do 2 147 483 647; jest to najczęściej występujący typ zmiennej
        Long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1

        // liczby zmiennoprzecinkowe
        Float fifthNumber = 4.99934F; // 4 bajty - max 6-7 liczb po przecinku
        Double sixthNumber = 3.999999999999999D; // 8 bajtów - max. ok 15 cyfr po przecinku

        /* na końcu liczby zmiennoprzecinkowej jawnie deklarujemy za pomocą litery F (dla flout) i D (dla double), który to typ zmiennej
        podobnie dla typu long dla liczby stałoprzecinkowej; przy braku określenie typu zmiennej, domyślnie traktowana jest liczba jako int,
        stąd w przypadku bardzo długich liczb, konieczność zaznaczenia tego literą L
        */

        // wartość logiczna
        Boolean prawda = true;
        Boolean falsz = false;

        //pojedynczy znak
        Character letter = 'A';

        //ciągi znaków (String to tak naprawdę ciąg znaków)
        String hello = "Hello Ania";


        /*
        Jak było wspomniane wyżej typy obiektowe umożliwiają wykonanie akcji (wywołanie metod) na tych danych
        Po zdefiniowaniu zmiennej możemy odnaleźć listę możliwych akcji wpisując np. hello. (z kropką)
        Wyświetla się wówczas lista możliwych poleceń dotyczących tej zmiennej (metody oznaczone są literką "m" z lewej strony)

        np. hello.contains(Hello) zwróci nam wartość logiczną true lub false czy w tym ciągu znaków zawiera się np. Ania
         */

        System.out.println(hello.charAt(0));
        /* powyższa metoda wyciąga informację o pierwszej literze (indeks 0) w naszym ciągu znaków hello
        w naszym przypadku będzie to H
        */

        System.out.println(hello.contains("Ania"));
    }

}
