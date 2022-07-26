import java.util.Scanner;

public class TriangleAreaCalc {
    public static void main(String[] args){
        int edgeA, edgeB, edgeC, halfPerimeter;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first edge:\t");
        edgeA = input.nextInt();
        System.out.println("Enter second edge:\t");
        edgeB = input.nextInt();
        System.out.println("Enter third edge:\t");
        edgeC = input.nextInt();

        halfPerimeter = (edgeA + edgeB + edgeC) / 2;
        area = Math.sqrt(halfPerimeter * (halfPerimeter - edgeA) * (halfPerimeter - edgeB) * (halfPerimeter - edgeC));

        System.out.println("--------------------------------");
        System.out.println("Area of the triangle: " + area);
        System.out.println("--------------------------------");       

    }
}