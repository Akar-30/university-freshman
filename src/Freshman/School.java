package Freshman;

import java.util.Scanner;
public class School {

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to the shape calculator\n");
        loop:while(true) {
            System.out.println("What type of shapes do you want to find its calculation\n");
            System.out.println("Press 1\t\tPress 2\t\tPress -1\n2D Shapes\t3D Shapes\tto Quit\t");
            int category1 = scan.nextInt();
            if (category1==-1){
                break;
            }
            switch (category1){
                case 1:
                    while (true) {
                        System.out.println("What type of shapes do you want to find its Perimeter or Area\n");
                        System.out.println("Press 1\t\tPress 2\t\tPress 3\t\tPress 4\t\tPress -1\nRectangle\tSquare\t\tTriangle\tCircle\t\tto Return");
                        int category2 = scan.nextInt();
                        if (category2==-1){
                            continue loop;
                        }

                        if (category2 == 1) {
                            System.out.print("Enter the length: ");
                            double length = scan.nextDouble();
                            System.out.print("Enter the width: ");
                            double width = scan.nextDouble();
                            if (length <= 0) {
                                System.out.println("ERROR; your length value is not valid");
                            }
                            if (width <= 0) {
                                System.out.println("ERROR; your width value is not valid");
                            }
                            if (length > 0 && width > 0) {
                                System.out.println("\nThe Area of the Rectangle: " + length * width);
                                System.out.println("The Perimeter of the Rectangle: " + 2 * (length + width)+"\n");
                            }
                        } else if (category2 == 2) {
                            System.out.print("Enter the length of a side: ");
                            double length = scan.nextDouble();
                            if (length <= 0) {
                                System.out.println("ERROR; your length value is not valid");
                            }
                            if (length > 0) {
                                System.out.println("\nThe Area of the Square: " + length * length);
                                System.out.println("The Perimeter of the Square: " + 4 * (length)+"\n");
                            }
                        } else if (category2 == 3) {
                            System.out.print("Enter the length of the Base: ");
                            double length = scan.nextDouble();
                            System.out.print("Enter the length of the Altitude: ");
                            double width = scan.nextDouble();
                            System.out.print("Enter the length of the other side: ");
                            double bSide = scan.nextDouble();
                            if (length <= 0) {
                                System.out.println("ERROR; your Base value is not valid");
                            }
                            if (width <= 0) {
                                System.out.println("ERROR; your Altitude value is not valid");
                            }
                            if (bSide <= 0) {
                                System.out.println("ERROR; your value of the other side is not valid");
                            }
                            if (length > 0 && width > 0 && bSide > 0) {
                                System.out.println("\nThe Area of the Triangle: " + (0.5 * length * width));
                                System.out.println("The Perimeter of the Triangle: " + (length + bSide + bSide)+"\n");
                            }
                        } else if (category2 == 4) {
                            System.out.print("Enter the Radius: ");
                            double length = scan.nextDouble();
                            if (length <= 0) {
                                System.out.println("ERROR; your Radius value is not valid");
                            }
                            if (length > 0) {
                                System.out.println("\nThe Area of the Circle: " + length * length * 3.14);
                                System.out.println("The Perimeter of the Circle: " + 2 * (length * 3.14)+"\n");
                            }
                        }else{
                            System.out.println("ERROR; the input is not recognised\n");
                        }
                    }
                case 2:
                    while (true) {
                        System.out.println("What type of shapes do you want to find its Perimeter or Area\n");
                        System.out.println("Press 1\t\t\t\t\t\tPress 2\t\tPress 3\t\t\t\tPress 4\t\tPress -1\nRight Spherical Cylinder\tCube\t\tRectangular Solid\tSphere\t\tto Return");
                        int category2 = scan.nextInt();
                        if (category2==-1){
                            continue loop;
                        }
                        switch (category2) {
                            case 1:
                                System.out.print("Enter the Radius: ");
                                double length1 = scan.nextDouble();
                                System.out.print("Enter the Height: ");
                                double width = scan.nextDouble();
                                if (length1 <= 0) {
                                    System.out.println("ERROR; your Radius value is not valid");
                                }
                                if (width <= 0) {
                                    System.out.println("ERROR; your Height value is not valid");
                                }
                                if (length1 > 0 && width > 0) {
                                    System.out.println("\nThe Surface Area of the Right Spherical Cylinder: " +(2*3.14*length1*(length1+width)));
                                    System.out.println("The Volume of the Right Spherical Cylinder: " + 3.14 * (length1*length1* width)+"\n");
                            }
                                break;
                            case 2:
                                System.out.print("Enter the length of a side: ");
                                double length2 = scan.nextDouble();
                                if (length2 <= 0) {
                                    System.out.println("ERROR; your length value is not valid");
                                }
                                if (length2 > 0) {
                                    System.out.println("\nThe Surface Area of the Cube: " + 6*length2 * length2);
                                    System.out.println("The Volume of the Cube: " +  (length2*length2*length2)+"\n");
                                }
                                break;
                            case 3:
                                System.out.print("Enter the length: ");
                                double length3 = scan.nextDouble();
                                System.out.print("Enter the width: ");
                                double width3 = scan.nextDouble();
                                System.out.print("Enter the height: ");
                                double bSide = scan.nextDouble();
                                if (length3 <= 0) {
                                    System.out.println("ERROR; your Length value is not valid");
                                }
                                if (width3 <= 0) {
                                    System.out.println("ERROR; your Width value is not valid");
                                }
                                if (bSide <= 0) {
                                    System.out.println("ERROR; your Height value is not valid");
                                }
                                if (length3 > 0 && width3 > 0 && bSide > 0) {
                                    System.out.println("\nThe Surface Area of the Rectangular Solid: " + 2*(length3*width3+width3*bSide));
                                    System.out.println("The Volume of the Rectangular Solid: " + (length3 * width3 * bSide)+"\n");
                                }
                                break;
                            case 4:
                                System.out.print("Enter the Radius: ");
                                double length4 = scan.nextDouble();
                                if (length4 <= 0) {
                                    System.out.println("ERROR; your Radius value is not valid");
                                }
                                if (length4 > 0) {
                                    System.out.println("\nThe Surface Area of the Sphere: " + 4*length4 * length4 * 3.14);
                                    System.out.println("The Volume of the Sphere: " + 4 * (length4 *length4*length4* 3.14/3)+"\n");
                                }
                                break;
                            default:
                                System.out.println("ERROR; the input is not recognised\n");
                        }

                        }
                default:
                    System.out.println("ERROR; the input not recognised\n");
            }
            }
        }

}
