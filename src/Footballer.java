public class Footballer extends Person {

    /*
    Wiemy, że piłkarz jest osobą, więc posiada wszystkie cechy i metody klasy Person
    Ma też inne charakterystyczne elementy

    Jeśli będziemy chcieli przypisywać wartości do pól za pomocą konstruktora / przy tworzeniu nowego obiektu
    musimy w klasie Footballer i MathTeacher skorzystać z konstruktora ze słowem kluczowym super
    Słowo kluczowe super, które przyjmuje name i age jako parametry, wywoła nam konstruktor klasy nadrzędnej
    (możemy kliknąć na super przytrzymując ctrl i zobaczymy, że przeniesie nas do konstruktora klasy nadrzędnej, czyli Person)

    Aby stworzyć piłkarza, musimy najpierw wywołać konstruktor klasy nadrzędnej. Wcześniej nie musieliśmy tego robić, ponieważ korzystaliśmy
    z konstruktora domyślnego i wszystko działo się niejawnie, wewnątrz naszych klas

    Jeśli chcemy dodatkowo, aby podczas tworzenia obiektu Footballer, żądane było podanie klubu piłkarskiego, możemy dodać tę zmienną do konstruktora.
    Ponieważ footballClub jest charakterystyczny tylko dla Footballera, a nie dla Person, dodanie tego parametru nie będzie się odbywać
    poprzez słowo kluczowe super, ale przez słowo this.
    Musimy pamiętać, że słowo kluczowe super musi być pierwsze w schemacie konstruktora. Dopiero później możemy skorzystać ze słowa kluczowego this.

     */

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        this.footballClub = footballClub;
    }

    // Poniżej nadpisanie metody eat

    public void eat() {
        System.out.println("I like healthy food!");
    }

    public void playFootball() {
        System.out.println("I'm playing football for " + footballClub);
    }

}
