public class LoopsCheck {
    /*
    Praca domowa
    1. Wypisz liczby z zakresu 1-100 podzielne przez 3
    2. Odwróć elementy tablicy [1, 3, 5] -> [5, 3, 3]
     */


    public static void main(String[] args) {

        /*
        // 1
        for (int i = 1; i < 100; i++) {
           if (i%3 == 0) {
               System.out.println(i);
           }
        }
        */

        // 2
        int[] numbers = new int[] {2, 8, 3, 1, 5};


        /*
        Najpierw musimy stworzyć zmienną tymczasową (o nazwie np. temp), która przechowa nam pierwszy element z tablicy
        A następnie nadpisać wartość w tablicy
         */

        for (int i = 0; i < (numbers.length/2); i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length-1-i];       //odejmujemy tu 1, gdyż długość naszej tablicy to 5, a ostatni numer indeksu to 4
            numbers[numbers.length-1-i] = temp;
            System.out.println("Interacja numer " + i);     // wiersz dodany na potrzeby śledzenia debugowania
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }



    }

}
