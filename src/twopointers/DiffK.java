package twopointers;

import java.util.ArrayList;
import java.util.Arrays;

public class DiffK {
    public static void main(String[] args) {
        System.out.println(new DiffK().diffPossible(new ArrayList<Integer>(Arrays.asList(1,3,5)),8));
    }

    public int diffPossible(ArrayList<Integer> a, int B) {
        if(a.size() == 0) return 0;
        int j,k;
        for(int i=0; i<a.size()-1; i++){
            j=i+1; k=a.size()-1;
            while(j<=k){
                if(a.get(j) - a.get(i) == B || a.get(k) - a.get(i) == B) return 1;
                else if(a.get(j) - a.get(i) < B) j++;
                else if(a.get(j) - a.get(i) > B) break;
                else if(a.get(k) - a.get(i) > B) k--;

            }
        }
        return 0;
    }
}
