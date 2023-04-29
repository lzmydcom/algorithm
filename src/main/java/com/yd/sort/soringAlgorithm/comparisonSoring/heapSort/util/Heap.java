package com.yd.sort.soringAlgorithm.comparisonSoring.heapSort.util;

public interface Heap<E> {
    int size();
    boolean isEmpty();
    void clear();
    void add(E element);
    E get();
    E remove();
    E replace(E element);
    void heapify(E[] elements);
}
