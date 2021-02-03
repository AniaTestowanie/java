package com.testeroprogramowania.app;

import com.testeroprogramowania.app.database.DatabaseConnection;
import com.testeroprogramowania.app.database.DatabaseUtils;

public class App {

    public static void main(String[] args) {

        DatabaseConnection databaseConnection = new DatabaseConnection();


        DatabaseUtils databaseUtils = new DatabaseUtils();
        com.testeroprogramowania.app.info.DatabaseUtils databaseUtils1 = new com.testeroprogramowania.app.info.DatabaseUtils();

        /*
        Powyżej przykład zaimportowania klas o tej samej nazwie z dwóch różnych paczek
        Przy wyborze drugiej klasy o tej samej nazwie Intellij zmodyfikuje nam zapis, aby wyraźnie rozdzielić te klasy
         */

    }
}
