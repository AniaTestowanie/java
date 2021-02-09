import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    /*
    Taki zapis:

        public static void readFile(String path) {
        FileInputStream fileInputStream = new FileInputStream(path);
    }

    spowoduje podświetlenie ostatniego członu FileInputStream, ponieważ Intellij spodziewa się wyjątku z uwagi
    że taki plik może nie istnieć
    Będziemy musieli zająć się obsługą takiego wyjątku

    Są dwa sposoby na obsłużenie tego wyjątku:
    - albo możemy skorzystać z metody try catch
    - albo możemy wybrać opcję podpowiadaną przez Intellij "add exception to method signature",
    czyli dodanie do nazwy naszej metody inforacji, że może ona wyrzucić wyjątek

    Jest to informacja dla innych metod, które będą wywoływały tę metodę, że ta metoda może wyrzucić wyjątek
    Co za tym idzie, gdy stworzymy metodę main i spróbujemy wywołać metodę readFile(), również podświetli nam się na czerwono,
    ponieważ wywołanie metody, która może wywołać wyjątek - może wywołać wyjątek ;)
    Tym samym również w tym konktekście mamy do dyspozycji dwie metody,

    W obydwu pzypadkach wybierzemy na razie opcję 'add exception to method signature'
     */


/*    public static void main(String[] args) throws FileNotFoundException {
        readFile("/src/testestes/test.txt");
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }*/

    /*
    Zamiast informacji, że nasza metoda wyrzuca wyjątek, możemy też skorzystać z drugiej opcji:
    bloku try i bloku catch. W tym celu posłużymy się tym samym przykładem
    i wybierzemy opcję 'surround with try/catch'.
    Co to jest za struktura?
    W bloku try definiujemy kod, który chcemy wykonać, ale mamy świadomość, że ten kod może spowodować sytuację wyjątkową,
    wywołać wyjątek. Jeśli ten kod wyrzuci wyjątek, to nie chcemy przerywać programu, tylko łapiemy ten wyjątek (tąd ten drugi blok - catch)
    i definiujemy co ma się stać, jeśli ten wyjątek zostanie wyłapany.

    W ramach testu stwórzmy przykładowy plik - klikamy prawym przyciskiem myszy na src, wybieramy opcję new -> file
    podajemy nazwę (może być od razu z rozszerzeniem .txt)
    Następnie skopiujmy ścieżkę (copy path - absolute path) i podmieńmy błędną ścieżkę w parametrze readFile()
    Podając prawidłową ścieżkę pliku, nie wywołamy wyjątku, zatem blok catch nie zostanie wykonany
     */

/*    public static void main(String[] args)  {
        try {
            System.out.println("Before reading file"); // możemy dodać określone działania przed wywołaiem tej metody
            readFile("C:\\Users\\Saturn\\Desktop\\automatyzacja\\java\\src\\test"); //
            System.out.println("Closing file"); // i możemy dodać określone działania po wywołaniu tej metody
        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage()); // możemy tu się dostać do obiektu klasy FileNotFoundException, czyli obiektu klasy naszego wyjątku; w naszym przypadku pobierzemy wiadomość
            //e.printStackTrace(); // lub wyświetlić stack trace
        }
    }*/


    /*
    Spróbujmy teraz zmodyfikować nasz kod w taki sposób, aby informacja "Closing file" wyświetlała się
    bez względu na to, czy blok catch zostanie czy też nie zostanie wykonany
    (oczywiście moglibyśmy skopiować odpowiedni wiersz z bloku try do bloku catch, ale to rozwiązanie jest nieefektywne i ograniczone).
    W tym celu możemy zastosować dodatkowy blok finally, który wykonuje się zawsze (zarówno w przypadku wyjątku jak i bez niego).
     */

    public static void main(String[] args)  {
        try {
            System.out.println("Before reading file"); // możemy dodać określone działania przed wywołaiem tej metody
            readFile("C:\\Users\\Saturn\\Desktop\\automatyzacja\\java\\src\\testy"); //
        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage()); // możemy tu się dostać do obiektu klasy FileNotFoundException, czyli obiektu klasy naszego wyjątku; w naszym przypadku pobierzemy wiadomość
            //e.printStackTrace(); // lub wyświetlić stack trace
        } finally {
            System.out.println("Closing file");
        }
    }


    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
