package com.company;
import java.util.*;

public class col_1 {
    public static <C> Collection<C> removeDuplicates(Collection<C> collection) {
        return new HashSet<>(collection);
    }

}
