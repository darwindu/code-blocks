package org.code.blocks.designpattern.j2ee.mvc;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public class StudentView {

    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
