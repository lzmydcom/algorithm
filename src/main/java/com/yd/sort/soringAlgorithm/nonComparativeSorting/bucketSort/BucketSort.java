package com.yd.sort.soringAlgorithm.nonComparativeSorting.bucketSort;

import com.yd.sort.operation.AbstractSort;
import com.yd.sort.operation.ElementValue;

import java.util.Iterator;
import java.util.LinkedList;

@SuppressWarnings("all")
public class BucketSort<E> extends AbstractSort<E> {
    private Object[] lists;

    @Override
    public E[] sort() {
        if (elements == null || elements.length == 0) throw new IllegalArgumentException("elements must not be empty");
        if (lists == null) lists = new Object[elements.length];
        int value;
        int index;
        LinkedList<E> list;

        //取得最大值
        int max = ((ElementValue)elements[0]).getValue();
        for (E e : elements){
            value = ((ElementValue) e).getValue();
            if (value > max) max = value;
        }
        //将元素放到各自的桶中
        for (E e : elements){
            value = ((ElementValue) e).getValue();
            index = (value * elements.length) / (max + 1);
            //如果该位置没有桶存在，就创建一个桶
            if (lists[index] == null) {
                lists[index] = new LinkedList<>();
            }
            list = (LinkedList<E>)lists[index];
            //桶中元素为空，直接放到桶中
            if (list.isEmpty()){
                list.addFirst(e);
            }else{
                //桶中元素不为空，进行比较，大的元素放后面，小于等于的元素放前面
                Iterator<E> iterator = list.iterator();
                index = 0;
                while (iterator.hasNext()){
                    E next = iterator.next();
                    int nodeValue = ((ElementValue) next).getValue();
                    if (value >= nodeValue) index++;
                    else break;
                }
                //放置元素
                list.add(index, e);
            }
        }
        //将桶中的元素按照从左至右，从前到后依次取出，按顺序放到原数组中去，并将桶清空
        index = 0;
        for (int i = 0; i < elements.length; i++) {
            list = (LinkedList<E>) lists[i];
            if (list != null && !list.isEmpty()) {
                Iterator<E> iterator = list.iterator();
                while (iterator.hasNext()){
                    elements[index++] = list.removeFirst();
                }
            }
        }
        //返回排序后的数组
        return elements;
    }
}
