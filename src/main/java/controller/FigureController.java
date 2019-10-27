package controller;

import model.FigureTriangle;
import service.Service;
import util.*;

import javax.xml.bind.SchemaOutputResolver;
import java.util.*;


public class FigureController {

    private FigureTriangle figureTriangle;
    private Service service = new Service();
    private List<FigureTriangle> figureTriangleList = new ArrayList<FigureTriangle>();

    private void addFigureTriangle(FigureTriangle figureTriangle) {
        figureTriangleList.add(figureTriangle);
    }

//    private void showListFigure() {
//        for (FigureTriangle figureTriangle : figureTriangleList)
//            System.out.println(figureTriangle);
//    }

    private void reiteration(){
        System.out.print(new Output().printQuestion());
        String answer = new Input().getAnswer();
        if (answer.equals("y") || answer.equals("yes"))
            runController();
        else service.showListFigure(figureTriangleList);
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
