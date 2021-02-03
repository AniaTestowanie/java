public class ReadOnly {

    /*
    Getter - metoda zwracająca wartość pola prywatnego

    Jeżeli chcemy aby inne klasy były w stanie odczytać wartość pola prywatnego, możemy stworzyć metodę publiczną,
    która zwróci nam wartość tego pola. Taką metodę nazywamy getterem.

    Istnieje konwencja nazywania takiej metody. Najpierw wpisujemy słowo get a następnie wartość, którą pobieramy.

    Zwrócona wartość jest tylko do odczytu (nie będzie można zmienić tej wartości,
    choć oczywiście wewnątrz tej metody możemy wprowadzić pewne modyfikacje (przykład poniżej)

     */


    private String name = "Ania";

    public String getName() {
        return name;
        // return name + "jest ok"; przykład modyfikacji
    }

    /*
    Setter - metoda pozwalająca ustalić, przypisać wartość pola, które jest prywatne

   Konwencja nazewnictwa jest analogiczna, tylko ze słowem set

   Musimy też skorzystać z parametru, który będzie później przypisywany do naszego pola prywatnego

   Setter umożliwia konfigurowanie tego pola z zewnątrz przez inne klasy, ale mamy ograniczony dostęp do tego pola, tj.
   nie umożliwia działania na tym polu ani pobrania jego zawartości
    */

    public void setName(String name) {
        this.name = name;
    }

    /*
    Intellij umożliwia wygenerowanie takich getterów i setterów. Aby to zrobić korzystamy ze skrótu klawiaturowego
    alt + insert, wybieramy opcję Getter / Setter / Getter and Setter, a następnie zaznaczamy jakiej wartości ma dotyczyć i klikamy ok
     */


}
