package ru.itsjava.statics;

public class StaticPractice {
    public static void main(String[] args) {
//        System.out.println("Salary.increaseCoefficient = " + Salary.increaseCoefficient);

//        Salary cleanerSalary = new Salary(5_000);
//        Salary targetSalary = new Salary(10_000);
//
//        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
//        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());
//
//        Salary.setincreaseCoefficient(1);
//
//        System.out.println("cleanerSalary.getFullSalary() = " + cleanerSalary.getFullSalary());
//        System.out.println("targetSalary.getFullSalary() = " + targetSalary.getFullSalary());
//
//        System.out.println("SALARY_CEO = " + Salary.SALARY_CEO);

        Car lada = new Car("Lada", "black", 600_000);
        Car audi = new Car("Audi", "red", 3_000_000);

        System.out.println("lada = " + lada);
        System.out.println("audi = " + audi);

    }


}
