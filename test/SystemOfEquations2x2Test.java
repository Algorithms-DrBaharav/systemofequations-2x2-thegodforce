/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;


import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

/**
 *
 * @author Zachi_Mac13in_1
 */
public class SystemOfEquations2x2Test {
    
    public SystemOfEquations2x2Test() {
    }

 

    @Test
    public void t1_testSolve2x2SimpleCaseI() {
        System.out.print("Solve2x2: Simple case I");
        SystemOfEquations2x2 instance ;
        instance = new SystemOfEquations2x2(1,2,3,4,5,11);
        double[] expResult = {1,2};
        double[] result = instance.Solve2x2();
        assertArrayEquals(expResult, result, 0.01);
    }

    @Test
    public void t2_testSolve2x2SimpleCaseII() {
        System.out.println("Solve2x2: Simple case II");
        SystemOfEquations2x2 instance ;
        instance = new SystemOfEquations2x2(2,4,3,4,10,11); 
        assertArrayEquals(new double[]{1,2}, instance.Solve2x2(), 0.01);
    }
    

    @Test
    public void t3_testSolve2x2NeedToFlipRows() {
        System.out.println("Solve2x2: Flip Rows");
        SystemOfEquations2x2 instance ;
        instance = new SystemOfEquations2x2(2,4,3,4,10,11); 
        assertArrayEquals(new double[]{1,2}, instance.Solve2x2(), 0.01);
    }
    
    
    @Test
    public void t4_testSolve2x2InfiniteNumberOfSolutionsI() {
        System.out.println("Infinite number of solutions I");
        SystemOfEquations2x2 instance ;
        instance = new SystemOfEquations2x2(0,0,1,0,4,5); 
        assertNull(instance.Solve2x2());
    }
        
    
    @Test
    public void t5_testSolve2x2InfiniteNumberOfSolutionsII() {
        System.out.println("Infinite number of solutions II");
        SystemOfEquations2x2 instance ;
        instance = new SystemOfEquations2x2(1,0,1,0,5,5); 
        assertNull(instance.Solve2x2());
    }
        
    @Test
    public void t6_testSolve2x2NoSolutions() {
        System.out.println("No Solutions");
        SystemOfEquations2x2 instance ;
        instance = new SystemOfEquations2x2(1,0,1,0,4,5); 
        assertNull(instance.Solve2x2());
    }
       
    
}
