public class Student {
    /*
    Np. tworząc aplikację przechowującą informację o studentach, możemy stworzyć klasę Student, która będzie swego rodzaju szablonem dla wszystkich studentów
    Taka klasa mogłaby zawierać:
    */

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

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



}
