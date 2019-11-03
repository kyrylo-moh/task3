package util;

public class Output {

    void printInstruction() {
        System.out.println("You entered incorrect value, /n You must enter in this format [2.55, 2.999, 5.00, Name]");
    }

    public void printQuestion() {
        System.out.println("Do you want add new triangle? [y/n] ");
    }

    void printEnterSide() {
        System.out.println("Please enter side triangle: ");
    }

    void printBiggerZero() {
        System.out.println("Please enter value bigger than 0!");
    }

    void printEnterName() {
        System.out.println("Please enter name of triangle: ");
    }
}
