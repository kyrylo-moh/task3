package service;

import model.FigureTriangle;
import java.util.*;

public class Service {

    public void getAreaTriangle(FigureTriangle figureTriangle) {
        double p = (figureTriangle.getSideA() + figureTriangle.getSideB() + figureTriangle.getSideC()) / 2;
        figureTriangle.setArea(Math.sqrt(p * (p - figureTriangle.getSideA()) * (p - figureTriangle.getSideB()) * (p - figureTriangle.getSideC())));
    }

    public void showListFigure(List<FigureTriangle> figureTriangleList) {
        Collections.sort(figureTriangleList, Collections.<FigureTriangle>reverseOrder());
        for (FigureTriangle figureTriangle : figureTriangleList)
            System.out.println(figureTriangle);
    }

}
