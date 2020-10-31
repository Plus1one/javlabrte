package com.company;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class Methods {
    public static long start;
    public static long finish;
    public static long difference;

    /**
     * @param array эррейлист
     * @param link линкдлист
     * добавляем элемент 2000 раз используя ф-цию нанотайм()
     * засекаем время перед добавлением и после. вычитаем первое значение из последнего
     */
    public void add(ArrayList<Integer> array, LinkedList<Integer> link)
    {
        start = System.nanoTime();
        for (int i = 0; i<2000; i++)
        {
            array.add(i);
        }
        finish = System.nanoTime();
        difference = (finish-start);
        System.out.println("ArrayList(add): "+ difference);

        start = System.nanoTime();
        for (int i = 0; i<2000; i++)
        {
            link.add(i);
        }
        finish = System.nanoTime();
        difference = (finish-start);
        System.out.println("LinkedList(add): "+ difference);
    }
    /**
     * @param array эррейлист
     * @param link линкдлист
     * получаем элемент 2000 раз используя ф-цию нанотайм()
     * засекаем время перед добавлением и после. вычитаем первое значение из последнего
     */
    public void get(ArrayList<Integer> array, LinkedList<Integer> link)
    {
        start = System.nanoTime();
        for (int i = 0; i<2000; i++)
        {
            array.get(i);
        }
        finish = System.nanoTime();
        difference = (finish-start);
        System.out.println("ArrayList(get): "+ difference);

        start = System.nanoTime();
        for (int i = 0; i<2000; i++)
        {
            link.get(i);
        }
        finish = System.nanoTime();
        difference = (finish-start);
        System.out.println("LinkedList(get): "+ difference);
    }
    /**
     * @param array эррейлист
     * @param link линкдлист
     * удаляем элемент 2000 раз используя ф-цию нанотайм()
     * засекаем время перед добавлением и после. вычитаем первое значение из последнего
     */
    public void delete(ArrayList<Integer> array, LinkedList<Integer> link)
    {
        start = System.nanoTime();
        for (int i = 0; i<2000; i++)
        {
            array.remove(0);
        }
        finish = System.nanoTime();
        difference = (finish-start);
        System.out.println("ArrayList(del): "+ difference);

        start = System.nanoTime();
        for (int i = 0; i<2000; i++)
        {
            link.remove(0);
        }
        finish = System.nanoTime();
        difference = (finish-start);
        System.out.println("LinkedList(del): "+ difference);
    }
    /**
     * @param array эррейлист
     * @param link линкдлист
     * вызывает все вышеперечисленные методы
     */
    public void displayInfo(ArrayList<Integer> array, LinkedList<Integer> link)
    {
        add(array, link);
        get(array, link);
        delete(array, link);
    }

}
