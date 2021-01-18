public class InstrukcjaWarunkowaIf {
// Instrukcje warunkowe pozwalają nam określać które części kodu mają zostać wykonane,gdy zostanie spełniony warunek
// Jeśli warunek będzie miał wartość true, kod zostanie wykonany, jeśli false, to kod nie zostanie wykonany

    public static void main(String[] args) {
        /*
        W naszym przykładzie będziemy wykonywać dzielenie
        Musimy się jednak upewnić, że dzielnik nie będzie równy 0
        Gdyby jednak był, pomijamy wykonanie kodu i poprosimy o podanie innej liczby
        Funkcję umożlwiającą podanie alternatywnego bloku kodu do wykonania (w naszym przypadku prośba o inną liczbę) jest funkcja "else"
        Blok "else" wykonywany jest dla każdego wyniku "false"
         */
        float dzielna = 4.0F;
        float dzielnik = 0.0F;

        // Poniżej podajemy instrukcję warunkową i blok kodu, który będzie wykonany jeśli wartość będzie true

        if(dzielnik != 0) {
            System.out.println("Wynik dzielenia to: " + dzielna/dzielnik);
        } else {
            System.out.println("Proszę podaj inną liczbę");
        }
    }
}
