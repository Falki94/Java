/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

import date.Date;
import employee.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Falki
 */
public class PrintNameSalaryDate {

    private static int id;

    public static void main(String[] args) {
        PrintNameSalaryDate t = new PrintNameSalaryDate();

        List<Assistant> list = new ArrayList<>();

        t.prepareData(list, "Marcin", "Zyla", 1500, 3, 11, 1994);
        t.prepareData(list, "Osiek", "Zyla", 4500, 3, 11, 1993);
        t.prepareData(list, "Andrzej", "Frankowski", 2500, 3, 10, 1995);
        t.prepareData(list, "Tomek", "Jackowy", 2500, 1, 1, 1996);
        t.prepareData(list, "Ola", "Olle", 5500, 3, 11, 1997);
        t.prepareData(list, "Aleksandra", "Jakas", 500, 3, 11, 1952);
        t.prepareData(list, "Pawel", "Czapiewski", 10000, 13, 12, 2000);
        t.prepareData(list, "Marcin", "Byla", 2000, 3, 11, 1994);
// Zbierznosc imion i nazwisk jest przypadkowa :D

        for (Assistant x : list) {
            System.out.println(x.getEmployee().getName() + " " + x.getEmployee().getSalary() + " " + x.getDateOfJoining().toString());
        }
    }

    private class Assistant {

        private Employee employee;
        private Date dateOfJoining;

        public Assistant(Employee employee, Date dateOfJoining) {
            this.employee = employee;
            this.dateOfJoining = dateOfJoining;
        }

        public Employee getEmployee() {
            return employee;
        }

        public void setEmployee(Employee employee) {
            this.employee = employee;
        }

        public Date getDateOfJoining() {
            return dateOfJoining;
        }

        public void setDateOfJoining(Date dateOfJoining) {
            this.dateOfJoining = dateOfJoining;
        }
    }

    private void prepareData(List<Assistant> list, String name, String surname, int salary, int day, int month, int year) {
        Employee e = new Employee(++id, name, surname, salary);
        Date d = new Date(day, month, year);
        Assistant a = new Assistant(e, d);
        list.add(a);
    }
}
