package identifiers.first;

public class Random {

    /*
    Sprawdzamy modyfikatory dostępu w klasie, w której nie ma dziedziczenia.
    Z tego względu musimy najpierw utworzyć nowy obiekt
     */

    public void testIdentifier() {
        Parent parent = new Parent();
        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
    }

    /*
    Klasa (w której nie występuje dziedziczene) w tej samej paczce nie ma dostępu do pól i metod private.
     */
}
