package identifiers.first;

public class Child extends Parent {

    /*
    Będzie to klasa potomna do Parent.
    Za jej pomocą zweryfikujemy, czy mamy dostęp do tych samych pól i metod co w klasie Parent
     */

    public void testIdentifier () {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        firstMethod();
        secondMethod();
        thirdMethod();
    }

    /*
    Klasa potomna w tej samej paczce nie ma dostępu do pól i metod private.
    Pola i metody private dostępne są tylko w obrębie klasy, w której je zdefiniowaliśmy.
     */

}
