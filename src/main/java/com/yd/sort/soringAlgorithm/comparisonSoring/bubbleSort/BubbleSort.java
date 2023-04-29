package com.yd.sort.soringAlgorithm.comparisonSoring.bubbleSort;

import com.yd.sort.operation.CompareSort;

public class BubbleSort<E> extends CompareSort<E> {
    @Override
    public E[] sort() {
        if (elements == null || elements.length == 0) throw new RuntimeException("数组不能为空！");
        //优化参数，加参数与不加参数
        int sortedIndex;
        //比较次数
        int count = 0;
        //交换次数
        int swapCount = 0;
        for (int i = elements.length - 2; i >= 0; i --) {
            sortedIndex = 0;
            for (int j = 0; j <= i; j ++){
                count ++;
                if (compare(elements[j], elements[j + 1]) > 0){
                    swapCount ++;
                    swap(j, j +1);
                    sortedIndex = j;
                }
            }
            i = sortedIndex;
        }
        System.out.println("比较次数：" + count + "次");
        System.out.println("交换次数：" + swapCount + "次");
        return elements;
    }
}
