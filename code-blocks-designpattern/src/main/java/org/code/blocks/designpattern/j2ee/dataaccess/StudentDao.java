package org.code.blocks.designpattern.j2ee.dataaccess;

import java.util.List;

/**
 * @author darwindu
 * @date 2019/12/11
 **/
public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudent(int rollNo);
    void updateStudent(Student student);
    void deleteStudent(Student student);

}
