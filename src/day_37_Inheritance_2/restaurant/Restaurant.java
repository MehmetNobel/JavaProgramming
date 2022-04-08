package day_37_Inheritance_2.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, location;
    public int numberOfStars;

    public ArrayList<Server> listServer=new ArrayList<>();
    public ArrayList<Chef> listChef=new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }


    public void hireServer(Server server){
        listServer.add(server);
    }

    public void hireServer(Server[] server){
        listServer.addAll(Arrays.asList(server));
    }

    public void hireChef(Chef chef){
        listChef.add(chef);
    }

    public void hireChef(Chef[] chef){
        listChef.addAll(Arrays.asList(chef));
    }

    public void terminateServer(int employeeId){
        listServer.removeIf(p->p.employeeId==employeeId);
        System.out.println(employeeId+" work is terminated");
    }

    public void terminateChef(int employeeId){
        listChef.removeIf(p->p.employeeId==employeeId);
        System.out.println(employeeId+" work is terminated");
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", listServer=" + listServer +
                ", listServer=" + listServer.size() +
                ", listChef=" + listChef +
                ", listChef=" + listChef.size() +
                '}';
    }
}
