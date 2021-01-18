public class OperatoryLogiczne {
    // Operatory logiczne działają na wartościach logicznych zwracając również wartości logiczne

    public static void main(String[] args) {

        /*
        określamy zmienne które przechowują wartości logiczne
        nie muszą to być zmienne, które tak jak poniżej zwracają wartości logiczne "na sztywne"
        możemy skorzystać z czegoś, co nam zwraca wartości logiczne, np. z operatorów porównania, tj.:
        boolean firstValue = 2 > 1;
        boolean secondValue = 2 < 1;
         */

        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true ;


        /*
        Będziemy korzystać z następujących operatorów logicznych:
        && - i - sprawdza wartość wyrażeń składowych i zwróci nam "true" gdy wszystkie wyrażenia składowe są równe "true"
        || - lub - sprawdza wartość wyrażeń składowych i zwróci nam "true" gdy jedno wyrażenie składowe jest równe "true"
        ! - zaprzeczenie, negacja - zwraca wartość przeciwną do wyrażenia, przed którym się znajduje
         */


        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && fourthValue);
        System.out.println(secondValue && thirdValue);
        System.out.println(firstValue || secondValue);
        System.out.println(secondValue || thirdValue);
        System.out.println(secondValue || thirdValue || fourthValue);
        System.out.println(!firstValue);
        System.out.println(!secondValue);
        System.out.println(!(firstValue && secondValue));
    }
}
