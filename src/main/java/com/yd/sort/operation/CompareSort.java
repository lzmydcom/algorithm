package com.yd.sort.operation;

import java.util.Comparator;

@SuppressWarnings("all")
public abstract class CompareSort<E> extends AbstractSort<E>{
    protected Comparator<E> comparator;

    public CompareSort() {
    }
    public CompareSort(Comparator<E> comparator) {
        this.comparator = comparator;
    }

    protected int compare(E e1, E e2){
        return comparator == null ? ((Comparable<E>)e1).compareTo(e2) : comparator.compare(e1, e2);
    }

    protected void swap(int a, int b){
        E temp = elements[a];
        elements[a] = elements[b];
        elements[b] = temp;
    }
}