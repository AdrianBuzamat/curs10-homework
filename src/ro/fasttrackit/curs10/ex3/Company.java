package ro.fasttrackit.curs10.ex3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Company {

    private String name;
    private ArrayList<Person> employees;

    public Company(String name, Collection<Person> employees) {
        this.name = name;
        this.employees = new ArrayList<>();
        this.employees.addAll(employees);
    }

    public Person getManager() {
        for (Person employee : employees) {
            if ("manager".equals(employee.getPosition())) {
                return employee;
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession) {
        List<Person> grup = new ArrayList<>();
        for (Person employee : employees) {
            if (profession.equals(employee.getPosition())) {
                grup.add(employee);
            }
        }
        return grup;
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> olderGrup = new ArrayList<>();
        for (Person employee : employees) {
            if (age < (employee.getAge())) {
                olderGrup.add(employee);
            }
        }
        return olderGrup;
    }

    public List<Person> getPerson(String filterName) {
        List<Person> sameName = new ArrayList<>();
        for (Person employee: employees) {
            if (filterName.equals(employee.getName())) {
                sameName.add(employee);
            }
        }
        return sameName;
    }

    public void employ(String name,int age,String profession) {
        this.employees.add(new Person(name,age,profession));
    }

    public String getName() {
        return name;
    }
}
