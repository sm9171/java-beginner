package book.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandler {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private InputHandler() {
    }

    public static int selectMenu() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    public static String getInput() throws IOException {
        return br.readLine();
    }
}
