/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p331;

/**
 *
 * @author User
 */
public class Student {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIsScienceMajor(boolean isScienceMajor) {
        this.isScienceMajor = isScienceMajor;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    int age;
    boolean isScienceMajor;
    char gender;
    
   
        public static void main(String[] args) {
            Student student = new Student();
            System.out.println("name ? " + student.name);
            System.out.println("age? " + student.age);
            System.out.println("isScienceMajor? " + student.isScienceMajor);
            System.out.println("gender?" + student.gender);
        }
      
        }
    
    

