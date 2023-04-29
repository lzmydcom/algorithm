package com.yd.sort.soringAlgorithm.comparisonSoring.mergeSort;

import com.yd.sort.operation.CompareSort;

import java.util.Comparator;

@SuppressWarnings("all")
public class MergeSort<E> extends CompareSort<E> {

    private E[] leftArray;

    public MergeSort() {
    }

    public MergeSort(Comparator<E> comparator) {
        super(comparator);
    }


    @Override
    public E[] sort() {
        if (elements == null || elements.length == 0) throw new RuntimeException("数组不能为空！");
        this.leftArray = (E[]) new Object[elements.length >> 1];
        sort(0, elements.length);
        return elements;
    }

    private void sort(int begin, int end){
        if (end - begin < 2) return;
        int middle = (begin + end) >> 1;
        sort(begin, middle);
        sort(middle, end);
        merge(begin, middle, end);
    }

    private void merge(int begin, int middle, int end) {
        int li = 0, le = middle - begin;
        int ri = middle, re = end;
        int ai = begin;
        for (int i = li; i < le; i++){
            leftArray[i] = elements[begin + i];
        }
        while (li < le) {
            if (ri < re && compare(elements[ri], leftArray[li]) < 0){
                elements[ai++] = elements[ri++];
            }else {
                elements[ai++] = leftArray[li++];
            }
        }
    }

}
