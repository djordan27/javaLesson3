package ru.geekbrains.lesson3.task2;

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания.
 *  *20*8
 */

public class Freelancer extends Employee{
//    private double salaryPerHour;
    private double workHour;

    public Freelancer(String name, String surname, double salaryPerHour,double workHour) {
        super(name, surname, salaryPerHour);
//        this.salaryPerHour = salaryPerHour;
        this.workHour = workHour;
    }

    @Override
    public double calculateSalary() {
        return salary * workHour;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата : %.2f (руб.)",
                surname, name, calculateSalary());
    }
}
