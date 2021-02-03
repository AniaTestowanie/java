public class Person {

    /*
    Dziedziczenie to podstawowy mechanizm programowania obiektowego.
    Dzięki niemu możemy utworzyć hierarchię klas, która pozwoli nam na przekazanie pewnych cech klasy bazowej klasom potomnym.

    Najłatwiej dziedziczenie będzie przedstawić na przykładzie.
    Person - będzie to klasa bazowa. Taka klasa będzie miała określone pola, jak: name, age oraz metody

    Następnie utworzymy klasy, które będą dziedziczyły te pola i te metody, gdyż będą one wspólne.
    Tymi klasami będą: Footballer oraz MathTeacher - one też są osobami, choć mają od siebie odmienne cechy.

    Chcemy aby klasy Footballer oraz MathTeacher rozszerzały klasę Person.
    Aby to zrobić w górnym wierszu, gdzie jest tworzona klasa, używamy słowa kluczowego "extends"
    a następnie wskazujemy właściwą klasę - w naszym przykładzie Person

    Kiedy to zrobimy, klasy Footballer oraz MathTeacher automatycznie mają te same pola i metody co Person.

    Po lewej stronie wiersza "public class Person {" możemy zobaczyć jakie klasy rozszerzają tą klasę

    */

    /*
    Nadpisywanie metod
    Czasem możemy nie chcieć aby metody w klasach potomnych były takie same jak w klasie nadrzędnej, chcemy dokonać modyfikacji
    W tym celu będziemy nadpisywali metody
    Dla naszego przykładu załóżmy, że Footballer będzie miał inne zachowanie w obrębie metody eat.
    W tym celu będziemy musieli nadpisać tę metodę, czyli wewnątrz klasy potomnej Footballer zdefiniować kolejną metodę eat,
    która przesłoni metodę eat z klasy nadrzędnej

    Po lewej stronie metody nadpisującej i nadpisanej zobaczymy odpowiedni symbol i komentarz Intellij informujący o tym fakcie
     */

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("I like pizza!");
    }

    public void walk() {
        System.out.println("I like walking!");
    }


}
