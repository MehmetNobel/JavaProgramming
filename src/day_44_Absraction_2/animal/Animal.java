package day_44_Absraction_2.animal;

public abstract class Animal {

    private final String breed, color;
    private int age;
    private final char gender;
    private String size,name;

    public final static boolean canBreath;  // final+static olabilir; bir kanun gibi yani. bir kez veririz ve değişmez.

    static {
        canBreath=true;
    }
    public Animal(String breed, String color, int age, char gender, String size, String name) {
        this.breed = breed;
        this.color = color;
        setAge(age);
        if(!(gender=='M'||gender=='F')){
            throw new RuntimeException("gender cannot be different then M/F");
        }
        this.gender = gender;
        setSize(size);
        this.name=name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0)
            throw new RuntimeException("age cannot be zero or less than zero");
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName(){
        return name;
    }

    public abstract void eat();

    public final void drink(){
        System.out.println(breed+" is drinking water");
    } // since we do not wanna change the method we used final

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                '}';
    }
}
