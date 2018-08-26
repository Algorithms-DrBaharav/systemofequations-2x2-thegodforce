
/**
 * Solves a linear system of equations
 * 
 * @author YourNameHere
 */
public class SystemOfEquations2x2 {

    
    /**
     * Holds all coefficients and results
     */
    private double[][] bigA;
    
    /**
     * Constructor for a 2x2 system of equations
     * 
     * The coefficients and results of the equation
     * @param a (0,0) - coefficient
     * @param b (0,1)
     * @param c (1,0)
     * @param d (1,1)
     * @param e (0,2)  - result
     * @param f (1,2)  - result
     */
    public SystemOfEquations2x2(double a, double b, double c, double d, double e, double f){

        bigA = new double[2][3];
        bigA[0][0] = a;
        bigA[0][1] = b;
        bigA[0][2] = e;
        bigA[1][0] = c;
        bigA[1][1] = d;
        bigA[1][2] = f;
        
    }
    
    /**
     * @return the two variables solution. If none, return null.
     */
    public double[] Solve2x2(){
        
        // Your code here
        
        return null;
    }
    
}
