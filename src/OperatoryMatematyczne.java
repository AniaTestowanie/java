public class OperatoryMatematyczne {
    //Operatory matematyczne umożliwiają wykonanie podstawowych operacji matematycznych

    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 6F;

        int addition = firstNumber + secondNumber;          //10
        int subtraction = firstNumber - secondNumber;       //-2
        int multiplication = firstNumber * secondNumber;    //24
        int division = firstNumber/secondNumber;            //0 - jeśli żadna składowa działania nie jest liczbą zmiennoprzecinkową, to wynik też nie będzie
        float divison2 = firstNumber/thirdNumber;           //0,66(6)
        int mod = secondNumber%firstNumber; //modulo - reszta z dzielenia       //2

        // Funkcja sout umożliwia podczas wyświetlania łączenie tekstu
        System.out.println("Wynik dodawania " + addition);
        System.out.println("Wynik odejmowania " + subtraction);
        System.out.println("Wynik mnożenia " + multiplication);
        System.out.println("Wynik dzielenia ze zmienną stałoprzecinkową" + division);
        System.out.println("Wynik dzielenia ze zmienną zmiennoprzecinkową " + divison2);
        System.out.println("Modulo " + mod);

        firstNumber+=secondNumber;      // firstNumber = firstNumber + secondNumber
        // -> nadpisujemy wartość zmiennej firstNumber poprzez dodanie dwóch liczb - firstNumber i secondNumber; nową wartością będzie 10
        // analogicznie będzie w poniższych przykładach; również tu nadpisujemy zmienną firstNumber
        // do tego musimy pamiętać, że każde nadpisanie zmienia nam wartość zmiennej, stąd inna będzie wartość wyjściowa do działania
        System.out.println("Po dodaniu: " + firstNumber);
        firstNumber-=secondNumber;      // firstNumber = firstNumber - secondNumber     ->4
        System.out.println("Po odejmowaniu: " + firstNumber);
        firstNumber*=secondNumber;      // firstNumber = firstNumber * secondNumber     ->24
        System.out.println("Po mnożeniu: " + firstNumber);
        firstNumber/=secondNumber;      // firstNumber = firstNumber / secondNumber     -> 4
        System.out.println("Po dzieleniu: " + firstNumber);
        firstNumber%=secondNumber;      // firstNumber = firstNumber % secondNumber     -> 4
        System.out.println("Po modulo: " + firstNumber);


    }
}
