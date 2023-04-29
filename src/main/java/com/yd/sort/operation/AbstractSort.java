package com.yd.sort.operation;

public abstract class AbstractSort<E> implements Sort<E>{

    protected E[] elements;

    @Override
    public E[] sort(E[] elements) {
        this.elements = elements;
        return sort();
    }

    public void setElements(E[] elements) {
        this.elements = elements;
    }

    public E[] getElements() {
        return elements;
    }
}
