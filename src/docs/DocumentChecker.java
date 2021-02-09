package docs;

public class DocumentChecker {

    public static void main(String[] args) {
        Document doc = new PdfDocument();
       // Document doc = new ExcelDocument();
        doc.getDescription();

        // W zależności który nowoutworzony obiekt zostanie odkomentowany, wykona się metoda odpowiednia dla danego dokumentu


    }
}
