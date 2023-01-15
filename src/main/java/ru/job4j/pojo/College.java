package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan");
        student.setStudentGroup("Faculty of Philosophy");
        student.setDateOfEnter("2015");
        System.out.println(student.getFullName() + " entered College in the "
                + student.getDateOfEnter() + " at the " + student.getStudentGroup() + ".");
    }
}
