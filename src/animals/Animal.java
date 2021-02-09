package animals;

public abstract class Animal {

    /*
    Klasa abstrakcyjna jest pewnym uogólnieniem innych klas i jest to klasa która nie ma swoich reprezentantów w postaci obiektów,
    czyli nie możemy stworzyć obiektu klasy abstrakcyjnej.

    Klasa abstrakcyjna może zawierać metodę abstrakcyjną.
    Metody abstrakcyjne to metody, które nie mają implementacji (tak jak w interfejsie), a implementacja musi zostać dostarczona w klasach,
    które dziedziczą po naszej klasie abstrakcyjnej.
    Poza metodami abstrakcyjnymi, klasa ta może zawierać stałe oznaczone słowami kluczowymi static final,
    ale może też zawierać zwykłe metody które będą miały jakąś swoją implementację.

    Aby stworzyć klasę abstrakcyjną, tworzymy nową klasę i w górnym wierszu dodajemy słowo kluczowe abstract.
    Aby stworzyć metodę abstrakcyjną, również musimy się posłużyć słowem kluczowym abstract (przykład poniżej).

    Klasa abstrakcyjna również wymusza pewien kontrakt - wymusza dostarczenie implementacji metody sound.

    Klasa abstrakcyjna ma podobne zastosowanie i działanie co interfejs. Warto jednak rozumieć ich reguły, różnice, korzyści i ograniczenia
     */

    public final static int legs = 4;

    public abstract void sound();

    public void sayHello() {
        System.out.println("Hello! I am an animal");
        }


}
