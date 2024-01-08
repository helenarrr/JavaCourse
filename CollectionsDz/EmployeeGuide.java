package Javagenerics.CollectionsDz;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeGuide {
    Scanner sc = new Scanner(System.in);
    ArrayList<Employee> employees;

    EmployeeGuide(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    //    Добавить метод, который ищет сотрудника по стажу (может быть список)

    public ArrayList<String> searchEmployee(Integer experience, ArrayList<Employee> employeeGuide) {
        ArrayList<String> result = new ArrayList<>();
        for (Employee employee : employeeGuide) {
            if (employee.experience().equals(experience)) result.add(employee.name());
        }
        return result;
    }


//    Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)

    public ArrayList<Long> getTelephone(String name, ArrayList<Employee> employeeGuide) {
        ArrayList<Long> result = new ArrayList<>();
        for (Employee employee : employeeGuide) {
            if (employee.name().equals(name)) result.add(employee.telephoneNumber());
        }
        return result;
    }


//    Добавить метод, который ищет сотрудника по табельному номеру

    public ArrayList<String> getTabelNum(Integer tabelNum, ArrayList<Employee> employeeGuide) {
        ArrayList<String> result = new ArrayList<>();
        for (Employee employee : employeeGuide) {
            if (employee.tabelNum().equals(tabelNum)) result.add(employee.name());
        }
        return result;
    }

//    Добавить метод добавление нового сотрудника в справочник

    public ArrayList<Employee> addEmployee(ArrayList<Employee> employeeArrayList) {
        System.out.println("Введите табельный номер: ");
        Integer tabelNum = sc.nextInt();
        System.out.println("Введите номер телефона: ");
        Long telephone = sc.nextLong();
        System.out.println("Введите имя: ");
        String name = sc.next();
        System.out.println("Введите стаж: ");
        Integer experience = sc.nextInt();
        employeeArrayList.add(new Employee(tabelNum, telephone, name, experience));
        return employeeArrayList;
    }
}
