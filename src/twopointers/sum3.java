package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sum3 {
    public static void main(String[] args) {
        System.out.println(new sum3().threeSum(new ArrayList<>(Arrays.asList(-1,0,1,2,-1,-4))));
    }

    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A,Collections.reverseOrder());
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<A.size()-2;i++){
            int j=i+1, k =A.size()-1;
            while(j!=k){
                int sum = A.get(i) + A.get(j) + A.get(k);
                if(sum==0){
                    System.out.print(new ArrayList<Integer>(Arrays.asList(A.get(i), A.get(j) ,A.get(k))) + " ");
                    k--;
                }
                else if(sum > 0) j++;
                else k--;
            }
        }
        return list;
    }
}
