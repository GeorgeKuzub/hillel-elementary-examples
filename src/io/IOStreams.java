package io;

import java.io.*;
import java.util.Arrays;
import java.util.Properties;

public class IOStreams {
    public static void main(String[] args) {
        getFilesInCurrentFolder();
        makeNewDir();
        makeNewEmptyFile();
        makeNewFileInsideExistDir();

        propertiesExample();
        primitivesExample();
        bufferedRead();
        copy();
        tryWithResources();
        OldStyle();
    }

    private static void getFilesInCurrentFolder() {
        File currentDir = new File(".");
        String[] list;

        list = currentDir.list();
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String item : list) {
            System.out.println(item);
        }
    }

    private static void makeNewDir() {
        File newDir = new File("." + File.separator + "res");

        if (!newDir.exists()) {
            newDir.mkdir();
        }
    }

    private static void makeNewFileInsideExistDir() {
        File newFileInsideDir = new File("." + File.separator + "res", "empty2.txt");

        if (!newFileInsideDir.exists()) {
            try {
                newFileInsideDir.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void makeNewEmptyFile() {
        File newFile = new File("." + File.separator + "res" + File.separator + "empty.txt");

        if (!newFile.exists()) {
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void propertiesExample() {
        Properties properties = new Properties();
        try (FileInputStream inputStream = new FileInputStream("./res/settings.properties")) {
            properties.load(inputStream);
            String db = properties.getProperty("DB");
            String password = properties.getProperty("password");
            int timeout = Integer.parseInt(properties.getProperty("timeout"));

            System.out.println(db + " " + password + " " + timeout);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void primitivesExample() {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("./res/primitives.dat"))) {
            dataOutputStream.writeInt(15);
            dataOutputStream.writeInt(4);
            dataOutputStream.writeInt(2016);
            dataOutputStream.writeLong(Long.MAX_VALUE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("./res/primitives.dat"))) {
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readInt());

//            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readLong());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bufferedRead() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("./res/myFile.txt")))) {
            String value = null;

            while ((value = reader.readLine()) != null) {
                System.out.println(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy() {
        try (InputStream inputStream = new FileInputStream("./res/myFile.txt");
             OutputStream outputStream = new FileOutputStream("./res/myFile_copy.txt")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void tryWithResources() {
        try (InputStream inputStream = new FileInputStream("./res/myFile.txt")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.println(value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void OldStyle() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("./res/myFile.txt");
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
