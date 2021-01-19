public class DoWhile {
/*
Pętla do while delikatnie różni się od pętli while, tj:
Mamy blok kodu "do", który zawiera instrukcje które chcemy wykonać, a następnie mamy część "while", która sprawdza nasz warunek
czyli najpierw odbywa się wykonanie kodu, a następnie przechodzimy do sprawdzenia warunku -> jeśli będzie miał wartość "true",
to ponownie przejdziemy do bloku "do", jeśli "false" ponownie kod się nie wykona

W naszym przypadku oznacza to, że niezależnie jaką wartość przypiszemy zmiennej number, pierwsze wykonanie kodu następi, nawet jeśli nie będzie spełniony warunek
Dopiero kolejne wykonanie będzie wstrzymane
Gdybyśmy zaczęli od np. 0, uzyskamy taki sam efekt jak w przypadku pętli While, tj. ostatnim wynikiem będzie 9
 */

    public static void main(String[] args) {
        int number = 20;
        do {
            System.out.println("Moja wartość to: " + number + " i jestem mniejsza od 10");
            number++;
        }
        while (number < 10);
    }
}
