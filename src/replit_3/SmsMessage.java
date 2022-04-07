package replit_3;

import java.util.Scanner;

public class SmsMessage {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

        System.out.println("please enter the message");
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        sender=message.substring(message.indexOf("<")+1,message.indexOf(".")-1);

        phoneNumber=message.substring(message.indexOf("[")+1, message.indexOf("]"));

        messageBody=message.substring(message.indexOf("{")+1,message.indexOf("}"));

        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: "+messageBody);
    }
}

