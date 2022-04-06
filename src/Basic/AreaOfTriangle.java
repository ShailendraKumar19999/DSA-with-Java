package Basic;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base and Height : ");
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        float areaOfTriangle = 0.5f * base * height;
        System.out.println("Area Of Triangle is : " + areaOfTriangle);
    }
}

// Area of Triangle            = (1/2 * b * h)
// Area of Isosceles Triangle  = (1/2 * b * h)
// Area Of Parallelogram       = (b * h)
// Area Of Rhombus             = (1/2 * D1 * D2) d1 and d2 is diagonal
// Area of Equilateral Triangle = ( √3/4 * a * a)
// Perimeter Of Circle          = (2 * PI * r)
// Perimeter Of Equilateral Triangle = (3 * a)
// Perimeter Of Parallelogram    = (2(a + b))
// Perimeter Of Rhombus        =   (4 * a)

// The volume of a cone = (1/3) πr2h
// Volume Of Prism   = (b * h)
// volume of a cylinder = (πr2h)
// Volume of a sphere = (4/3 πr3)
// Volume Of Pyramid  (1/3 b*b*h)
// Curved Surface Area Of Cylinder = (2 * PI * r * h)
// Total Surface Area Of Cube = (6 * a * a)
