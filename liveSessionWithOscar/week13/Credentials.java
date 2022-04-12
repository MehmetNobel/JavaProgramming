package week13;

import java.util.Scanner;

public class Credentials {

    private String userName;
    private String password;
    Scanner scan=new Scanner(System.in);

    public Credentials(String userName, String password){
        setUserName(userName);
        setPassword(password);
    }

    public String getUserName() {
        System.out.println("how long are u our customer?");
        int answer=scan.nextInt();
        if(answer>=3)
        return userName;
        else{
            System.err.println("you are not eligible to see the username!");
            System.exit(-1);
        }
           return userName;
    }

    public void setUserName(String userName) {

        if(userName.equals("Mehmet"))
        this.userName = userName;
        else{
            System.err.println("user name is invalid");
            System.exit(-1);
        }
    }

    public String getPassword() {
        System.out.println("how long are u our customer?");
        int answer=scan.nextInt();
        if(answer>=3)
            return password;
        else{
            System.err.println("you are not eligible to see the username!");
            System.exit(-1);
        }
        return password;
    }

    public void setPassword(String password) {
        if(password.equals("12345"))
        this.password = password;
        else{
            System.err.println("invalid password");
            System.exit(-1);
        }
    }




}
