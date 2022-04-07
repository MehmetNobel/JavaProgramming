package day_31_Constructors;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer o1 = new Offer("MC", "CYDEO", "SDET", 60000, true, true, false, true);
        Offer o2 = new Offer("CM", "CYDEO", "SDET", 55000, true, true, true, false);
        Offer o3 = new Offer("AB", "CYDEO", "QE", 32000, true, true, false, true);
        Offer o4 = new Offer("MC", "CYDEO", "SDET", 60000, false, true, true, false);
        Offer o5 = new Offer("TN", "CYDEO", "QA", 80000, false, true, false, false);
        Offer o6 = new Offer("MC", "CYDEO", "DEV", 90000, true, true, true, true);
        Offer o7 = new Offer("TR", "CYDEO", "SDET", 111000, false, true, false, true);


        ArrayList<Offer> list = new ArrayList<>();
        list.addAll(Arrays.asList(o1, o2, o3, o4, o5, o6, o7));

        //System.out.println(list);

        System.out.println("***********************************");

        for (Offer offer : list) {

            System.out.println(offer);

        }

        System.out.println("***********************************");
        ArrayList<Offer> listfulltime = new ArrayList<>(list);
        ArrayList<Offer> listLocalJobs = new ArrayList<>(list);

        listfulltime.removeIf(p -> (p.isFulltime == false));

        System.out.println("listfulltime = " + listfulltime);

        System.out.println("listfulltime.size() = " + listfulltime.size());

        Offer arr[] = listfulltime.toArray(new Offer[listfulltime.size()]);

        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("arr.length = " + arr.length);

        listLocalJobs.removeIf(p->!p.location.equals("MC"));

        System.out.println("listLocalJobs = " + listLocalJobs);

        Offer arrLocal[]=listLocalJobs.toArray(new Offer[0]);  // conversionv from list to array.

        System.out.println("arrLocal = " + Arrays.toString(arrLocal));

        ArrayList<Offer> listBenefit=new ArrayList<>(list);

        listBenefit.removeIf(p->!p.hasBenefit==true);

        System.out.println("listBenefit = " + listBenefit);

        System.out.println("***********************************");

        Offer arrBenefit[]=listBenefit.toArray(new Offer[0]);

        System.out.println("arrBenefit = " + Arrays.toString(arrBenefit));

        ArrayList<Offer> sdetOffers=new ArrayList<>(list);

        sdetOffers.removeIf(p->!p.jobTitle.equals("SDET"));

        System.out.println("///////////////////////////////////////////");

        System.out.println("Arraylist of sdetOffers = " + sdetOffers);

        System.out.println("*******************************");

        Offer arrSdet[]=sdetOffers.toArray(new Offer[0]);

        System.out.println("Array of arrSdet = " + Arrays.toString(arrSdet));

        ArrayList<Offer> muchthen100k=new ArrayList<>(list);

        muchthen100k.removeIf(p->p.salary<=100000);

        System.out.println("muchthen100k = " + muchthen100k);

        Offer arr100k[]=muchthen100k.toArray(new Offer[0]);

        System.out.println("arr100k = " + Arrays.toString(arr100k));

        for (Offer listLocalJob : listLocalJobs) {

            System.out.println("location : "+ listLocalJob.location+ " company name: "+listLocalJob.companyName+ " salary : "+ listLocalJob.salary);

        }


    }


}
