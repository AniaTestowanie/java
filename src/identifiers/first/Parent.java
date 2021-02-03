package identifiers.first;

/*

Modyfikatory dostępu określają w jaki sposób inne obiekty mogą uzyskać dostęp do danej metody, pola klasy czy też interfejsu.
W Javie wyróżniamy cztery rodzaje modyfikatorów dostępu:
- public
- protected
- private
- oraz domyślny, default (nazywany również package - modyfikatorem paczki)

Modyfikator dostępu określamy słowem kluczowym przed typem danych określając pola lub na początku definiowania metody.
Wyjątkiem jest modentyfikator domyślny, który jest używany, kiedy żaden z pozostałych modyfikatorów nie został wskazany.

Wewnątrz tej klasy utworzymy cztery pola oraz cztery metody z różnymi modyfikatorami dostępu
oraz jedną metodę testową
 */

public class Parent {


    public String first = "public";
    String second = "default";
    protected String third = "protected";
    private String fourth = "private";


    public void firstMethod() {
        System.out.println("public");
    }

    void secondMethod() {
        System.out.println("default");
    }

    protected void thirdMethod() {
        System.out.println("protected");
    }
    private void fourthMethod() {
        System.out.println("private");
    }

    public void testIdentifiers() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }

    /*
    Po analizie dostępnych pól i metod w klasach: Child i Random (w obrębie tej paczki i poza nią), możemy podsumować:
    public - pola i metody dostępne bez ograniczeń
    default - pola i metody dostępne w obrębie tej samej paczki bez względu czy mamy do czynienia z dziedziczeniem czy nie
    protected - pola i metody dostępne w obrębie klas potomnych lub/i w obrębie tej samej paczki (nie są dostępne w klasie bez dziedziczenia, z innej paczki)
    private - pola i metody dostępne tylko w obrębie klasy, w której je zdefiniowaliśmy
     */



}
