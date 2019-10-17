package Util;

public class Output {

    public void printInstruction() {
        System.out.println("You entered incorrect value, /n You must enter in this format [2.55, 2.999, 5.00, Name]");
    }

    public String printInfoSide(int count) {
        return "You must input the side " + count + " : ";
    }

    public String printQuestion() {
        return "Do you want add new triangle? [yes/y] ";
    }

}
