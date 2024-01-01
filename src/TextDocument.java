public class TextDocument extends Document {
    private String content;

    public TextDocument(String fileName, String content) {
        super(fileName);
        this.content = content;
    }

    public String printDocument() {
        return "TextDocument{" +
                "content='" + content + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
