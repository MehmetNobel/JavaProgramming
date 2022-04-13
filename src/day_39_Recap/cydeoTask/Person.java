package day_39_Recap.cydeoTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
       setName(name);
       setAge(age);
       setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (Character.isDigit(name.charAt(0))) {
            System.err.println("name cannot be digit");
            System.exit(-1);
        }

        if (name.isEmpty() || name.isBlank()) {
            System.err.println("name cannot be empty or blank");
            System.exit(-1);
        } else
            this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 15 || age > 70) {
            System.err.println("age cannot be less than 15 or more than 70");
            System.exit(-1);
        } else {
            this.age = age;
        }
    }

    public char getGender() {
        return gender;
    }

    public void eat(){

        System.out.println(name+" is eating");
    }

    public void drink(){

        System.out.println(name+" is drinking");
    }
    public void sleep(){

        System.out.println(name+" is sleeping");
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("gender cannot be other than M or F");
            System.exit(-1);
        } else {
            this.gender = gender;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }





}
