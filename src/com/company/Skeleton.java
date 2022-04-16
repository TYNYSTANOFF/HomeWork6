package com.company;

import jdk.dynalink.beans.StaticClass;

public class Skeleton extends Boss {
    private int arrowSum;

    public int getArrowSum() {
        return arrowSum;
    }

    public void setArrowSum(int arrowSum) {
        this.arrowSum = arrowSum;
    }

    public String printInfo(){
        return super.printInfo() + "; Arrows: " + arrowSum;
    }
}
