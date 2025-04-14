package org.example;
import java.util.*;

public class ListZipper {
    public static <T> List<T> zip(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int minSize = Math.min(size1, size2);
        for (int i = 0; i < minSize; i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));
        }
        if (size1 > minSize) {
            result.addAll(list1.subList(minSize, size1));
        }
        if (size2 > minSize) {
            result.addAll(list2.subList(minSize, size2));
        }
        return result;
    }
}
