package document;

public class DocumentChecker {

/*
Dokument Excel możemy zadeklarować na dwa sposoby, jak pokazano poniżej.
Dokument Excela jest jedną z postaci naszego dokumentu
Dokument jest wielopostaciowy - może być dokumentem excela, ale może być też dokumentem pdf
Dlatego też mówimy o polimorfiźmie

Taką samą zależność (polimorfizm) możemy osiągnąć korzystając z interfejsu, więc albo korzystamy z dziedziczenia klas
(i wtedy możemy zapisać, że nasz konkretny typ, klasa potomna jest typu klasy bazowej) albo  korzystamy z interfejsu
 */


    public static void main(String[] args) {
        ExcelDocument document = new ExcelDocument();
        Document excelDocument = new ExcelDocument();
        Document pdfDocument = new PdfDocument();

        document.getDescription();
        excelDocument.getDescription();
        pdfDocument.getDescription();


    }
}
