package io;

import java.io.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class IOStreams {
    public static void main(String[] args) throws IOException {
        Car myCar = new Car("BMW", 2017, "Yuriy");
        myCar.setTenant(new Tenant("Olga"));

        save(myCar);

        Car deserializedCar = load();

        System.out.println(deserializedCar);
        System.out.println(deserializedCar == myCar);


        writeToZipFile();
        readFromZipFile();

//        getFilesInCurrentFolder();
//        makeNewDir();
//        makeNewEmptyFile();
//        makeNewFileInsideExistDir();
//
//        propertiesExample();
//        primitivesExample();
//        bufferedRead();
//        copy();
//        tryWithResources();
//        OldStyle();
    }


    private static void writeToZipFile() {
        byte age = 16;
        String name = "Lexus";
        int[] repairYears = {2001, 2004, 2008, 2012, 2017};

        try (DataOutputStream dataOutput = new DataOutputStream(new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream(new File("res/data.zip")))))) {
            dataOutput.writeByte(age);
            dataOutput.writeUTF(name);
            for (int yearElement : repairYears) {
                dataOutput.writeInt(yearElement);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromZipFile() {
        byte age;
        String name;
        int[] repairYears;

        try (DataInputStream dataInput = new DataInputStream(new GZIPInputStream(new BufferedInputStream(new FileInputStream(new File("res/data.zip")))))) {
            age = dataInput.readByte();
            repairYears = new int[age];
            name = dataInput.readUTF();

            repairYears[0] = dataInput.readInt();
            repairYears[1] = dataInput.readInt();
            repairYears[2] = dataInput.readInt();
            repairYears[3] = dataInput.readInt();
            repairYears[4] = dataInput.readInt();

        } catch (IOException e) {
            e.printStackTrace();
        }
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

    public static void save(Car car) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("res/car.dat"))) {
            outputStream.writeObject(car);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Car load() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("res/car.dat"))) {
            return (Car) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}