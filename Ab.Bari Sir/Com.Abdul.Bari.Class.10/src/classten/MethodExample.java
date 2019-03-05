/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classten;

/**
 *
 * @author User
 */
public class MethodExample {
    int x,y;
    double d;
    String s;
   static int dispSum(int x, int y){
    return x+y;
    }
    void setX(int x,int y){
    this.x=x;
    this.y=y;
    }
    public static void main(String[] args) {
       MethodExample m = new MethodExample();
       m.setX(50,60);
       int sum = m.dispSum(4, 5);
        System.out.println(sum);
    }

   

   
}
