public class InstrukcjaWarunkowaElseIf {
    /*
    Instrukcja warunkowa "else if" powala nam sprawdzać kilka warunków
    Jeśli "if" i "else if" nie dadzą wyniku "true", to wykonany zostanie blok kodu "else"
     */

    public static void main(String[] args) {
        int number = 12;

        if(number == 0) {
            System.out.println("Liczba równa zero");
        } else if(number > 0) {
            System.out.println("Liczba dodatnia");
        } else if(number > 10) {
            System.out.println("Liczba większa od 10");
        } else if(number < -5) {
            System.out.println("Liczba mniejsza od -5");
        } else {
            System.out.println("Żaden warunek nie został spełniony");
        }

        // jeżeli jakiś warunek zostanie spełniony i kod zostanie wykonany, to nie sprawdzamy pozostałych warunków
        // w naszym przykładzie przykładowo liczba 12 spełnia warunek number > 0 i number > 10
        // wykonany zostanie tylko kod z pierwszą instrukcją której wynik będzie true, czyli u nas dostaniemy komunikat "Liczba dodatnia"
        // gdybyśmy zamienili kolejności instrukcji, sytuacja uległaby zmianie

    }

}
