public class TypyProste {

    //Typy proste / prymitywne typy danych zawierają tylko "surowe dane"

    // poniżej typy zmiennych wraz z informacją o pojemności zmiennej - zakresie
    // liczby stałoprzecinkowe
    byte firstNumber = 127;     // 1 bajt zawiera zakres: -128 do 127
    short secondNumber = 32689; // 2 bajty -32 768 do 32 767
    int thirdNumber = 32768999; // 4 bajty -2 147 483 648 do 2 147 483 647; jest to najczęściej występujący typ zmiennej
    long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1

    // liczby zmiennoprzecinkowe
    float fifthNumber = 4.99934F; // 4 bajty - max 6-7 liczb po przecinku
    double sixthNumber = 3.999999999999999D; // 8 bajtów - max. ok 15 cyfr po przecinku

    /* na końcu liczby zmiennoprzecinkowej jawnie deklarujemy za pomocą litery F (dla flout) i D (dla double), który to typ zmiennej
    podobnie dla typu long dla liczby stałoprzecinkowej; przy braku określenie typu zmiennej, domyślnie traktowana jest liczba jako int,
    stąd w przypadku bardzo długich liczb, konieczność zaznaczenia tego literą L
     */

    // wartość logiczna
    boolean prawda = true;
    boolean fałsz = false;

    //pojedynczy znak
    char letter = 'A'; //pojedyczny znak zawsze definiujemy w pojedynczym cudzysłowie; zastosowanie "" będzie oznaczać String - typ obiektowy

}
