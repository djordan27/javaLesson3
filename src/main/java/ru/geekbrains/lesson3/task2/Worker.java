package ru.geekbrains.lesson3.task2;

public class Worker extends Employee {
    private int workDayPerMonth;
//    private double salaryPerDay;


    public Worker(String name, String surname, double salaryPerDay,int workDayPerMonth) {
        super(name, surname,salaryPerDay);
        this.workDayPerMonth = workDayPerMonth;
//        this.salaryPerDay = salaryPerDay;

    }

    @Override
    public double calculateSalary() {
        return salary * workDayPerMonth;
    }


    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, calculateSalary());
    }
}
