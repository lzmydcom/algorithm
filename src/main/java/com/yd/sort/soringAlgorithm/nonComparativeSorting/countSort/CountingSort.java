package com.yd.sort.soringAlgorithm.nonComparativeSorting.countSort;

import com.yd.sort.operation.AbstractSort;
import com.yd.sort.operation.ElementValue;

import java.util.Arrays;

@SuppressWarnings("all")
public class CountingSort<E> extends AbstractSort<E> {
    private int min;

    private int max;

    @Override
    public E[] sort() {
        if (elements == null || elements.length == 0) throw new RuntimeException("数组不能为空！");
        max = ((ElementValue)elements[0]).getValue();
        min = max;
        //找最大值
        for (int i = 0; i < elements.length; i++){
            int value = ((ElementValue) elements[i]).getValue();
            if (value > max) {
                max = value;
            }
        }
        //找最小值
        for (int i = 0; i < elements.length; i++){
            int value = ((ElementValue) elements[i]).getValue();
            if (value < min) {
                min = value;
            }
        }
        //开辟空间
        int len = max - min + 1;
        int[] counts = new int[len];
        E[] newElements = (E[]) new Object[elements.length];
        //初始化
        Arrays.fill(counts, 0);
        //统计每个元素出现的次数
        for (E element : elements){
            counts[((ElementValue)element).getValue() - min]++;
        }
        //每个元素出现次数累加并赋值给counts数组中的元素
        int countSum = 0;
        for (int i = 0; i < len; i++) {
            counts[i] = counts[i] + countSum;
            countSum = counts[i];
        }
        int realIndex;
        for (int i = elements.length - 1; i >= 0; i--) {
            realIndex = --counts[((ElementValue)elements[i]).getValue() - min];
            newElements[realIndex] = elements[i];
        }
        return newElements;
    }
}
