public class AutoTest {

    public static void main(String[] args) {


        /*
        Teraz musimy zadeklarować zmienną typu Auto, będzie to typ obiektowy
        Najpierw podajemy nazwę naszej klasy, następnie nazwę naszej zmiennej (w naszym przykładzie będzie to mercedes)
        Następnie tworzymy nowy obiekt tej klasy
        Aby to zrobić musimy skorzystać ze słowa kluczowego new, następnie podajemy nazwę klasy i nawiasy
         */

        Auto mercedes = new Auto();
        /*
        Tym sposobem mamy nowy obiekt klasy auto, który jest przypisany do zmiennej mercedes
        Następnie przypiszemy wartości do pól naszego obiektu
        W tym celu odwołujemy się do naszej zmiennej mercedes, która przechowuje nasz obiekt
        Po wpisaniu jej nazwy, wpisujemy kropkę i na liście rozwijanej wyświetlają nam się podpowiedzi
        Odpowiednie pola z literą f (field) oraz metody z literą m (methods)
        Od razu też widzimy jaki typ danych jest w danym polu (np. String)
        */
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.przebieg = 1000;
        mercedes.rokProdukcji = 2021;

        /*
        Po przypisaniu wartości możemy spróbować wywołać metody znajdujące się wewnątrz tej klasy
         */

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();
        /*
        Aby podpatrzeć co znajduje się w metodzie jedz(), przytrzymujemy ctrl, najeżdżamy na tę metodę
        Ona nam się podświetla i możemy na nią kliknąć. Kiedy to zrobimy zostaniemy automatycznie przekierowani do tej metody
         */

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rokProdukcji = 2020;
        audi.przebieg = 0;

        audi.info();
        audi.jedz();
        audi.hamuj();

        /*
        Jeśli nie ustawimy wartości zmiennej np. audi.marka etc., to dla typów String otrzymamy wartość null, dla zmiennych int wartość 0, gdyż:
        Domyślna wartość dla typów obiektowych to null
        DOmyślna wartość dla typów prostych to 0
        */


    }
}
