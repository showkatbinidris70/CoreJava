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
public class ComparableRectangel extends Rectangle implements Comparable<ComparableRectangel> {

    @Override
    public int compareTo(ComparableRectangel o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.
                getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public ComparableRectangel(double width, double height) {
        super(width, height);
    }

    @Override
    public String toString() {
        return super.toString() + "Area: " + getArea();
    }

}
