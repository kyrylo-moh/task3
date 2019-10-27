package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public double getDouble() {
        try {
            return scanner.nextDouble();
        }
        catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public String getName() {
        return scanner.next();
    }

    public String getAnswer() {
        return scanner.next();
    }

}
