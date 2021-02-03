package com.testeroprogramowania.app.info;

public class PackageInfo {

    /*
    Kiedy wraz ze wzrostem funkcjonalności projektowanego systemu / aplikacji rośnie też liczba klas,
    konieczne jest rozdzielenie tych klas na logiczne grupy reprezentujące jeden konkretny obszar aplikacji.
    Dodatkowo podział na takie grupy pozwoli nam na korzystanie z wielu różnych klas o tych samych nazwach.
    W javie takie grupy nazwywamy paczkami (package).

    Aby stworzyć taką paczkę i umieścić w niej klasy, najeżdżamy kursorem na folder src, klikamy prawym przyciskiem myszy,
    wybieramy opcję new a następnie package. Na wstępie podajemy nazwę naszej paczki i klikamy enter.

    Konwencja nazewnictwa paczek: na początku podaje się nazwę domeny, która jest odwrócona (com.nazwadomeny),
    następnie podaje się kolejne partie, tworzące logiczny porządek.

    Nazwa paczki przedzielona jest kropkami. Każdy z tych segmentów pomiędzy kropkami, stworzy osobny folder.

    Aby stworzyć klasę wewnątrz paczki postępujemy analogicznie jak w przypadku tworzenia klasy w obrębie src,
    tj. najeżdżamy kursorem na wybraną paczkę, klikamy prawym przyciskiem myszy, wybieramy opcję new a następnie Java Class.
    Jeśli stworzymy klasę wewnątrz jakiejś paczki, to na samej górze tej klasy znajdzie się deklaracja,
    informacja w jakiej paczce znajduje się nasza klasa: package nazwapaczki;

    Przykładowa paczka z przykładowymi klasami to: com.testeroprogramowania.app.database
    Po dodaniu nowej paczki,np. com.testeroprogramowania.app.view, paczki zgrupują się w obrębie com.testeroprogramowania.app/

    Do paczki można przenieść także już istniejące klasy. Aby to zrobić możemy postąpić dwojako. Albo na wybranej klasie
    prawym przyciskiem myszy otworzyć opcje, wybrać Refactor -> Move Class albo przeciągnąć wybraną klasę do konkretnej paczki
    (drag and drop). W obydwu sposobach akceptujemy zmianę przyciskiem Refactor.

    Jeżeli klasy znajdują się w różnych paczkach, mogą one nosić te same nazwy.

    Sposób wykorzystania / odwołania się do klas z paczki zaprezentowany będzie w klasie App (z paczki com.testeroprogramowania.app)
     */


}
