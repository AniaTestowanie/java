public class InkrementacjaDekrementacja {
    public static void main(String[] args) {

        /*
        Mamy dwa typy inkrementacji i dekrementacji:
        post-inkrementację/dekrementację i pre-inkrementację/dekrementację
        Postinkrementacja "++" stoją za nazwą zmiennej
        Postdekrementacja "--" stoją za nazwą zmiennej
        Preinkrementacja "++" stoją przed nazwą zmiennej
        Predekrementacja "--" stoją przed nazwą zmiennej

        Post-inkrementacja/dekrementacja - najpierw następuje przypisanie wartości, a następnie jej zmiana in plus lub in minus
        Pre-inkrementacja/dekrementacja - najpierw zmienia się wartość zmiennej in plus lub in minus, a następnie przypisujemy wartość do zmiennej
         */

        // Inkrementacja to zwiększenie wartości o jeden
        int a = 0;
        System.out.println("Wartość a: " + a);  // 0
        int b = a++;                            // zwiększenie wartości zmiennej o 1 -> w tym przypadku mamy do czynienia z postinkrementacją
        System.out.println("Wartość b: " + b);  // 0
        System.out.println("Wartość a: " + a);  // 1
        int c = ++a;                            // kolejne zwiększenie wartości zmiennej o 1 -> w tym przypadku mamy do czynienia z preinkrementacją
        System.out.println("Wartość c: " + c);  // 2
        System.out.println("Wartość a: " + a);  // 2  -> zmienna to dwa, ponieważ już wcześniej użyliśmy inkrementacji "a++", podnosząc wartość, a teraz robimy to ponownie

        // Dekrementacja to zmniejszenie wartości o jeden
        int d = 0;
        System.out.println("Wartość d: " + d);  // 0
        int e = d--;
        System.out.println("Wartość e: " + e);  // 0
        System.out.println("Wartość d: " + d);  // -1
        int f = --d;
        System.out.println("Wartość f: " + f);  // -2
        System.out.println("Wartość d: " + d);  // -2
    }
}
