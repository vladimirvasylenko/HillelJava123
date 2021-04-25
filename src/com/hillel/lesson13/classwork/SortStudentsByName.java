package com.hillel.lesson13.classwork;

import java.util.Comparator;

public class SortStudentsByName implements Comparator<Student> {

    @Override
    public int compare(Student student_1, Student student_2) {
        return student_1.getName().compareTo(student_2.getName());
    }
}
