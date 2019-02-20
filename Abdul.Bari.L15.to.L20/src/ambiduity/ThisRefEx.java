/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ambiduity;

/**
 *
 * @author User
 */
public class ThisRefEx {

    int x;
    String y;

    public ThisRefEx(int x, String y) {
        this.x = x;
        this.y = y;
    }

    void sum(int x, int y) {
        System.out.println(x + y);
    }

    void doYYY(String[] args) {
        RecRef recref = new RecRef();
        recref.doXX(this);
        recref.doMM(x);
    }

}

class RecRef {

    void doXX(ThisRefEx rr) {
        rr.sum(5, 6);
    }

    void doMM(int s) {

    }
}
