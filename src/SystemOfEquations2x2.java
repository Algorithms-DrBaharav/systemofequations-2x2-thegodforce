
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
        
        double x1=bigA[0][0];
        double x2=bigA[1][0];
        double y1=bigA[0][1];
        double y2=bigA[1][1];
        double ans1=bigA[0][2];
        double ans2=bigA[1][2];
        double mult;
        if(x1 == 0 || y1==0){
           return null;
        }
        mult = x2/x1;
        double mult_y=y2-mult*y1;
        double mult_ans=ans2-mult*ans1;
        double final_y=mult_ans/mult_y;
        double final_x=(ans1-(final_y*y1))/x1;
        
        
        
        return new double[]{final_x,final_y};
    }
    
}
