package day_45_Abstraction_2.browsersTask;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver chrome=new ChromeDriver("chrome");

        FireFox firefox=new FireFox("firefox");

        chrome.executeScript("title");

        chrome.findElement("tagName");

        firefox.get("https://www.google.com");

        firefox.takeScreenShot();

        firefox.close();

        firefox.getTitle();



    }
}
