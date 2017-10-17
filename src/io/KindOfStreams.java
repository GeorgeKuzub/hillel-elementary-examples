package io;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class KindOfStreams {
    public static void main(String[] args) throws IOException {
        String fileName = "res/myFile.txt";
        try (InputStream inFile = new FileInputStream("res/myFile.txt")) {
            readByteOutToChar(inFile);
        } catch (IOException e) {
            throw new IOException("Exception when open and read file " + fileName);
        }
        System.out.println("\n\n");

        String url = "http://google.com";
        try (InputStream inUrl = new URL(url).openStream()) {
            readByteOutToChar(inUrl);
        } catch (IOException e) {
            throw new IOException("Exception when open your URL " + url);
        }

        System.out.println("\n\n");

        byte[] data = new byte[]{65, 66, 67, 68, 69, 70};
        try (InputStream inByte = new ByteArrayInputStream(data);) {
            readByteOutToChar(inByte);
        } catch (IOException e) {
            throw new IOException("Exception happened during an attempt to load the array data: " + data);
        }
        System.out.println("\n\n");
    }

    public static void readByteOutToChar(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.println("\n" + "end");
                break;
            }
        }
    }
}
