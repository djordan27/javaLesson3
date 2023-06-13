package ru.geekbrains.lesson3.task2;

public class Itr extends Employee {
    private double salaryPerMonth;


    @Override
    public double getSalary() {
        return super.getSalary();
    }

    public Itr(String name, String surname, double salaryPerMonth) {
        super(name, surname, salaryPerMonth);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

//    @Override
//    public int compareTo(Employee o) {
//        return super.compareTo(o);
//    }

    public String toString() {
        return String.format("%s %s; ИТР; Среднемесячная заработная плата : %.2f (руб.)",
                surname, name, calculateSalary());
    }
}