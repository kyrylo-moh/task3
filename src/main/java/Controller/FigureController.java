package Controller;

import Model.FigureTriangle;
import Util.*;

import java.util.*;


public class FigureController {

    private FigureTriangle figureTriangle;

    private List<FigureTriangle> figureTriangleList = new ArrayList<FigureTriangle>();

    private void addFigureTriangle(FigureTriangle figureTriangle) {
        figureTriangleList.add(figureTriangle);
    }

    private void showListFigure() {
        //Collections.sort(figureTriangleList);
        for (FigureTriangle figureTriangle : figureTriangleList)
            System.out.println(figureTriangle);
    }

    private void reiteration(){
        System.out.print(new Output().printQuestion());
        String answer = new Input().getAnswer();
        if (answer.equals("y") || answer.equals("yes"))
            runController();
        else showListFigure();
    }

    public void   runController() {
        double[] arr = new double[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(new Output().printInfoSide(i + 1));
            while (arr[i] <= 0) {
                arr[i] = new Input().getDouble();
                while (!new Validator().numIsPositive(arr[i])) {
                    new Output().printInstruction();
                    arr[i] = new Input().getDouble();
                }
            }
        }
        System.out.print("Input name: ");
        String name = new Input().getName();
        addFigureTriangle(new FigureTriangle(arr[0], arr[1], arr[2], name));
        reiteration();

    }

}
