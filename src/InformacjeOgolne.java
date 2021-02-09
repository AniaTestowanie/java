public class InformacjeOgolne {


    /*

    Skróty w Intellij:

    alt+1 widok projektu (listy po lewej stronie)
    psvm + enter – public static void main
    sout + enter - System.out.println();
    ctr + tab - przechodzenie pomiędzy otwartymi zakładkami klas
    przytrzymanie ctrl + najechanie na naszą(!) metodę + kliknięcie - przenosi nas automatycznie do tej metody i kodu kryjącego się pod nią
    alt + enter - wyświetlenie podpowiedzi do danego wiersza
    alt+insert - generowanie np. konstruktora przez Intellij



    Komentarze:


    // po slaschach komentarz jednolinijkowy
    /*
    w tej przestrzeni komentarz wielolinijkowy
     */

    /*
    Zaznaczenie określonego obszaru i użycie skrótu klawiaturowego Ctr+shift+/ powoduje wykomentowanie go komentarzem wielolinijkowym

    Pojęcia:

    Klasa jest pewnego rodzaju szablonem, na podstawie którego można tworzyć obiekty
    Opis klasy na przykładach jest dostępny w klasie Auto, AutoTest oraz Student

    Metoda jest to blok który zawiera jakieś instrukcje

    Dziedziczenie to podstawowy mechanizm programowania obiektowego.
    Dzięki niemu możemy utworzyć hierarchię klas, która pozwoli nam na przekazanie pewnych cech klasy bazowej klasom potomnym.
    Najłatwiej dziedziczenie będzie przedstawić na przykładzie.
    Powiązane pojęcia, słowa kluczowe: super, this
    Person - będzie to klasa bazowa. MathTeacher i Footballer to klasy potomne. W nich szerszy opis

    Nadpisywanie metod (method overriding) - zmiana zachowania metody pomimo zachowania jej nazwy
    przykład dostępny w klasie Person / Footballer

    Przeciążąnie metod (method overloading) - posiadanie wewnątrz jednej klasy więcej niż jednej metody o tej samej nazwie
    Jest to możliwe tylko w przypadku kiedy dana metoda ma inne parametry (inną ich liczbę lub innych ich typ) - patrz klasa MethodName

    Paczka (package). Kiedy wraz ze wzrostem funkcjonalności projektowanego systemu / aplikacji rośnie też liczba klas,
    konieczne jest rozdzielenie tych klas na logiczne grupy reprezentujące jeden konkretny obszar aplikacji.
    Dodatkowo podział na takie grupy pozwoli nam na korzystanie z wielu różnych klas o tych samych nazwach.
    W javie takie grupy nazwywamy paczkami (package).
    Więcej o tworzeniu paczek i klas w ich obrębie w com.testeroprogramowania.app.info - klasa PackageInfo

    Modyfikatory dostępu określają w jaki sposób inne obiekty mogą uzyskać dostęp do danej metody, pola klasy czy też interfejsu.
    W Javie wyróżniamy cztery rodzaje modyfikatorów dostępu:
    - public
    - protected
    - private
    - oraz domyślny, default (nazywany również package - modyfikatorem paczki)
    Więcej o modyfikatorach dostępu w paczce identifiers (first, klasa Parent)

    Getter - metoda zwracająca wartość pola prywatnego. Więcej w klasie ReadOnly
    Setter - metoda przypisująca wartość pola prywatnego. Więcej w klasie ReadOnly

    Słowo kluczowe final nie pozwala zmienić wartości, która została przypisana do tej zmiennej (więcej w FinalTest)

    Src (source) – miejsce, folder, w którym trzymany jest kod źródłowy

    Zmienne to zarezerwowane miejsce w pamięci z określonym typem danych
    W javie określamy najpierw typ danych, a następnie nazwę takiej zmiennej
    Wszystkie zmienne muszą mieć unikatowe nazwy

    Typy proste / prymitywne typy danych zawierają tylko "surowe dane"

    Typy obiektowe przechowują aktualną wartość oraz umożliwiają wykonanie akcji (wywołanie metod) na tych danych
    Typy obiektowe pisane są wielką literą; wyświetlają się też w innym kolorze niż typy proste

    Debugowanie - sprawdzanie działania programu, kodu krok po kroku, sprawdzanie jakie wartości przypisane są do zmiennych w danym momencie
    Aby sprawdzić program w konkretnym miejscu, musimy dodać breakpoint; breakpoint to miejsce w którym program zostanie zatrzyamny
    Aby to zrobić najeżdżamy na odpowiednią linijkę kodu i klikamy obok numeru wiersza (miejsce to oznaczone zostanie czerwoną kropką a wiersz zostanie podświetlony)
    Następnie musimy uruchomić program, ale w odpowiednim trybie - w trybie debugowania (znaczek robaczka - w górnym panelu obok znaku play)

    Interfejs jest to zestaw metod bez ich implementacji, czyli będziemy określali zwracany typ, nazwę metody, ale nie będziemy podawali ciała metody,
    czyli całego kodu, który jest w środku.
    Ciało metody będzie dostarczone przez klasy, które będą implementowały nasz interfejs.
    Aby stworzyć nowy interfejs, klikamy prawym przyciskiem myszy na danym folderze lub paczce, wybieramy opcję New -> Java Class -> Interface
    Przykłady: Interface Vehicle, Bike (klasa która będzie implementowała interfejs Vehicle za pomocą słowa kluczowego implements), Truck

    W polimorfiźmie mamy świadomość, że jak podamy typ klasy bazowej lub interfejsu to ten typ może mieć kilka postaci, tj.:
    może to być każda z klas która rozszerza daną klasę lub każda z klas która implementuje interfejs.
    Polimorfizm oparty na klasach i na interejscie (odpowiednio paczki document i docs)

    Klasa abstrakcyjna jest pewnym uogólnieniem innych klas i jest to klasa która nie ma swoich reprezentantów w postaci obiektów,
    czyli nie możemy stworzyć obiektu klasy abstrakcyjnej.
    Klasa abstrakcyjna może zawierać metodę abstrakcyjną.
    Metody abstrakcyjne to metody, które nie mają implementacji (tak jak w interfejsie), a implementacja musi zostać dostarczona w klasach,
    które dziedziczą po naszej klasie abstrakcyjnej.
    Poza metodami abstrakcyjnymi, klasa ta może zawierać stałe oznaczone słowami kluczowymi static final,
    ale może też zawierać zwykłe metody które będą miały jakąś swoją implementację.

    Aby stworzyć klasę abstrakcyjną, tworzymy nową klasę i w górnym wierszu dodajemy słowo kluczowe abstract.
    Przykłady w paczce animals i klasie abstrakcyjnej Animal

    Wyjątek to specjalna sytuacja, która może spowodować zatrzymanie wykonania naszego programu
    Przykłady wyjątków znajdą się w klasie ExceptionsExample

    Nazewnictwo:


    Według konwencji nazwy zmiennych nadajemy według camelCase.
    Jest to system notacji ciągów tekstowych, w którym kolejne wyrazy pisane są łącznie, rozpoczynając każdy następny wielką literą (prócz pierwszego!)

    Jeśli chodzi o nazewnictwo klas, to nie stosujemy w nich spacji, a każde słowo zaczynamy wielką literą
    Staramy się też, by nazwa klasy opisywała to, co się będzie pod nią kryło

    Przydatne opcje:

    Zmiana nazwy utworzonej klasy
    Klikamy prawym przyciskiem myszy na nazwę klasy, wybieramy opcję Refactor i następnie Rename
    Po zmianie nazwy, naciskamy przycisk Refactor i gotowe




     */




}
