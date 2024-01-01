import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Document dok1 = new Document("dok1");
        System.out.println("dok1.printDocument() = " + dok1.printDocument());
        
        TextDocument dok2 = new TextDocument("dok2", "inhalt1");
        System.out.println("dok2.printDocument() = " + dok2.printDocument());
        
        ImageDocument dok3 = new ImageDocument("dok3", 0,1, "balck");
        System.out.println("dok3.printDocument() = " + dok3.printDocument());
        
        
        ArrayList<String> myList = new ArrayList<>();
        myList.add("eins");
        myList.add("zwei");
        CsvDocument dok4 = new CsvDocument("dok4", myList);
        dok4.addline("drei");
        System.out.println("dok4.printDocument() = " + dok4.printDocument());

        System.out.println("_____");
        
        PrintManager mng1 = new PrintManager();
        mng1.addDocument(dok1);
        mng1.addDocument(dok2);
        mng1.addDocument(dok3);
        mng1.addDocument(dok4);

        mng1.printAll();

        System.out.println("mng1.findDocument(\"dok1\").printDocument() = " + mng1.findDocument("dok1").printDocument());
        System.out.println("mng1.findDocument(\"dok11\").printDocument() = " + mng1.findDocument("dok11").printDocument());
        System.out.println("mng1.findDocument(\"dok4\").printDocument() = " + mng1.findDocument("dok4").printDocument());


    }
}
