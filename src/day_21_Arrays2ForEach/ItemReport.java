package day_21_Arrays2ForEach;

public class ItemReport {

    public static void main(String[] args) {


        String st[]={"AHMET","AYSE","SEMİH"};

        double db[]={12.33,14.23,15,33};

        int itemNo[]={1,2,3};

        String report="";


        for (int i = 0; i < st.length ; i++) {

            report=st[i]+" "+db[i]+"  "+itemNo[i]+" ";

            System.out.println("report = " + report);

        }


        System.out.println(report);

    }
}
