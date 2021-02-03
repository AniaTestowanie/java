public class Bike implements Vehicle {

    /*
    Aby nasza klasa dostarczyła implementację, ciało metod, musimy skorzystać ze słowa kluczowego implements, a następnie podać nazwę interfejsu.
    Klasa podświetli nam się pokazując błąd. Musimy zatem najechać na podświetlony tekst i wybrać opcję 'implement methods'
    (możemy też użyć skrótu klawiaturowego alt + enter, gdzie w przypadku błędu pojawią nam się możliwe akcje do wykonania).

    Po ich zaimplementowaniu, pojawią się nam te metody, jednak ponad nimi będzie się znajdować specjalna adnotacja, że nadpisujemy metodę
    oraz specjalny symbol po lewej, również o tym informujący. Następnym krokiem będzie ich uzupełnienie poprzez wpisanie odpowiedniego kodu.

    Interfejs pozwala nam wymusić, aby klasa posiadała jakieś konkretne metody.
    Nie oznacza to jednak, że nie możemy dodawać nowych, własnych metod. Jest to jak najbardziej możliwe, jedynym naszym
    kontraktem (wymogiem) są metody z interfejsu
     */

    @Override
    public void jazda(int speed) {
        speed = 20;
        System.out.println("Jadę rowerem z prędkością " + speed);

    }

    @Override
    public void stop() {
        System.out.println("Hamuję rowerem! Naciskam mocno na pedały.");
    }

    @Override
    public String info() {
        return "rower";
    }


}
