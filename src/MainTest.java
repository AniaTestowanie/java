public class MainTest {

    //Metoda uruchomieniowa psvm jest rownież metodą statyczną

    public static void main(String[] args) {

        // Dwa sposoby na wywołanie metody statycznej main z klasy StudentChecker. Pierwszy:

        StudentChecker.main(args);

        // Drugi:

        String[] argss = new String[0];
        StudentChecker.main(argss);
    }
}
