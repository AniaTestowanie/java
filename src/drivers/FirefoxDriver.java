package drivers;

public class FirefoxDriver implements WebDriver {

    public String przegladarka = "Firefox";

    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę za pomocą " + przegladarka);
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element za pomocą " + przegladarka);
    }
}
