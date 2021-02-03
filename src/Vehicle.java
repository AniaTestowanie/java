public interface Vehicle {

    /*
    Interfejs jest to zestaw metod bez ich implementacji, czyli będziemy określali zwracany typ, nazwę metody, ale nie będziemy podawali ciała metody,
    czyli całego kodu, który jest w środku.
    Ciało metody będzie dostarczone przez klasy, które będą implementowały nasz interfejs.
    Aby stworzyć nowy interfejs, klikamy prawym przyciskiem myszy na danym folderze lub paczce, wybieramy opcję New -> Java Class -> Interface

    W przypadku interfejsów metody i deklaracje domyślnie są publiczne, dlatego nie trzeba używać modyfikatora dostępu public
     */

    void jazda (int speed);
    void stop ();
    String info ();

    /*
    Aby dostarczyć teraz ciało tym metodom, stworzymy klasę Bike i posłużymy się słowem kluczowym implements
     */

}
