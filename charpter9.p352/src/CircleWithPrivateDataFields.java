/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CircleWithPrivateDataFields {
    
    double radius;
    CircleWithPrivateDataFields(double x){
    radius = x;
    }
    public double getArea(){
    return Math.pow(radius,2) * 3.1415926;
    }
    public double getRadius(){
    return radius;
    }
    
}
