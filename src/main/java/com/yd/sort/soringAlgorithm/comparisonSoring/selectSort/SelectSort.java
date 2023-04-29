package com.yd.sort.soringAlgorithm.comparisonSoring.selectSort;

import com.yd.sort.operation.CompareSort;

public class SelectSort<E> extends CompareSort<E> {
    @Override
    public E[] sort() {
        if (elements == null || elements.length == 0) throw new RuntimeException("数组不能为空！");
        int maxIndex;
        E temp;
        for (int len = elements.length; len > 0 ; len--){
            maxIndex = 0;
            for (int index = 1; index < len; index++) {
                if ( compare(elements[maxIndex], elements[index]) < 0) {
                    maxIndex = index;
                }
            }
            temp = elements[len - 1];
            elements[len - 1] = elements[maxIndex];
            elements[maxIndex] = temp;
        }
        return elements;
    }

}
