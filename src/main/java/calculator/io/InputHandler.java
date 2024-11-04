package calculator.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandler {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private InputHandler() {
    }

    public static String[] getInputs() throws IOException {
        String input = br.readLine();
        return input.split(" ");
    }
}