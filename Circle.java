class CircleA{
    public int radius;

    public double area(){
        double a;
        a=Math.PI * radius * radius;
        return a;
    }
    public double perimeter(){
        double p;
        p=Math.PI * 2 * radius;
        return p;
    }
}

public class Circle {
    public static void main(String[] args) {
        CircleA cirA= new CircleA();
        cirA.radius=7;
        System.out.println("The area of the circle will be:"+cirA.area());
        System.out.println("The circumference of the circle will be:"+cirA.perimeter());
    }
}
