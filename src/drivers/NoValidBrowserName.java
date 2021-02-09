package drivers;

public class NoValidBrowserName extends Exception{

    /*
    Tworzymy własny wyjątek. W tym celu najpierw tworzymy klasę o odpowiedniej nazwie,
    a następnie musimy rozszerzyć klasę Exception (z pakietu java.lang)

    Wyjątek będzie się wywoływał w WebDriverChecker

    Możemy też przygotować wiadomość (przykład poniżej)

    Tu zaprezentowany został przykład wyjątku typu checked.

    Jeśli chcemy stworzyć swój własny wyjątek typu unchecked, rozszerzamy klasę RuntimeException,
    wówczas nie musimy w WebDriverChecked rozszerzać sygnatury słowem kluczowym throw. Nie powinniśmy jednak
    korzystać z takiego rozwiązania, gdyż błędy unchecked pozostawiamy jednak na sytuację, gdy są to błędy niespodziewane,
    wynikające z błędu programisty

     */

    public NoValidBrowserName(String message) {
        super(message);
    }

}
