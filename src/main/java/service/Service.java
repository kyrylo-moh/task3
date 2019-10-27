package service;

import model.FigureTriangle;
import java.util.*;

public class Service {

    public void showListFigure(List<FigureTriangle> figureTriangleList) {
        for (FigureTriangle figureTriangle : figureTriangleList)
            System.out.println(figureTriangle);
    }

}
