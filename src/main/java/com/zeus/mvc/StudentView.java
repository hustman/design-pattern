package com.zeus.mvc;

/**
 * @author xuxingbo
 * @Date 2017/7/4
 */
public class StudentView {
    public void printStudentDetails(Student student){
        System.out.println("Student: ");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
    }
}
