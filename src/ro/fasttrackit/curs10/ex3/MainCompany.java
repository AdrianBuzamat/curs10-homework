package ro.fasttrackit.curs10.ex3;

import java.util.List;

public class MainCompany {
    public static void main(String[] args) {
        Company company = new Company("S.C. StingeLimina S.R.L.",
                List.of(new Person("Ana", 54, "manager"),
                        new Person("Dorel", 44, "plummer"),
                        new Person("Celentano", 46, "carpenter"),
                        new Person("Firicel", 44, "welder"),
                        new Person("Flaviu", 24, "welder"),
                        new Person("Dorel", 33,"welder")));
        System.out.println(company.getManager());
        System.out.println(company.getPersons("welder"));
        System.out.println(company.getPersonsOlder(45));
        System.out.println(company.getPerson("Dorel"));
        company.employ("Vasile",43,"plummer");
        System.out.println(company.getName());
    }
}
