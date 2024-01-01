import java.util.ArrayList;

public class PrintManager {
    private ArrayList<Document> liste = new ArrayList<>();

    public void addDocument(Document doc){
        liste.add(doc);
    }


    public void printAll() {
        for(Document doc : liste){
            System.out.println(doc.printDocument());
        }
    }

    public Document findDocument(String fileName){
        for (Document doc : liste) {
            if(doc.fileName.equals(fileName)){ //dok1 != Dok1
                return doc;
            }
        }
        return new Document("");
    }
}

