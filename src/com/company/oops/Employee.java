package com.company.oops;

public class Employee {

    int empid;
    int salary;
    String empname;
    int dptno;

    void display() {
        System.out.println(empid);
        System.out.println(salary);
        System.out.println(empname);
        System.out.println(dptno);

    }

    public static void main(String[] args) {
        Employee emp1= new Employee();
        emp1.empid =21;
        emp1.salary= 70000;
        emp1.empname= "Satish";
        emp1.dptno = 8;
        emp1.display();
    }
}