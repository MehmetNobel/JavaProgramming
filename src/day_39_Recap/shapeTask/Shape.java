package day_39_Recap.shapeTask;

public class Shape {

    private String name;

    public Shape(String name) {
       setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equalsIgnoreCase("square") || name.equalsIgnoreCase("rectangle")
                || name.equalsIgnoreCase("circle"))
            this.name = name;
        else {
            System.err.println("shape data is wrong. please try again.");
            System.exit(0);
        }

    }

    public double area(){

        return 0;
    }

    public double perimeter(){

        return 0;
    }





}
