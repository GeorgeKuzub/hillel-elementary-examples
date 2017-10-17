package io;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class KindOfStreams {
    public static void main(String[] args) throws IOException {
        try (InputStream inFile = new FileInputStream("res/myFile.txt")) {
            readByteOutToChar(inFile);
        }
        System.out.println("\n\n");

        try (InputStream inUrl = new URL("http://google.com").openStream()) {
            readByteOutToChar(inUrl);
        }
        System.out.println("\n\n");

        try (InputStream inByte = new ByteArrayInputStream(new byte[]{65, 66, 67, 68, 69, 70});) {
            readByteOutToChar(inByte);
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
