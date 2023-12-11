package color;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorTest {

    @Test
    public void colorizeWithColor() {
        String message = "Hello, World!";
        String colorizedMessage = Color.colorize(Color.COLOR_RED, message);

        // The expected result should be the message surrounded by the color codes
        assertEquals("\u001B[31m" + message + "\u001B[0m", colorizedMessage);
    }

    @Test
    public void colorizeWithEnumInstance() {
        String message = "Hello, World!";
        String colorizedMessage = Color.COLOR_GREEN.colorize(message);

        // The expected result should be the message surrounded by the color codes
        assertEquals("\u001B[32m" + message + "\u001B[0m", colorizedMessage);
    }

    @Test
    public void colorizeReset() {
        String message = "Hello, World!";
        String colorizedMessage = Color.COLOR_BLUE.colorize(message);

        // The expected result should be the message surrounded by the color codes and reset code
        assertEquals("\u001B[34m" + message + "\u001B[0m", colorizedMessage);
    }
}