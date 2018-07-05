package com.ellisdeclercq;

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

public class TestenDepenciesApache {

    public static void main(String[] args) {

        double [][] data = {
                {1,2},
                {3,4},
                {5,2}
        };
        RealMatrix r = MatrixUtils.createRealMatrix(data);


        double [][] data2 = {
                {2,2,4},
                {0,1,0}
        };
        RealMatrix s = MatrixUtils.createRealMatrix(data2);

        RealMatrix t = r.multiply(s);

        System.out.println(t);



    }
}
