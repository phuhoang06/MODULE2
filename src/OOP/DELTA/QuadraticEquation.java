package OOP.DELTA;

public class QuadraticEquation {
    private double a, b, c;

public QuadraticEquation(){

}
public QuadraticEquation(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
}
public void getDiscriminant() {
    double delta = Math.pow(this.b,2) - 4*this.a*this.c;
    if (delta > 0) {
    double a = getR1();
    double b = getR2();
        System.out.println("x1 = " + a);
        System.out.println("x2 = " + b);
    }
    else if (delta == 0) {
        double a = getR1();
        System.out.println("x = " + a);
    }
    else {
        System.out.println("The equation has no roots");
    }

}
    public double getR1 () {
        double r1 = (-this.b+Math.sqrt((this.b*this.b)-(4*this.a*this.c)))/(2*this.a);
        return r1;
}
    public double getR2 () {
        double r2 =  (-this.b-Math.sqrt((this.b*this.b)-(4*this.a*this.c)))/(2*this.a);
        return r2;
}
}