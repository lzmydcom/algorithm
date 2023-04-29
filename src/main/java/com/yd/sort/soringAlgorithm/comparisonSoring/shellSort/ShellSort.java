package com.yd.sort.soringAlgorithm.comparisonSoring.shellSort;

import com.yd.sort.operation.CompareSort;

public class ShellSort<E> extends CompareSort<E> {
    @Override
    public E[] sort() {
        if (elements == null || elements.length == 0) throw new RuntimeException("数组不能为空！");
        for(int gap = elements.length / 2; gap > 0; gap /= 2) {
            for(int i = gap; i < elements.length; i++) {
                for(int j = i - gap; j >= 0; j -= gap) {
                    if(compare(elements[j], elements[j + gap]) > 0) {
                        E temp = elements[j];
                        elements[j] = elements[j + gap];
                        elements[j + gap] = temp;
                    }
                }
            }
        }
        return elements;
    }

}
