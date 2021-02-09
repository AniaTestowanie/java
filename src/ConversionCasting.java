import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConversionCasting {

    /*
    Konwersja i rzutowanie typów

    Pokażemy proste przykłady

    Wykonamy dzielenie korzystając z różnych typów danych i zobaczymy, co musimy zrobić, aby różne typy danych się ze sobą nie gryzły.
     */

    public static void main(String[] args) {
        int a = 2;
        double b = 4.23;

        double c = a/b;
        /*
        W powyższym przypadku java niejawnie konwertuje nam typ danych - liczbę stałoprzecinkową (int), na liczbę zmiennoprzecinkową (double)
        Jest to możliwe ponieważ nie ma tu mowy o utracie jakichkolwiek danych: 2 zamienia się na 2.00
        Jeśliby konwersja zachodziła w drugą stronę, to w tej sytuacji stracilibyśmy ułamkową część zmiennej b,
        z tego powodu taka konwersja nie odbędzie się niejawnie, a wyrażenie: int d = a/b; będzie niepoprawne
        Jeśli jednak zależy nam na zmianie typu, możemy to zrobić samodzielnie

        Poniżej opis konwersji zmiennej double b na int

        Musimy zrzutować ten typ na typ int
        Przed zmienną którą chcemy konwertować musimy zrobić nawias i następnie podać typ, na który chcemy tę zmienną przekonwertować
        */

        int d = a/(int)b;

        System.out.println(c);
        System.out.println(d);

        /*
        Poniżej konwersja na przykładzie typów obiektowych

        Zmienna driver przechowuje WebDriver, bardziej ogólny typ
        Zmienna firefoxDriver jest konkretnego typu firefox
        Spróbujemy do niej przypisać zawartość zmiennej driver
        FirefoxDriver firefoxDriver = driver;
        Żeby to zadziałało, to musimy driver przerzutować na typ FirefoxDriver
        (inaczej próbujemy przyrównać FirefoxDrivera do WebDrivera)
        Robimy to analogicznie
         */

        WebDriver driver = new FirefoxDriver();
        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;
        firefoxDriver.get();


    }

}
