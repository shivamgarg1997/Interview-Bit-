package twopointers;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatesFromSortedArray().
                removeDuplicates(new ArrayList<Integer>(Arrays.asList(500,500,500))));
    }

    public int removeDuplicates(ArrayList<Integer> a) {
        int size = a.size();
        for(int i = size-1,j = size-2; j>=0; i--,j--){
            if(a.get(i).equals(a.get(j))){
                a.remove(j);
            }
        }
        System.out.println(a);
        return a.size();
    }
}
