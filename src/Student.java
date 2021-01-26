public class Student {
    /*
    Np. tworząc aplikację przechowującą informację o studentach, możemy stworzyć klasę Student, która będzie swego rodzaju szablonem dla wszystkich studentów
    Taka klasa mogłaby zawierać następujące pola:
    */

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    /*
    Możemy też dodać pola statyczne
    Są to pola, które nie odnoszą się do obiektu danej klasy, a do samej klasy,
    dla naszego przykładu może być to informacja o tym dla jakiej uczelni przechowujemy dane
    Oczywiście mogłoby to być również pole dotyczące obiektu Student, ale wówczas
    1) każdy ze studentów miałby w tym miejscu taką samą wartość
    2) istnieje ryzyko popełnienia błędu podczas przypisywania wartości

    Zatem chcemy aby pole z nazwą uczelni było bardziej charakterystyczne dla klasy a nie dla obiektu tej klasy.
    To pole będzie współdzielone przez obiekty tej klasy, ale nie będzie bezpośrednio powiązane z nimi
     */

    public static String nazwaUczelni = "AGH";

    public void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko);
        }

    public void zalogujSie() {
        System.out.println("Loguję się za pomocą " + nick);
        }

    public void podajNrIndeksu() {
        System.out.println("Mój numer indeksu to: " + numerIndeksu);
        }

    public void podajEmail() {
        System.out.println("Mój email to: " + email);
        }

    /*
    Analogicznie do pól statycznych, mamy też metody statyczne, które będą charakterystyczne dla klasy,
    będą powiązane z klasą a nie z konkretnymi obiektami danej klasy.
    Metoda statyczna nie ma dostępu do innych pól niż statyczne (!), czyli np. w naszym przykładzie do pola imie czy nazwisko
    W obrębie metody statycznej możemy zawrzeć inne metody, ale tylko pod warunkiem, że one też będą statyczne
     */

    public static void infoUczelnia() {
        System.out.println("Moja uczelnia to: " + nazwaUczelni);
        drugaMetoda();
    }

    public static void drugaMetoda() {
        System.out.println("Jestem drugą metodą");
    }
}
