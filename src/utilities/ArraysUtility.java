package utilities;

public class ArraysUtility {

    public static void printEachElement(int arr[]) {
        for (int i : arr) {
            System.out.print(i);
        }
    }

    public static void printEachElement(double arr[]) {
        for (double i : arr) {
            System.out.print(i);
        }
    }

    public static void printEachElement(char arr[]) {
        for (char i : arr) {
            System.out.print(i);
        }

    }

    public static void printEachElement(String arr[]) {
        for (String i : arr) {
            System.out.print(i);
        }

    }

    // finds the max int number in the int array
    public static int max(int arr[]) {

        int max = arr[0];

        for (int i : arr) {

            if (i > max)
                max = i;
        }
        return max;
    }

    // finds the max double number in the int array
    public static double max(double arr[]) {

        double max = arr[0];

        for (double i : arr) {

            if (i > max)
                max = i;
        }
        return max;
    }

    // finds the min double number in the int array
    public static double min(double arr[]) {

        double min = arr[0];

        for (double i : arr) {

            if (i < min)
                min = i;
        }
        return min;
    }

    // finds the min int number in the int array
    public static int min(int arr[]) {

        int min = arr[0];

        for (int i : arr) {

            if (i < min)
                min = i;
        }
        return min;
    }

    //return true or false if the given int element occurs in given int array
    public static boolean isContain(int arr[], int i) {
        for (int i1 : arr) {
            if (i1 == i)
                  return true;
        }
        return false;
    }

    //return true or false if the given double element occurs in given double array
    public static boolean isContain(double arr[], double i) {
        for (double i1 : arr) {
            if (i1 == i)
                return true;
        }
        return false;
    }

    //return true or false if the given char element occurs in given char array
    public static boolean isContain(char arr[], char i) {
        for (char i1 : arr) {
            if (i1 == i)
                return true;
        }
        return false;
    }

    //return true or false if the given String element occurs in given String array
    public static boolean isContain(String arr[], String i) {
        for (String i1 : arr) {
            if (i1.equals(i))
                return true;
        }
        return false;
    }

    //add a new element to the given array.
    public static int[] addElement(int arr[], int a) {

        int newArray[] = new int[arr.length + 1];


        for (int i = 0; i < arr.length; i++) {

            newArray[i] = arr[i];

        }

        newArray[arr.length] = a;

        return newArray;

    }

    //add a new element to the given array.
    public static char[] addElement(char array[], char ch) {

        char newArray[] = new char[array.length + 1];

        int i = 0;

        for (char c : array) {

            newArray[i++] = c;

        }
        newArray[array.length] = ch;

        return newArray;

    }

    //add a new element to the given array.
    public static String[] addElement(String array[], String ch) {

        String newArray[] = new String[array.length + 1];

        int i = 0;

        for (String c : array) {

            newArray[i++] = c;

        }
        newArray[array.length] = ch;

        return newArray;

    }

    //add a new element to the given array.
    public static double[] addElement(double array[], double ch) {

        double newArray[] = new double[array.length + 1];

        int i = 0;

        for (double c : array) {

            newArray[i++] = c;

        }
        newArray[array.length] = ch;

        return newArray;

    }

    // returns the frequency of the given element in the given array
    public static int frequencyOfElement(int arr[], int a) {

        int count = 0;

        for (int i : arr) {
            if (i == a)
                count++;

        }
        return count;
    }

    // returns the frequency of the given element in the given array
    public static int frequencyOfElement(double arr[], double a) {

        int count = 0;

        for (double i : arr) {
            if (i == a)
                count++;

        }
        return count;
    }

    // returns the frequency of the given element in the given array
    public static int frequencyOfElement(char arr[], char a) {

        int count = 0;

        for (char i : arr) {
            if (i == a)
                count++;

        }
        return count;
    }

    // returns the frequency of the given element in the given array
    public static int frequencyOfElement(String arr[], String str) {

        int count = 0;

        for (String i : arr) {
            if (i.equals(str))
                count++;

        }
        return count;
    }

    //returns new array after finding the unique elements
    public static int[] uniqueElements(int arr[]) {

        int result[]={};

        for (int i : arr) {

            int count = ArraysUtility.frequencyOfElement(arr, i);
            if (count == 1)
                result=ArraysUtility.addElement(result,i);

        }
        return result;

    }

    //returns new array after finding the unique elements
    public static double[] uniqueElements(double arr[]) {

        double result[]={};

        for (double i : arr) {

            int count = ArraysUtility.frequencyOfElement(arr, i);
            if (count == 1)
                result=ArraysUtility.addElement(result,i);

        }
        return result;

    }

    //returns new array after finding the unique elements
    public static char[] uniqueElements(char arr[]) {

        char result[]={};

        for (char i : arr) {

            int count = ArraysUtility.frequencyOfElement(arr, i);
            if (count == 1)
                result=ArraysUtility.addElement(result,i);

        }
        return result;

    }

    //returns new array after finding the unique elements
    public static String[] uniqueElements(String arr[]) {

        String result[]={};

        for (String i : arr) {

            int count = ArraysUtility.frequencyOfElement(arr, i);
            if (count == 1)
                result=ArraysUtility.addElement(result,i);

        }
        return result;

    }

    //remove the given index's of element from the given array and returns new array.
    public static int[] removeElement(int arr[],int a){

        if(a<0||a>arr.length-1) {

            System.err.println("invalid index" + a);

            System.exit(0);
        }

        int arr2[]=new int[arr.length-1];

        int j=0;

        for (int i = 0; i < arr.length; i++) {

            if(i==a)
                continue;

            arr2[j++]=arr[i];

        }
        return arr2;

    }

    //remove the given index's of element from the given array and returns new array.
    public static double[] removeElement(double arr[],int a){

        if(a<0||a>arr.length-1) {

            System.err.println("invalid index" + a);

            System.exit(0);
        }

        double arr2[]=new double[arr.length-1];

        int j=0;

        for (int i = 0; i < arr.length; i++) {

            if(i==a)
                continue;

            arr2[j++]=arr[i];

        }
        return arr2;

    }

    //remove the given index's of element from the given array and returns new array.
    public static char[] removeElement(char arr[],int a){

        if(a<0||a>arr.length-1) {

            System.err.println("invalid index" + a);

            System.exit(0);
        }

        char arr2[]=new char[arr.length-1];

        int j=0;

        for (int i = 0; i < arr.length; i++) {

            if(i==a)
                continue;

            arr2[j++]=arr[i];

        }
        return arr2;

    }

    //remove the given index's of element from the given array and returns new array.
    public static String[] removeElement(String arr[],int a){

        if(a<0||a>arr.length-1) {

            System.err.println("invalid index" + a);

            System.exit(0);
        }

        String arr2[]=new String[arr.length-1];

        int j=0;

        for (int i = 0; i < arr.length; i++) {

            if(i==a)
                continue;

            arr2[j++]=arr[i];

        }
        return arr2;

    }

    //merge two given arrays (1.way)
    /*public static int[] merge(int arr1[],int arr2[]){

        int arrNew[]=new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length; i++) {

            arrNew[i]=arr1[i];

        }

        int j=arr1.length;

        for (int i = 0; i < arr2.length; i++) {

            arrNew[j++]=arr2[i];

        }

        return arrNew;

    }

     */

    //merge two given arrays (2.way)
    public static int[] merge(int arr1[],int arr2[]){

        int arrNew[]={};

        for (int i : arr1) {
            arrNew=addElement(arrNew,i);
        }

        for (int i : arr2) {
            arrNew=addElement(arrNew,i);
        }

        return arrNew;

    }
    
    //merge two given arrays (2.way)
    public static double[] merge(double arr1[],double arr2[]){

        double arrNew[]={};

        for (double i : arr1) {
            arrNew=addElement(arrNew,i);
        }

        for (double i : arr2) {
            arrNew=addElement(arrNew,i);
        }

        return arrNew;

    }

    //merge two given arrays (2.way)
    public static char[] merge(char arr1[],char arr2[]){

        char arrNew[]={};

        for (char i : arr1) {
            arrNew=addElement(arrNew,i);
        }

        for (char i : arr2) {
            arrNew=addElement(arrNew,i);
        }

        return arrNew;

    }

    //merge two given arrays (2.way)
    public static String[] merge(String arr1[],String arr2[]){

        String arrNew[]={};

        for (String i : arr1) {
            arrNew=addElement(arrNew,i);
        }

        for (String i : arr2) {
            arrNew=addElement(arrNew,i);
        }

        return arrNew;

    }

    //reverse the given array and then returns new array
    public static int[] reverseArray(int arr[]){

        int j=0;

        int reversedArray[]=new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            reversedArray[j++]=arr[i];

        }
        return reversedArray;



    }

    //reverse the given array and then returns new array
    public static double[] reverseArray(double arr[]){

        int j=0;

        double reversedArray[]=new double[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            reversedArray[j++]=arr[i];

        }
        return reversedArray;



    }

    //reverse the given array and then returns new array
    public static char[] reverseArray(char arr[]){

        int j=0;

        char reversedArray[]=new char[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            reversedArray[j++]=arr[i];

        }
        return reversedArray;



    }

    //reverse the given array and then returns new array
    public static String[] reverseArray(String arr[]){

        int j=0;

        String reversedArray[]=new String[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            reversedArray[j++]=arr[i];

        }
        return reversedArray;

    }

   //removes the duplicates from the given array and returns new array
    public static int[] removeDuplicates(int arr[]){

        int result[]={};

        for (int i : arr) {

            if(!ArraysUtility.isContain(result,i))
                result=ArraysUtility.addElement(result,i);

        }
        return result;

    }

    //removes the duplicates from the given array and returns new array
    public static double[] removeDuplicates(double arr[]){

        double result[]={};

        for (double i : arr) {

            if(!ArraysUtility.isContain(result,i))
                result=ArraysUtility.addElement(result,i);

        }
        return result;

    }

    //removes the duplicates from the given array and returns new array
    public static char[] removeDuplicates(char arr[]){

        char result[]={};

        for (char i : arr) {

            if(!ArraysUtility.isContain(result,i))
                result=ArraysUtility.addElement(result,i);

        }
        return result;

    }

    //removes the duplicates from the given array and returns new array
    public static String[] removeDuplicates(String arr[]){

        String result[]={};

        for (String i : arr) {

            if(!ArraysUtility.isContain(result,i))
                result=ArraysUtility.addElement(result,i);

        }
        return result;

    }

   //replaces the given index of element in the given array and then return as new array
    public static int[] replace(int arr[], int index, int value){

        if(index<0||index> arr.length-1){
            System.err.println( "invalid index: ==>"+ index);
            System.exit(0);

        }

        arr[index]=value;

        return arr;

    }

    //replaces the given index of element in the given array and then return as new array
    public static double[] replace(double arr[], int index, double value){

        if(index<0||index> arr.length-1){
            System.err.println( "invalid index: ==>"+ index);
            System.exit(0);

        }

        arr[index]=value;

        return arr;

    }

    //replaces the given index of element in the given array and then return as new array
    public static char[] replace(char arr[], int index, char value){

        if(index<0||index> arr.length-1){
            System.err.println( "invalid index: ==>"+ index);
            System.exit(0);

        }

        arr[index]=value;

        return arr;

    }

    //replaces the given index of element in the given array and then return as new array
    public static String[] replace(String arr[], int index, String value){

        if(index<0||index> arr.length-1){
            System.err.println( "invalid index: ==>"+ index);
            System.exit(0);

        }

        arr[index]=value;

        return arr;

    }

    //replaces the given old element with the given new element and then returns new array
    public static int[] replaceAll(int arr[], int value, int newValue){

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                arr[i] = newValue;

            }
        }
        return arr;

    }

    //replaces the given old element with the given new element and then returns new array
    public static double[] replaceAll(double arr[], double value, double newValue){

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                arr[i] = newValue;

            }
        }
        return arr;

    }

    //replaces the given old element with the given new element and then returns new array
    public static char[] replaceAll(char arr[], char value, char newValue){

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                arr[i] = newValue;

            }
        }
        return arr;

    }

    //replaces the given old element with the given new element and then returns new array
    public static String[] replaceAll(String arr[], String value, String newValue){

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(value)) {
                arr[i] = newValue;

            }
        }
        return arr;

    }

    //inserts a given value to the given index and then return a new array
    public static int[] insert(int arr[],int index, int value){

        int arrNew[]={};

        for (int i = 0; i < arr.length; i++) {

            if(i==index){
                arrNew= ArraysUtility.addElement(arrNew,value);
            }
            arrNew=ArraysUtility.addElement(arrNew,arr[i]);
        }

        return  arrNew;


    }

    //inserts a given value to the given index and then return a new array
    public static double[] insert(double arr[],int index, double value){

        double arrNew[]={};

        for (int i = 0; i < arr.length; i++) {

            if(i==index){
                arrNew= ArraysUtility.addElement(arrNew,value);
            }
            arrNew=ArraysUtility.addElement(arrNew,arr[i]);
        }
        return  arrNew;

    }

    //inserts a given value to the given index and then return a new array
    public static char[] insert(char arr[],int index, char value){

        char arrNew[]={};

        for (int i = 0; i < arr.length; i++) {

            if(i==index){
                arrNew= ArraysUtility.addElement(arrNew,value);
            }
            arrNew=ArraysUtility.addElement(arrNew,arr[i]);
        }
        return  arrNew;

    }

    //inserts a given value to the given index and then return a new array
    public static String[] insert(String arr[],int index, String value){

        String arrNew[]={};

        for (int i = 0; i < arr.length; i++) {

            if(i==index){
                arrNew= ArraysUtility.addElement(arrNew,value);
            }
            arrNew=ArraysUtility.addElement(arrNew,arr[i]);
        }
        return  arrNew;

    }

    //swaps the given index s elements with the other given index s element and then returns new array
    public static int[] swap(int arr[],int index1,int index2){

        int temp=arr[index2];

        arr[index2]=arr[index1];

        arr[index1]=temp;

        return  arr;

    }

    //swaps the given index s elements with the other given index s element and then returns new array
    public static double[] swap(double arr[],int index1,int index2){

        double temp=arr[index2];

        arr[index2]=arr[index1];

        arr[index1]=temp;

        return  arr;

    }

    //swaps the given index s elements with the other given index s element and then returns new array
    public static char[] swap(char arr[],int index1,int index2){

        char temp=arr[index2];

        arr[index2]=arr[index1];

        arr[index1]=temp;

        return  arr;

    }

    //swaps the given index s elements with the other given index s element and then returns new array
    public static String[] swap(String arr[],int index1,int index2){

        String temp=arr[index2];

        arr[index2]=arr[index1];

        arr[index1]=temp;

        return  arr;

    }




}
