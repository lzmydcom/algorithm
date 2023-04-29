package com.yd.sort.soringAlgorithm.comparisonSoring.heapSort;

import com.yd.sort.operation.CompareSort;
import com.yd.sort.soringAlgorithm.comparisonSoring.heapSort.util.LargeTopHeap;

import java.util.Comparator;

public class HeapSort<E> extends CompareSort<E> {

    public HeapSort() {
    }

    public HeapSort(Comparator<E> comparator) {
        super(comparator);
    }
    private final LargeTopHeap<E> topHeap = new LargeTopHeap<>(comparator);

    /**
     * 将数据进行排序并返回
     * @return 是选择排序的优化，能达到 O(nlog(n)) 的复杂度
     */

    @Override
    public E[] sort() {
        if (elements == null || elements.length == 0) throw new RuntimeException("数组不能为空！");
        topHeap.heapify(elements);
        while (!topHeap.isEmpty()){
            E top = topHeap.remove();
            elements[topHeap.size()] =  top;
        }
        return elements;
    }

}
