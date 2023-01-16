package ru.itsjava.exception;

public class ExceptionPractice {

    public static void main(String[] args) {

//        throw new RuntimeException("My runtime exception");

//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("!!! Exception! BE CAREFUL !!!");
////            throw new RuntimeException(e);
//        }

//        try {
//            System.out.println("Begin!");
////            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("Catch!");
////            throw new RuntimeException(e);
//        } finally {
//            System.out.println("Finally!");
//        }
//
//        System.out.println("End!");

//        try {
//            throw new RuntimeException();
//        } catch (RuntimeException runtimeException){
//            System.out.println("Runtime exception");
//        } catch (Throwable throwable) {
//            System.out.println("Throwable");
//        }

        Calculator calculator = new Calculator();
        System.out.println("calculator.division(5,3) = " + calculator.division(5, 3));

        try{
            System.out.println("calculator.division(5,0) = " + calculator.division(5, 0));
        } catch (CalculatorException ce) {
            System.out.println("На ноль делить нельзя!");
            ce.printStackTrace();
        }
    }



}
