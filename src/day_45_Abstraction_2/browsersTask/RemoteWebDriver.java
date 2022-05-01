package day_45_Abstraction_2.browsersTask;

public class RemoteWebDriver implements WebDriver,TakeScreenShot,JavaScriptExecuter{

    final String browserName;

    public RemoteWebDriver(String browserName) {
        this.browserName = browserName;

        System.out.println( "opening "+browserName+" browser");
    }


    @Override
    public void executeScript(String script) {
        System.out.println("Executing \"" + script + "\" script on" + browserName +" browser");

    }

    @Override
    public String findElement(String locator) {
        return browserName+" driver locating an element by " + locator;
    }

    @Override
    public String findElements(String locator) {
        return browserName+" driver locating multiple elements by " + locator;
    }

    @Override
    public void takeScreenShot() {
        System.out.println("Taking \n" +
                "screenshot on: "+browserName+ " browser");

    }

    @Override
    public void get(String url) {

        System.out.println("getting the "+url+" on "+browserName+" browser");

    }

    @Override
    public void close() {
        System.out.println("Closing the tab on "+browserName+" browser");

    }

    @Override
    public void quit() {
        System.out.println("quitting the browser "+browserName+" browser");

    }

    @Override
    public void getTitle() {
        System.out.println(browserName+ "driver is getting the title");
    }
}
