package symCounter;

import java.io.*;
import java.net.URL;

public class FileDownloader {
    public void downloadFile() throws IOException {
        BufferedReader fileReader = new BufferedReader(
                new InputStreamReader(System.in));
        String linkAdress = fileReader.readLine();
        URL url = new URL(linkAdress);
        InputStream in = new BufferedInputStream(url.openStream());
        String fileName = "loaded.txt";
        FileOutputStream out = new FileOutputStream(fileName);
        System.out.println("Download start!");
        byte buffer[] = new byte[1024];
        int count = -1;
        while ((count = in.read(buffer)) != -1) {
            out.write(buffer, 0, count);
        }
        System.out.println("Download finish!");

        in.close();
        out.close();
    }
}
