package com.stesh;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        myNumbers.add(2305);
        myNumbers.add(765);
        myNumbers.add(453);
        myNumbers.add(3456);

        for (int i=0;i<myNumbers.size();i++) {
            System.out.println("The value at index: "+i+" is : "+myNumbers.get(i));
        }
    }
}
