/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricobject.page510;

import geometricobject.Rectangle;

/**
 *
 * @author User
 */
public class SortRectangles {
    public static void main(String[] args) {
        ComparableRectangel[] rectangles={
        new ComparableRectangel(3.4, 5.4),
        new ComparableRectangel(13.24, 55.4),
        new ComparableRectangel(7.4, 35.4),
        new ComparableRectangel(1.4, 25.4)
        };
        for(Rectangle rectangle : rectangles){
            System.out.println(rectangle + " ");
            System.out.println();
        }
    }
}
