package com.yd.sort.operation;

public interface Sort<E>{
    /**
     * @param elements 给一个数组，将里面的数据进行排序并返回
     */
    E[] sort(E[] elements);

    E[] sort();
}
