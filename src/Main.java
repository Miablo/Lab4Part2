/*
 *
 * @ author Cody Walker, Mio Diaz
 * @ version 1.0
 * (3 pts) Given a JUnitIT.zip file as the program for test,
 * implement the function foo in Q1 and utilize JUnit to perform “Robustness testing”.
 * Assert the correctness between the expected output and the actual output.
 */
public class Main {
    public String triangleType(int a, int b, int c){
        if(a == 0 || b == 0 || c == 0){ // first see if it even is a triangle
            return "Not a triangle";
        }else{
            if(a == b && a == c){  // checks if it is an equilateral
                return "equilateral";
            }else if(a == b || a == c || b == c){  // check if it is isosceles
                return "isosceles";
            }else{
                return "scalene"; //if neither will return scalene
            }
        }
    }
}
