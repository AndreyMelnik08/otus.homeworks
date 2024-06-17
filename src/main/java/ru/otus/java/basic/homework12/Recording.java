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
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(array[arrayId - 1]))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл в директории не был найден, будет создан файл: " + array[arrayId - 1]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void recordingInFile(String data, int arrayId) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(array[arrayId - 1],
                true))) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
