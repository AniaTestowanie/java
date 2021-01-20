public class Auto {
    /*
    Czym jest klasa i co w sobie zawiera
    Klasa jest pewnego rodzaju szablonem, na podstawie którego można tworzyć obiekty
    Obiekt jest przedstawicielem danej klasy

    public w górnym wierszu - jest identyfikatorem dostępu; więcej w tym temacie będzie w klasie dot. dziedziczenia
    class - oznaczenie że chodzi o klasę
    Auto - nazwa klasy (taka sama jak nazwa pliku w src)

    Klasa może zawierać w sobie pola
    W naszym przypadku będą to cztery pola: marka i model (które będą przechowywały ciąg znaków)\
    oraz rokProdukcji i przebieg (które będą przechowywać wartość liczbową)

    Klasa zawiera w sobie także metody (jedną lub wiele), czyli sposób zachowania naszego obiektu

    Ani pola ani metody nie są obowiązkowe
     */

    public String marka;
    public String model;
    public int rokProdukcji;
    public int przebieg;

    public void jedz() {
        System.out.println("Jadę!");
    }

    public void hamuj() {
        System.out.println("Hamuję");
    }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg);
    }




}
