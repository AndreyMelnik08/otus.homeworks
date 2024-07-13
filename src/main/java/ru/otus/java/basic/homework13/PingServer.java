package ru.otus.java.basic.homework13;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class PingServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            Socket client = serverSocket.accept();
            System.out.println("Client connected");
            processRequest(client);
        }
    }

    public static void processRequest(Socket client) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String userInput = in.readLine();
        String result = String.valueOf(Operations.operations(userInput));
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
        out.writeUTF(result);
        out.flush();
    }
}
