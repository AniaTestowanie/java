public class MathTeacher extends Person {

    /*
    Analogicznie jak dla Footballer'a MathTeacher również jest osobą z charakterystycznymi cechami.

    */

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    /*
    Słowo kluczowe super, które przyjmuje name i age jako parametry, wywoła nam konstruktor klasy nadrzędnej
    Ale za pomocą słowa kluczowego super, możemy również w szerszy sposób odwołać się do klasy nadrzędnej, klasy bazowej
    np. poprzez wywołanie metod z klasy nadrzędnej, odwołania do metod czy pól
     */

    public void walk() {
        super.walk();
        System.out.println("I walk very fast");
    }

    /*
    Powyżej przykład rozszerzenia metody walk poprzez jej nadpisanie
    Nowa, nadpisana metoda walk, wywołuje "starą" metodę walk z klasy bazowej oraz dodaje określony przez nas tekst
     */

    public void teachMath() {
        System.out.println("I'm teaching math in " + school);
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + age);
    }

}
