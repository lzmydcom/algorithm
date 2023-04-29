package com.yd.sort.soringAlgorithm.comparisonSoring.quickSort;

import com.yd.sort.operation.CompareSort;

import java.util.Comparator;

public class QuickSort<E> extends CompareSort<E> {
    public QuickSort() {
    }

    public QuickSort(Comparator<E> comparator) {
        super(comparator);
    }
    private void sort(E[] arr, int Left, int Right) {
        int left = Left;
        int right = Right;
        E index = arr[(Left + Right) / 2];
        E temp;
        while (true) {
            while (compare(arr[Right], index) > 0) {
                Right--;
            }
            while (compare(arr[Left], index) < 0) {
                Left++;
            }
            if (Right == Left) {
                Right--;
                Left++;
            }
            if (Right > Left) {
                temp = arr[Left];
                arr[Left] = arr[Right];
                arr[Right] = temp;
                Left++;
                Right--;
            } else {
                if (Right > left) {
                    sort(arr, left, Right);
                }
                if (Left < right) {
                    sort(arr, Left, right);
                }
                break;
            }
        }
    }

    @Override
    public E[] sort() {
        if (elements == null || elements.length == 0) throw new RuntimeException("数组不能为空！");
        sort(elements, 0, elements.length - 1);
        return elements;
    }
}