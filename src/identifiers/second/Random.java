package identifiers.second;

import identifiers.first.Parent;

public class Random {

    public void testIdentifier() {
        Parent parent = new Parent();
        System.out.println(parent.first);
        parent.firstMethod();
    }

    /*
    W klasie (w której nie występuje dziedziczenie) w innej paczcie nie mamy dostępu do pól i klas default, private i protected.
    Dostępne są tylko pola i meody z modyfikatorem public.
     */
}
