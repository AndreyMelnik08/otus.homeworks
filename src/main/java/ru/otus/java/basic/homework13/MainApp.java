package ru.otus.java.basic.homework13;

import java.net.Socket;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        System.out.println("Введите математическое выражение через пробел (например, 2 + 3):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try (Socket socket = new Socket("localhost", 8888)) {
            PingClient pingClient = new PingClient(socket);
            pingClient.send(input + "\n");
            String result = pingClient.read();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
