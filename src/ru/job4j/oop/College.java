package ru.job4j.oop;

/**
 * 3.1. Приведение типов. Повышение типа и понижение типа.[#257542]
 */
public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student st = freshman;
        Object object = st;

        Object object1 = new Object();
        Student student = (Student) object1;
        Freshman freshman1 = (Freshman) student;
    }
}
