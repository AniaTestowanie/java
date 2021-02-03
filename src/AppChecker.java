public class AppChecker {

    /*
    Praca domowa:
    Stwórz klasę bazową App - zawiera pole name i metodę appInfo; Dodaj konstruktor do którego przekażesz wartość name
    Stwórz klasę potomną AndroidApp i IphoneApp - zawiera metodę runAndroidApp / runIphoneApp
     */

    public static void main(String[] args) {

        AndroidApp androidApp = new AndroidApp("PierwszaAplikacja");
        androidApp.runAndroidApp();
        androidApp.info();

        IphoneApp iphoneApp = new IphoneApp("DrugaAplikacja");
        iphoneApp.runIphoneApp();
        iphoneApp.info();

    }


}
