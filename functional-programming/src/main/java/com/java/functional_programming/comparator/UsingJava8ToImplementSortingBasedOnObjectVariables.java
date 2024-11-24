package com.java.functional_programming.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student{
    double grades;
    String name;

    double getGrades(){
        return this.grades;
    }

    String getName(){
        return this.name;
    }

    Student(String name, double grades){
        this.grades = grades;
        this.name = name;
    }
}

class MyComparatorForStudent implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {


        return Double.compare(s2.grades, s1.grades);
    }
}
public class UsingJava8ToImplementSortingBasedOnObjectVariables {

    public static void main(String[] args) {

        Student s1 = new Student("Siddharth", 8.9);
        Student s2 = new Student("Priya", 9.2);
        Student s3 = new Student("Vikram", 8.5);
        Student s4 = new Student("Rahul", 9.1);

        List< Student> studentsList = Arrays.asList(s1,s2,s3,s4);
        Comparator<Student> comparator = Comparator.comparing(Student::getGrades).reversed().thenComparing(Student::getName);

        studentsList.sort(comparator);

       for(Student student : studentsList){
           System.out.println("Name: "+student.getName() + "Grade: "+student.getGrades());
       }


    }
}
