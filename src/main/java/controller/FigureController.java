package controller;

import model.FigureTriangle;
import service.Service;
import util.Input;
import util.Output;
import util.Validator;

import java.util.*;


public class FigureController {

    private Service service = new Service();
    private Output output = new Output();
    private Input input = new Input();
    private Validator validator = new Validator();
    private List<FigureTriangle> figureTriangleList = new ArrayList<FigureTriangle>();

    private void addFigureTriangle(FigureTriangle figureTriangle) {
        service.getAreaTriangle(figureTriangle);
        figureTriangleList.add(figureTriangle);
    }

    private double enterSide() {
        return input.getDouble();
    }

    private String enterName() {
        return input.getName();
    }

    private void createTriangle() {
        addFigureTriangle(new FigureTriangle(enterSide(), enterSide(), enterSide(), enterName()));
    }

    public void runController() {
        String answer;
        do {
            createTriangle();
            service.showListFigure(figureTriangleList);
            output.printQuestion();
            answer = input.getAnswer();
        } while (answer.equalsIgnoreCase("y") ||
                answer.equalsIgnoreCase("yes"));
    }

}
