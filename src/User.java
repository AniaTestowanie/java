public class User {
    /*
    Konstruktory to specjalne metody, które zwracają obiekt danej klasy i które są wywoływane automatycznie podczas tworzenia obiektu.

    Stwórzmy dwa pola publiczne oraz określmy metodę. Następnie w klasie UserTest stwórzmy nowy obiekt klasy User,
    przypiszmy wartości do pól oraz wywołajmy metodę.

    W momencie tworzenia nowego obiektu, jednak gdy po kliknięciu User, wejdziemy do naszej klasy, nie widzimy żadnej specjalnej metody.
    Nie widzimy jej, gdyż w javie istnieje coś takiego jak konstruktor domyślny, którego nie trzeba jawnie definiować.




     */

    public String username;
    public String password;

    /*
    Gdybyśmy chcieli jednak poznać zapis konstruktora, to wygląda on następująco:
    metoda ta zwraca typ User, nie ma nazwy, nie mamy tu też zwrotu return.

    public User() {

    }

    Aby sprawdzić, czy
    metoda ta faktycznie jest wywoływana, możemy dodać sout z odpowiednim tekstem w celu obserwacji,
    czy zostanie on wypisany na ekranie w momencie tworzenia nowego obiektu, np.:


    public User() {
        System.out.println("Hello z konstruktora");
    }

    Nasz konstruktor może przyjmować też określone argumenty:

    public User (String user, String pass) {

    }

    ale wówczas pojawi nam się problem, gdyż podczas tworzenia nowego obiektu będziemy musieli przekazać te dwa argumenty.

    Jeśli chcemy uniknąć tego problemu, to możemy zadeklarować drugi konstruktor publiczny, ale tym razem jawnie, który nie będzie miał żadnych parametrów
    i będzie wyglądał jak konstruktor domyślny.

    -> Jeśli chcemy mieć kilka konstruktorów, to wtedy ten domyślny musi być jawnie zadeklarowany
    Jeśli go nie będzie, to będziemy mieli błąd - będziemy musieli podać parametry podczas tworzenia obiektu, a jeśli tego nie zrobimy, kod nam nie zadziała

    Poniżej przykład:


    public User () {

    }

    public User (String user, String pass) {
        System.out.println("Hello z konstruktora");
        username = user;
        password = pass;
    }

    Po co deklarować konstruktor z parametrami i co możemy zrobić z wartościami, które zostaną przekazane podczas tworzenia obiektu?
    Jeśli zastosujemy powyższy zapis, to podczas tworzenia nowego obiektu podając określone wartości w parametrach od razu mamy przypisane wartości do pól

    Czasem możemy spotkać zapis, w którym parametry mają taką samą nazwę jak nazwa pól.
    Wówczas musimy jawnie wskazać, że chodzi nam o przypisanie wartości do pola w nowotworzonym obiekcie
    Powinniśmy skorzystać wówczas ze słowa kluczowego 'this'. Słowo 'this' wskazuje nam na obiekt, który właśnie tworzymy
    Taki zapis również umożliwia nam utworzenie nowego obiektu z już zdefiniowanymi polami


    */

    public User () {

    }

    public User (String username, String password) {
        System.out.println("Hello z konstruktora");
        this.username = username;
        this.password = password;

    }

    public void sayHello() {
        System.out.println("Hello my name is " + username);
    }



}
