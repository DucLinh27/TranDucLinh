package Bai7_Abtract_Interface.Baitap;

public  class Circle extends Shape implements Colorable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius,String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius* radius* Math.PI;
    }
    public double getPerimeter(){
        return 2*radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius =" + getRadius() +", "+super.toString()+","+"Area ="+ getArea();
    }

    @Override
    public void resize(double persent) {
        this.radius *= (persent/200);
    }

    @Override
    public void howToColor(String color) {
        System.out.println(this.getColor());
    }
}
