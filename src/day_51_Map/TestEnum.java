package day_51_Map;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestEnum {

    public static void main(String[] args) {

        //enum is used to define constant things

        // enum is a data type like string
        // contains fixed number of things

        Browser browser=Browser.EDGE;

        switch(browser){

            case FIREFOX:
                System.out.println("firefox is selected");
                break;
            case SAFARI:
                System.out.println("safari is selected");
                break;
            case OPERA:
                System.out.println("opera is selected");
                break;
            case EDGE:
                System.out.println("edge is selected");
                break;
            default:
                System.out.println("chrome is selected");



    }

    }
}
