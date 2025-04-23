package ru.gar24s8;

import ru.gar24s8.model.Student;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("john", 4.5),
                new Student("ellie", 2.3),
                new Student("bob", 3.7),
                new Student("victor", 1.4),
                new Student("dan", 5.0)
        );

        List<Student> goodStudents = students.stream()
                .filter(s -> s.getGrade() > 3)
                .toList();

        double averageGrade = students.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);

        System.out.println(goodStudents);
        System.out.println(averageGrade);
    }
}