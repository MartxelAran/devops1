package es.upm.miw.iwvg_devops.pruebaGit;

import java.util.ArrayList;

public class Employer {

    private String name;
    private String lastName;
    private int age;
    public Jefe jefe;
    public ArrayList<Client> clients;

    public Employer(String name, String lastName, int age, Jefe jefe) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.jefe = jefe;
    }

    public Employer(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

}
