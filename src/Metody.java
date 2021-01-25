public class Metody {
    /*
    Metoda jest to blok który zawiera jakieś instrukcje
    Może być wykonana (uruchomiona, wywołana), kiedy mamy jakiś obiekt danej klasy i odwołamy się do tej metody, korzystając z jej nazwy

    Gdzie jest nazwa metody i jak taką metodę zdefiniować?


    W tym przykładzie zdefiniujemy jedną metodę, która policzy nam wynik dodawania liczb od 0 do 100 i wyświetli go na ekranie.

    Aby zdefiniować metodę, najpierw korzystamy z identyfikatora dostępu, np. może być to public.
    Następnie podajemy zwracany typ danych (to może być int, String lub np. Student - wówczas zwróci nam obiekt klasy Student)
    Jeżeli nie chcemy zwracać żadnej wartości z naszej metody, to skorzystamy ze specjalnego słowa kluczowego "void"
    "void" oznacza, że nasza metoda nie zwraca żadnej wartości
    Następnie musimy podać nazwę metody

    Konwencja jeśli chodzi o nazewnictwo metody: rozpoczynamy z małej litery,a kolejne wyrazy bez spacji rozpoczynamy wielką literą (przykladowaNazwaMetody)
    Dodatkowo nazwa metody powinna wskazywać na to, co dana metoda robi

    Po nazwie metody dodajemy nawiasy, a następnie otwieramy klamerki.
    Wewnątrz nawiadów klamrowych definiujemy instrukcje, które będą wykonywane wewnątrz naszej metody

     */


    public void policzWynik() {
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i<100; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);

        /*
        Aby wywołać tą metodę, musimy stworzyć obiekt tej klasy (Metody), a następnie odwołać się do metody za pomocą jej nazwy i nawiasów
        Patrz MetodyTest
         */

    }

    /*
    Teraz spróbujemy stworzyć metodę która zwróci nam wartość

    Nie wystarczy tylko przekopiować wyżej stworzonej metody, podmienić "void" na określony przez nas typ danych i zmienić nazwy metody
    Jeśli byśmy na tym poprzestali, to otrzymamy komunikat "Missing return statement" (po najechaniu na ostatnią klamerkę metody)
    "return" to słowo kluczowe pozwalające nam zwrócić wartość z naszej metody; musimy je zawrzeć na końcu i określić którą wartość chcemy zwrócić
    (pamiętając jaki typ danych wcześniej zadeklarowaliśmy), może to być nasz wynik "result", ale możemy go zmodyfikować
    czy też wreszcie określić na sztywno dowolną wartość z typem int
     */



    public int pobierzWynik() {
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
        return result;
    }

    /*
    Teraz stworzymy metodę bardziej elastyczną od policzWynik.
    Tym razem parametr określający do kiedy pętla for ma się wykonywać (i<100) będzie podawany przez osobę wywołującą metodę.
    W tym celu w nawiasach podajemy określony typ zmiennej oraz jej nazwę oraz podmieniamy wartość w pętli for.
    Wartość parametru number będziemy podawać dopiero przy wywoływaniu naszej metody, dlatego tu nie ma zdefiniowanej wartości.
    W momencie wywołania metody będziemy musieli podać żądaną przez nas wartość w nawiasach obok nazwy metody
     */

    public void policzWynikParam(int number) {
        System.out.println("Number ma wartość: " + number);
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i< number; i++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);

    }


    public void add(int firstNumber, int secondNumber) {
        System.out.println("Suma to: " + (firstNumber + secondNumber));
    }

    public int add2(int number1, int number2) {
        if(number1==0) {
            return 0;
        }
        return number1+number2;
    //  System.out.println("Hello"); // ta instrukcja nigdy się nie wykona, gdyż wcześniej zwróciliśmy już wartość
        // W metodzie może być kilka 'return'
        // dodatkowo w metodzie możemy dodać więcej zmiennych zwracających wartość, np.
        // public int add(int firstNumber, ind secondNumber, String word)
        // wówczas podczas wywoływania metody trzeba by było określić trzy parametry - 2 inty i 1 String
    }


    /*
    Teraz powiemy sobie o konstruktorach, czyli specjalnych metodach, które zwracają obiekt danej klasy
    i które są wywoływane automatycznie podczas tworzenia obiektu.
    Więcej o konstruktorach i przykłady w klasie User
     */



}
