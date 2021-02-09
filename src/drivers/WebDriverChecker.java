package drivers;

import drivers.ChromeDriver;
import drivers.FirefoxDriver;

public class WebDriverChecker {
    /*
    Praca domowa:
    stwórz interface drivers.WebDriver, który będzie miał dwie metody get() i findElementBy()
    Dodaj dwie klasy drivers.ChromeDriver i drivers.FirefoxDriver, które będą implementowały ten interface
    W metodzie get() ma się znaleźć informacja, że otwieramy przeglądarkę za pomocą Chrome / Firefox
    W metodzie findElementBy() ma się znaleźć informacja, że znajdujemy element za pomocą Chrome / Firefox

     */

    public static void main(String[] args) throws NoValidBrowserName {

        /*
        Poniżej rozwiązanie pracy domowej
         */

        /*
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get();
        firefoxDriver.findElementBy();

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get();
        chromeDriver.findElementBy();
         */

        /*
        Poniżej przykład tego, w jaki sposób możemy skorzystać z polimorfizmu, aby nie powielać kodu
        W zależności jaką wartość damy w getDriver, wykona nam się odpowiedni kod
         */

        WebDriver driver = getDriver("opera");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();


    }

/*    private static WebDriver getDriver(String name) {
        if(name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        } else {
            return null;
        }
    }*/

    /*
    Jeśli sprawdzamy czy wartość String jest równa jakiemuś tekstowi nie wykorzystujemy znaków ==
    ale korzystamy z metody equals jak pokazano powyżej
     */

    /*
    Poniżej próbujemy wywołać zdefiniowany przez nas wyjątek.
    W tym celu return zastępujemy słowem kluczowym throw, a następnie musimy podać nowy obiekt klasy,
    której wyjątek chcemy wyrzucić.
    W kolejnym kroku wybieramy jedną z dwóch metod obsłużenia wyjątku. W tym przypadku decydujemy się na
    dodanie informacji o nim w deklaracji i to samo robimy z metodą main
     */

    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if(name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        } else {
            throw new NoValidBrowserName("No valid browser name");
        }
    }



}
