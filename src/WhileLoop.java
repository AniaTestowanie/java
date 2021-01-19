public class WhileLoop {

    /*
    Pętla while jest wykonywana dopóki wartość logiczna z wyrażenia za "while" jest "true"
    W naszym przykładzie pętla będzie sprawdzać, czy nasza wartość będzie mniejsza od 10
    Jeśli tak, wykonany zostanie blok kodu, tj. na ekranie uzyskamy odpowiedni komunikat, a następnie zwiększamy wartość zmiennej
    Jeśli nie, kod nie wykona się
     */

    public static void main(String[] args) {
        int number = 0;
        while (number < 10) {
            System.out.println("Moja wartość to: " + number + " i jest mniejsza od 10");
            number++;
        }
    }
}
