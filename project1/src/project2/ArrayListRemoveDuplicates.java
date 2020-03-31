package project2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveDuplicates {

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();
        for(int i = 0; i < list.size(); ++i) {
            if(!newList.contains(list.get(i))) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }
    }
