import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        double delta;
        return  delta = b*b - 4*a*c;
    }
    public double getRoot1(){
        double r1;
        return r1 = (-b + Math.pow((b*b - 4*a*c),0.5))/(2*a);
    }
    public double getRoot2(){
        double r2;
        return r2 = (-b - Math.pow((b*b - 4*a*c),0.5))/(2*a);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a:");
        double a = scanner.nextDouble();
        System.out.println("enter b:");
        double b = scanner.nextDouble();
        System.out.println("enter c:");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
        double delta = equation.getDiscriminant();
        System.out.println("delta:"+delta);
        if (delta > 0){
            System.out.println("nghiem1"+equation.getRoot1()+" "+"nghiem2"+equation.getRoot2());
        }else if (delta == 0){
            System.out.println("co 1 nghiem"+equation.getRoot1());
        }else {
            System.out.println("ko co nghiem");
        }
    }
}
