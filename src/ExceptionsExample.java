import drivers.ChromeDriver;
import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ExceptionsExample {

    /*
    Wyjątek to specjalna sytuacja, która może spowodować zatrzymanie wykonania naszego programu
     */

    public static void main(String[] args) {
/*
        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 3;

        //for (int i = 0; i <= numbers.length; i++) { //taki zapis wywoła nam błąd, wyjątek, ponieważ numbers.length = 2, a ostatni ideks tablicy to 1
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }
*/

        WebDriver driver = getDriver("firefox1"); // jeśli dla wartości null będziemy próbowali wywołać metodę, to również otrzymamy wyjątek
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

    }

    private static WebDriver getDriver(String name) {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        } else {
            return null;
        }
    }

    /*
    Aby sprawdzić, która linijka kodu nie działa, możemy kliknąć niebieski odnośnik, który przeniesie nas na właściwe miejsce w kodzie
    dodatkowo podany jest numer wiersza
    Cała ta informacja o wyjątku nazywana jest stack trace - stos wywołań i na podstawie tego stack trace można określić, co
    poszło nie tak

    Jeśli kompilator (np. Intellij) będzie nam podpowiadał, że dana metoda będzie mogła nam wyrzucać wyjątek i będziemy mogli
    zdecydować się na jej użycie i na to że program zostanie ewentualnie przerwamy lub na obsłużenie tego wyjątku, to takie wyjątki nazywamy checked.

    Wyjątków typu checked poniekąd się spodziewamy. Kompilator wymusi na nas obsłużenie tego wyjątku.
    Więcej o tego typu wyjątkach w klasie CheckedExceptions
     */

}
