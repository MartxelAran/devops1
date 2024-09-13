package es.upm.miw.iwvg_devops.pruebaGit;

public class Employer {
    private String name;
    private String lastName;
    private int age;
    public Employer(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
