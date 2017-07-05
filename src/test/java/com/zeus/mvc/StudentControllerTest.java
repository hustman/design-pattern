package com.zeus.mvc;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class StudentControllerTest {

    @Test
    public void mvcPatternTest(){
        Student model = retriveStudentFromDataBase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model,view);

        controller.updateView();

        controller.setStudentName("John");

        controller.updateView();


    }

    private static Student retriveStudentFromDataBase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }

}