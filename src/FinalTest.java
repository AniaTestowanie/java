public class FinalTest {

    /*
    Słowo kluczowe final nie pozwala zmienić wartości, która została przypisana do tej zmiennej.

    Rozpoczynamy od zdefiniowania zmiennej która będzie typu final, będzie zawierała takie słowo kluczowe.

    słowo kluczowe final, typ danych, nazwa zmiennej i wartość (final int x = 2;)
    Próba zmiany x = 5; będzie skutkować błędem.
     */


    public static void main(String[] args) {
        final int x = 2;

        /*
        Spróbujemy też stworzyć nowy obiekt klasy Person ze słowem kluczowym final, aby sprawdzić
        modyfikację na zmiennej obiektowej i zweryfikować co znaczy dla niej, że jest final.

        Istniejący obiekt możemy edytować, np. zmienić wartość zmiennej age, działać na metodach które są dostępne dla obiektu,
        ale nie możemy przypisać nowego obiektu (tu: osoby)
        tj. person = new Person ("Tim", 25);
         */

        final Person person = new Person("Tomek",36);
        person.age = 25;


        /*
        Reasumując,
            Pola typu final są niezmienne, nie da się nadpisać ich wartości, jeśli chodzi o typy proste
            Nie możemy stworzyć, przypisać nowego obiektu tego typu do już istniejącej zmiennej, która jest final, jeśli chodzi o typy obiektowe

            Jeżeli oznaczymy metodę jako final, to takiej metody nie będziemy mogli nadpisać (np. gdybyśmy w klasie Person
            zmienili metodę eat() w następujący sposób: public final void eat(), to nie może ona zostać nadpisana w klasie Footballer)

            Jeżeli oznaczmy klasę jako final, to taka klasa nie może być klasą bazową, nie można dziedziczyć z tej klasy
            (np. gdybyśmy oznaczyli klasę Person jako final, tj. public final class Person, klasa Footballer czy Mathteacher nie mogą być jej klasami potomnymi)
         */


    }
}
