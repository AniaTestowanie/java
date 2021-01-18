public class Zmienne {
    /*
    Zmienne to zarezerwowane miejsce w pamięci z określonym typem danych
    W javie określamy najpierw typ danych, a następnie nazwę takiej zmiennej
    Wszystkie zmienne muszą mieć unikatowe nazwy
     */
    /*
    Według konwencji nazwy zmiennych nadajemy według camelCase.
    Jest to system notacji ciągów tekstowych, w którym kolejne wyrazy pisane są łącznie, rozpoczynając każdy następny wielką literą (prócz pierwszego!)

    Jeśli chodzi o nazewnictwo klas, to nie stosujemy w nich spacji, a każde słowo zaczynamy wielką literą
    Staramy się też, by nazwa klasa opisywała to, co się będzie pod nią kryło
     */


    public static void main(String[] args) {

        // poniżej zaprezentowany został przykład definicji danych
        // najpierw podajemy typ danych "String", a następnie określamy nazwę zmiennej "name"
        // w tym przypadku wartość określamy po znaku równości
        // do zmiennej możemy się odnieść, jeśli będzie zdefiniwana w obrębie metody


        String name = "Ania";
        int firstNumber = 1;
        int secondNumber = 2;
        int result = firstNumber + secondNumber;

        /* zmiennych nie musimy od razu inicjalizować (nadawać wartości zmiennej), możemy je najpierw zadeklarować (określić typ i nazwę zmiennej):
        int firstNumber, secondNumber, result;
        lub:
        int firstNumber;
        int secondNumber;
        int result;
        a dopiero w następnym kroku przypisać im wartość bez podawania typu danych
        tj.:
        firstNumber = 1;
        secondNumber = 2;
        result = firstNumber + secondNumber;

        w kontekście działania programu rezultat będzie ten sam
        */


        name = "Kasia";
        // powyżej nadpisanie zmiennej name - po takim nadpisaniu, to ta wartość będzie uznawana za wartość zmiennej;
        // nadpisanie wartości zawsze wykonujemy jak w powyższym przykładzie (nie określamy już typu danych, bo wówczas program czytałby to jako nową zmienną



        System.out.println(name);
        // powyższa metoda wypisze na ekranie wartość, która jest przypisana do tej zmiennej
        System.out.println(result);
        // powyższa metoda wypisze na ekranie wartość zmiennej result, która jest pochodną innych
    }

}
