package com.company;

class Shape {
    private double volume;

    public double GVolume() {
        return this.volume;


    }

    public void SVolume(double volume) {
        this.volume = volume;

    }
}

class Box extends Shape {
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

class SQRT extends Shape{
        private double a;

}




