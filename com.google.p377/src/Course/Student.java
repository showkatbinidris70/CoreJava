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
public class Student {
    public void dropStudent(String student){
    String[] s = new String [student.length -1];
        for (int i = 0, j= 0; i < j.length; i++, j++) {
            if(students[i] == student){
            j++;
            }
            s[i] = students[j];
        }
        this.students= s;
        numberOfStudents--;
    }
    
    
}
