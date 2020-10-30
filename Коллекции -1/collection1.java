package com.company;
import java.util.*;
//удаление повторных элементов в коллекции
public class collection1 {

    public static <T> Collection<T> removeDuplicates (Collection<T> coll){
        return new HashSet<>(coll);
    }

}
