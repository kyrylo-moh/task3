package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);
    private Output output = new Output();
    private Validator validator = new Validator();

    public double getDouble() {
        double num;
        output.printEnterSide();
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
            if (!validator.numIsPositive(num)) {
                output.printBiggerZero();
                scanner.next();
                num = getDouble();
            }
        } else {
            output.printInstruction();
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    public String getName() {
        output.printEnterName();
        return scanner.next();
    }

    public String getAnswer() {
        return scanner.next();
    }

}
