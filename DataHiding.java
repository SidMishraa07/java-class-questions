class Rectangle{

    private double length;
    private double breath;

    public double getLength(){
        return length;
    }
    public void setLength(double l){
        length=l;
    }
    public double getBreath(){
        return breath;
    }
    public void setBreath(double b){
        breath=b;
    }

    public double area(){
        return length*breath;
    }
    public double perimeter(){
        return 2*(length+breath);
    }
}

public class DataHiding {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setLength(5);
        r.setBreath(20);
        System.out.println("The length of the rectangle is:"+r.getLength());
        System.out.println("The breath of the rectangle is:"+r.getBreath());
        System.out.println("The area of the rectangle is:"+r.area());
        System.out.println("The length of the rectangle is:"+r.perimeter());

    }
}
