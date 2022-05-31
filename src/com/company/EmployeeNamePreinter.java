package com.company;
////делаем метод интерфейса, т.е реализиурем Printer интерфейс
public class EmployeeNamePreinter implements Printer{
    @Override
    public void print(Employee employee) {

        if ( employee.firstName.isEmpty() || employee.lastName.isEmpty()){
            System.out.println("First name and Last name cannot be empty");
        }else{
        System.out.println("First name: " + employee.firstName);
        System.out.println("Last name" + employee.lastName);

    }
}}
