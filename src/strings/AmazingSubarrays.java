package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AmazingSubarrays {
    static Set<Character > set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    public static void main(String[] args) {
       // System.out.println("heloo");
        System.out.println(new AmazingSubarrays().solve("ABEC"));
    }

    public int solve(String A) {
        int n = A.length();
        int i=0;
        int count = 0;
        while(i<n){
            if(set.contains(A.charAt(i))){
                count = count + (n-i);
                count = count %10003;
            }
            i++;
        }

        return count;
    }
}
