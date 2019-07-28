package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortByColor {
    public static void main(String[] args) {
        new SortByColor().sortColors(new ArrayList<>(Arrays.asList(0,1,2,0,1,2)));
    }

    public void sortColors(ArrayList<Integer> a) {
        int low = 0, mid = 0;
        int high = a.size()-1;

        while(mid <= high){
            if(a.get(mid) == 2){
                Collections.swap(a,mid,high);
                high--;
            } else if(a.get(mid) == 0){
                Collections.swap(a,mid,low);
                low++;
                mid++;
            } else if(a.get(mid) == 1){
                mid++;
            }
        }

        System.out.println(a);
    }
}
