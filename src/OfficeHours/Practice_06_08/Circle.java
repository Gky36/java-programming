package OfficeHours.Practice_06_08;

public class Circle extends Shape
{
    double radius;
    double diameter;

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    @Override
    public void calculatePerimeter()
    {
       perimeter = 2* Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
