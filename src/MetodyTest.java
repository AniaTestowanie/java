public class MetodyTest {

    public static void main(String[] args) {
        Metody metody = new Metody();
/*        //metody.policzWynik();
        int result = metody.pobierzWynik();             // zmienna result (równie dobrze mogę nazwać abc) przechowuje wartość zwróconą przez naszą metodę, całość wyrażenia wywołuje też całą metodę
        int result2 = result*2;
        System.out.println("Rezultat po mnożeniu to: " + result2);*/
        metody.policzWynikParam(2);
        metody.policzWynikParam(100);
        metody.policzWynikParam(23);



    /*
    odwołanie się do tak skonstruowanej metody ma szereg zalet:
    1) większa przejrzystość
    2) można używać samej metody, bez konieczności przeklejania całego kodu w niej zawartego
    3) w przypadku błędu w kodzie, zmieniamy go tylko w jednym miejscu, a nie w każdym w którym jej użyliśmy
     */

    /*
    Kiedy odwrócimy schemat, tj. najpierw powołamy się na metodę, które nie została jeszcze utworzona,
    podśwetli się nam ona na czerwono. Możemy wówczas wybrać z podpowiedzi Intellij opcję: "create method 'add(nazwa)' in 'Metody'",
    która przeniesie nas do klasy Metody, gdzie zostanie wygenerowana konkretna metodą z zadaną nazwą
     */
        metody.add(2,3);

        int result = metody.add2(3,5);
        System.out.println(result);

        System.out.println(metody.add2(0,1));

        metody.add2(0,1);

        // Powyżej przykłady użycia metody add2
        // Jeśli nie użyjemy sout, metody.add2() nie pokaże nam zwracanych wartości, bo nie mamy takiej instrukcji
    }
}
