package com.company;
import com.company.homework2.Circle;
import com.company.homework2.Rectangle;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Nastya","Pinchuk",15,"Feature",0000);
        EmployeeNamePreinter namePreinter = new EmployeeNamePreinter(); //вызываем объект класса. Объект класс + имя = присвоить имя класса
        namePreinter.print(employee1);

        EmployeeSalaryPrinter salaryPrinter = new EmployeeSalaryPrinter();
        salaryPrinter.print(employee1);

        Employee employee2 = new Employee("", "", 44, "MQA", -333);
        namePreinter.print(employee2);
        salaryPrinter.print(employee2);


        Circle circle1 = new Circle(8);
        Rectangle rectangle1 = new Rectangle(4, 8);
        System.out.println("Circle = " + circle1.getSquere());
        System.out.println("Rectangle = " + rectangle1.getSquere());



    }
}
