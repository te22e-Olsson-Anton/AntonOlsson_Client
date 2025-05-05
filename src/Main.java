import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int port = 5050;

        Socket socket = new Socket(host, port);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Skriv ett matteuttryck (t.ex. 3+5 eller 4*2): ");
        String input = userInput.readLine();
        out.println(input);

        String response = in.readLine();
        System.out.println("Svar från servern: " + response);

        socket.close();
    }
}
