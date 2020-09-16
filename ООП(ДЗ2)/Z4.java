package com.company;

abstract class Z4 {

    private double volume;

    public double GVolume() {
        return this.volume;


    }

    public void SVolume(double volume) {
        this.volume = volume;

    }
}

class Boxx extends Shape {
    public boolean add(Shape shape) {
        if (this.GVolume() < shape.GVolume()){
            return false;


        }
        else{
            double Free = this.GVolume()- shape.GVolume();
            this.SVolume(Free);
            return true;

        }
    }

}

class SQRTT extends Shape{
    private double a;

}
