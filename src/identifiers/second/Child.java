package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    public void testIdentifier() {
        System.out.println(first);
        System.out.println(third);
        firstMethod();
        thirdMethod();
    }

    /*
    Klasa potomna w innej paczce nie ma dostępu do pól i metod private.
    Pola i metody private dostępne są tylko w obrębie klasy, w której je zdefiniowaliśmy.

    Nie mamy również dostępu do pól i metod z modyfikatorem domyślnym, gdyż pola i metody
    z modyfikatorem domyślnym, zwanym również modyfikatorem paczki są dostępne tylko w obrębie
    danej paczki, w której te pola i metody zdefiniowano.
     */

}
