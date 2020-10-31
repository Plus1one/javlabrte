package com.company;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        LinkedList<Integer> link = new LinkedList<Integer>();
        Methods Obj1 = new Methods();
        Obj1.displayInfo(array, link);
    }
}
