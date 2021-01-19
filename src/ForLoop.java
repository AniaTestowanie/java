public class ForLoop {
    /*
    Pętle umożliwiają cykliczne wykonanie ciągu instrukcji określoną liczbę razy

    Wypbraźmy sobie koniczność wyświetlenia liczb od 0 do 100, z krokiem przejścia 2 (podając liczby co dwa), tj. 0, 2, 4 itd.
    Bez użycia pętli musielibyśmy w 50 wierszach użyć metody sout. co byłoby nieefektywne, poza tym byłoby to rozwiązanie nieelastyczne w przypadku zmiany wymagań
    Właśnie w tym celu powstały pętle - aby zautomatyzować proces
     */

    public static void main(String[] args) {

        int number = 100;

        // i specjalna zmienna sterująca (równie dobrze możemy ją inaczej nazwać, choć tak się przyjęło, że jest to najczęściej i lub j)

        for (int i = 0; i < number; i = i + 2) {
            System.out.println(i);
        }


        /*
            Poniżej przykład tego, że w obrębie pętli for możemy dodawać instrukcje warunkowe.
            Poniżej mamy następujący warunek:
            i = 0, i ma być mniejsze od 100, i wzrasta o 1, wyświetlone zostaną tylko liczby podzielne przez 5 (modulo z i/5 to 0)

        for (int i=0; i < number; i++) {
            if(i%5==0) {
                System.out.println(i);
            }
        }
        */

        /*
        Poniżej przykład tego, że nie musimy pętli wykorzystywać tylko do liczb

        for (int j = 0; j < number; j++) {
            System.out.println("Kiedyś się tego nauczę!");
        }
        */


    }

}
