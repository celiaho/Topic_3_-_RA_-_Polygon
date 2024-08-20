/* *****************************************
 *  Author : Celia Ho   
 *  Created On : Wed Feb 28 2024
 *  File : Test.java for Polygon.java file
 *  Description : Create a class Polygon with numSides and sideLength as private variables.  numSides must be greater than 2, sideLength must be greater than zero.  Create a UML for Polygon.  Create the Java Polygon Class file and the Test file.  You should have setters and getters, a toString method, as well as area, and perimeter calculation methods. (You have had an assignment with this formula.) 
 *  Due: Friday, March 1, 2024, 11:59 PM 
 * ******************************************/

 public class Test {

    public static void main(String[] args) {
        Polygon polygon = new Polygon(4, 4);

        System.out.printf("%.2f\n", polygon.area());
        System.out.printf("%.2f\n", polygon.perimeter());
    }
    
}
