package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vector {
    double x1, y1, z1;
    Vector(double x1, double y1, double z1 ){
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;

    } // Constructor

    public double vectorLength () {
        return Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2) + Math.pow(z1, 2));
    }

    public double scalarProduct(){
        double x2=2;
        double y2=6;
        double z2=2;
        return x1*x2 + y1*y2 + z1*z2;

    }
    public double vectorProductOne(){
        double y2=6;
        double z2=2;
        return y1*z2-z1*y2;
    }
    public double vectorProductTwo(){
        double x2=2;
        double z2=2;
        return z1*x2-x1*z2;
    }
    public double vectorProductThree(){
        double x2=2;
        double y2=6;
        return x1*y2-y1*x2;
    }
    public double vectorCos(){
        double x2= 3;
        double y2=4;
        return (x1*x2+y1*y2)/Math.sqrt(Math.pow(x1,2)+ Math.pow(y1, 2))*Math.sqrt(Math.pow(x2, 2)+Math.pow(y2,2));

    }

    public double vectorSumOne(){
        double x2=2;
        return x1+x2;

    }

    public double vectorSumTwo(){
        double y2=6;
        return y1+y2;
    }
    public double vectorSumThree(){
        double z2=2;
        return z1+z2;
    }
    public double vectorSubOne(){
        double x2=2;
        return x1-x2;

    }

    public double vectorSubTwo(){
        double y2=6;
        return y1-y2;
    }
    public double vectorSubThree(){
        double z2=2;
        return z1-z2;
    }



}
