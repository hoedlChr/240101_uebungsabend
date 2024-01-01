public class Document {
    protected String fileName;

    public Document(String fileName) {
        this.fileName = fileName;
    }

    public String printDocument() {
        return "Document{" +
                "fileName='" + fileName + '\'' +
                '}';
    }
}
