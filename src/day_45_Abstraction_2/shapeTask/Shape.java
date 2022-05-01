package day_45_Abstraction_2.shapeTask;

public abstract class Shape {

    private String name;

    public Shape(String name){
        this.name=name;
    }



    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return super.toString();
    }
}
