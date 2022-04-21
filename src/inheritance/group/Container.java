package inheritance.group;

public class Container {

    private String initial="A";

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    @Override
    public String toString() {
        return "Container{" +
                "initial='" + initial + '\'' +
                '}';
    }
}
