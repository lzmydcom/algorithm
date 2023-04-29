package com.yd.sort.soringAlgorithm.nonComparativeSorting.radixSort;

import com.yd.sort.operation.AbstractSort;
import com.yd.sort.operation.ElementValue;
import com.yd.sort.operation.Sort;

import java.util.Arrays;

@SuppressWarnings("all")
public class RadixSort<E> extends AbstractSort<E> {
    private static final int index = 0b1111;

    private static boolean NEGATIVE_FLAG = false;

    private final int[] counts = new int[16];

    @Override
    public E[] sort() {
        if (elements == null || elements.length == 0) throw new IllegalArgumentException("传入数组不能为空！");
        E[] newElements = (E[]) new Object[elements.length];
        int max = ((ElementValue) elements[0]).getValue();
        //获取最大值
        for (E e : elements) {
            int value = ((ElementValue) e).getValue();
            if (value > max) max = value;
        }
        //根据最大值获取最大位数的范围
        int position = 0;
        int medianValue = max;
        while (medianValue != 0) {
            medianValue = medianValue >> 4;
            position++;
        }
        // 先采用十六进制数中的”位数“排序
        for (int i = 0; i < position; i++) {
            for (E element : elements) {
                int value = ((ElementValue) element).getValue() >> (4 * i);
                counts[value & index]++;
            }
            int countSum = 0;
            for (int j = 0; j < counts.length; j++) {
                counts[j] = countSum + counts[j];
                countSum = counts[j];
            }
            for (int k = elements.length - 1; k >= 0; k--) {
                int value = ((ElementValue) elements[k]).getValue() >> (4 * i);
                newElements[--counts[value & index]] = elements[k];
            }
            E[] temp = elements;
            elements = newElements;
            newElements = temp;
            Arrays.fill(counts, 0);
        }
        return elements;
    }
}
