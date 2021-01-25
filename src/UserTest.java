public class UserTest {

    public static void main(String[] args) {

        /*
        Dla domyślnego konstruktora tworzymy obiekt tak jak w pierwszym wierszu,
        a następnie przypisujemy polom wartość oraz wywołujemy metodę

        Problem z takim podejściem jest taki, że możemy zapomnieć przypisać wartość i to może spowodować jakieś błędy w naszym programie

        Za pomocą konstruktora możemy od razu przypisać wartości do pól naszego obiektu

         */


        User user = new User();
        User user2 = new User ("Kasia", "haslo");

        user.username = "Ania";
        user.password = "qwerty";
        user.sayHello();

        System.out.println(user2.username + " " +user2.password);
    }

}
