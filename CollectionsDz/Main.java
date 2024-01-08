package Javagenerics.CollectionsDz;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Employee> employees = new ArrayList<>() {{
            add(new Employee(1,23456L,"H",7));
            add(new Employee(2,13456L,"Y",4));
            add(new Employee(3,4443456L,"T",1));
            add(new Employee(4,23555456L,"R",15));
            add(new Employee(4,23555456L,"R",15));
            add(new Employee(4,23555456L,"R",15));
            add(new Employee(4,23555456L,"R",15));
            add(new Employee(4,23555456L,"R",15));
        }};




        EmployeeGuide employeesGuide = new EmployeeGuide(employees);


        System.out.println(employeesGuide.getTelephone("R", employees));
        System.out.println(employeesGuide.getTabelNum(1, employees));

        System.out.println(employeesGuide.searchEmployee(15, employees));


        employeesGuide.addEmployee(employees);
        System.out.println(employees);
    }


}