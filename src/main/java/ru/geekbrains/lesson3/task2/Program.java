package ru.geekbrains.lesson3.task2;

import java.util.*;


public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(){
        int count = random.nextInt(0,3);
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salaryPerHour = random.nextInt(100, 5000);
        int salaryPerDay = random.nextInt(3000, 8000);
        int salaryPerMonth = random.nextInt(20000, 80000);
        if (count == 0) {
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salaryPerDay, random.nextInt(1, 27));
        } else if (count == 1)
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salaryPerHour, random.nextInt(1, 181));
        else {
            return new Itr(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salaryPerMonth);

        }
    }



    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *  Придумать несколько Comparator'ов для сортировки сотрудников
     *  по фамилии + имени или по возрасту и уровню ЗП.
     * @param args
     */
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            employees.add(generateEmployee());
        }
        Collections.sort(employees,
                new SortBySurnameName());

//        Collections.sort(employees, new SortBySurnameName());

//        Arrays.sort(employees); // new SalaryComparator()
        for(Employee employee : employees){
            System.out.println(employee);
        }
        Collections.sort(employees, new SortByJobAndMoney());
        System.out.println("##############################################################");
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }

}
