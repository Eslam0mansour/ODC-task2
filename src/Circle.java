
public class Circle extends GeoShape {
    //2- contractor
    public Circle(double dim1) {
        super(dim1);
    }
    //3- Methods
    //double area()
    @Override
    public double area() {
        return Math.PI * Math.pow(getDim1(), 2);
    }
}