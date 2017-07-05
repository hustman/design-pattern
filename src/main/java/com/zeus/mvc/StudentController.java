package com.zeus.mvc;

/**
 * @author xuxingbo
 * @Date 2017/7/4
 */
public class StudentController {
    private Student model;

    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentName(String studentName) {
        model.setName(studentName);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void setStudentRollNo(String studentRollNo) {
        model.setRollNo(studentRollNo);
    }

    public void updateView(){
        view.printStudentDetails(model);
    }
}
