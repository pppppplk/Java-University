package com.company;
import java.util.Iterator;

public class Z1  implements Iterator<Integer>{

    Integer[][] num;
    int i, j;

    public Z1(Integer[][] num){
        this.num = num;

    }


    @Override
    public boolean hasNext() {
        return  i < num.length && j < num[i].length;
    }

    @Override
    public Integer next() {
        Integer r = num[i][j++];
        if (j >= num[i].length){
            i++;
            j = 0;
        }
        return r;
    }
}
