package project2;

import java.util.ArrayList;
import java.util.Arrays;

public class Project8 {

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>();
        for(int i = 0; i < list.size(); ++i) {
            if(!newList.contains(list.get(i))) {
               newList.add(list.get(i));
            }
        }
        return newList;
    }
	public static void main(String[] args)
	{
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(14, 24, 14, 42, 25, 35, 46, 42));
        System.out.println("Original list " + numbers);
        System.out.println("nodup list " + removeDuplicates(numbers));

        ArrayList<String> strings = new ArrayList<String>(Arrays.asList("Bob", "Mary", "Tony", "Nick", "Adam", "Bob", "Nick"));
        System.out.println("\nOriginal list " + strings);
        System.out.println("nodup list " + removeDuplicates(strings));
        
        ArrayList<Double> number = new ArrayList<Double>(Arrays.asList(5.0, 6.0, 5.0, 7.5, 8.9, 9.2, 6.0));
        System.out.println("\nOriginal list " + number);
        System.out.println("nodup list " + removeDuplicates(number));
    }
}