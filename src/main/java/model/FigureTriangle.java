package model;

public class FigureTriangle implements Comparable<FigureTriangle> {

    private double sideA;
    private double sideB;
    private double sideC;
    private String triangleName;
    private double area;

    public FigureTriangle(double sideA, double sideB, double sideC, String triangleName) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.triangleName = triangleName;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public String getTriangleName() {
        return triangleName;
    }

    public void setTriangleName(String triangleName) {
        this.triangleName = triangleName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "\t[Triangle " + triangleName + "]: " + String.format("%.4g%n", this.getArea()) + " cm";
    }

    public int compareTo(FigureTriangle object) {
        int count = (int) object.getArea();
        return (int)(count - getArea());
    }
}
