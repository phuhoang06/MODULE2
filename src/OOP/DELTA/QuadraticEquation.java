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
public double getDiscriminant() {
    double delta = this.b*2 - 4*this.a*this.c;
    if (delta > 0) {
    getR1();
    getR2();
    }
    else if (delta == 0) {
        getR1();
    }
    else {
        System.out.println("The equation has no roots");
    }
return delta;
}
    public double getR1 () {
double r1 = (-this.b+Math.pow((this.b*this.b)-(4*this.a*this.c),0.5))/(2*this.a);
        System.out.println("r1 = " + r1);
    return r1;}
    public double getR2 () {
    double r2 =  (-this.b-Math.pow((this.b*this.b)-(4*this.a*this.c),0.5))/(2*this.a);
    System.out.println("r2 = " + r2);
    return r2;}
}