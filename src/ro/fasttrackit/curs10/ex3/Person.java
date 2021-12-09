package ro.fasttrackit.curs10.ex3;

public class Person {
    private String name;
    private int age;
    private String position;


    public Person(String name){
        this(name,18,"undefined");
    }

    public Person(String name, int age){

        this(name, age,"undefined");
    }

    public Person(String name, int age, String position){
        this.name=name;
        this.age=age;
        this.position=position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}
