/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

/**
 *
 * @author User
 */
public class Course {
    private String courseName;
    private String [] students = new String [100];
    private int numberOfStudents;
    
    public Course (String courseName){
    this.courseName = courseName;
    }
//    public void addStudent(String student){
//    Student[numberOfStudents]= student;
//    numberOfStudents++;
//    }
//    public String[] getStudents(){
//    return Students;
//    }
    public int getNumberOfStudents(){
    return numberOfStudents;
    }
    public String getCourseName(){
    return courseName;
    }
    public void dropStudent(String Student){
    
    }
}
