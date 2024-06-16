package ru.otus.java.basic.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Recording {

    String[] array = {"fileone.txt", "filetwo.txt", "filethree.txt"};
    File files = new File(Arrays.toString(array));

    public void info() {
        System.out.println("Список файлов: " + files.getName());
    }

    public void read(int arrayId) {
        try (InputStreamReader in = new InputStreamReader(new FileInputStream(array[arrayId - 1]))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void recordingInFile(String data, int arrayId) {
        try (FileOutputStream out = new FileOutputStream(array[arrayId - 1], true)) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            out.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
