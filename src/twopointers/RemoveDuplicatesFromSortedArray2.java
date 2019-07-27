package twopointers;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatesFromSortedArray2().
                removeDuplicates(new ArrayList<Integer>(Arrays.asList(500,500,500))));
    }
    public int removeDuplicates(ArrayList<Integer> a) {
        int size= a.size();
        if(size<=2) return size;

        for(int i=size-3;i>=0;i--){
            if((a.get(i)-a.get(i+1))==0 && (a.get(i)-a.get(i+2))==0) a.remove(i);

        }
        return a.size();
    }
}
