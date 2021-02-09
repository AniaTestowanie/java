package drivers;

public class ChromeDriver implements WebDriver {

    public String przegladarka = "Chrome";

    @Override
    public void get() {
        System.out.println("Otwieram przeglądarkę za pomocą " + przegladarka);
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję element za pomocą " + przegladarka);
    }
}
