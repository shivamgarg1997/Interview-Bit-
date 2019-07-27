package strings;

public class Atoi{
    public static void main(String[] args) {
        System.out.println(new Atoi().atoi("5121478262 8"));
    }

    public int atoi(final String A) {
        if(A.length() == 0) return 0;
        int i=0;
        int flag = 0;
        long ans = 0;
        while(i < A.length()){
            if(Character.isDigit(A.charAt(i))){
                ans = ans * 10 + (long) Character.getNumericValue(A.charAt(i));
                if((flag == 1 || flag == 0) && ans > Integer.MAX_VALUE ) return Integer.MAX_VALUE;
                if(flag == -1 && -ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            } else if(A.charAt(i) == '-' || A.charAt(i) == '+' ){
                if(A.charAt(i) == '-') flag = -1;
                else flag = 1;
            } else{
                break;
            }
            i++;
        }
        if(flag == -1) return -(int)ans;
        return (int)ans;
    }
}
