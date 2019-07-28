package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        System.out.println(new RemoveElementFromArray().removeElement(
                new ArrayList<Integer>(Arrays.asList(4,1,1,2,1,3)),5));
    }

    public int removeElement(ArrayList<Integer> a, int b) {
        int i=0;
        while( i < a.size() && a.get(i) != b) i++;
        if(i == a.size()) return a.size();
        int j=i;
        while(i < a.size() && j < a.size()){
            if(a.get(i) == b){
                while(j < a.size() && a.get(j) == b) j++;
                if(j >= a.size()) break;
                Collections.swap(a,i,j);
                j++;
            }
            i++;
        }
        System.out.println(a);
        i = 0;
        int count = 0;
        while(a.get(i) != b){
            count++;
            i++;
        }

        return count;
    }
}
