package com.company;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class Z3Z4 implements Iterator<String> {

    String str;
    Stack<Iterator> iteratorST;
    boolean hasNext;

    public Z3Z4(Iterator<?> iterators, String str){

        this.iteratorST =  new Stack<Iterator>();
        iteratorST.push(iterators);
        updateNext();
    }

    @Override
    public boolean hasNext() {
        return  hasNext;
    }

    public void updateNext(){
        if(iteratorST.empty()){
            str = null;
            hasNext = false;
        }
        Iterator current = iteratorST.peek();

        if (current.hasNext()){
            Object o = current.next();
            if (o instanceof String) {
                str = (String) o;
                hasNext = true;
            } else if (o instanceof Iterator){
                Iterator iterator = (Iterator) o;
                iteratorST.push(iterator);
                updateNext();
            }else{
                iteratorST.pop();
                updateNext();
            }

        }
    }


    @Override
    public String next() throws NoSuchElementException {
         if(!hasNext()){
             throw  new NoSuchElementException();

         }

         String nextt = str;
         updateNext();
         return nextt;

    }
    @Override
    public  void  remove(){
        throw new UnsupportedOperationException();
    }

}
