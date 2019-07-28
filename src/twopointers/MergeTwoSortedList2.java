package twopointers;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedList2 {
    public static void main(String[] args) {
        new MergeTwoSortedList2().merge(new ArrayList<>(Arrays.asList(1,5,8)),
                new ArrayList<>(Arrays.asList(6,9)));
    }

    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0, j = 0;
        while(i < a.size() && j < b.size()){
            if(a.get(i) > b.get(j)){
                a.add(i,b.get(j));
                b.remove(j);
            }
            i++;
        }
        a.addAll(b);
        System.out.println(a);
    }
}
