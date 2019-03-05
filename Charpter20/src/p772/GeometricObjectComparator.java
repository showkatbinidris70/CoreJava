/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p772;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author User
 */
public class GeometricObjectComparator implements Comparator<GeometricObject>, Serializable {

    @Override
    public int compare(GeometricObject o1, GeometricObject o2) {
        double area1 = o1.getArea();
        double area2 = o2.getArea();
        if (area1 < area2) {
            return -1;
        } else if (area1 == area2) {
            return 0;
        } else {
            return 1;
        }
    }

}

/*
public int compare(GeometricObject o1, GeometricObject o2){
double area1 = o1.getArea();
double area2 = o2.getArea();
if(area1 < area2)
    return -1;
else if(area1 == area2)
    return 0;
else
    return 1;
}
 */
