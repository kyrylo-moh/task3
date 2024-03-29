package Model;

public class FigureTriangle implements IFigureTriangle, Comparable<FigureTriangle> {

    private double sideA;
    private double sideB;
    private double sideC;
    private String triangleName;

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
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public String toString() {
        return "[Triangle " + triangleName + "]: " + this.getArea() + " cm";
    }

    public int compareTo(FigureTriangle o) {
        int count = (int) o.getArea();
        return (int)(count - getArea());
    }
}
