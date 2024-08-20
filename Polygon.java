/* *****************************************
 *  Author : Celia Ho   
 *  Created On : Wed Feb 28 2024
 *  File : Polygon.java
 *  Description : 
 *    Create a class Polygon with numSides and sideLength as private variables.  numSides must be greater than 2, sideLength must be greater than zero.  
 *    Create a UML for Polygon.  
 *    Create the Java Polygon Class file and the Test file.  You should have setters and getters, a toString method, as well as area, and perimeter calculation methods. 
 * (You have had an assignment with this formula.) 
 *  Due: Friday, March 1, 2024, 11:59 PM 
 * ******************************************/



 // import java.util.Scanner; 	// Import java.util package for Scanner
 import java.lang.Math; 		// Import for java.lang.Math.tan() method
 
 // Create a class Polygon with numSides and sideLength as private variables.  
 public class Polygon {
  private int 
    numSides,
    sideLength;
  private static final double PI = 3.14159;

  // Constructor
  public Polygon(int numSides, int sideLength) {

    this.numSides = numSides;
    this.sideLength = sideLength;

    if(sideLength <= 0)
      this.sideLength = 1;    // Set default

    if(numSides <= 2)
      this.numSides = 3;      // Set default
  }

  // Getters and setters follow:
  public int getNumSides() {
    return numSides;
  }

  public void setNumSides(int numSides) {
    this.numSides = numSides;
  }

  public int getSideLength() {
    return sideLength;
  }

  public void setSideLength(int sideLength) {
    this.sideLength = sideLength;
  }

  public static double getPi() {
    return PI;
  }

  // Area calculation method
  public double area() {
    return (numSides * (sideLength * sideLength)) / (4 * (Math.tan(PI/numSides)));
  }

  // Perimeter calculation method
  public double perimeter() {
    return numSides * sideLength;
  }

  // toString method
  @Override
  public String toString() {
    return "Polygon [numSides=" + numSides + ", sideLength=" + sideLength + ", area=" + area() + ", perimeter=" + perimeter() + "]";
  }
}