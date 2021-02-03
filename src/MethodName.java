public class MethodName {

    /*
    Przeciążąnie metod (method overloading) - posiadanie wewnątrz jednej klasy więcej niż jednej metody o tej samej nazwie
    Jest to możliwe tylko w przypadku kiedy dana metoda ma inne parametry (inną ich liczbę lub innych ich typ)

    Weryfikacja poprawności działania będzie się odbywać poprzez klasę MethodNameTest
     */

    public void add (int a, int b) {
        System.out.println(a + b);
    }

    public void add (int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(int a) {
        System.out.println(a);
    }

    public void add(String a) {
        System.out.println(a);
    }

    public void add() {
        System.out.println(2 + 1);
    }
}
