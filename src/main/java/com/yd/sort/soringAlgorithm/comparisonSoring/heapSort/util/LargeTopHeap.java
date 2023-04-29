package com.yd.sort.soringAlgorithm.comparisonSoring.heapSort.util;

import java.util.Comparator;

@SuppressWarnings("all")
public class LargeTopHeap<E> extends AbstractBinaryHeap<E> {

    public LargeTopHeap() {
        super();
    }

    public LargeTopHeap(Comparator<E> comparator) {
        super(comparator);
    }

    @Override
    protected void siftDown(int index) {
        E element = elements[index];
        int leftIndex = (index << 1) + 1;
        int rightIndex = leftIndex + 1;
        //一定有左子节点
        while (leftIndex < size) {
            E elementL = elements[leftIndex];
            //有右子节点
            if (rightIndex < size) {
                E elementR = elements[rightIndex];
                if (compare(elementL, elementR) > 0) {
                    if (compare(element, elementL) < 0){
                        elements[index] = elementL;
                        index = leftIndex;
                    }else {
                        break;
                    }
                }else {
                    if (compare(element, elementR) < 0){
                        elements[index] = elementR;
                        index = rightIndex;
                    }else {
                        break;
                    }
                }
            } else{
                if (compare(element, elementL) < 0){
                    elements[index] = elementL;
                    index = leftIndex;
                }else {
                    break;
                }
            }
            leftIndex = (index << 1) + 1;
            rightIndex = leftIndex + 1;
        }
        elements[index] = element;
    }

    @Override
    protected void siftUp(int index) {
        E element = elements[index];
        while (index > 0){
            int parentIndex = (index - 1) >> 1;
            int newIndex = index;
            int cmp = compare(element, elements[parentIndex]);
            if (cmp > 0){
                elements[newIndex] = elements[parentIndex];
                index = (index - 1) >> 1;
            }else {
                break;
            }
        }
        elements[index] = element;
    }

}
