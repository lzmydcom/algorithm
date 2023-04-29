package com.yd.sort.soringAlgorithm.comparisonSoring.insertionSort;

import com.yd.sort.operation.CompareSort;

public class InsertionSort<E> extends CompareSort<E> {

    @Override
    public E[] sort() {
        if (elements == null || elements.length == 0) throw new RuntimeException("数组不能为空！");
        for (int i = 1; i < elements.length; i++) {
            for (int j = i; j > 0; j--) {
                if (compare(elements[j], elements[j - 1]) < 0) swap(j, j - 1);
                else break;
            }
        }
        return elements;
    }
    //能通过二分查找优化
}
