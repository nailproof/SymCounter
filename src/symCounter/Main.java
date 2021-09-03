package symCounter;

public class Main {
    public static void main(String[] args) {
        FileDownloader loadFile = new FileDownloader();
        try {
            loadFile.downloadFile();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        NumOfCharacters symCounter = new NumOfCharacters();
        symCounter.readFile();
    }
}