package day_43_Abstraction.employeeTask;

public abstract class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        this.gender = gender;
    }

    public abstract void sleep();

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()||name.isBlank()){

            throw new RuntimeException("name cannot be empty or blank!");
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0||age>130){
            throw new RuntimeException("age cannot be less than zero or more than 130 "+ age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
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
