package com.company;
//в данном случае выступает хранилицем данных работников

public class Employee {
    public String firstName;
    public String lastName;
    public int age;
    public String team;
    public long salary;

    public Employee(String firstName, String lastName, int age, String team, long salary){

        if ( age < 18){
            System.out.println("Incorrect age value");
        }


        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.team = team;
        this.salary = salary; // в скобках метода инициализация данных
    }
}
