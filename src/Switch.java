public class Switch {

    /*
    Instrukcja sterująca switch działa podobnie do instrukcji else if

    "break" powoduje przerwanie wykonania instrukcji sterującej;
    gdybyśmy w naszym przykładzie nie użyli "break" po każdym casie, wówczas na ekranie wyświetliłyby nam się wszystkie komunikaty

    "default" powoduje wykonanie kodu dla innych wartości niż wskazane w case'ach
     */

    public static void main(String[] args) {

        String danie = "Krewetki";

        switch (danie) {
            case "Pizza":
                System.out.println("Cena pizzy to 22 zł");
                break;
            case "Losos":
                System.out.println("Cena łososia to 26 zł");
                break;
            case "Frytki":
                System.out.println("Cena frytek to 9 zł");
                break;
            default:
                System.out.println("Brak dania w karcie");
        }
    }




}
