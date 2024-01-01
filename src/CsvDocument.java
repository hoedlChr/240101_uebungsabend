import java.util.ArrayList;

public class CsvDocument extends Document{
    private ArrayList<String> lines = new ArrayList<>();

    public CsvDocument(String fileName, ArrayList<String> lines) {
        super(fileName);
        this.lines = lines;
    }

    public void addline(String line){
        lines.add(line);
    }
    @Override
    public String printDocument() {
        return "CsvDocument{" +
                "lines=" + lines +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
