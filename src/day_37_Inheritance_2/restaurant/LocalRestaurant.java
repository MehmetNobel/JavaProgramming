package day_37_Inheritance_2.restaurant;

public class LocalRestaurant {

    public static void main(String[] args) {


        Restaurant res = new Restaurant("mehmet", "maltepe", 5);
        Server server1 = new Server("ali", 151, 25, true);
        Server server2 = new Server("veli", 152, 25, true);
        Server server3 = new Server("selin", 153, 25, true);
        Chef chef1 = new Chef("ahmet", 251, 35, true);
        Chef chef2 = new Chef("kaya", 252, 40, true);
        Chef chef3 = new Chef("sedat", 253, 35, true);

        Server[] arrServer = {server1, server2, server3};
        res.hireServer(arrServer);

        Chef[] arrChef = {chef1, chef2, chef3};
        res.hireChef(arrChef);

        System.out.println("res = " + res);

        res.terminateChef(252);

        System.out.println("res.listChef.size() = " + res.listChef.size());

        System.out.println("res.listServer.size() = " + res.listServer.size());
    }


}
