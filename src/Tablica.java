public class Tablica {
    /*
    Tablice są to struktury pozwolające gromadzić większą ilość danych


     */

    public static void main(String[] args) {

        /*
        Poniżej tablica zawierająca listę zimowych miesięcy
        Najpierw stworzyliśmy pustą tablicę, która miała 3 elementy i dopiero później przypisywaliśmy
        wartości do konkretnych miejsc w tej tablicy
         */

        String[] winterMonths = new String[3];
        winterMonths[0] = "grudzien";
        winterMonths[1] = "styczen";
        winterMonths[2] = "luty";

        /*
        Zdefiniujmy tablicę "imiona"
        Najpierw określamy typ danych - String
        Następnie dodajemy nawiasy kwadratowe, które wskazują nam że będzie to tablica (tak definiujemy typ danych tablice)
        Dodajemy nazwę tablicy - w naszym przypadku będzie to "imiona"
        Następnie tworzymy nową tablicę - "new String"
        W nawiasach podajemy liczbę elementów tej tablicy
         */

        String[] imiona = new String [3];

        /*
        Teraz musimy przypisać wartość do konkretnych pól, do konkretnych miejsc w tablicy
        Wszystkie elementy mają swoje indeksy, numery.
        Zawsze zaczynamy numerować elementy w tablicy od 0 (nie od 1!)
        Zatem w celu przypisania konkretnej wartości wpisujemy nazwę tablicy wraz z konkretnym indeksem, a następnie naszą wartość
         */
        imiona[0] = "Bartek";
        imiona[1] = "Basia";
        imiona[2] = "Michał";

        /*
        Analogicznie w przypadku jeśli chcemy skorzystać z funkcji sout - musimy wskazać konkretny element do wyświetlenia
         */

        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);


        // Poniżej przykład tablicy zawierającej typy proste i tu jest inny sposób definiowania tablicy
        // Od razu definiujemy jakie wartości są w tablicy podczas tworzenia tej tablicy

        int[] lottoNumbers = new int[] {1,2,3,4,5,6};

        System.out.println(winterMonths[0]);
        System.out.println(winterMonths[1]);
        System.out.println(winterMonths[2]);

        System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[2]);
        System.out.println(lottoNumbers[3]);
        System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[5]);

        /*
        Mamy też możliwość wyświetlenia długości tablicy
        Przyda nam się to w pętlach
         */

        System.out.println(lottoNumbers.length);

        for (int i = 0; i <imiona.length; i++) {
            System.out.println(imiona[i]);
        }

        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.println(lottoNumbers[i]);
        }


    }
}
