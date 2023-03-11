public class Main {
    public static void main(String[] args) {
        Complex c1=new Complex(4,19);
        Complex c2=new Complex(3,5);
        Complex sum;
        sum = Complex.add(c1, c2);
        Complex.print(sum);
        Complex diff;
        diff = Complex.subtract(c1, c2);
        Complex.print(diff);

        Rectangle rec1 = new Rectangle(3, 4);
        Circle cer1 = new Circle(5);
        Triangle tri1 = new Triangle(3, 4, 5);
        System.out.println(sumArea(rec1, cer1, tri1));
    }
    public static double sumArea(GeoShape s1, GeoShape s2, GeoShape s3){
        return s1.area()+s2.area()+s3.area();
    }

}