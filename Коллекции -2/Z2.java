package com.company;

import java.util.Iterator;

public class Z2<E> implements Iterator<E> {

    Iterator<E> iterat1;
    Iterator<E> iterat2;

    public Z2(Iterator<E> iterat1,Iterator<E> iterat2 ){
        this.iterat1 = iterat1;
        this.iterat2 = iterat2;

    }


    @Override
    public boolean hasNext() {
        while(iterat1.hasNext() && iterat2.hasNext()){
            return true;
        }
        return  false;
    }

    @Override
    public E next() {
        while(iterat1.hasNext()) {
            return iterat1.next();
        }
        while (iterat2.hasNext()){
            return iterat2.next();
        }
        return null;
    }
}
